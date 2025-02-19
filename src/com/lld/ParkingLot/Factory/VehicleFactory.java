package com.lld.ParkingLot.Factory;

import com.lld.ParkingLot.Vehicle.*;

public class VehicleFactory {
    private static long id = 0;
    public static Vehicle getVehicleInstance(VehicleType type) {
        if (type == VehicleType.BIKE) {
            return new Bike(String.valueOf(++id));
        }
        else if (type == VehicleType.CAR) {
            System.out.println("Car is been created.");
            return new Car(String.valueOf(++id));
        }
        else if (type == VehicleType.TRUCK) {
            System.out.println("truck is been created.");
            return new Truck(String.valueOf(++id));
        }
        return null;
    }
}
