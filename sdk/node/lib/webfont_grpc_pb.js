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

function serialize_webfontsdk_GetGlyfsIndexRequest(arg) {
  if (!(arg instanceof webfont_pb.GetGlyfsIndexRequest)) {
    throw new Error('Expected argument of type webfontsdk.GetGlyfsIndexRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetGlyfsIndexRequest(buffer_arg) {
  return webfont_pb.GetGlyfsIndexRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetGlyfsIndexResult(arg) {
  if (!(arg instanceof webfont_pb.GetGlyfsIndexResult)) {
    throw new Error('Expected argument of type webfontsdk.GetGlyfsIndexResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetGlyfsIndexResult(buffer_arg) {
  return webfont_pb.GetGlyfsIndexResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetGlyfsUnicodeRequest(arg) {
  if (!(arg instanceof webfont_pb.GetGlyfsUnicodeRequest)) {
    throw new Error('Expected argument of type webfontsdk.GetGlyfsUnicodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetGlyfsUnicodeRequest(buffer_arg) {
  return webfont_pb.GetGlyfsUnicodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetGlyfsUnicodeResult(arg) {
  if (!(arg instanceof webfont_pb.GetGlyfsUnicodeResult)) {
    throw new Error('Expected argument of type webfontsdk.GetGlyfsUnicodeResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetGlyfsUnicodeResult(buffer_arg) {
  return webfont_pb.GetGlyfsUnicodeResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetMultGlyfsUnicodeRequest(arg) {
  if (!(arg instanceof webfont_pb.GetMultGlyfsUnicodeRequest)) {
    throw new Error('Expected argument of type webfontsdk.GetMultGlyfsUnicodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetMultGlyfsUnicodeRequest(buffer_arg) {
  return webfont_pb.GetMultGlyfsUnicodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetMultGlyfsUnicodeResult(arg) {
  if (!(arg instanceof webfont_pb.GetMultGlyfsUnicodeResult)) {
    throw new Error('Expected argument of type webfontsdk.GetMultGlyfsUnicodeResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetMultGlyfsUnicodeResult(buffer_arg) {
  return webfont_pb.GetMultGlyfsUnicodeResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetProfileWithoutMapRequest(arg) {
  if (!(arg instanceof webfont_pb.GetProfileWithoutMapRequest)) {
    throw new Error('Expected argument of type webfontsdk.GetProfileWithoutMapRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetProfileWithoutMapRequest(buffer_arg) {
  return webfont_pb.GetProfileWithoutMapRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetProfileWithoutMapResult(arg) {
  if (!(arg instanceof webfont_pb.GetProfileWithoutMapResult)) {
    throw new Error('Expected argument of type webfontsdk.GetProfileWithoutMapResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetProfileWithoutMapResult(buffer_arg) {
  return webfont_pb.GetProfileWithoutMapResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetUnicodeIndexsRequest(arg) {
  if (!(arg instanceof webfont_pb.GetUnicodeIndexsRequest)) {
    throw new Error('Expected argument of type webfontsdk.GetUnicodeIndexsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetUnicodeIndexsRequest(buffer_arg) {
  return webfont_pb.GetUnicodeIndexsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_webfontsdk_GetUnicodeIndexsResult(arg) {
  if (!(arg instanceof webfont_pb.GetUnicodeIndexsResult)) {
    throw new Error('Expected argument of type webfontsdk.GetUnicodeIndexsResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_webfontsdk_GetUnicodeIndexsResult(buffer_arg) {
  return webfont_pb.GetUnicodeIndexsResult.deserializeBinary(new Uint8Array(buffer_arg));
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
  // GetProfile
  getProfileWithoutMap: {
    path: '/webfontsdk.Greeter/GetProfileWithoutMap',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.GetProfileWithoutMapRequest,
    responseType: webfont_pb.GetProfileWithoutMapResult,
    requestSerialize: serialize_webfontsdk_GetProfileWithoutMapRequest,
    requestDeserialize: deserialize_webfontsdk_GetProfileWithoutMapRequest,
    responseSerialize: serialize_webfontsdk_GetProfileWithoutMapResult,
    responseDeserialize: deserialize_webfontsdk_GetProfileWithoutMapResult,
  },
  // GetUnicodeIndexs
  getUnicodeIndexs: {
    path: '/webfontsdk.Greeter/GetUnicodeIndexs',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.GetUnicodeIndexsRequest,
    responseType: webfont_pb.GetUnicodeIndexsResult,
    requestSerialize: serialize_webfontsdk_GetUnicodeIndexsRequest,
    requestDeserialize: deserialize_webfontsdk_GetUnicodeIndexsRequest,
    responseSerialize: serialize_webfontsdk_GetUnicodeIndexsResult,
    responseDeserialize: deserialize_webfontsdk_GetUnicodeIndexsResult,
  },
  // GetGlyfs Index
  getGlyfsIndex: {
    path: '/webfontsdk.Greeter/GetGlyfsIndex',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.GetGlyfsIndexRequest,
    responseType: webfont_pb.GetGlyfsIndexResult,
    requestSerialize: serialize_webfontsdk_GetGlyfsIndexRequest,
    requestDeserialize: deserialize_webfontsdk_GetGlyfsIndexRequest,
    responseSerialize: serialize_webfontsdk_GetGlyfsIndexResult,
    responseDeserialize: deserialize_webfontsdk_GetGlyfsIndexResult,
  },
  // GetGlyfs Unicode
  getGlyfsUnicode: {
    path: '/webfontsdk.Greeter/GetGlyfsUnicode',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.GetGlyfsUnicodeRequest,
    responseType: webfont_pb.GetGlyfsUnicodeResult,
    requestSerialize: serialize_webfontsdk_GetGlyfsUnicodeRequest,
    requestDeserialize: deserialize_webfontsdk_GetGlyfsUnicodeRequest,
    responseSerialize: serialize_webfontsdk_GetGlyfsUnicodeResult,
    responseDeserialize: deserialize_webfontsdk_GetGlyfsUnicodeResult,
  },
  // GetMultGlyfsUnicode
  getMultGlyfsUnicode: {
    path: '/webfontsdk.Greeter/GetMultGlyfsUnicode',
    requestStream: false,
    responseStream: false,
    requestType: webfont_pb.GetMultGlyfsUnicodeRequest,
    responseType: webfont_pb.GetMultGlyfsUnicodeResult,
    requestSerialize: serialize_webfontsdk_GetMultGlyfsUnicodeRequest,
    requestDeserialize: deserialize_webfontsdk_GetMultGlyfsUnicodeRequest,
    responseSerialize: serialize_webfontsdk_GetMultGlyfsUnicodeResult,
    responseDeserialize: deserialize_webfontsdk_GetMultGlyfsUnicodeResult,
  },
};

exports.GreeterClient = grpc.makeGenericClientConstructor(GreeterService);
