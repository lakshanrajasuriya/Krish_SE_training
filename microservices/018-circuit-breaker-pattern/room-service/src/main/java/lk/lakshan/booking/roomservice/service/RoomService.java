package lk.lakshan.booking.roomservice.service;

import lk.lakshan.booking.model.room.Room;

import java.util.List;

public interface RoomService {
    Room save(Room room);

    Room findById(int id);

    List<Room> findAll();
}
