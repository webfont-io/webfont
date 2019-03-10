var messages = require('./lib/webfont_pb.js');
var services = require('./lib/webfont_grpc_pb.js');

var grpc = require('grpc');

function main() {
  var client = new services.GreeterClient('localhost:5000',grpc.credentials.createInsecure());
  var request = new messages.FontListRequest({"apikey":"5873b2bc-84e7-490b-b637-58aaf7d59240"});
  client.fontList(request, function(err, response) {
    console.log('Greeting:', response.getMessage());
  });
}

main();