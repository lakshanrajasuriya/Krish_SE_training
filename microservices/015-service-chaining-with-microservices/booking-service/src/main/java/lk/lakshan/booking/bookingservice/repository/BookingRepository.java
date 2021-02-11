package lk.lakshan.booking.bookingservice.repository;

import lk.lakshan.booking.model.booking.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
}
