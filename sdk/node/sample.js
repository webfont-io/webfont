var messages = require('./lib/webfont_pb');
var services = require('./lib/webfont_grpc_pb');

var grpc = require('grpc');
var client = new services.GreeterClient('localhost:5000',grpc.credentials.createInsecure());

function fontlist() {
  var request = new messages.FontListRequest();
  request.setApikey("798e7dac-bdd4-4049-b03c-7cce5832e013")
  client.fontList(request, function(err, response) {
    console.log("err", err);
    var maps = response.getFontsMap();
    console.log("maps",maps);
  });
}


function fontbuild() {
  var request = new messages.FontBuildRequest();
  request.setApikey("798e7dac-bdd4-4049-b03c-7cce5832e013");
  request.setFontId(45803);
  request.setText("中文字体");
  request.setNeedTtf(true);
  request.setNeedEot(false);
  request.setNeedWoff(false);

  client.buildFont(request, function(err, response) {
    console.log("err", err);
    console.log("ttf",response.getBytesTtf());
  });
}


fontlist();
fontbuild();