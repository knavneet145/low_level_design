package com.lld.RideSharing;

import com.lld.RideSharing.Constants.NotificationType;
import com.lld.RideSharing.Constants.PaymentStatus;
import com.lld.RideSharing.Constants.RideStatus;
import com.lld.RideSharing.Factory.TransactionFactory;
import com.lld.RideSharing.ServiceUtil.FareCalculationService;
import com.lld.RideSharing.ServiceUtil.NearByDrivers;
import com.lld.RideSharing.ServiceUtil.NotificationService;

import java.util.List;

public class RideSharingService {
    private static RideSharingService rideSharingService;

    public static RideSharingService getInstance() {
        if (rideSharingService == null) {
            rideSharingService = new RideSharingService();
        }
        return rideSharingService;
    }

    private RideSharingService() {
    }

    public void requestRide(Ride ride) {
        List<User> nearByDrivers = NearByDrivers.findNearByDrivers(ride.getSrc());
        for (User driver: nearByDrivers) {
            if (driver instanceof Driver) {
                ((Driver) driver).addRequest(ride);
                NotificationService.notify(driver, NotificationType.Request);
            }
        }
    }

    public void acceptRide(Ride ride, Driver driver) {
        driver.acceptRequest(ride, driver);
        NotificationService.notify(driver, NotificationType.RideAccepted);
    }

    public void declineRide(Ride ride, Driver driver) {
        driver.declineRequest(ride);
    }

    public void onRideComplete(Ride ride) {
        ride.getPassanger().ongoingRide = null;
        ride.getDriver().ongoingRide = null;
        ride.setRideStatus(RideStatus.COMPLETED);
        NotificationService.notify(ride.getDriver(), NotificationType.RideComplete);

        double fare = FareCalculationService.calculateFare(ride);
        System.out.println("please pay the amount "+fare);
        ride.getPassanger().makePayment(fare);
        ride.setPaymentStatus(PaymentStatus.COMPLETED);
        NotificationService.notify(ride.getPassanger(), NotificationType.PaymentCompleted);
        ride.getPassanger().addTransaction(TransactionFactory.getTransaction(fare, ride.getPaymentType()));
    }
}
