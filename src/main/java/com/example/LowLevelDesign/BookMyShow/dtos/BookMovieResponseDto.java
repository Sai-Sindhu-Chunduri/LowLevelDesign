package com.example.LowLevelDesign.BookMyShow.dtos;

import com.example.LowLevelDesign.BookMyShow.models.Booking;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieResponseDto {

    private Booking booking;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
