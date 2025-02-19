package com.lld.PubSubSystem;

import java.util.ArrayList;
import java.util.List;

public class PubSubSystemManager {
    private List<Topic> topics = new ArrayList<>();
    private List<Subscriber> subscribers = new ArrayList<>();
    private List<Publisher> publishers = new ArrayList<>();

    public PubSubSystemManager() {
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void subscribeTopic(Subscriber subscriber, Topic topic) {
        topic.subscribe(subscriber);
    }
}
