package com.lld.MovieTicketBookingSystem.Factory;

import com.lld.MovieTicketBookingSystem.DAO;
import com.lld.MovieTicketBookingSystem.Movie;

public class MovieFactory {
    private static long id = 0;
    public static Movie getInstance(String title) {
        Movie movie = new Movie(title, String.valueOf(++id));
        DAO.addMovie(movie);
        return movie;
    }
}
