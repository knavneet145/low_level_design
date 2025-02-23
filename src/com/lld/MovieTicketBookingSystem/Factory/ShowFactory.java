package com.lld.MovieTicketBookingSystem.Factory;

import com.lld.MovieTicketBookingSystem.DAO;
import com.lld.MovieTicketBookingSystem.Seat;
import com.lld.MovieTicketBookingSystem.Show;

import java.time.LocalDateTime;
import java.util.List;

public class ShowFactory {
    private static long id = 0;
    public static Show getInstance(String movieId, LocalDateTime startTime, LocalDateTime endTime, String theaterId, List<Seat> seats, int capacity) {
        Show show = new Show(String.valueOf(++id),movieId,startTime,endTime,theaterId,seats,capacity);
        DAO.addShow(show);
        return show;
    }
}
