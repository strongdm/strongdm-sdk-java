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
 * AccessRules allows the use of tags and other attributes to grant resources
 * to roles. Each Role may have several access rules.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: access_rules.proto")
public final class AccessRulesGrpc {

  private AccessRulesGrpc() {}

  public static final String SERVICE_NAME = "v1.AccessRules";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateRequest,
      com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateRequest,
      com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateRequest, com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateResponse> getCreateMethod;
    if ((getCreateMethod = AccessRulesGrpc.getCreateMethod) == null) {
      synchronized (AccessRulesGrpc.class) {
        if ((getCreateMethod = AccessRulesGrpc.getCreateMethod) == null) {
          AccessRulesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateRequest, com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRulesMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetRequest,
      com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetRequest.class,
      responseType = com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetRequest,
      com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetRequest, com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetResponse> getGetMethod;
    if ((getGetMethod = AccessRulesGrpc.getGetMethod) == null) {
      synchronized (AccessRulesGrpc.class) {
        if ((getGetMethod = AccessRulesGrpc.getGetMethod) == null) {
          AccessRulesGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetRequest, com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRulesMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteRequest,
      com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteRequest.class,
      responseType = com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteRequest,
      com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteRequest, com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = AccessRulesGrpc.getDeleteMethod) == null) {
      synchronized (AccessRulesGrpc.class) {
        if ((getDeleteMethod = AccessRulesGrpc.getDeleteMethod) == null) {
          AccessRulesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteRequest, com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRulesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessRulesStub newStub(io.grpc.Channel channel) {
    return new AccessRulesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessRulesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccessRulesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessRulesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccessRulesFutureStub(channel);
  }

  /**
   * <pre>
   * AccessRules allows the use of tags and other attributes to grant resources
   * to roles. Each Role may have several access rules.
   * </pre>
   */
  public static abstract class AccessRulesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create registers a new AccessRule.
     * </pre>
     */
    public void create(com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one AccessRule by ID.
     * </pre>
     */
    public void get(com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a AccessRule by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateRequest,
                com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetRequest,
                com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteRequest,
                com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * AccessRules allows the use of tags and other attributes to grant resources
   * to roles. Each Role may have several access rules.
   * </pre>
   */
  public static final class AccessRulesStub extends io.grpc.stub.AbstractStub<AccessRulesStub> {
    private AccessRulesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessRulesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessRulesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessRulesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new AccessRule.
     * </pre>
     */
    public void create(com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one AccessRule by ID.
     * </pre>
     */
    public void get(com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a AccessRule by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AccessRules allows the use of tags and other attributes to grant resources
   * to roles. Each Role may have several access rules.
   * </pre>
   */
  public static final class AccessRulesBlockingStub extends io.grpc.stub.AbstractStub<AccessRulesBlockingStub> {
    private AccessRulesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessRulesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessRulesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessRulesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new AccessRule.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateResponse create(com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one AccessRule by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetResponse get(com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a AccessRule by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteResponse delete(com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AccessRules allows the use of tags and other attributes to grant resources
   * to roles. Each Role may have several access rules.
   * </pre>
   */
  public static final class AccessRulesFutureStub extends io.grpc.stub.AbstractStub<AccessRulesFutureStub> {
    private AccessRulesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessRulesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessRulesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessRulesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new AccessRule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateResponse> create(
        com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one AccessRule by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetResponse> get(
        com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a AccessRule by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteResponse> delete(
        com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessRulesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessRulesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccessRulesPlumbing.AccessRuleDeleteResponse>) responseObserver);
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

  private static abstract class AccessRulesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessRulesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.AccessRulesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessRules");
    }
  }

  private static final class AccessRulesFileDescriptorSupplier
      extends AccessRulesBaseDescriptorSupplier {
    AccessRulesFileDescriptorSupplier() {}
  }

  private static final class AccessRulesMethodDescriptorSupplier
      extends AccessRulesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessRulesMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessRulesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessRulesFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
