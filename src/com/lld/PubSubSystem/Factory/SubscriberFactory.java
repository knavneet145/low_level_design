package com.lld.PubSubSystem.Factory;

import com.lld.PubSubSystem.Subscriber;
import com.lld.PubSubSystem.Topic;

public class SubscriberFactory {
    public static Subscriber getSubscriberInstance(Topic topic, String name) {
        return new Subscriber(topic, name);
    }
}
