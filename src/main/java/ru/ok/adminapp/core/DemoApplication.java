package ru.ok.adminapp.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Queue;

@SpringBootApplication
public class DemoApplication {

    private static int APPLICATION_PORT = 8080;
    protected static HashMap<Long, Queue<Comment>> queues;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        SubscriptionService.subscribe("http://localhost:" + APPLICATION_PORT + "/spring-rest", 0, 0);
        queues = new HashMap<>();
    }

}
