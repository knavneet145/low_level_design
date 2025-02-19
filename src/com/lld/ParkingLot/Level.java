package com.lld.ParkingLot;

import com.lld.ParkingLot.Vehicle.VehicleType;
import java.util.ArrayList;
import java.util.List;

public class Level {
    private final String id;
    private final int floorNumber;
    private final List<ParkingSpot> parkingSpots;

    public Level(int floorNumber, String id) {
        this.floorNumber = floorNumber;
        this.parkingSpots = new ArrayList<>();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    public ParkingSpot getAvailableSpot(VehicleType type) {
        for (ParkingSpot spot: parkingSpots) {
            if (spot.spotType.toString().equals(type.toString()) && spot.available) {
                return spot;
            }
        }
        return null;
    }
}
