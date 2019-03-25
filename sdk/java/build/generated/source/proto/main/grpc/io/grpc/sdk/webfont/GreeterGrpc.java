package io.grpc.sdk.webfont;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: webfont.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "webfontsdk.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.sdk.webfont.FontBuildRequest,
      io.grpc.sdk.webfont.FontBuildBufResult> getBuildFontMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildFont",
      requestType = io.grpc.sdk.webfont.FontBuildRequest.class,
      responseType = io.grpc.sdk.webfont.FontBuildBufResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.sdk.webfont.FontBuildRequest,
      io.grpc.sdk.webfont.FontBuildBufResult> getBuildFontMethod() {
    io.grpc.MethodDescriptor<io.grpc.sdk.webfont.FontBuildRequest, io.grpc.sdk.webfont.FontBuildBufResult> getBuildFontMethod;
    if ((getBuildFontMethod = GreeterGrpc.getBuildFontMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getBuildFontMethod = GreeterGrpc.getBuildFontMethod) == null) {
          GreeterGrpc.getBuildFontMethod = getBuildFontMethod = 
              io.grpc.MethodDescriptor.<io.grpc.sdk.webfont.FontBuildRequest, io.grpc.sdk.webfont.FontBuildBufResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "webfontsdk.Greeter", "BuildFont"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.sdk.webfont.FontBuildRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.sdk.webfont.FontBuildBufResult.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("BuildFont"))
                  .build();
          }
        }
     }
     return getBuildFontMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.sdk.webfont.MultFontBuildRequest,
      io.grpc.sdk.webfont.MultFontBuildBufResult> getMultBuildFontMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultBuildFont",
      requestType = io.grpc.sdk.webfont.MultFontBuildRequest.class,
      responseType = io.grpc.sdk.webfont.MultFontBuildBufResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.sdk.webfont.MultFontBuildRequest,
      io.grpc.sdk.webfont.MultFontBuildBufResult> getMultBuildFontMethod() {
    io.grpc.MethodDescriptor<io.grpc.sdk.webfont.MultFontBuildRequest, io.grpc.sdk.webfont.MultFontBuildBufResult> getMultBuildFontMethod;
    if ((getMultBuildFontMethod = GreeterGrpc.getMultBuildFontMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getMultBuildFontMethod = GreeterGrpc.getMultBuildFontMethod) == null) {
          GreeterGrpc.getMultBuildFontMethod = getMultBuildFontMethod = 
              io.grpc.MethodDescriptor.<io.grpc.sdk.webfont.MultFontBuildRequest, io.grpc.sdk.webfont.MultFontBuildBufResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "webfontsdk.Greeter", "MultBuildFont"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.sdk.webfont.MultFontBuildRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.sdk.webfont.MultFontBuildBufResult.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("MultBuildFont"))
                  .build();
          }
        }
     }
     return getMultBuildFontMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.sdk.webfont.FontListRequest,
      io.grpc.sdk.webfont.FontListResult> getFontListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FontList",
      requestType = io.grpc.sdk.webfont.FontListRequest.class,
      responseType = io.grpc.sdk.webfont.FontListResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.sdk.webfont.FontListRequest,
      io.grpc.sdk.webfont.FontListResult> getFontListMethod() {
    io.grpc.MethodDescriptor<io.grpc.sdk.webfont.FontListRequest, io.grpc.sdk.webfont.FontListResult> getFontListMethod;
    if ((getFontListMethod = GreeterGrpc.getFontListMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getFontListMethod = GreeterGrpc.getFontListMethod) == null) {
          GreeterGrpc.getFontListMethod = getFontListMethod = 
              io.grpc.MethodDescriptor.<io.grpc.sdk.webfont.FontListRequest, io.grpc.sdk.webfont.FontListResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "webfontsdk.Greeter", "FontList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.sdk.webfont.FontListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.sdk.webfont.FontListResult.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("FontList"))
                  .build();
          }
        }
     }
     return getFontListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *BuildFont
     * </pre>
     */
    public void buildFont(io.grpc.sdk.webfont.FontBuildRequest request,
        io.grpc.stub.StreamObserver<io.grpc.sdk.webfont.FontBuildBufResult> responseObserver) {
      asyncUnimplementedUnaryCall(getBuildFontMethod(), responseObserver);
    }

    /**
     * <pre>
     *MultBuildFont
     * </pre>
     */
    public void multBuildFont(io.grpc.sdk.webfont.MultFontBuildRequest request,
        io.grpc.stub.StreamObserver<io.grpc.sdk.webfont.MultFontBuildBufResult> responseObserver) {
      asyncUnimplementedUnaryCall(getMultBuildFontMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get my fontlist
     * </pre>
     */
    public void fontList(io.grpc.sdk.webfont.FontListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.sdk.webfont.FontListResult> responseObserver) {
      asyncUnimplementedUnaryCall(getFontListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBuildFontMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.sdk.webfont.FontBuildRequest,
                io.grpc.sdk.webfont.FontBuildBufResult>(
                  this, METHODID_BUILD_FONT)))
          .addMethod(
            getMultBuildFontMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.sdk.webfont.MultFontBuildRequest,
                io.grpc.sdk.webfont.MultFontBuildBufResult>(
                  this, METHODID_MULT_BUILD_FONT)))
          .addMethod(
            getFontListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.sdk.webfont.FontListRequest,
                io.grpc.sdk.webfont.FontListResult>(
                  this, METHODID_FONT_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     *BuildFont
     * </pre>
     */
    public void buildFont(io.grpc.sdk.webfont.FontBuildRequest request,
        io.grpc.stub.StreamObserver<io.grpc.sdk.webfont.FontBuildBufResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuildFontMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *MultBuildFont
     * </pre>
     */
    public void multBuildFont(io.grpc.sdk.webfont.MultFontBuildRequest request,
        io.grpc.stub.StreamObserver<io.grpc.sdk.webfont.MultFontBuildBufResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultBuildFontMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get my fontlist
     * </pre>
     */
    public void fontList(io.grpc.sdk.webfont.FontListRequest request,
        io.grpc.stub.StreamObserver<io.grpc.sdk.webfont.FontListResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFontListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *BuildFont
     * </pre>
     */
    public io.grpc.sdk.webfont.FontBuildBufResult buildFont(io.grpc.sdk.webfont.FontBuildRequest request) {
      return blockingUnaryCall(
          getChannel(), getBuildFontMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *MultBuildFont
     * </pre>
     */
    public io.grpc.sdk.webfont.MultFontBuildBufResult multBuildFont(io.grpc.sdk.webfont.MultFontBuildRequest request) {
      return blockingUnaryCall(
          getChannel(), getMultBuildFontMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get my fontlist
     * </pre>
     */
    public io.grpc.sdk.webfont.FontListResult fontList(io.grpc.sdk.webfont.FontListRequest request) {
      return blockingUnaryCall(
          getChannel(), getFontListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *BuildFont
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.sdk.webfont.FontBuildBufResult> buildFont(
        io.grpc.sdk.webfont.FontBuildRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBuildFontMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *MultBuildFont
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.sdk.webfont.MultFontBuildBufResult> multBuildFont(
        io.grpc.sdk.webfont.MultFontBuildRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMultBuildFontMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get my fontlist
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.sdk.webfont.FontListResult> fontList(
        io.grpc.sdk.webfont.FontListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFontListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BUILD_FONT = 0;
  private static final int METHODID_MULT_BUILD_FONT = 1;
  private static final int METHODID_FONT_LIST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BUILD_FONT:
          serviceImpl.buildFont((io.grpc.sdk.webfont.FontBuildRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.sdk.webfont.FontBuildBufResult>) responseObserver);
          break;
        case METHODID_MULT_BUILD_FONT:
          serviceImpl.multBuildFont((io.grpc.sdk.webfont.MultFontBuildRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.sdk.webfont.MultFontBuildBufResult>) responseObserver);
          break;
        case METHODID_FONT_LIST:
          serviceImpl.fontList((io.grpc.sdk.webfont.FontListRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.sdk.webfont.FontListResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.sdk.webfont.WebfontProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getBuildFontMethod())
              .addMethod(getMultBuildFontMethod())
              .addMethod(getFontListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
