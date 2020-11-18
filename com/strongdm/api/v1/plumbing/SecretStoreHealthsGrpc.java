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
package com.strongdm.api.v1.plumbing;

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
 * Audit exposes the endpoints to extract point-in-time snapshot of data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: secret_store_healths.proto")
public final class SecretStoreHealthsGrpc {

  private SecretStoreHealthsGrpc() {}

  public static final String SERVICE_NAME = "v1.SecretStoreHealths";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListRequest,
      com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListRequest.class,
      responseType = com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListRequest,
      com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListRequest, com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListResponse> getListMethod;
    if ((getListMethod = SecretStoreHealthsGrpc.getListMethod) == null) {
      synchronized (SecretStoreHealthsGrpc.class) {
        if ((getListMethod = SecretStoreHealthsGrpc.getListMethod) == null) {
          SecretStoreHealthsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListRequest, com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretStoreHealthsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckRequest,
      com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckResponse> getCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Check",
      requestType = com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckRequest.class,
      responseType = com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckRequest,
      com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckResponse> getCheckMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckRequest, com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckResponse> getCheckMethod;
    if ((getCheckMethod = SecretStoreHealthsGrpc.getCheckMethod) == null) {
      synchronized (SecretStoreHealthsGrpc.class) {
        if ((getCheckMethod = SecretStoreHealthsGrpc.getCheckMethod) == null) {
          SecretStoreHealthsGrpc.getCheckMethod = getCheckMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckRequest, com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretStoreHealthsMethodDescriptorSupplier("Check"))
              .build();
        }
      }
    }
    return getCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecretStoreHealthsStub newStub(io.grpc.Channel channel) {
    return new SecretStoreHealthsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecretStoreHealthsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SecretStoreHealthsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecretStoreHealthsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SecretStoreHealthsFutureStub(channel);
  }

  /**
   * <pre>
   * Audit exposes the endpoints to extract point-in-time snapshot of data.
   * </pre>
   */
  public static abstract class SecretStoreHealthsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List lists an org's secret store healths
     * </pre>
     */
    public void list(com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check pushes a healthcheck request for a secret store
     * </pre>
     */
    public void check(com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListRequest,
                com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckRequest,
                com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckResponse>(
                  this, METHODID_CHECK)))
          .build();
    }
  }

  /**
   * <pre>
   * Audit exposes the endpoints to extract point-in-time snapshot of data.
   * </pre>
   */
  public static final class SecretStoreHealthsStub extends io.grpc.stub.AbstractStub<SecretStoreHealthsStub> {
    private SecretStoreHealthsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecretStoreHealthsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretStoreHealthsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecretStoreHealthsStub(channel, callOptions);
    }

    /**
     * <pre>
     * List lists an org's secret store healths
     * </pre>
     */
    public void list(com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check pushes a healthcheck request for a secret store
     * </pre>
     */
    public void check(com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Audit exposes the endpoints to extract point-in-time snapshot of data.
   * </pre>
   */
  public static final class SecretStoreHealthsBlockingStub extends io.grpc.stub.AbstractStub<SecretStoreHealthsBlockingStub> {
    private SecretStoreHealthsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecretStoreHealthsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretStoreHealthsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecretStoreHealthsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List lists an org's secret store healths
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListResponse list(com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check pushes a healthcheck request for a secret store
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckResponse check(com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Audit exposes the endpoints to extract point-in-time snapshot of data.
   * </pre>
   */
  public static final class SecretStoreHealthsFutureStub extends io.grpc.stub.AbstractStub<SecretStoreHealthsFutureStub> {
    private SecretStoreHealthsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecretStoreHealthsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretStoreHealthsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecretStoreHealthsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List lists an org's secret store healths
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListResponse> list(
        com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check pushes a healthcheck request for a secret store
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckResponse> check(
        com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_CHECK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecretStoreHealthsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecretStoreHealthsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthListResponse>) responseObserver);
          break;
        case METHODID_CHECK:
          serviceImpl.check((com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.SecretStoreHealthCheckResponse>) responseObserver);
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

  private static abstract class SecretStoreHealthsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecretStoreHealthsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.SecretStoreHealthsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecretStoreHealths");
    }
  }

  private static final class SecretStoreHealthsFileDescriptorSupplier
      extends SecretStoreHealthsBaseDescriptorSupplier {
    SecretStoreHealthsFileDescriptorSupplier() {}
  }

  private static final class SecretStoreHealthsMethodDescriptorSupplier
      extends SecretStoreHealthsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecretStoreHealthsMethodDescriptorSupplier(String methodName) {
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
      synchronized (SecretStoreHealthsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecretStoreHealthsFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
