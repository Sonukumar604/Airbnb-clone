package com.AirbnbProject.airBnbApp.service;

import com.AirbnbProject.airBnbApp.dto.HotelDto;
import com.AirbnbProject.airBnbApp.dto.HotelSearchRequest;
import com.AirbnbProject.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
