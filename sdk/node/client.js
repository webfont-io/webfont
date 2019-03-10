var messages = require('./webfont_pb');
var services = require('./webfont_grpc_pb');

var grpc = require('grpc');

function main() {
  var client = new services.GreeterClient('localhost:5000',
                                          grpc.credentials.createInsecure());
  var request = new messages.HelloRequest();
  var user;
  if (process.argv.length >= 3) {
    user = process.argv[2];
  } else {
    user = 'world';
  }
  request.setName(user);
  client.sayHello(request, function(err, response) {
    console.log('Greeting:', response.getMessage());
  });
}

main();