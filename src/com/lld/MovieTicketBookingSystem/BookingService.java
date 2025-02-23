package com.lld.MovieTicketBookingSystem;

import com.lld.MovieTicketBookingSystem.Factory.BookingFactory;
import com.lld.RideSharing.ServiceUtil.PaymentService;
import java.util.List;

public class BookingService {
    public static boolean book(User user, List<String> seats, Show show) {
        double totalCost = 0;
        for(String seatId: seats) {
            Seat seat = DAO.getSeat(seatId);
            totalCost += seat.getCost();
            if (seat.getStatus() == SeatStatus.OCCUPIED) return false;
        }

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(totalCost);
        for (String seatId: seats) {
            Seat seat = DAO.getSeat(seatId);
            seat.setStatus(SeatStatus.OCCUPIED);
        }
        Booking booking = BookingFactory.getInstance(user.getUserId(), seats, show);
        user.addUpcomingBooking(booking);
        return true;
    }
}
