# This is your basic example echo server.

# Telnet to localhost port 1234

require "vertx"
include Vertx

@server = NetServer.new.connect_handler { | socket |
  Pump.new( socket, socket ).start
}.listen( 1234, 'localhost' )

def vertx_stop
  @server.close
end
