package com.bhavyakaria.hms.models;

import com.bhavyakaria.hms.enums.RoomStatus;

public class Room {
    public int roomNumber;
    public RoomStatus status;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.status = RoomStatus.AVAILABLE;
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

}
