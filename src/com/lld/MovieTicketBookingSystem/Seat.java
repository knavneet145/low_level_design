package com.lld.MovieTicketBookingSystem;

public class Seat {
    private SeatType seatType;
    private final String seatId;
    private double cost;
    private final String theaterId;
    private SeatStatus status;
    private String movieId;

    public Seat(SeatType seatType, String seatId, double cost, String theaterId, String movieId) {
        this.seatType = seatType;
        this.seatId = seatId;
        this.cost = cost;
        this.theaterId = theaterId;
        this.status = SeatStatus.UNOCCUPIED;
        this.movieId = movieId;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public String getSeatId() {
        return seatId;
    }

    public double getCost() {
        return cost;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getTheaterId() {
        return theaterId;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
