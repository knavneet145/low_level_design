package com.lld.ParkingLot;

public class CarSpot extends ParkingSpot {
    public CarSpot(String levelId, String spotId) {
        super(levelId, spotId);
        this.spotType = SpotType.CAR;
    }
}
