package com.lld.SocialMedia.Entity;

import java.util.ArrayList;

public class Comment extends Entity{
    private String content;
    private String parentId;

    public Comment(String id, String content) {
        this.id = id;
        this.content = content;
        likes = new ArrayList<>();
    }

    public String getParentId() {
        return parentId;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void editContent(String content) {
        this.content = content;
    }
}
