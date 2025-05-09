// Copyright 2020 StrongDM Inc
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
//     http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// 
package com.strongdm.api.plumbing;

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
 * HealthChecks lists the last healthcheck between each node and resource.
 * Note the unconventional capitalization here is to prevent having a collision with GRPC
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: health_checks.proto")
public final class HealthChecksGrpc {

  private HealthChecksGrpc() {}

  public static final String SERVICE_NAME = "v1.HealthChecks";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListRequest,
      com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListRequest.class,
      responseType = com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListRequest,
      com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListRequest, com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListResponse> getListMethod;
    if ((getListMethod = HealthChecksGrpc.getListMethod) == null) {
      synchronized (HealthChecksGrpc.class) {
        if ((getListMethod = HealthChecksGrpc.getListMethod) == null) {
          HealthChecksGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListRequest, com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HealthChecksMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HealthChecksStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthChecksStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthChecksStub>() {
        @java.lang.Override
        public HealthChecksStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthChecksStub(channel, callOptions);
        }
      };
    return HealthChecksStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HealthChecksBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthChecksBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthChecksBlockingStub>() {
        @java.lang.Override
        public HealthChecksBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthChecksBlockingStub(channel, callOptions);
        }
      };
    return HealthChecksBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HealthChecksFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthChecksFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthChecksFutureStub>() {
        @java.lang.Override
        public HealthChecksFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthChecksFutureStub(channel, callOptions);
        }
      };
    return HealthChecksFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * HealthChecks lists the last healthcheck between each node and resource.
   * Note the unconventional capitalization here is to prevent having a collision with GRPC
   * </pre>
   */
  public static abstract class HealthChecksImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of Healthchecks matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListRequest,
                com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * HealthChecks lists the last healthcheck between each node and resource.
   * Note the unconventional capitalization here is to prevent having a collision with GRPC
   * </pre>
   */
  public static final class HealthChecksStub extends io.grpc.stub.AbstractAsyncStub<HealthChecksStub> {
    private HealthChecksStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthChecksStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthChecksStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of Healthchecks matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * HealthChecks lists the last healthcheck between each node and resource.
   * Note the unconventional capitalization here is to prevent having a collision with GRPC
   * </pre>
   */
  public static final class HealthChecksBlockingStub extends io.grpc.stub.AbstractBlockingStub<HealthChecksBlockingStub> {
    private HealthChecksBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthChecksBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthChecksBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of Healthchecks matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListResponse list(com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * HealthChecks lists the last healthcheck between each node and resource.
   * Note the unconventional capitalization here is to prevent having a collision with GRPC
   * </pre>
   */
  public static final class HealthChecksFutureStub extends io.grpc.stub.AbstractFutureStub<HealthChecksFutureStub> {
    private HealthChecksFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthChecksFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthChecksFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of Healthchecks matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListResponse> list(
        com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HealthChecksImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HealthChecksImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.HealthChecksPlumbing.HealthcheckListResponse>) responseObserver);
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

  private static abstract class HealthChecksBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HealthChecksBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.HealthChecksPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HealthChecks");
    }
  }

  private static final class HealthChecksFileDescriptorSupplier
      extends HealthChecksBaseDescriptorSupplier {
    HealthChecksFileDescriptorSupplier() {}
  }

  private static final class HealthChecksMethodDescriptorSupplier
      extends HealthChecksBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HealthChecksMethodDescriptorSupplier(String methodName) {
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
      synchronized (HealthChecksGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HealthChecksFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
