package com.lld.PubSubSystem;

import java.util.List;

public class PrintSubscriber {
    public static void printSubscriber(List<Message> messageList, String name) {
        System.out.println("showing data in " + name);
        for (Message message: messageList) {
            System.out.println(message.getContent());
        }
    }
}
