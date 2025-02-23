package com.lld.MovieTicketBookingSystem;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

public class HistoryService implements Runnable{
    public void run(){
        for (User user: DAO.getUsers().values()) {
            for (Booking upcomingBooking: user.getUpcoming()) {
                if (upcomingBooking.getShow().getEndTime().isBefore(LocalDateTime.now())) {
                    user.addHistoryBooking(upcomingBooking);
                }
            }
        }
    }
}
