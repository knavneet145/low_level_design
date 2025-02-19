package com.lld.ParkingLot;

import com.lld.ParkingLot.Factory.LevelFactory;
import com.lld.ParkingLot.Factory.ParkingSpotFactory;
import com.lld.ParkingLot.Factory.VehicleFactory;
import com.lld.ParkingLot.Vehicle.Vehicle;
import com.lld.ParkingLot.Vehicle.VehicleType;

public class ParkingLotDemo implements Runnable{

    @Override
    public void run() {
        ParkingLot parkingLot = ParkingLot.getInstance();
        DAO dao = DAO.getInstance();
        Vehicle car = VehicleFactory.getVehicleInstance(VehicleType.CAR);
        Vehicle bike = VehicleFactory.getVehicleInstance(VehicleType.BIKE);
        Level level = LevelFactory.getLevelInstance(-1);
        dao.addLevel(level);

        ParkingSpot ps1 = ParkingSpotFactory.getParkingSpotInstance(SpotType.CAR, level.getId());
        ParkingSpot ps2 = ParkingSpotFactory.getParkingSpotInstance(SpotType.BIKE, level.getId());
        ParkingSpot ps3 = ParkingSpotFactory.getParkingSpotInstance(SpotType.TRUCK,level.getId());

        level.addParkingSpot(ps1);
        level.addParkingSpot(ps2);
        level.addParkingSpot(ps3);

        parkingLot.addLevel(level);

        parkingLot.entry(bike);
        parkingLot.entry(car);
        parkingLot.exit(bike);
        parkingLot.exit(car);
    }
}
