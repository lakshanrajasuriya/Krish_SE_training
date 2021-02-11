package lk.lakshan.booking.roomservice.service;

import lk.lakshan.booking.model.room.Room;
import lk.lakshan.booking.roomservice.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService{

    @Autowired
    RoomRepository roomRepository;

    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room findById(int id) {
        Optional<Room> room=roomRepository.findById(id);
        if(room.isPresent())
            return room.get();
        else
            return new Room();
    }

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }
}
