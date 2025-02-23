package com.lld.MovieTicketBookingSystem;

import com.lld.MovieTicketBookingSystem.Factory.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieTicketBookingServiceDemo implements Runnable{

    @Override
    public void run() {
        MovieTicketBookingService movieTicketBookingService = MovieTicketBookingService.getInstance();
        User navneet  = UserFactory.getInstance("navneet", "np.eng97@gmail.com","123456789");
        Movie thor = MovieFactory.getInstance("thor");
        Theater bangalore = TheaterFactory.getInstance(100);
        List<Seat> seats = new ArrayList<>();
        for(int i = 0; i < 200; i++) {
            seats.add(SeatFactory.getInstance(SeatType.REGULAR,150,bangalore.getTheaterId(),thor.getMovieId()));
        }
        Show thorShow = ShowFactory.getInstance(thor.getMovieId(), LocalDateTime.now(),LocalDateTime.now().plusHours(2),bangalore.getTheaterId(),seats,200);
        bangalore.addShow(thorShow.getShowId());
        movieTicketBookingService.addTheater(bangalore.getTheaterId());
        movieTicketBookingService.displaySearch("thor");
        List<Seat> bookingSeats = seats.subList(0, 2);
        List<String> bookingSeatIds = bookingSeats.stream().map(Seat::getSeatId).collect(Collectors.toList());
        movieTicketBookingService.book(navneet, bookingSeatIds, thorShow);
    }
}
