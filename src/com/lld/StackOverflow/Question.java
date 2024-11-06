package com.lld.StackOverflow;

import java.util.ArrayList;
import java.util.List;

public class Question implements Entity {
    private String id;
    private String content;
    private List<Vote> votes = new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();
    private List<Answer> answers = new ArrayList<>();

    @Override
    public String getId() {
        return id;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public Tag getTag() {
        return tag;
    }

    @Override
    public String getParentId() {
        return "";
    }

    private final Tag tag;

    public Question(String id, String content, Tag tag) {
        this.id = id;
        this.content = content;
        this.tag = tag;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void upvote(Vote vote) {
        votes.add(vote);
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    @Override
    public String getContent() {
        return content;
    }
}
