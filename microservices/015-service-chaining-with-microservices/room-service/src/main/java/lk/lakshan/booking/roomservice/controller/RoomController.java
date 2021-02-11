package lk.lakshan.booking.roomservice.controller;

import lk.lakshan.booking.model.room.Room;
import lk.lakshan.booking.roomservice.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("services/rooms")
public class RoomController {
    @Autowired
    RoomService roomService;

    @PostMapping
    public Room save(@RequestBody Room room) {
        return roomService.save(room);
    }

    @GetMapping(value = "/{id}")
    public Room getById(@PathVariable int id) {
        System.out.println("request came on " + LocalDateTime.now() + "----------->>>");
        return roomService.findById(id);
    }

    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.findAll();
    }
}
