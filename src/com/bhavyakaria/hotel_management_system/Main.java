package com.bhavyakaria.hotel_management_system;

import com.bhavyakaria.hotel_management_system.exceptions.BaseException;
import com.bhavyakaria.hotel_management_system.models.User;
import com.bhavyakaria.hotel_management_system.services.HotelBookingService;

public class Main {

    public static void main(String[] args) {

        int NO_OF_BUILDINGS = 1;
        int NO_OF_FLOORS = 1;
        int NO_OF_ROOMS_PER_FLOOR = 2;

        HotelBookingService hotelBookingService = new HotelBookingService(NO_OF_BUILDINGS,NO_OF_FLOORS, NO_OF_ROOMS_PER_FLOOR);

        User user1 = new User("Bhavya", "Karia", "bhavya@gmail.com", "1234567890");

        try {
            hotelBookingService.book(user1);
            hotelBookingService.book(user1);
            hotelBookingService.book(user1);
        } catch (BaseException e) {

        }

        System.out.println(hotelBookingService.hotel.getBookingList().size());
        System.out.println(hotelBookingService.hotel.getBookingList().get(0).bookingStatus);

    }
}
