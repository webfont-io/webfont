// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webfont.proto

package io.grpc.sdk.webfont;

public final class WebfontProto {
  private WebfontProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_webfontsdk_FontListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_webfontsdk_FontListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_webfontsdk_FontListResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_webfontsdk_FontListResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_webfontsdk_FontListResult_FontsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_webfontsdk_FontListResult_FontsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_webfontsdk_FontBuildRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_webfontsdk_FontBuildRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_webfontsdk_MultFontBuildRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_webfontsdk_MultFontBuildRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_webfontsdk_FontBuildBufResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_webfontsdk_FontBuildBufResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_webfontsdk_MultFontBuildBufResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_webfontsdk_MultFontBuildBufResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rwebfont.proto\022\nwebfontsdk\"!\n\017FontListR" +
      "equest\022\016\n\006apikey\030\001 \001(\t\"t\n\016FontListResult" +
      "\0224\n\005fonts\030\001 \003(\0132%.webfontsdk.FontListRes" +
      "ult.FontsEntry\032,\n\nFontsEntry\022\013\n\003key\030\001 \001(" +
      "\r\022\r\n\005value\030\002 \001(\003:\0028\001\"x\n\020FontBuildRequest" +
      "\022\017\n\007font_id\030\001 \001(\r\022\014\n\004text\030\002 \001(\t\022\016\n\006apike" +
      "y\030\003 \001(\t\022\020\n\010need_ttf\030\004 \001(\010\022\020\n\010need_eot\030\005 " +
      "\001(\010\022\021\n\tneed_woff\030\006 \001(\010\"C\n\024MultFontBuildR" +
      "equest\022+\n\005items\030\001 \003(\0132\034.webfontsdk.FontB" +
      "uildRequest\"\244\001\n\022FontBuildBufResult\022\017\n\007fo" +
      "nt_id\030\001 \001(\r\022\033\n\023font_format_version\030\002 \001(\r" +
      "\022\025\n\rfont_checksum\030\003 \001(\r\022\017\n\007name_en\030\004 \001(\t" +
      "\022\021\n\tbytes_ttf\030\005 \001(\014\022\021\n\tbytes_eot\030\006 \001(\014\022\022" +
      "\n\nbytes_woff\030\007 \001(\014\"G\n\026MultFontBuildBufRe" +
      "sult\022-\n\005items\030\001 \003(\0132\036.webfontsdk.FontBui" +
      "ldBufResult2\366\001\n\007Greeter\022K\n\tBuildFont\022\034.w" +
      "ebfontsdk.FontBuildRequest\032\036.webfontsdk." +
      "FontBuildBufResult\"\000\022W\n\rMultBuildFont\022 ." +
      "webfontsdk.MultFontBuildRequest\032\".webfon" +
      "tsdk.MultFontBuildBufResult\"\000\022E\n\010FontLis" +
      "t\022\033.webfontsdk.FontListRequest\032\032.webfont" +
      "sdk.FontListResult\"\000B%\n\023io.grpc.sdk.webf" +
      "ontB\014WebfontProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_webfontsdk_FontListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_webfontsdk_FontListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_webfontsdk_FontListRequest_descriptor,
        new java.lang.String[] { "Apikey", });
    internal_static_webfontsdk_FontListResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_webfontsdk_FontListResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_webfontsdk_FontListResult_descriptor,
        new java.lang.String[] { "Fonts", });
    internal_static_webfontsdk_FontListResult_FontsEntry_descriptor =
      internal_static_webfontsdk_FontListResult_descriptor.getNestedTypes().get(0);
    internal_static_webfontsdk_FontListResult_FontsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_webfontsdk_FontListResult_FontsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_webfontsdk_FontBuildRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_webfontsdk_FontBuildRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_webfontsdk_FontBuildRequest_descriptor,
        new java.lang.String[] { "FontId", "Text", "Apikey", "NeedTtf", "NeedEot", "NeedWoff", });
    internal_static_webfontsdk_MultFontBuildRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_webfontsdk_MultFontBuildRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_webfontsdk_MultFontBuildRequest_descriptor,
        new java.lang.String[] { "Items", });
    internal_static_webfontsdk_FontBuildBufResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_webfontsdk_FontBuildBufResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_webfontsdk_FontBuildBufResult_descriptor,
        new java.lang.String[] { "FontId", "FontFormatVersion", "FontChecksum", "NameEn", "BytesTtf", "BytesEot", "BytesWoff", });
    internal_static_webfontsdk_MultFontBuildBufResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_webfontsdk_MultFontBuildBufResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_webfontsdk_MultFontBuildBufResult_descriptor,
        new java.lang.String[] { "Items", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
