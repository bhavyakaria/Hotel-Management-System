package com.bhavyakaria.hotel_management_system.services;

import com.bhavyakaria.hotel_management_system.exceptions.BaseException;
import com.bhavyakaria.hotel_management_system.models.*;

import java.util.ArrayList;
import java.util.List;

public class HotelBookingService {

    public Hotel hotel;

    public HotelBookingService(int NO_OF_BUILDINGS, int NO_OF_FLOORS, int NO_OF_ROOMS) {
        Hotel hotel = new Hotel("Hotel 1", "123456789", "abc.@gmail.com");

        // add rooms
        List<Room> roomList = new ArrayList<>();
        for(int i = 0; i < NO_OF_ROOMS; i++) {
            roomList.add(new Room(i+1));
        }

        // add floors
        List<Floor> floorList = new ArrayList<>();
        for (int i = 0; i < NO_OF_FLOORS; i++) {
            floorList.add(new Floor(i+1, roomList));
        }

        // add buildings
        List<Building> buildings = new ArrayList<>();
        for (int i = 0; i < NO_OF_BUILDINGS; i++) {
            buildings.add(new Building(1, floorList));
        }

        hotel.setBuildingList(buildings);
        this.hotel = hotel;
    }

    public void book(User user) throws BaseException {
        hotel.book(user);
    }

}
