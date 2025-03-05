package com.lld.MovieTicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String userId;
    private final String name;
    private final String email;
    private String password;
    private final List<Booking> history;
    private final List<Booking> upcoming;

    public List<Booking> getHistory() {
        return history;
    }

    public List<Booking> getUpcoming() {
        return upcoming;
    }

    public User(String userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.history = new ArrayList<>();
        upcoming = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addHistoryBooking(Booking booking) {
        history.add(booking);
    }

    public void addUpcomingBooking(Booking booking) {
        upcoming.add(booking);
    }
}
