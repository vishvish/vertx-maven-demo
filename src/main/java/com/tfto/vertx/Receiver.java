package com.tfto.vertx;

import org.vertx.java.core.Handler;
import org.vertx.java.core.eventbus.EventBus;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.deploy.Verticle;

public class Receiver extends Verticle {

    @Override
    public void start() throws Exception {
        System.out.println("Receiver Started");

        EventBus eb = vertx.eventBus();

        Handler<Message> validationHandler = new Handler<Message>() {

            public void handle(Message message) {
                System.out.println("Message Received " + message.body);
            }
        };

        eb.registerHandler("receiver.request", validationHandler);

    }
}
