package lk.lakshan.booking.bookingservice.controller;

import lk.lakshan.booking.bookingservice.model.Response;
import lk.lakshan.booking.bookingservice.model.SimpleResponse;
import lk.lakshan.booking.bookingservice.service.BookingService;
import lk.lakshan.booking.model.booking.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services/bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;


    @PostMapping
    public Booking save(@RequestBody Booking booking) {
        return bookingService.save(booking);
    }

    @GetMapping(value = "/{id}")
    public Response getBook(@PathVariable int id, @RequestParam(required = false) String type) {
        if (type != null && type.equals("full")){
            return bookingService.findDetailResponse(id);
        } else{
            return new SimpleResponse(bookingService.findById(id));
        }
    }

    @GetMapping
    public List<Booking> getAllBooks() {
        return bookingService.findAll();
    }
}
