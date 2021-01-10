package com.kodilla.exception.nullpointer;

import com.kodilla.exception.nullpointer.MessageSender;
import com.kodilla.exception.nullpointer.User;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {
/*        User user = null;
        MessageSender messageSender = new MessageSender();
        messageSender.sendMessageTo(user, "Hello!");*/

        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "hello");
        } catch (MessageNotSentException e) {
            System.out.println("Message is not send," +
                    "but my program still running very well!");
        }

        System.out.println("Processing other logic!");
    }
}
