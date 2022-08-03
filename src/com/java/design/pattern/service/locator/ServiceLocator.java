package com.java.design.pattern.service.locator;

public class ServiceLocator {
    private static Cache cache = new Cache();
    public static MessagingService getService(String serviceName) {

        MessagingService service = cache.getService(serviceName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        MessagingService service1 = (MessagingService) context
                .lookup(serviceName);
        cache.addService(serviceName, service1);
        return service1;
    }
}
