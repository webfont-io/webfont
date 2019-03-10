// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var webfont_pb = require('./webfont_pb.js');

function serialize_webfontsdk_FontBuildBufResult(arg) {
  if (!(arg instanceof webfont_pb.FontBuildBufResult)) {
    throw new Error('Expected argument of type webfontsdk.FontBuildBufResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_FontBuildBufResult(buffer_arg) {
  return webfont_pb.FontBuildBufResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_FontBuildRequest(arg) {
  if (!(arg instanceof webfont_pb.FontBuildRequest)) {
    throw new Error('Expected argument of type webfontsdk.FontBuildRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_FontBuildRequest(buffer_arg) {
  return webfont_pb.FontBuildRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_FontListRequest(arg) {
  if (!(arg instanceof webfont_pb.FontListRequest)) {
    throw new Error('Expected argument of type webfontsdk.FontListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_FontListRequest(buffer_arg) {
  return webfont_pb.FontListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_FontListResult(arg) {
  if (!(arg instanceof webfont_pb.FontListResult)) {
    throw new Error('Expected argument of type webfontsdk.FontListResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_FontListResult(buffer_arg) {
  return webfont_pb.FontListResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_MultFontBuildBufResult(arg) {
  if (!(arg instanceof webfont_pb.MultFontBuildBufResult)) {
    throw new Error('Expected argument of type webfontsdk.MultFontBuildBufResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_MultFontBuildBufResult(buffer_arg) {
  return webfont_pb.MultFontBuildBufResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_MultFontBuildRequest(arg) {
  if (!(arg instanceof webfont_pb.MultFontBuildRequest)) {
    throw new Error('Expected argument of type webfontsdk.MultFontBuildRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_MultFontBuildRequest(buffer_arg) {
  return webfont_pb.MultFontBuildRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


// The greeting service definition.
var GreeterService = exports.GreeterService = {
  // BuildFont
  buildFont: {
    path: '/webfontsdk.Greeter/BuildFont',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.FontBuildRequest,
    responseType: webfont_pb.FontBuildBufResult,
    requestSerialize: serialize_webfontsdk_FontBuildRequest,
    requestDeserialize: deserialize_webfontsdk_FontBuildRequest,
    responseSerialize: serialize_webfontsdk_FontBuildBufResult,
    responseDeserialize: deserialize_webfontsdk_FontBuildBufResult,
  },
  // MultBuildFont
  multBuildFont: {
    path: '/webfontsdk.Greeter/MultBuildFont',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.MultFontBuildRequest,
    responseType: webfont_pb.MultFontBuildBufResult,
    requestSerialize: serialize_webfontsdk_MultFontBuildRequest,
    requestDeserialize: deserialize_webfontsdk_MultFontBuildRequest,
    responseSerialize: serialize_webfontsdk_MultFontBuildBufResult,
    responseDeserialize: deserialize_webfontsdk_MultFontBuildBufResult,
  },
  // Get my fontlist
  fontList: {
    path: '/webfontsdk.Greeter/FontList',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.FontListRequest,
    responseType: webfont_pb.FontListResult,
    requestSerialize: serialize_webfontsdk_FontListRequest,
    requestDeserialize: deserialize_webfontsdk_FontListRequest,
    responseSerialize: serialize_webfontsdk_FontListResult,
    responseDeserialize: deserialize_webfontsdk_FontListResult,
  },
};

exports.GreeterClient = grpc.makeGenericClientConstructor(GreeterService);
