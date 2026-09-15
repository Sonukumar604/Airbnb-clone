package com.AirbnbProject.airBnbApp.service;
import com.AirbnbProject.airBnbApp.dto.BookingDto;
import com.AirbnbProject.airBnbApp.dto.BookingRequest;
import com.AirbnbProject.airBnbApp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
