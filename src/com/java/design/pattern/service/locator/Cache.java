package com.java.design.pattern.service.locator;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private Map<String,MessagingService> services = new HashMap<>();

    public MessagingService getService(String serviceName) {
        return  this.services.get(serviceName);
    }

    public void addService(String serviceName, MessagingService newService) {
        this.services.put(serviceName, newService);
    }
}
