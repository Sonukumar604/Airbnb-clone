package com.AirbnbProject.airBnbApp.repository;
import com.AirbnbProject.airBnbApp.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}