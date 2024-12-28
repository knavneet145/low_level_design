package com.lld.SocialMedia.Entity;

import java.util.List;

public abstract class Entity {
    String id;
    String userId;
    List<Like> likes;

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public void addLike(Like like) {
        likes.add(like);
    }

    public void removeLike(String like) {
        likes.remove(like);
    }

}
