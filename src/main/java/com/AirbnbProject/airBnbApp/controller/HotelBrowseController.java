package com.AirbnbProject.airBnbApp.controller;
import com.AirbnbProject.airBnbApp.dto.HotelDto;
import com.AirbnbProject.airBnbApp.dto.HotelInfoDto;
import com.AirbnbProject.airBnbApp.dto.HotelPriceDto;
import com.AirbnbProject.airBnbApp.dto.HotelSearchRequest;
import com.AirbnbProject.airBnbApp.service.HotelService;
import com.AirbnbProject.airBnbApp.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class HotelBrowseController {

    private final InventoryService inventoryService;
    private final HotelService hotelService;

    @GetMapping("/search")
    public ResponseEntity<Page<HotelPriceDto>> searchHotels(@RequestBody HotelSearchRequest hotelSearchRequest) {

        Page<HotelPriceDto> page = inventoryService.searchHotels(hotelSearchRequest);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId) {
        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId));
    }

}
