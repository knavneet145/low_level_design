package com.lld.StackOverflow;

import java.util.ArrayList;
import java.util.List;

public class Answer implements Entity {
    private final String id;
    private final String content;
    private final String parentId;
    private final List<Vote> votes = new ArrayList<>();

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getContent() {
        return content;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Tag getTag() {
        return tag;
    }

    @Override
    public String getParentId() {
        return parentId;
    }

    private final List<Comment> comments = new ArrayList<>();
    private final Tag tag;

    public Answer(String id, String content, Tag tag, String parentId) {
        this.id = id;
        this.content = content;
        this.tag = tag;
        this.parentId = parentId;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void upvote(Vote vote) {
        votes.add(vote);
    }

}
