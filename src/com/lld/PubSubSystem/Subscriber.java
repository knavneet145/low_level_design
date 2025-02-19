package com.lld.PubSubSystem;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {
    private final String name;
    private List<Message> content;
    private final Topic topic;

    public Subscriber(Topic topic, String name) {
        this.content = new ArrayList<>();
        this.topic = topic;
        this.name = name;
        topic.subscribe(this);
    }

    public void addContent(Message message) {
        content.add(message);
    }

    public void notifySubscriber() {
        PrintSubscriber.printSubscriber(content, name);
        content.clear();
    }

    public void unSubscribe() {
        topic.unsubscribe(this);
    }
}
