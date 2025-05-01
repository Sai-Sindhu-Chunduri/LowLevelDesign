package com.example.LowLevelDesign.BookMyShow.controllers;


import com.example.LowLevelDesign.BookMyShow.dtos.SignUpRequestDto;
import com.example.LowLevelDesign.BookMyShow.dtos.SignUpResponseDto;
import com.example.LowLevelDesign.BookMyShow.services.UserService;

public class UserController {


    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    SignUpResponseDto signUpUser(SignUpRequestDto requestDto) {
        // call the user service sign up

        return null;
    }
}
