package com.lld.PubSubSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Topic {
    private final LinkedList<Message> content;
    private final List<Subscriber> subscribers = new ArrayList<>();

    public Topic() {
        this.content = new LinkedList<>();
    }

    public void publish(Message message) {
        content.add(message);
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void onMessageRecieved() {
        for (Subscriber subscriber: subscribers) {
            for (Message message: content) {
                subscriber.addContent(message);
            }
            subscriber.notifySubscriber();
        }
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
