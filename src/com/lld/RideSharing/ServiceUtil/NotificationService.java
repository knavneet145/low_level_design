package com.lld.RideSharing.ServiceUtil;

import com.lld.RideSharing.Constants.NotificationType;
import com.lld.RideSharing.Factory.NotificationFactory;
import com.lld.RideSharing.Notification;
import com.lld.RideSharing.User;

public class NotificationService {
    public static void notify(User user, NotificationType notificationType) {
        Notification notification = NotificationFactory.generateNotification(notificationType, user);
        System.out.println(notification.getContent());
    }
}
