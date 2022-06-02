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
 * RoleGrants represent relationships between composite roles and the roles
 * that make up those composite roles. When a composite role is attached to another
 * role, the permissions granted to members of the composite role are augmented to
 * include the permissions granted to members of the attached role.
 * Deprecated: use Role access rules instead.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: role_grants.proto")
@java.lang.Deprecated
public final class RoleGrantsGrpc {

  private RoleGrantsGrpc() {}

  public static final String SERVICE_NAME = "v1.RoleGrants";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateRequest,
      com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateRequest,
      com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateRequest, com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateResponse> getCreateMethod;
    if ((getCreateMethod = RoleGrantsGrpc.getCreateMethod) == null) {
      synchronized (RoleGrantsGrpc.class) {
        if ((getCreateMethod = RoleGrantsGrpc.getCreateMethod) == null) {
          RoleGrantsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateRequest, com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleGrantsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetRequest,
      com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetRequest,
      com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetRequest, com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetResponse> getGetMethod;
    if ((getGetMethod = RoleGrantsGrpc.getGetMethod) == null) {
      synchronized (RoleGrantsGrpc.class) {
        if ((getGetMethod = RoleGrantsGrpc.getGetMethod) == null) {
          RoleGrantsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetRequest, com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleGrantsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteRequest,
      com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteRequest,
      com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteRequest, com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = RoleGrantsGrpc.getDeleteMethod) == null) {
      synchronized (RoleGrantsGrpc.class) {
        if ((getDeleteMethod = RoleGrantsGrpc.getDeleteMethod) == null) {
          RoleGrantsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteRequest, com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleGrantsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListRequest,
      com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListRequest,
      com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListRequest, com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListResponse> getListMethod;
    if ((getListMethod = RoleGrantsGrpc.getListMethod) == null) {
      synchronized (RoleGrantsGrpc.class) {
        if ((getListMethod = RoleGrantsGrpc.getListMethod) == null) {
          RoleGrantsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListRequest, com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleGrantsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoleGrantsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleGrantsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleGrantsStub>() {
        @java.lang.Override
        public RoleGrantsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleGrantsStub(channel, callOptions);
        }
      };
    return RoleGrantsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoleGrantsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleGrantsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleGrantsBlockingStub>() {
        @java.lang.Override
        public RoleGrantsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleGrantsBlockingStub(channel, callOptions);
        }
      };
    return RoleGrantsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoleGrantsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleGrantsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleGrantsFutureStub>() {
        @java.lang.Override
        public RoleGrantsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleGrantsFutureStub(channel, callOptions);
        }
      };
    return RoleGrantsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RoleGrants represent relationships between composite roles and the roles
   * that make up those composite roles. When a composite role is attached to another
   * role, the permissions granted to members of the composite role are augmented to
   * include the permissions granted to members of the attached role.
   * Deprecated: use Role access rules instead.
   * </pre>
   */
  @java.lang.Deprecated
  public static abstract class RoleGrantsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create registers a new RoleGrant.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void create(com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one RoleGrant by ID.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void get(com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a RoleGrant by ID.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void delete(com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of RoleGrants matching a given set of criteria.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void list(com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateRequest,
                com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetRequest,
                com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteRequest,
                com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListRequest,
                com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * RoleGrants represent relationships between composite roles and the roles
   * that make up those composite roles. When a composite role is attached to another
   * role, the permissions granted to members of the composite role are augmented to
   * include the permissions granted to members of the attached role.
   * Deprecated: use Role access rules instead.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RoleGrantsStub extends io.grpc.stub.AbstractAsyncStub<RoleGrantsStub> {
    private RoleGrantsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleGrantsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleGrantsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new RoleGrant.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void create(com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one RoleGrant by ID.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void get(com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a RoleGrant by ID.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void delete(com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of RoleGrants matching a given set of criteria.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void list(com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RoleGrants represent relationships between composite roles and the roles
   * that make up those composite roles. When a composite role is attached to another
   * role, the permissions granted to members of the composite role are augmented to
   * include the permissions granted to members of the attached role.
   * Deprecated: use Role access rules instead.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RoleGrantsBlockingStub extends io.grpc.stub.AbstractBlockingStub<RoleGrantsBlockingStub> {
    private RoleGrantsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleGrantsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleGrantsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new RoleGrant.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateResponse create(com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one RoleGrant by ID.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetResponse get(com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a RoleGrant by ID.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteResponse delete(com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of RoleGrants matching a given set of criteria.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListResponse list(com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RoleGrants represent relationships between composite roles and the roles
   * that make up those composite roles. When a composite role is attached to another
   * role, the permissions granted to members of the composite role are augmented to
   * include the permissions granted to members of the attached role.
   * Deprecated: use Role access rules instead.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RoleGrantsFutureStub extends io.grpc.stub.AbstractFutureStub<RoleGrantsFutureStub> {
    private RoleGrantsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleGrantsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleGrantsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new RoleGrant.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateResponse> create(
        com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one RoleGrant by ID.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetResponse> get(
        com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a RoleGrant by ID.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteResponse> delete(
        com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of RoleGrants matching a given set of criteria.
     * Deprecated: use Role access rules instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListResponse> list(
        com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_LIST = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoleGrantsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoleGrantsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.RoleGrantListResponse>) responseObserver);
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

  private static abstract class RoleGrantsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoleGrantsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.RoleGrantsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoleGrants");
    }
  }

  private static final class RoleGrantsFileDescriptorSupplier
      extends RoleGrantsBaseDescriptorSupplier {
    RoleGrantsFileDescriptorSupplier() {}
  }

  private static final class RoleGrantsMethodDescriptorSupplier
      extends RoleGrantsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoleGrantsMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoleGrantsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoleGrantsFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
