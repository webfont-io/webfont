var messages = require('./lib/webfont_pb');
var services = require('./lib/webfont_grpc_pb');

var grpc = require('grpc');
var client = new services.GreeterClient('localhost:5000',grpc.credentials.createInsecure());

function fontbuild() {
    var request = new messages.FontBuildRequest();
    request.setApikey("798e7dac-bdd4-4049-b03c-7cce5832e013");      //replace your apikey here, config in /usr/etc/webfont/conf/conf.yml
    request.setFontId(45803);
    request.setText("中文字体测试");
    request.setNeedTtf(true);
    request.setNeedEot(true);
    request.setNeedWoff(false);

    client.buildFont(request, function(err, response) {
      if (err!=null) {
          console.log("err Code", err.code, "detail:", err.details)
          return;
      }
      console.log("ttf",response.getBytesTtf().length);
      console.log("eot",response.getBytesEot().length);
      console.log("woff",response.getBytesWoff().length);
    });
  }
  
  
fontbuild();