package com.lld.MovieTicketBookingSystem;

import java.util.List;

public class DisplayService {
    public static void displayResults(String searchWord) {
        List<Show> shows = SearchService.search(searchWord);
        System.out.println("Showing results for search..");
        for (Show show : shows) {
            Movie movie = DAO.getMovie(show.getMovieId());
            System.out.println("Movie: "+movie.getTitle());
            System.out.println("Theater: " + show.getTheaterId());
            System.out.println("start time: "+ show.getStartTime()+"  end time: "+ show.getEndTime());
            System.out.println("Available seats..");

            for (Seat seat: show.getSeats()) {
                if (seat.getStatus() == SeatStatus.UNOCCUPIED) {
                    System.out.println(seat.getSeatId() + "  INR:"+seat.getCost());
                }
            }
            System.out.println("   ");
        }
    }
}
