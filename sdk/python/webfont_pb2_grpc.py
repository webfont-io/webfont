# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import webfont_pb2 as webfont__pb2


class GreeterStub(object):
  """The greeting service definition.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.BuildFont = channel.unary_unary(
        '/webfontsdk.Greeter/BuildFont',
        request_serializer=webfont__pb2.FontBuildRequest.SerializeToString,
        response_deserializer=webfont__pb2.FontBuildBufResult.FromString,
        )
    self.MultBuildFont = channel.unary_unary(
        '/webfontsdk.Greeter/MultBuildFont',
        request_serializer=webfont__pb2.MultFontBuildRequest.SerializeToString,
        response_deserializer=webfont__pb2.MultFontBuildBufResult.FromString,
        )
    self.FontList = channel.unary_unary(
        '/webfontsdk.Greeter/FontList',
        request_serializer=webfont__pb2.FontListRequest.SerializeToString,
        response_deserializer=webfont__pb2.FontListResult.FromString,
        )
    self.GetProfileWithoutMap = channel.unary_unary(
        '/webfontsdk.Greeter/GetProfileWithoutMap',
        request_serializer=webfont__pb2.GetProfileWithoutMapRequest.SerializeToString,
        response_deserializer=webfont__pb2.GetProfileWithoutMapResult.FromString,
        )
    self.GetMultGlyfsUnicode = channel.unary_unary(
        '/webfontsdk.Greeter/GetMultGlyfsUnicode',
        request_serializer=webfont__pb2.GetMultGlyfsUnicodeRequest.SerializeToString,
        response_deserializer=webfont__pb2.GetMultGlyfsUnicodeResult.FromString,
        )


class GreeterServicer(object):
  """The greeting service definition.
  """

  def BuildFont(self, request, context):
    """BuildFont
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def MultBuildFont(self, request, context):
    """MultBuildFont
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def FontList(self, request, context):
    """Get my fontlist
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetProfileWithoutMap(self, request, context):
    """GetProfile
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetMultGlyfsUnicode(self, request, context):
    """GetUnicodeIndexs
    rpc GetUnicodeIndexs(GetUnicodeIndexsRequest) returns (GetUnicodeIndexsResult) {}

    GetGlyfs Index
    rpc GetGlyfsIndex(GetGlyfsIndexRequest) returns (GetGlyfsIndexResult) {}

    GetGlyfs Unicode
    rpc GetGlyfsUnicode(GetGlyfsUnicodeRequest) returns (GetGlyfsUnicodeResult) {}

    GetMultGlyfsUnicode
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_GreeterServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'BuildFont': grpc.unary_unary_rpc_method_handler(
          servicer.BuildFont,
          request_deserializer=webfont__pb2.FontBuildRequest.FromString,
          response_serializer=webfont__pb2.FontBuildBufResult.SerializeToString,
      ),
      'MultBuildFont': grpc.unary_unary_rpc_method_handler(
          servicer.MultBuildFont,
          request_deserializer=webfont__pb2.MultFontBuildRequest.FromString,
          response_serializer=webfont__pb2.MultFontBuildBufResult.SerializeToString,
      ),
      'FontList': grpc.unary_unary_rpc_method_handler(
          servicer.FontList,
          request_deserializer=webfont__pb2.FontListRequest.FromString,
          response_serializer=webfont__pb2.FontListResult.SerializeToString,
      ),
      'GetProfileWithoutMap': grpc.unary_unary_rpc_method_handler(
          servicer.GetProfileWithoutMap,
          request_deserializer=webfont__pb2.GetProfileWithoutMapRequest.FromString,
          response_serializer=webfont__pb2.GetProfileWithoutMapResult.SerializeToString,
      ),
      'GetMultGlyfsUnicode': grpc.unary_unary_rpc_method_handler(
          servicer.GetMultGlyfsUnicode,
          request_deserializer=webfont__pb2.GetMultGlyfsUnicodeRequest.FromString,
          response_serializer=webfont__pb2.GetMultGlyfsUnicodeResult.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'webfontsdk.Greeter', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
