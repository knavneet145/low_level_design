package com.lld.StackOverflow;

public class User {
    private String userId;
    private String userName;
    private String userHandle;

    public User(String userId, String userName, String userHandle) {
        this.userId = userId;
        this.userName = userName;
        this.userHandle = userHandle;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserHandle() {
        return userHandle;
    }
}
