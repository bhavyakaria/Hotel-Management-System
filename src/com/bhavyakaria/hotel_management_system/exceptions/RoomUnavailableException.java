package com.bhavyakaria.hotel_management_system.exceptions;

public class RoomUnavailableException extends BaseException {

    public RoomUnavailableException(String message, int code) {
        super(message, code);
    }
}
