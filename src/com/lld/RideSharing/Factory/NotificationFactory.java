package com.lld.RideSharing.Factory;

import com.lld.RideSharing.Constants.NotificationType;
import com.lld.RideSharing.Notification;
import com.lld.RideSharing.User;

public class NotificationFactory {
    public static Notification generateNotification(NotificationType notificationType, User reciever) {
        return new Notification(reciever.getId(), notificationType);
    }
}
