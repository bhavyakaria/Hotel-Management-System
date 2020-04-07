package com.bhavyakaria.hotel_management_system.models;

import com.bhavyakaria.hotel_management_system.enums.RoomStatus;

public class Room {
    public int roomNumber;
    public RoomStatus status;
    public boolean isAvailable;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.status = RoomStatus.OPEN;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
