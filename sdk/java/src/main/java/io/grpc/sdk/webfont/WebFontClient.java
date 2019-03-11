/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.grpc.sdk.webfont;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import  java.util.Date;



public class WebFontClient {
  private static final Logger logger = Logger.getLogger(WebFontClient.class.getName());

  private final ManagedChannel channel;
  private final GreeterGrpc.GreeterBlockingStub blockingStub;

  //private final string apikey;

  /** Construct client connecting to HelloWorld server at {@code host:port}. */
  public WebFontClient(String host, int port) {
    this(ManagedChannelBuilder.forAddress(host, port)
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
        // needing certificates.
        .usePlaintext()
        .build());
  }

  /** Construct client for accessing HelloWorld server using the existing channel. */
  WebFontClient(ManagedChannel channel) {
    this.channel = channel;
    blockingStub = GreeterGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  }

  /** Say hello to server. */
  public void fontlist() {
    FontListRequest request = FontListRequest.newBuilder().setApikey("798e7dac-bdd4-4049-b03c-7cce5832e013").build();
    FontListResult response;
    try{
      response=blockingStub.fontList(request);
      for (Map.Entry< Integer,Long> entry : response.getFontsMap().entrySet()) {
        Date date = new Date(entry.getValue());
        logger.log(Level.INFO,"FontId: {0}  Expire date: {1}",new Object[]{entry.getKey().toString(),date.toString()});
      }
    }catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}  Desc: {1}",new Object[] {e.getStatus().getCode().value(), e.getStatus().getDescription()});
      return;
    }
  }

  /** Say hello to server. */
  public void buildfont() {
    FontBuildRequest request = FontBuildRequest.newBuilder()
            .setApikey("798e7dac-bdd4-4049-b03c-7cce5832e013")
            .setFontId(168)
            .setText("中文字体")
            .setNeedTtf(true)
            .setNeedEot(true)
            .setNeedWoff(true)
            .build();
    FontBuildBufResult response;
    try{
      response=blockingStub.buildFont(request);
      logger.log(Level.INFO,"success build font:{0}",response.getFontId());
      logger.log(Level.INFO,"ttf len:{0}",response.getBytesTtf().size());
      logger.log(Level.INFO,"eot len:{0}",response.getBytesEot().size());
      logger.log(Level.INFO,"woff len:{0}",response.getBytesWoff().size());
    }catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}  Desc: {1}",new Object[] {e.getStatus().getCode().value(), e.getStatus().getDescription()});
      return;
    }
  }


  public void multbuild(){
    MultFontBuildRequest request = MultFontBuildRequest.newBuilder().addItems(
            FontBuildRequest.newBuilder()
                    .setApikey("798e7dac-bdd4-4049-b03c-7cce5832e013")
                    .setFontId(168)
                    .setText("中文字体")
                    .setNeedTtf(true)
                    .setNeedEot(true)
                    .setNeedWoff(true)
    ).addItems(
            FontBuildRequest.newBuilder()
                    .setApikey("798e7dac-bdd4-4049-b03c-7cce5832e013")
                    .setFontId(47023)
                    .setText("中文字体")
                    .setNeedTtf(true)
                    .setNeedEot(true)
                    .setNeedWoff(true))
            .build();
    MultFontBuildBufResult response;
    try{
      response=blockingStub.multBuildFont(request);

      for (FontBuildBufResult item : response.getItemsList()) {
        logger.log(Level.INFO,"success build font:{0}",item.getFontId());
        logger.log(Level.INFO,"ttf len:{0}",item.getBytesTtf().size());
        logger.log(Level.INFO,"eot len:{0}",item.getBytesEot().size());
        logger.log(Level.INFO,"woff len:{0}",item.getBytesWoff().size());
      }

    }catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}  Desc: {1}",new Object[] {e.getStatus().getCode().value(), e.getStatus().getDescription()});
      return;
    }
  }




  /*
    This is a reusable connection that can be automatically and reconnected.
    Built-in DNS load balancing, will automatically load balance all ips on the back end according to the incoming host.
    */
  public static WebFontClient client = new WebFontClient("localhost", 5000);


  public static void main(String[] args) throws Exception {
    for (int i = 0; i < 20; i++) {
      client.fontlist();
      Thread.sleep(1000);       //please close selfthost then reopen, you can enjoy auto reconnected.
    }

    client.buildfont();
    client.multbuild();
  }
}
