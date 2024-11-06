package com.lld.StackOverflow;

public interface Entity {
    public String getContent();
    public Tag getTag();
    public String getParentId();
    public String getId();
    public void upvote(Vote vote);
}
