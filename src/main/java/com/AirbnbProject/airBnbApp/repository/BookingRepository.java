package com.AirbnbProject.airBnbApp.repository;

import com.AirbnbProject.airBnbApp.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
