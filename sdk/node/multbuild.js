var messages = require('./lib/webfont_pb');
var services = require('./lib/webfont_grpc_pb');

var grpc = require('grpc');
var client = new services.GreeterClient('localhost:5000',grpc.credentials.createInsecure());

function multfontbuild() {
    var request = new messages.MultFontBuildRequest();
    request.clearItemsList();

    var item = new messages.FontBuildRequest();
    item.setApikey("798e7dac-bdd4-4049-b03c-7cce5832e013");      //replace your apikey here, config in /usr/etc/webfont/conf/conf.yml
    item.setFontId(45803);
    item.setText("中文字体测试");
    item.setNeedTtf(true);
    item.setNeedEot(true);
    item.setNeedWoff(false);
    request.addItems(item);

    var item = new messages.FontBuildRequest();
    item.setApikey("798e7dac-bdd4-4049-b03c-7cce5832e013");      //replace your apikey here, config in /usr/etc/webfont/conf/conf.yml
    item.setFontId(128);
    item.setText("中文字体测试");
    item.setNeedTtf(true);
    item.setNeedEot(true);
    item.setNeedWoff(false);
    request.addItems(item);

    client.buildFont(request, function(err, response) {
      if (err!=null) {
          console.log("err Code", err.code, "detail:", err.details)
          return;
      }
      console.log("ok")
      //console.log("ttf",response.getBytesTtf().length);
      //console.log("eot",response.getBytesEot().length);
      //console.log("woff",response.getBytesWoff().length);
    });
  }


multfontbuild();
