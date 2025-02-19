package com.lld.PubSubSystem.Factory;

import com.lld.PubSubSystem.Topic;

public class TopicFactory {
    public static Topic getTopicInstance() {
        return new Topic();
    }
}
