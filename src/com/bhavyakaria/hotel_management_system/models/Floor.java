package com.bhavyakaria.hotel_management_system.models;

import com.bhavyakaria.hotel_management_system.enums.FloorStatus;
import com.bhavyakaria.hotel_management_system.exceptions.BaseException;

import java.util.ArrayList;
import java.util.List;

public class Floor {

    public int floorNumber;
    public List<Room> roomList = new ArrayList<>();
    public FloorStatus status;
    public boolean roomsAvailable;

    public Floor(int floorNumber, List<Room> roomList) {
        this.floorNumber = floorNumber;
        this.roomList = roomList;
        this.status = FloorStatus.OPEN;
        this.roomsAvailable = true;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public FloorStatus getStatus() {
        return status;
    }

    public void setStatus(FloorStatus status) {
        this.status = status;
    }

    public boolean isRoomsAvailable() {
        return roomsAvailable;
    }

    public void setRoomsAvailable(boolean roomsAvailable) {
        this.roomsAvailable = roomsAvailable;
    }

    public Room getAvailableRoom() {
        Room rm = null;
        for (Room room : roomList) {
            if (room.isAvailable) {
                room.setAvailable(false);
                rm = room;
                break;
            }
        }

        if (getCountOfAvailableRooms() > 0) {
            roomsAvailable = true;
        } else {
            roomsAvailable = false;
        }

        return rm;
    }

    public int getCountOfAvailableRooms() {
        int count = 0;
        for (Room room : roomList) {
            if (room.isAvailable) {
                count += 1;
            }
        }
        return count;
    }
}
