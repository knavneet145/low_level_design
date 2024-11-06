package com.lld.StackOverflow;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class StackOverflow {

    private final ConcurrentHashMap<String, Entity> entities = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>();
    private static StackOverflow instance;

    public static StackOverflow getInstance() {
        if (instance == null) {
            instance = new StackOverflow();
        }
        return instance;
    }

    public void createUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void postQuestion(Question question) {
        entities.put(question.getId(), question);
    }

    public void postAnswer(Answer answer) {
        entities.put(answer.getId(), answer);
    }

    public void postComment(Comment comment) {
        entities.put(comment.getId(), comment);
    }

    public void upvoteEntity(String entityId, String userId) {
        Entity entity = entities.get(entityId);
        entity.upvote(new Vote(userId, entityId));
    }

    public List<Entity> search(String keyWord) {
        List<Entity> result = new ArrayList<>();
        for (Entity entity: entities.values()) {
            String content = entity.getContent();
            if (content.contains(keyWord)) {
                result.add(entity);
            }
        }
        return result;
    }
}
