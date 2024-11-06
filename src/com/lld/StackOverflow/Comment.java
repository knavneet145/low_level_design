package com.lld.StackOverflow;

import java.util.ArrayList;
import java.util.List;

public class Comment implements Entity{
    private final String id;
    private final String parentId;
    private final String content;
    private final List<Vote> votes;
    private final Tag tag;

    public Comment(String id, String parent, String content, Tag tag) {
        this.id = id;
        this.parentId = parent;
        this.content = content;
        this.votes = new ArrayList<>();
        this.tag = tag;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getParent() {
        return parentId;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public Tag getTag() {
        return tag;
    }

    @Override
    public String getParentId() {
        return parentId;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    @Override
    public void upvote(Vote vote) {
        votes.add(vote);
    }
}
