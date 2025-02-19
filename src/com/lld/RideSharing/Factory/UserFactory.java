package com.lld.RideSharing.Factory;

import com.lld.RideSharing.Driver;
import com.lld.RideSharing.Location;
import com.lld.RideSharing.Passanger;
import com.lld.RideSharing.RideSharingDAO;

public class UserFactory {
    private static RideSharingDAO rideSharingDAO = RideSharingDAO.getInstance();
    private static long id = 0;
    public static Driver buildDriver(String name, Location location) {
        Driver driver = new Driver(name, String.valueOf(++id), location);
        rideSharingDAO.addUser(driver);
        return driver;
    }

    public static Passanger buildPassaanger(String name, Location location) {
        Passanger passanger = new Passanger(name, String.valueOf(++id), location);
        rideSharingDAO.addUser(passanger);
        return passanger;
    }
}
