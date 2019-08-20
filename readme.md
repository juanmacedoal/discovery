# Discovery Server

## Description

This is the cloud discovery service based in Eureka

## Configurations 

The discovery configuration loaded is:

```yml
eureka:
  instance:
   hostname: localhost
  client:
    registerWithEureka: false
    fetchRegistry: false
    serviceUrl:
      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
  server:
    enableSelfPreservation: false
```

## How to run
 
Just run it, no profile is required.  
