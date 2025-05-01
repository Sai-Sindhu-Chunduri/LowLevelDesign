package com.example.LowLevelDesign.BookMyShow.controllers;

import com.example.LowLevelDesign.BookMyShow.dtos.BookMovieRequestDto;
import com.example.LowLevelDesign.BookMyShow.dtos.BookMovieResponseDto;
import com.example.LowLevelDesign.BookMyShow.services.BookingService;

public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {

        this.bookingService = bookingService;
    }

    public BookMovieResponseDto BookMovieTicket(BookMovieRequestDto requestDto) {

        return null;
    }

}
