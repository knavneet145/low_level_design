package com.lld.MovieTicketBookingSystem.Factory;

import com.lld.MovieTicketBookingSystem.DAO;
import com.lld.MovieTicketBookingSystem.Theater;

public class TheaterFactory {
    private static long id = 0;
    public static Theater getInstance(int capacity) {
        Theater theater = new Theater(String.valueOf(++id), capacity);
        DAO.addTheater(theater);
        return theater;
    }
}
