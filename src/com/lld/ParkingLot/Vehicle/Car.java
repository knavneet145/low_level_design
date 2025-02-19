package com.lld.ParkingLot.Vehicle;

public class Car extends Vehicle{
    public Car(String id) {
        super(id);
        this.vehicleType = VehicleType.CAR;
    }
}
