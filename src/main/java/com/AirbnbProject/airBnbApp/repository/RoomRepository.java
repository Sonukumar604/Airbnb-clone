package com.AirbnbProject.airBnbApp.repository;

import com.AirbnbProject.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
