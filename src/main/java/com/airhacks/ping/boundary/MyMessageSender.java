package com.airhacks.ping.boundary;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;


@RequestScoped
public class MyMessageSender {


    @Inject
    Event<String> messageEvent;


    public void sendMessage() {
        messageEvent.fire("Message event fired!");

    }



}
