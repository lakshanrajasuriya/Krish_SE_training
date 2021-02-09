package com.lakshan.bookingengine.bookingengine.service;

import com.lakshan.bookingengine.bookingengine.repository.RoomRepository;
import com.lakshan.bookingengine.commons.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoomManageServiceImpl implements RoomManageService {

    @Autowired
    RoomRepository roomRepository;


    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room fetchRoomById(int id) {
        Optional<Room> room = roomRepository.findById(id);
        if (room.isPresent()) {
            return room.get();
        }
        return null;
    }
}
