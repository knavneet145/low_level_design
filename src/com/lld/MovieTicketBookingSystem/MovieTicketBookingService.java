package com.lld.MovieTicketBookingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MovieTicketBookingService {
    private static MovieTicketBookingService instance;
    private final List<String> theaters;
    private static final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

    private MovieTicketBookingService() {
        theaters = new ArrayList<>();
        HistoryService historyService = new HistoryService();
        executorService.scheduleAtFixedRate(historyService, 0, 1, TimeUnit.HOURS);
    }

    public void addTheater(String theater) {
        theaters.add(theater);
    }

    public static MovieTicketBookingService getInstance() {
        if (instance == null) {
            instance = new MovieTicketBookingService();
        }
        return instance;
    }

    public void displaySearch(String searchWord) {
        DisplayService.displayResults(searchWord);
    }

    public void book(User user, List<String> seatIds, Show show) {
        BookingService.book(user, seatIds, show);
    }

}
