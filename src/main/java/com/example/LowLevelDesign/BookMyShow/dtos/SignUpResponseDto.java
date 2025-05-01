package com.example.LowLevelDesign.BookMyShow.dtos;

import com.example.LowLevelDesign.BookMyShow.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDto {
    private User user;
}
