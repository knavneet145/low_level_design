package com.lld.RestaurentManagementSystem;

import java.util.HashMap;

public class ReservationManager {
    private static int availableSeats;
    private HashMap<String, Integer> seatsMapping;
    private static ReservationManager reservationManager;

    public static ReservationManager getInstance(int totalSeats) {
        if (reservationManager == null) {
            reservationManager = new ReservationManager();
            availableSeats = totalSeats;
        }
        return reservationManager;
    }

    private ReservationManager() {
    }

    public void reserveSeats(String userId, int requiredSeats) {
        if (availableSeats >= requiredSeats) {
            seatsMapping.put(userId, seatsMapping.getOrDefault(userId, 0) + requiredSeats);
            availableSeats -= requiredSeats;
            System.out.println(requiredSeats + " seats have been booked for userId: "+ userId);
        }
        else {
            System.out.println(requiredSeats + " are not available.");
        }
    }

    public void leaveUser(String userId) {
        if (seatsMapping.containsKey(userId)) {
            availableSeats += seatsMapping.get(userId);
            seatsMapping.remove(userId);
        }
    }
}
