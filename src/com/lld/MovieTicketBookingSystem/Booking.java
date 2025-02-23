package com.lld.MovieTicketBookingSystem;

import java.util.List;

public class Booking {
    private final String bookingId;
    private final String userId;
    private final List<String> seats;
    private final Show show;

    public Booking(String bookingId, String userId, List<String> seats, Show show) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.seats = seats;
        this.show = show;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public List<String> getSeats() {
        return seats;
    }

    public Show getShow() {
        return show;
    }
}
