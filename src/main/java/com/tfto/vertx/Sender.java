package com.tfto.vertx;

import org.vertx.java.core.eventbus.EventBus;
import org.vertx.java.platform.Verticle;

public class Sender extends Verticle {

    public void start() {
        System.out.println("Sender Started");

        EventBus eb = vertx.eventBus();

        //Thread.sleep(2000); // wait for the Receiver to be ready :)

        eb.publish("receiver.request", "Hello Receiver!");

    }
}
