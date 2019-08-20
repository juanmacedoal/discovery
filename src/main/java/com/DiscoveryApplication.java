package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Discovery service based in Eureka
 * 
 *
 */
@SpringBootApplication
public class DiscoveryApplication {
    
    /**
     * Run the server.
     * 
     * @param args {@link String}[]
     */
    public static void main(
        final String[] args){
        SpringApplication.run(DiscoveryApplication.class, args);
    }
}
