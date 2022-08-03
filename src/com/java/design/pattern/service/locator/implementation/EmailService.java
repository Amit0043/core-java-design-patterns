package com.java.design.pattern.service.locator.implementation;

import com.java.design.pattern.service.locator.MessagingService;

public class EmailService implements MessagingService {
    public String getMessageBody() {
        return "email message";
    }

    public String getServiceName() {
        return "EmailService";
    }
}
