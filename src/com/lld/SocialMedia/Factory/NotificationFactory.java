package com.lld.SocialMedia.Factory;

import com.lld.SocialMedia.Entity.Notification;
import com.sun.tools.corba.se.idl.constExpr.Not;

public class NotificationFactory {
    private static long id = 0;
    public static Notification getNotification(String content) {
        return new Notification(String.valueOf(++id), content);
    }
}
