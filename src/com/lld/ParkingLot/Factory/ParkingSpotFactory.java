package com.lld.ParkingLot.Factory;

import com.lld.ParkingLot.*;

public class ParkingSpotFactory {
    private static long id = 0;
    public static ParkingSpot getParkingSpotInstance(SpotType type, String levelId) {
        if (type == SpotType.BIKE) {
            System.out.println("Bike spot created");
            return new BikeSpot(levelId, String.valueOf(++id));
        }
        else if (type == SpotType.CAR) {
            System.out.println("Car spot created");
            return new CarSpot(levelId, String.valueOf(++id));
        }
        else if (type == SpotType.TRUCK) {
            System.out.println("Truck spot created");
            return new TruckSpot(levelId, String.valueOf(++id));
        }
        else return null;
    }
}
