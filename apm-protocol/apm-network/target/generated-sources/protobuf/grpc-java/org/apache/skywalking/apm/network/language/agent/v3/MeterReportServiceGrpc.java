package org.apache.skywalking.apm.network.language.agent.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.0)",
    comments = "Source: language-agent/Meter.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MeterReportServiceGrpc {

  private MeterReportServiceGrpc() {}

  public static final String SERVICE_NAME = "skywalking.v3.MeterReportService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v3.MeterData,
      org.apache.skywalking.apm.network.common.v3.Commands> getCollectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "collect",
      requestType = org.apache.skywalking.apm.network.language.agent.v3.MeterData.class,
      responseType = org.apache.skywalking.apm.network.common.v3.Commands.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v3.MeterData,
      org.apache.skywalking.apm.network.common.v3.Commands> getCollectMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v3.MeterData, org.apache.skywalking.apm.network.common.v3.Commands> getCollectMethod;
    if ((getCollectMethod = MeterReportServiceGrpc.getCollectMethod) == null) {
      synchronized (MeterReportServiceGrpc.class) {
        if ((getCollectMethod = MeterReportServiceGrpc.getCollectMethod) == null) {
          MeterReportServiceGrpc.getCollectMethod = getCollectMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.v3.MeterData, org.apache.skywalking.apm.network.common.v3.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "collect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.v3.MeterData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.v3.Commands.getDefaultInstance()))
              .setSchemaDescriptor(new MeterReportServiceMethodDescriptorSupplier("collect"))
              .build();
        }
      }
    }
    return getCollectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v3.MeterDataCollection,
      org.apache.skywalking.apm.network.common.v3.Commands> getCollectBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "collectBatch",
      requestType = org.apache.skywalking.apm.network.language.agent.v3.MeterDataCollection.class,
      responseType = org.apache.skywalking.apm.network.common.v3.Commands.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v3.MeterDataCollection,
      org.apache.skywalking.apm.network.common.v3.Commands> getCollectBatchMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v3.MeterDataCollection, org.apache.skywalking.apm.network.common.v3.Commands> getCollectBatchMethod;
    if ((getCollectBatchMethod = MeterReportServiceGrpc.getCollectBatchMethod) == null) {
      synchronized (MeterReportServiceGrpc.class) {
        if ((getCollectBatchMethod = MeterReportServiceGrpc.getCollectBatchMethod) == null) {
          MeterReportServiceGrpc.getCollectBatchMethod = getCollectBatchMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.v3.MeterDataCollection, org.apache.skywalking.apm.network.common.v3.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "collectBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.v3.MeterDataCollection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.v3.Commands.getDefaultInstance()))
              .setSchemaDescriptor(new MeterReportServiceMethodDescriptorSupplier("collectBatch"))
              .build();
        }
      }
    }
    return getCollectBatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MeterReportServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeterReportServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeterReportServiceStub>() {
        @java.lang.Override
        public MeterReportServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeterReportServiceStub(channel, callOptions);
        }
      };
    return MeterReportServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MeterReportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeterReportServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeterReportServiceBlockingStub>() {
        @java.lang.Override
        public MeterReportServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeterReportServiceBlockingStub(channel, callOptions);
        }
      };
    return MeterReportServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MeterReportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeterReportServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeterReportServiceFutureStub>() {
        @java.lang.Override
        public MeterReportServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeterReportServiceFutureStub(channel, callOptions);
        }
      };
    return MeterReportServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MeterReportServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Meter data is reported in a certain period. The agent/SDK should report all collected metrics in this period through one stream.
     * The whole stream is an input data set, client should onComplete the stream per report period.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.v3.MeterData> collect(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCollectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reporting meter data in bulk mode as MeterDataCollection.
     * By using this, each one in the stream would be treated as a complete input for MAL engine,
     * comparing to `collect (stream MeterData)`, which is using one stream as an input data set.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.v3.MeterDataCollection> collectBatch(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCollectBatchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCollectMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.v3.MeterData,
                org.apache.skywalking.apm.network.common.v3.Commands>(
                  this, METHODID_COLLECT)))
          .addMethod(
            getCollectBatchMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.v3.MeterDataCollection,
                org.apache.skywalking.apm.network.common.v3.Commands>(
                  this, METHODID_COLLECT_BATCH)))
          .build();
    }
  }

  /**
   */
  public static final class MeterReportServiceStub extends io.grpc.stub.AbstractAsyncStub<MeterReportServiceStub> {
    private MeterReportServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeterReportServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeterReportServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Meter data is reported in a certain period. The agent/SDK should report all collected metrics in this period through one stream.
     * The whole stream is an input data set, client should onComplete the stream per report period.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.v3.MeterData> collect(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCollectMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Reporting meter data in bulk mode as MeterDataCollection.
     * By using this, each one in the stream would be treated as a complete input for MAL engine,
     * comparing to `collect (stream MeterData)`, which is using one stream as an input data set.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.v3.MeterDataCollection> collectBatch(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCollectBatchMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MeterReportServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MeterReportServiceBlockingStub> {
    private MeterReportServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeterReportServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeterReportServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class MeterReportServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MeterReportServiceFutureStub> {
    private MeterReportServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeterReportServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeterReportServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COLLECT = 0;
  private static final int METHODID_COLLECT_BATCH = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MeterReportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MeterReportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COLLECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.collect(
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands>) responseObserver);
        case METHODID_COLLECT_BATCH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.collectBatch(
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MeterReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MeterReportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.v3.Meter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MeterReportService");
    }
  }

  private static final class MeterReportServiceFileDescriptorSupplier
      extends MeterReportServiceBaseDescriptorSupplier {
    MeterReportServiceFileDescriptorSupplier() {}
  }

  private static final class MeterReportServiceMethodDescriptorSupplier
      extends MeterReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MeterReportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MeterReportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MeterReportServiceFileDescriptorSupplier())
              .addMethod(getCollectMethod())
              .addMethod(getCollectBatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
