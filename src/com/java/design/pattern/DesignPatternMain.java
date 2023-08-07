package com.java.design.pattern;

import com.java.design.pattern.factory.Notification;
import com.java.design.pattern.factory.NotificationFactory;

public class DesignPatternMain {
    public static void main(String[] args) {
        //singletonPractise();
        factoryPractise();
    }

    private static void singletonPractise(){
        SingletonService serviceX = SingletonService.getInstance();
        SingletonService serviceY = SingletonService.getInstance();
        SingletonService serviceZ = SingletonService.getInstance();

        System.out.println(serviceX.getData());
        System.out.println(serviceY.getData());
        System.out.println(serviceZ.getData());

        serviceX.setData("Data changed by Object X change");

        System.out.println(serviceX.getData());
        System.out.println(serviceY.getData());
        System.out.println(serviceZ.getData());

    }

    private static void factoryPractise(){
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

    }
}
