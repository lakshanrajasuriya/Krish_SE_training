package lk.lakshan.booking.model.booking;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int bookId;
    int customerId;
    int roomId;
    LocalDateTime checkIn;
    LocalDateTime checkOut;
}
