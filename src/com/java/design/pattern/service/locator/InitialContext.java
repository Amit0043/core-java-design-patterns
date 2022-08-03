package com.java.design.pattern.service.locator;

import com.java.design.pattern.service.locator.implementation.EmailService;
import com.java.design.pattern.service.locator.implementation.SmsService;

public class InitialContext {
    public Object lookup(String serviceName) {
        if (serviceName.equalsIgnoreCase("EmailService")) {
            return new EmailService();
        } else if (serviceName.equalsIgnoreCase("SMSService")) {
            return new SmsService();
        }
        return null;
    }
}
