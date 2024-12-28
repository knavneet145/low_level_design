package com.lld.SocialMedia.Entity;

public class Notification {
    private final String id;
    private final String message;

    public Notification(String id, String content) {
        this.id = id;
        this.message = content;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return message;
    }
}
