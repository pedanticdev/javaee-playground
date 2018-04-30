package com.airhacks.ping.boundary;

import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.interceptor.Interceptor;

@RequestScoped
public class MyMessageReceiver {


    void messageReceiver1(@Observes @Priority(Interceptor.Priority.APPLICATION +200) String message) {
        System.out.println(message + ". Message logged form method 1 with lower priority");
    }


    void messageReceiver2(@Observes @Priority(Interceptor.Priority.APPLICATION ) String message) {
        System.out.println(message + ". Message logged form method 2 with higher priority");
    }
}
