package com.bhavyakaria.hms.models;

import com.bhavyakaria.hms.exceptions.RoomUnavailableException;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    public String name;
    public String contactNumber;
    public String email;
    public List<Building> buildingList = new ArrayList<>();
    public List<Booking> bookingList = new ArrayList<>();

    public Hotel(String name, String contactNumber, String email) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Building> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(List<Building> buildingList) {
        this.buildingList = buildingList;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public void book(User user) throws RoomUnavailableException {
        Room room = buildingList.get(0).getAvailableRoom();
        Booking booking = new Booking(user, room);
        bookingList.add(booking);
    }
}
