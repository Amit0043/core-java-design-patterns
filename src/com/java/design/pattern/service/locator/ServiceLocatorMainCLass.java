package com.java.design.pattern.service.locator;

public class ServiceLocatorMainCLass {
    public static void main(String[] args) {
        MessagingService service
                = ServiceLocator.getService("EmailService");
        String email = service.getMessageBody();
        System.out.println(email+" Object Address => "+service);

        MessagingService smsService
                = ServiceLocator.getService("SMSService");
        String sms = smsService.getMessageBody();
        System.out.println(sms+" Object Address => "+smsService);

        MessagingService emailService
                = ServiceLocator.getService("EmailService");
        String newEmail = emailService.getMessageBody();
        System.out.println(newEmail+" Object Address => "+emailService);

        MessagingService smsService2
                = ServiceLocator.getService("SMSService");
        String sms2 = smsService.getMessageBody();
        System.out.println(sms+" Object Address => "+smsService2);

        MessagingService otherService
                = ServiceLocator.getService("OtherService");
        String other = smsService.getMessageBody();
        System.out.println(sms+" Object Address => "+otherService);
    }
}
