package com.tfto.vertx;

import org.vertx.java.deploy.Verticle;

public class SampleMain extends Verticle {

    public void start() {
        container.deployVerticle("com.tfto.vertx.Receiver");
        container.deployVerticle("com.tfto.vertx.Sender");
        container.deployVerticle("ruby_verticle.rb");
        container.deployVerticle("app.js");
    }
}