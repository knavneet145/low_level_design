package com.lld.StackOverflow;

import java.util.List;

public class StackOverflowDemo extends Thread {
    private final String commentId = "2";
    private long entityId = 0;
    private long userId = 0;

    @Override
    public void start() {
        StackOverflow stackOverflow = StackOverflow.getInstance();
        User user = new User(String.valueOf(++userId), "user1", "user1Handle");
        // id: 01
        String questionId = "0";
        Question question = new Question(questionId + (++entityId), "what happens when we divide by 0", new Tag(EntityType.QUESTION, "1"));
        stackOverflow.postQuestion(question);
        List<Entity> result = stackOverflow.search("divide by 0");
        for (Entity entity: result) {
            System.out.println("type: " +entity.getTag().getType() + " Id: "+ entity.getId());
            System.out.println(entity.getContent());
            System.out.println(" ");
        }
        // id: 12
        String answerId = "1";
        Answer answer = new Answer(answerId + (++entityId), "it is undefined behaviour when we divide by 0", new Tag(EntityType.ANSWER, "12"), "01");
        stackOverflow.postAnswer(answer);
        result = stackOverflow.search("divide by 0");

        for (Entity entity: result) {
            System.out.println("type: " + entity.getTag().getType() + " Id: "+ entity.getId());
            System.out.println(entity.getContent());
            System.out.println(" ");
        }
    }
}
