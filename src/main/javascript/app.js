load('vertx.js');

var webServerConf = {  
  port: 8080,
  host: 'localhost'
};

// Start the web server, with the config we defined above

vertx.deployModule('vertx.web-server-v1.0', webServerConf);