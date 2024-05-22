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
 * RemoteIdentities assign a resource directly to an account, giving the account the permission to connect to that resource.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: remote_identities.proto")
@java.lang.Deprecated
public final class RemoteIdentitiesGrpc {

  private RemoteIdentitiesGrpc() {}

  public static final String SERVICE_NAME = "v1.RemoteIdentities";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateRequest,
      com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateRequest.class,
      responseType = com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateRequest,
      com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateRequest, com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateResponse> getCreateMethod;
    if ((getCreateMethod = RemoteIdentitiesGrpc.getCreateMethod) == null) {
      synchronized (RemoteIdentitiesGrpc.class) {
        if ((getCreateMethod = RemoteIdentitiesGrpc.getCreateMethod) == null) {
          RemoteIdentitiesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateRequest, com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteIdentitiesMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetRequest,
      com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetRequest.class,
      responseType = com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetRequest,
      com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetRequest, com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetResponse> getGetMethod;
    if ((getGetMethod = RemoteIdentitiesGrpc.getGetMethod) == null) {
      synchronized (RemoteIdentitiesGrpc.class) {
        if ((getGetMethod = RemoteIdentitiesGrpc.getGetMethod) == null) {
          RemoteIdentitiesGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetRequest, com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteIdentitiesMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateRequest,
      com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateRequest.class,
      responseType = com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateRequest,
      com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateRequest, com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = RemoteIdentitiesGrpc.getUpdateMethod) == null) {
      synchronized (RemoteIdentitiesGrpc.class) {
        if ((getUpdateMethod = RemoteIdentitiesGrpc.getUpdateMethod) == null) {
          RemoteIdentitiesGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateRequest, com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteIdentitiesMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteRequest,
      com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteRequest,
      com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteRequest, com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = RemoteIdentitiesGrpc.getDeleteMethod) == null) {
      synchronized (RemoteIdentitiesGrpc.class) {
        if ((getDeleteMethod = RemoteIdentitiesGrpc.getDeleteMethod) == null) {
          RemoteIdentitiesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteRequest, com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteIdentitiesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListRequest,
      com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListRequest.class,
      responseType = com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListRequest,
      com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListRequest, com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListResponse> getListMethod;
    if ((getListMethod = RemoteIdentitiesGrpc.getListMethod) == null) {
      synchronized (RemoteIdentitiesGrpc.class) {
        if ((getListMethod = RemoteIdentitiesGrpc.getListMethod) == null) {
          RemoteIdentitiesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListRequest, com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteIdentitiesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RemoteIdentitiesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteIdentitiesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteIdentitiesStub>() {
        @java.lang.Override
        public RemoteIdentitiesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteIdentitiesStub(channel, callOptions);
        }
      };
    return RemoteIdentitiesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RemoteIdentitiesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteIdentitiesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteIdentitiesBlockingStub>() {
        @java.lang.Override
        public RemoteIdentitiesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteIdentitiesBlockingStub(channel, callOptions);
        }
      };
    return RemoteIdentitiesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RemoteIdentitiesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteIdentitiesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteIdentitiesFutureStub>() {
        @java.lang.Override
        public RemoteIdentitiesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteIdentitiesFutureStub(channel, callOptions);
        }
      };
    return RemoteIdentitiesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RemoteIdentities assign a resource directly to an account, giving the account the permission to connect to that resource.
   * </pre>
   */
  @java.lang.Deprecated
  public static abstract class RemoteIdentitiesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create registers a new RemoteIdentity.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one RemoteIdentity by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a RemoteIdentity by ID.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a RemoteIdentity by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentities matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateRequest,
                com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetRequest,
                com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateRequest,
                com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteRequest,
                com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListRequest,
                com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * RemoteIdentities assign a resource directly to an account, giving the account the permission to connect to that resource.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RemoteIdentitiesStub extends io.grpc.stub.AbstractAsyncStub<RemoteIdentitiesStub> {
    private RemoteIdentitiesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteIdentitiesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteIdentitiesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new RemoteIdentity.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one RemoteIdentity by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a RemoteIdentity by ID.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a RemoteIdentity by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentities matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RemoteIdentities assign a resource directly to an account, giving the account the permission to connect to that resource.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RemoteIdentitiesBlockingStub extends io.grpc.stub.AbstractBlockingStub<RemoteIdentitiesBlockingStub> {
    private RemoteIdentitiesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteIdentitiesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteIdentitiesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new RemoteIdentity.
     * </pre>
     */
    public com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateResponse create(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one RemoteIdentity by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetResponse get(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a RemoteIdentity by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateResponse update(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a RemoteIdentity by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteResponse delete(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentities matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListResponse list(com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RemoteIdentities assign a resource directly to an account, giving the account the permission to connect to that resource.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RemoteIdentitiesFutureStub extends io.grpc.stub.AbstractFutureStub<RemoteIdentitiesFutureStub> {
    private RemoteIdentitiesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteIdentitiesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteIdentitiesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new RemoteIdentity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateResponse> create(
        com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one RemoteIdentity by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetResponse> get(
        com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a RemoteIdentity by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateResponse> update(
        com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a RemoteIdentity by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteResponse> delete(
        com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentities matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListResponse> list(
        com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_LIST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RemoteIdentitiesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RemoteIdentitiesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityGetResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.RemoteIdentityListResponse>) responseObserver);
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

  private static abstract class RemoteIdentitiesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RemoteIdentitiesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.RemoteIdentitiesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RemoteIdentities");
    }
  }

  private static final class RemoteIdentitiesFileDescriptorSupplier
      extends RemoteIdentitiesBaseDescriptorSupplier {
    RemoteIdentitiesFileDescriptorSupplier() {}
  }

  private static final class RemoteIdentitiesMethodDescriptorSupplier
      extends RemoteIdentitiesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RemoteIdentitiesMethodDescriptorSupplier(String methodName) {
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
      synchronized (RemoteIdentitiesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RemoteIdentitiesFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
