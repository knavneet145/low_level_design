package com.lld.SocialMedia.Entity;

public class Like {
    private final String id;
    private final String entityId;
    private final String ownerId;

    public Like(String id, String entityId, String userId) {
        this.id = id;
        this.entityId = entityId;
        this.ownerId = userId;
    }

    public String getId() {
        return id;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getownerId() {
        return ownerId;
    }
}
