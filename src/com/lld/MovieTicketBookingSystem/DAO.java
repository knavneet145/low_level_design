package com.lld.MovieTicketBookingSystem;

import java.util.concurrent.ConcurrentHashMap;

public class DAO {
    private static final ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Theater> theaters = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Booking> bookings = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Show> shows = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Movie> movies = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Seat> seats = new ConcurrentHashMap<>();

    public static ConcurrentHashMap<String, Seat> getSeats() {
        return seats;
    }

    public static ConcurrentHashMap<String, Movie> getMovies() {
        return movies;
    }

    public static ConcurrentHashMap<String, Show> getShows() {
        return shows;
    }

    public static ConcurrentHashMap<String, User> getUsers() {
        return users;
    }

    public static ConcurrentHashMap<String, Theater> getTheaters() {
        return theaters;
    }

    public static ConcurrentHashMap<String, Booking> getBookings() {
        return bookings;
    }

    public static User getUser(String userId) {
        return users.get(userId);
    }

    public static Theater getTheater(String theaterId) {
        return theaters.get(theaterId);
    }

    public static Booking getBooking(String bookingId) {
        return bookings.get(bookingId);
    }

    public static void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public static void addTheater(Theater theater) {
        theaters.put(theater.getTheaterId(), theater);
    }

    public static void addBooking(Booking booking) {
        bookings.put(booking.getUserId(), booking);
    }

    public static void addShow(Show show) {
        shows.put(show.getShowId(), show);
    }

    public static Show getShow(String showId) {
        return shows.get(showId);
    }

    public static void addMovie(Movie movie) {
        movies.put(movie.getMovieId(), movie);
    }

    public static Movie getMovie(String movieId) {
        return movies.get(movieId);
    }

    public static void addSeat(Seat seat) {
        seats.put(seat.getSeatId(), seat);
    }

    public static Seat getSeat(String seatId) {
        return seats.get(seatId);
    }
}
