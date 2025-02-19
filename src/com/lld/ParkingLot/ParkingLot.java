package com.lld.ParkingLot;

import com.lld.ParkingLot.Vehicle.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final List<Level> levels;
    private static ParkingLot instance;

    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }

        return instance;
    }

    private ParkingLot() {
        this.levels = new ArrayList<>();
    }

    public void addLevel(Level level) {
        levels.add(level);
    }

    public void entry(Vehicle vehicle) {
        ParkingSpot spot = getAvailableSpot(vehicle);
        if (spot == null) {
            System.out.println("Parking lot is full.");
            return;
        }

        vehicle.setSpot(spot);
        System.out.println("vehicle "+vehicle.getId()+" is been assigned the spot "+spot.id);
        System.out.println("Now spot"+spot.id+" availability status is: "+ spot.available);
        spot.setAvailable(false);
        spot.setVehicle(vehicle);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void exit(Vehicle vehicle) {
        vehicle.getSpot().setAvailable(true);
        System.out.println("vehicle "+vehicle.getId()+" is leaving from the spot "+vehicle.getSpot().id );
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private ParkingSpot getAvailableSpot(Vehicle vehicle) {
        for (Level level: levels) {
            ParkingSpot spot = level.getAvailableSpot(vehicle.getVehicleType());
            if (spot != null) return spot;
        }
        return null;
    }
}
