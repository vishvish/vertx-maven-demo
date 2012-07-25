package com.tfto.vertx;

import org.vertx.java.core.eventbus.EventBus;
import org.vertx.java.deploy.Verticle;

public class Sender extends Verticle {

    @Override
    public void start() throws Exception {
        System.out.println("Sender Started");

        EventBus eb = vertx.eventBus();
        
        Thread.sleep(2000); // wait for the Receiver to be ready :)
        
        eb.publish("receiver.request", "Hello Receiver!");

    }
}
