package com.nelumbo.challenge.domain.exception;

public class ParkingNotFoundException extends RuntimeException  {
    public ParkingNotFoundException(String message) {
        super(message);
    }
}
