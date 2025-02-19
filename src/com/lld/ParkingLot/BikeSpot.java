package com.lld.ParkingLot;

public class BikeSpot extends ParkingSpot {
    public BikeSpot(String levelId, String spotId) {
        super(levelId, spotId);
        this.spotType = SpotType.BIKE;
    }
}
