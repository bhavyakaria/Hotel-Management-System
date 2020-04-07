package com.bhavyakaria.hms.models;

import com.bhavyakaria.hms.enums.BookingStatus;

import java.util.Date;

public class Booking {

    public User user;
    public Room room;
    public Date bookedAt;
    public Date checkedInOn;
    public Date checkOutOn;
    public BookingStatus bookingStatus;


    public Booking(User user, Room room) {
        this.user = user;
        this.room = room;
        this.bookedAt = new Date();
        this.bookingStatus = BookingStatus.BOOKED;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getBookedAt() {
        return bookedAt;
    }

    public void setBookedAt(Date bookedAt) {
        this.bookedAt = bookedAt;
    }

    public Date getCheckedInOn() {
        return checkedInOn;
    }

    public void setCheckedInOn(Date checkedInOn) {
        this.checkedInOn = checkedInOn;
    }

    public Date getCheckOutOn() {
        return checkOutOn;
    }

    public void setCheckOutOn(Date checkOutOn) {
        this.checkOutOn = checkOutOn;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}
