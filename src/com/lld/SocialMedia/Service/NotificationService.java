package com.lld.SocialMedia.Service;

import com.lld.SocialMedia.Constants.NotificationType;
import com.lld.SocialMedia.Entity.Notification;
import com.lld.SocialMedia.Entity.Profile;
import com.lld.SocialMedia.Entity.User;
import com.lld.SocialMedia.Repository.SocialMediaRepository;

public class NotificationService {
    private static long notificationId = 0;

    public static void notify(String recieverId, String senderId, NotificationType notificationType) {
        Profile recieverProfile = SocialMediaRepository.getProfile(recieverId);
        User senderUser = SocialMediaRepository.getUser(senderId);
        Notification notification = null;
        if (notificationType == NotificationType.FRIEND_REQUEST) {
            notification = new Notification(String.valueOf(++notificationId), senderUser.getName() + " has sent you the friend request");
        }

        else if (notificationType == NotificationType.COMMENT) {
            notification = new Notification(String.valueOf(++notificationId), senderUser.getName() + " has commented on your post");
        }

        else if (notificationType == NotificationType.LIKE) {
            notification = new Notification(String.valueOf(++notificationId), senderUser.getName() + " has liked your post");
        }

        else {
            notification = new Notification("0", "ignore the notification");
        }

        recieverProfile.addNotification(notification);
    }
}
