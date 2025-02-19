package com.lld.ParkingLot;

public class TruckSpot extends ParkingSpot {
    public TruckSpot(String levelId, String spotId) {
        super(levelId, spotId);
        this.spotType = SpotType.TRUCK;
    }
}
