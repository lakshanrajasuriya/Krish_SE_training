package com.lakshan.bookingengine.bookingengine.controller;

import com.lakshan.bookingengine.bookingengine.service.RoomManageService;
import com.lakshan.bookingengine.commons.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")
public class RoomController {
    @Autowired
    RoomManageService roomManageService;

    @RequestMapping(value = "/room", method = RequestMethod.POST)
    public Room save(@RequestBody Room room) {
        return roomManageService.save(room);
    }

    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public ResponseEntity<Room> fetchRoom(@RequestParam int id) {
        Room room = roomManageService.fetchRoomById(id);
        if (room == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(room);
        }
    }
}
