package com.example;

import com.example.client.GreetingClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.example.config.AppConfig.class);
        GreetingClient client = context.getBean(GreetingClient.class);
        client.showGreeting("World");
    }
}
