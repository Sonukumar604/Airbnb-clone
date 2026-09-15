package com.AirbnbProject.airBnbApp.service;

import com.AirbnbProject.airBnbApp.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

    void deleteAllInventories(Room room);
}
