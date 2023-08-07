package com.java.design.pattern.factory.implementation;

import com.java.design.pattern.factory.Notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an e-mail notification");
    }
}

