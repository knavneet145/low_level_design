package com.lld.MovieTicketBookingSystem;

public class Movie {
    private final String title;
    private final String movieId;

    public Movie(String title, String movieId) {
        this.title = title;
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getMovieId() {
        return movieId;
    }
}
