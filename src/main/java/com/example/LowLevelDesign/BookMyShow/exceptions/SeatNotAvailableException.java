package com.example.LowLevelDesign.BookMyShow.exceptions;

public class SeatNotAvailableException extends Exception{
    public SeatNotAvailableException(String message) {
        super(message);
    }
}
