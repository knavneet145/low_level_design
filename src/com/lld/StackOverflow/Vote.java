package com.lld.StackOverflow;

public class Vote {
    private String userId;
    private String parentId;

    public Vote(String userId, String parentId) {
        this.userId = userId;
        this.parentId = parentId;
    }

    public String getUserId() {
        return userId;
    }

    public String getParentId() {
        return parentId;
    }
}
