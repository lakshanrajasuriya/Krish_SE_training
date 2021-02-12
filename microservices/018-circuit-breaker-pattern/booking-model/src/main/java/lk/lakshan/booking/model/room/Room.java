package lk.lakshan.booking.model.room;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "room")
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String type;
    String status;
    int numberOfBeds;
}
