package com.lld.ParkingLot.Vehicle;

public class Truck extends Vehicle{
    public Truck(String id) {
        super(id);
        this.vehicleType = VehicleType.TRUCK;
    }
}
