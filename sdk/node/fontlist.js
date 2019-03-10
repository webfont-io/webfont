var messages = require('./lib/webfont_pb');
var services = require('./lib/webfont_grpc_pb');

var grpc = require('grpc');
var client = new services.GreeterClient('localhost:5000',grpc.credentials.createInsecure());

function fontlist() {
  var request = new messages.FontListRequest();
  request.setApikey("798e7dac-bdd4-4049-b03c-7cce5832e013")
  client.fontList(request, function(err, response) {
    if (err!=null) {
      console.log("err Code", err.code, "detail:", err.details)
      return;
    }
    var maps = response.getFontsMap();
    console.log("maps",maps);
  });
}
fontlist();


