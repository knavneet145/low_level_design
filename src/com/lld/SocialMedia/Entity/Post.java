package com.lld.SocialMedia.Entity;

import com.lld.SocialMedia.Constants.PostVisibility;

import java.util.Date;

public class Post extends Commentable {
    private final String id;
    private String text;
    private String mediaCloudLink;
    private PostVisibility postVisibility;
    private long timeStamp;

    public Post(String id, String text, String mediaCloudLink, String user, PostVisibility visibility, long timeStamp) {
        this.id = id;
        this.text = text;
        this.mediaCloudLink = mediaCloudLink;
        this.userId = user;
        this.postVisibility = visibility;
        this.timeStamp = timeStamp;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setPostVisibility(PostVisibility postVisibility) {
        this.postVisibility = postVisibility;
    }

    public PostVisibility getPostVisibility() {
        return postVisibility;
    }

    public void editPost(String editedLink, String text) {
        this.mediaCloudLink = editedLink;
        this.text = text;
    }

    public void addComment(String commentId) {
        comments.add(commentId);
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getMediaCloudLink() {
        return mediaCloudLink;
    }

    public String getUserId() {
        return userId;
    }
}
