// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webfont.proto

package io.grpc.sdk.webfont;

public interface MultFontBuildRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:webfontsdk.MultFontBuildRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .webfontsdk.FontBuildRequest items = 1;</code>
   */
  java.util.List<io.grpc.sdk.webfont.FontBuildRequest> 
      getItemsList();
  /**
   * <code>repeated .webfontsdk.FontBuildRequest items = 1;</code>
   */
  io.grpc.sdk.webfont.FontBuildRequest getItems(int index);
  /**
   * <code>repeated .webfontsdk.FontBuildRequest items = 1;</code>
   */
  int getItemsCount();
  /**
   * <code>repeated .webfontsdk.FontBuildRequest items = 1;</code>
   */
  java.util.List<? extends io.grpc.sdk.webfont.FontBuildRequestOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <code>repeated .webfontsdk.FontBuildRequest items = 1;</code>
   */
  io.grpc.sdk.webfont.FontBuildRequestOrBuilder getItemsOrBuilder(
      int index);
}
