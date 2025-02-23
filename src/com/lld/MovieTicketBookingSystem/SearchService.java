package com.lld.MovieTicketBookingSystem;

import com.lld.MovieTicketBookingSystem.DAO;
import com.lld.MovieTicketBookingSystem.Show;

import java.util.List;
import java.util.stream.Collectors;

public class SearchService {
    public static List<Show> search(String searchWord) {
        return DAO.getShows().values().stream().filter(show -> DAO.getMovie(show.getMovieId()).getTitle().contains(searchWord))
                .collect(Collectors.toList());
    }
}
