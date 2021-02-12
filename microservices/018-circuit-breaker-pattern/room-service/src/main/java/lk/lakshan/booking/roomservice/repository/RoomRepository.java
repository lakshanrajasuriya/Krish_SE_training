package lk.lakshan.booking.roomservice.repository;

import lk.lakshan.booking.model.room.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Integer> {
}
