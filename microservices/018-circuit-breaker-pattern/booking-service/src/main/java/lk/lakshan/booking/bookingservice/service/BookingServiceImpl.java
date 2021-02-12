package lk.lakshan.booking.bookingservice.service;

import com.netflix.hystrix.HystrixCommand;
import lk.lakshan.booking.bookingservice.hystrix.CommonHystrixCommand;
import lk.lakshan.booking.bookingservice.hystrix.RoomCommand;
import lk.lakshan.booking.bookingservice.model.DetailResponse;
import lk.lakshan.booking.bookingservice.repository.BookingRepository;
import lk.lakshan.booking.model.booking.Booking;
import lk.lakshan.booking.model.customer.Customer;
import lk.lakshan.booking.model.room.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    HystrixCommand.Setter setter;


    @Autowired
    RestTemplate restTemplate;

    @LoadBalanced
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Override
    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking findById(int id) {
        Optional<Booking> book = bookingRepository.findById(id);
        if (book.isPresent())
            return book.get();
        else
            return new Booking();
    }

    @Override
    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException {
        Booking booking = findById(id);
        Customer customer = getCustomer(booking.getCustomerId());
        Room room = getRoom(booking.getRoomId());
        return new DetailResponse(booking, customer, room);
    }


    private Customer getCustomer(int customerId) throws ExecutionException, InterruptedException {
        CommonHystrixCommand<Customer> customerCommonHystrixCommand=new CommonHystrixCommand<Customer>(setter,()->{
            return restTemplate.getForObject("http://customer/services/customers/" + customerId, Customer.class);
        },()->{
            return new Customer();
        });

        Future<Customer> customerFuture=customerCommonHystrixCommand.queue();
        return customerFuture.get();
    }

    private Room getRoom(int roomId) {
        RoomCommand roomCommand=new RoomCommand(restTemplate,roomId);
        return roomCommand.execute();
//        return restTemplate.getForObject("http://room/services/rooms/" + roomId, Room.class);
    }
}
