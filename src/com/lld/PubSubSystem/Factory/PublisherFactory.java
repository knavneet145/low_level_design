package com.lld.PubSubSystem.Factory;

import com.lld.PubSubSystem.Publisher;
import com.lld.PubSubSystem.Topic;

public class PublisherFactory {
    public static Publisher getPublisherInstance(Topic topic) {
        return new Publisher(topic);
    }
}
