package com.lakshan.bookingengine.bookingengine.service;

import com.lakshan.bookingengine.commons.model.Room;

public interface RoomManageService {
    Room save(Room room);

    Room fetchRoomById(int id);
}
