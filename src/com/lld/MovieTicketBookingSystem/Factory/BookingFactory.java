package com.lld.MovieTicketBookingSystem.Factory;

import com.lld.MovieTicketBookingSystem.Booking;
import com.lld.MovieTicketBookingSystem.DAO;
import com.lld.MovieTicketBookingSystem.Seat;
import com.lld.MovieTicketBookingSystem.Show;
import java.util.List;

public class BookingFactory {
    private static long id = 0;
    public static Booking getInstance(String userId, List<String> seats, Show show) {
        Booking booking = new Booking(String.valueOf(++id),userId,seats, show);
        DAO.addBooking(booking);
        return booking;
    }
}
