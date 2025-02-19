package com.lld.PubSubSystem;

import com.lld.PubSubSystem.Factory.SubscriberFactory;
import com.lld.PubSubSystem.Factory.TopicFactory;

public class PubSubSystemDemo implements Runnable {
    public void run() {
        PubSubSystemManager manager = new PubSubSystemManager();
        Topic topic = TopicFactory.getTopicInstance();
        Subscriber subscriber = new Subscriber(topic, "T.V.");
        Subscriber subscriber1 = SubscriberFactory.getSubscriberInstance(topic, "Laptop screen");
        Publisher publisher = new Publisher(topic);
        publisher.publishMessage(new Message("Hi, how are you."));
    }
}
