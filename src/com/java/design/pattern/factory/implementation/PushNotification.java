package com.java.design.pattern.factory.implementation;

import com.java.design.pattern.factory.Notification;

public class PushNotification implements Notification {

    @Override
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending a push notification");
    }
}

