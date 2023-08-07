package com.java.design.pattern.factory;

import com.java.design.pattern.factory.implementation.EmailNotification;
import com.java.design.pattern.factory.implementation.PushNotification;
import com.java.design.pattern.factory.implementation.SMSNotification;

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}

