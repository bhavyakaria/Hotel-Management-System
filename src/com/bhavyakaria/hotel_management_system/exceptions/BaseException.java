package com.bhavyakaria.hotel_management_system.exceptions;

public class BaseException extends Exception {

    public BaseException(String message, int code) {
        System.out.printf("Message: %s\nStatus: %d\n", message, code);
    }

}
