# Core Java Design Patterns

######[![N|Solid](https://1000logos.net/wp-content/uploads/2020/09/Java-Logo.png)](https://nodesource.com/products/nsolid)

## 1) _Service Locator Design Pattern_

The purpose of the Service Locator pattern is to return the service instances on demand

An implementation will consist of the following components:

- Client – the client object is a service consumer. It's responsible for invoking the request from the service locator
- Service Locator – is a communication entry point for returning the services from the cache
- Cache – an object for storing service references to reuse them later
- Initializer – creates and registers references to services in the cache
- Service – the Service component represents the original services or their implementation


```mermaid
classDiagram
    MessagingService <|-- EmailService
    MessagingService <|-- SmsService
    class MessagingService{
        +getMessageBody() String
        +getServiceName() String
    }
    class InitialContext{
        +lookup(service) Object
    }
    class Cache{
        -List~MessagingService~ services
        +getService(String serviceName) MessagingService
        +addService(MessagingService serviceName)
    }
    class ServiceLocator{
        -Cache cache
        +getService(String serviceName) MessagingService
    }