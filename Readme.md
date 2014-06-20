# vert.x Multi Language app

## Updated for vert.x 2.1

Updated maven build and all code to run on latest vert.x

--

This is a sample app that compiles with Maven, using the vert.x framework.

There is a master verticle, SampleMain, which deploys the other three verticles:

1. Sender - this simply dispatches an event to the address "receiver.request"
2. Receiver - this handles any events at the address "receiver.request"
3. Ruby Verticle - this starts an echo server on port 1234
4. Javascript Verticle - starts a webserver on port 8080

The point of this sample app is to show how Java and Ruby (and other languages) could live in one application and build with Maven.

## OS X

Install vert.x with Homebrew

  brew install vert.x

## Building

	mvn clean compile

## Running

After building

	cd <projectdir>/target/classes
	
Assuming vertx is in your path.

	vertx run com.tfto.vertx.SampleMain

You should see something like:

	Receiver Started
	Sender Started
	Message Received Hello Receiver!
	Started

The sender waits 2000ms before firing an event. The Receiver registers the event.

Then test out the Ruby Verticle in a terminal window

	telnet localhost 1234

Then test out the Javascript Verticle in your browser

    http://localhost:8080

And see everything you type echoed back.

The whole project works fine with IntelliJ.
