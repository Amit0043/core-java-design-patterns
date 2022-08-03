package com.java.design.pattern.service.locator.implementation;

import com.java.design.pattern.service.locator.MessagingService;

public class SmsService implements MessagingService {
    public String getMessageBody() {
        return "sms message";
    }

    public String getServiceName() {
        return "SmsService";
    }
}
