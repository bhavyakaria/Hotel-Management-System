package com.bhavyakaria.hotel_management_system.models;

import com.bhavyakaria.hotel_management_system.constants.Constants;
import com.bhavyakaria.hotel_management_system.enums.BuildingStatus;
import com.bhavyakaria.hotel_management_system.exceptions.BaseException;
import com.bhavyakaria.hotel_management_system.exceptions.RoomUnavailableException;

import java.util.ArrayList;
import java.util.List;

public class Building {

    public int buildingNumber;
    public List<Floor> floorList = new ArrayList<>();
    public boolean roomsAvailable;
    public BuildingStatus status;

    public Building(int buildingNumber, List<Floor> floorList) {
        this.buildingNumber = buildingNumber;
        this.floorList = floorList;
        this.roomsAvailable = true;
        this.status = BuildingStatus.OPEN;
    }

    public Room getAvailableRoom() throws RoomUnavailableException {
        for (Floor floor : floorList) {
            if (floor.roomsAvailable) {
                return floor.getAvailableRoom();
            }
        }
        throw new RoomUnavailableException(Constants.ROOMS_UNAVAILABLE_MSG, Constants.BASE_ERROR_CODE);
    }
}
