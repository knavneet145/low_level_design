package com.lld.RideSharing;

import com.lld.RideSharing.Constants.Constants;
import com.lld.RideSharing.Constants.NotificationType;
import com.sun.tools.corba.se.idl.constExpr.Not;

public class Notification {
    private String content;
    private final String reciever;
    private final NotificationType notificationType;

    public Notification(String reciever, NotificationType notificationType) {
        this.reciever = reciever;
        this.notificationType = notificationType;
        populateContent();
    }

    public String getContent() {
        return content;
    }

    public String getReciever() {
        return reciever;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    private void populateContent() {
        if (notificationType == NotificationType.Request) {
            content = Constants.requested;
        }
        else if (notificationType == NotificationType.RideAccepted) {
            content = Constants.rideAccepted;
        }
        else if (notificationType == NotificationType.RideComplete) {
            content = Constants.rideComplete;
        }
        else if (notificationType == NotificationType.PaymentCompleted) {
            content = Constants.paymentAccepted;
        }
    }
}
