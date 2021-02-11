package lk.lakshan.booking.bookingservice.service;

import lk.lakshan.booking.bookingservice.model.DetailResponse;
import lk.lakshan.booking.bookingservice.repository.BookingRepository;
import lk.lakshan.booking.model.booking.Booking;
import lk.lakshan.booking.model.customer.Customer;
import lk.lakshan.booking.model.room.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    RestTemplate restTemplate;

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
    public DetailResponse findDetailResponse(int id) {
        Booking booking = findById(id);
        Customer customer = getCustomer(booking.getCustomerId());
        Room room = getRoom(booking.getRoomId());
        return new DetailResponse(booking, customer, room);
    }

    private Customer getCustomer(int customerId) {
        Customer customer = restTemplate.getForObject("http://localhost:8080/services/customers/" + customerId, Customer.class);
        return customer;
    }

    private Room getRoom(int roomId) {
        return restTemplate.getForObject("http://localhost:9191/services/rooms/" + roomId, Room.class);
    }
}
