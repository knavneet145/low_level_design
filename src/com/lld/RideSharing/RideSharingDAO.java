package com.lld.RideSharing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RideSharingDAO {
    private final ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Ride> rides = new ConcurrentHashMap<>();
    private static RideSharingDAO rideSharingDAO;

    public static RideSharingDAO getInstance() {
        if (rideSharingDAO == null) {
            rideSharingDAO = new RideSharingDAO();
        }
        return rideSharingDAO;
    }

    private RideSharingDAO() {
    }

    public void addUser(User user) {
        users.put(user.id, user);
    }

    public void addRide(Ride ride) {
        rides.put(ride.getId(), ride);
    }

    public Ride getRide(String id) {
        return rides.get(id);
    }

    public User getUser(String id) {
        return users.get(id);
    }

    public List<User> getAllDrivers() {
        List<User> drivers = new ArrayList<>();
        for (Map.Entry<String, User> entry: users.entrySet()) {
            if (entry.getValue().isDriver) {
                drivers.add(entry.getValue());
            }
        }
        return drivers;
    }
}
