 vert.x Multi Language app

This is a sample app that compiles with Maven, using the vert.x framework.

There is a master verticle, SampleMain, which deploys the other three verticles:

1. Sender - this simply dispatches an event to the address "receiver.request"
2. Receiver - this handles any events at the address "receiver.request"
3. Ruby Verticle - this starts an echo server on port 1234

The point of this sample app is to show how Java and Ruby (and other languages) could live in one application and build with Maven.

## Building

	mvn clean compile

This will download the vert.x dependencies for Version 1.1.0. As none of the vert.x stuff is in a central Maven repo, I've loaded the two jars into my own Nexus repo and made it openly available. Version 1.2.1 is out but I haven't tested it yet.

## Running

After building

	cd <projectdir>/target/classes
	
Assuming vertx 1.1.0 is in your path:

	vertx run com.tfto.vertx.SampleMain

You should see something like:

	Receiver Started
	Sender Started
	Message Received Hello Receiver!
	Started

The sender waits 2000ms before firing an event. The Receiver registers the event.

Then test out the Ruby Verticle: In a terminal window

	telnet localhost 1234

And see everything you type echoed back.

The whole project works fine with IntelliJ. There's also `mvn package` which will copy the jar
dependencies into a `lib` folder.