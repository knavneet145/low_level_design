package com.lld.MovieTicketBookingSystem.Factory;

import com.lld.MovieTicketBookingSystem.DAO;
import com.lld.MovieTicketBookingSystem.Seat;
import com.lld.MovieTicketBookingSystem.SeatType;

public class SeatFactory {
    private static long id = 0;
    public static Seat getInstance(SeatType seatType, double cost, String theaterId, String movieId){
        Seat seat = new Seat(seatType,String.valueOf(++id), cost, theaterId, movieId);
        DAO.addSeat(seat);
        return seat;
    }
}
