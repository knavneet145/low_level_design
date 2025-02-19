package com.lld.PubSubSystem;

public class Publisher {
    private Topic topic;

    public Publisher(Topic topic) {
        this.topic = topic;
    }

    public void publishMessage(Message message) {
        topic.publish(message);
        topic.onMessageRecieved();
    }
}
