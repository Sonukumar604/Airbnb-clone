package com.AirbnbProject.airBnbApp.dto;


import com.AirbnbProject.airBnbApp.entity.User;
import com.AirbnbProject.airBnbApp.entity.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data

public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}

