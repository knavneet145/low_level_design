package com.lld.SocialMedia.Entity;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private String profilePicLink;
    private String bio;
    private String interest;
    private String userId;
    private final List<String> requests = new ArrayList<>();
    private final List<Notification> notifications = new ArrayList<>();
    private final List<String> posts = new ArrayList<>();
    private final List<String> friends = new ArrayList<>();

    public Profile(String profilePicLink, String bio, String interest, String id) {
        this.profilePicLink = profilePicLink;
        this.bio = bio;
        this.interest = interest;
        this.userId = id;
    }

    public String getProfilePicLink() {
        return profilePicLink;
    }

    public String getBio() {
        return bio;
    }

    public String getInterest() {
        return interest;
    }

    public String getUserId() {
        return userId;
    }

    public List<String> getRequests() {
        return requests;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void addNotification(Notification notification) {
        notifications.add(notification);
    }

    public void addRequest(String senderId) {
        requests.add(senderId);
    }

    public void editProfile(String profilePicLink, String bio, String interest, String id) {
        this.profilePicLink = profilePicLink;
        this.bio = bio;
        this.interest = interest;
        this.userId = id;
    }

    public void addPost(String post) {
        posts.add(post);
    }

    public void addFriend(String userId) {
        friends.add(userId);
    }

    public void unfriend(String userId) {
        friends.remove(userId);
    }

    public List<String> getPosts() {
        return posts;
    }

    public List<String> getFriends() {
        return friends;
    }
}
