package com.lld.MovieTicketBookingSystem;

import java.time.LocalDateTime;
import java.util.List;

public class Show {
    private final String showId;
    private final String movieId;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private final String theaterId;
    private final int capacity;
    private final List<Seat> seats;

    public Show(String showId, String movieId, LocalDateTime startTime, LocalDateTime endTime, String theaterId, List<Seat> seats, int capacity) {
        this.showId = showId;
        this.movieId = movieId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.theaterId = theaterId;
        this.seats = seats;
        this.capacity = capacity;
    }

    public String getShowId() {
        return showId;
    }

    public String getMovieId() {
        return movieId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getTheaterId() {
        return theaterId;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
