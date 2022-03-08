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
 * SecretStores are servers where resource secrets (passwords, keys) are stored.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: secret_stores.proto")
public final class SecretStoresGrpc {

  private SecretStoresGrpc() {}

  public static final String SERVICE_NAME = "v1.SecretStores";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateRequest,
      com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateRequest,
      com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateRequest, com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateResponse> getCreateMethod;
    if ((getCreateMethod = SecretStoresGrpc.getCreateMethod) == null) {
      synchronized (SecretStoresGrpc.class) {
        if ((getCreateMethod = SecretStoresGrpc.getCreateMethod) == null) {
          SecretStoresGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateRequest, com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretStoresMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetRequest,
      com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetRequest.class,
      responseType = com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetRequest,
      com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetRequest, com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetResponse> getGetMethod;
    if ((getGetMethod = SecretStoresGrpc.getGetMethod) == null) {
      synchronized (SecretStoresGrpc.class) {
        if ((getGetMethod = SecretStoresGrpc.getGetMethod) == null) {
          SecretStoresGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetRequest, com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretStoresMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateRequest,
      com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateRequest,
      com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateRequest, com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = SecretStoresGrpc.getUpdateMethod) == null) {
      synchronized (SecretStoresGrpc.class) {
        if ((getUpdateMethod = SecretStoresGrpc.getUpdateMethod) == null) {
          SecretStoresGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateRequest, com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretStoresMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteRequest,
      com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteRequest.class,
      responseType = com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteRequest,
      com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteRequest, com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = SecretStoresGrpc.getDeleteMethod) == null) {
      synchronized (SecretStoresGrpc.class) {
        if ((getDeleteMethod = SecretStoresGrpc.getDeleteMethod) == null) {
          SecretStoresGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteRequest, com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretStoresMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListRequest,
      com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListRequest.class,
      responseType = com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListRequest,
      com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListRequest, com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListResponse> getListMethod;
    if ((getListMethod = SecretStoresGrpc.getListMethod) == null) {
      synchronized (SecretStoresGrpc.class) {
        if ((getListMethod = SecretStoresGrpc.getListMethod) == null) {
          SecretStoresGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListRequest, com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretStoresMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecretStoresStub newStub(io.grpc.Channel channel) {
    return new SecretStoresStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecretStoresBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SecretStoresBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecretStoresFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SecretStoresFutureStub(channel);
  }

  /**
   * <pre>
   * SecretStores are servers where resource secrets (passwords, keys) are stored.
   * </pre>
   */
  public static abstract class SecretStoresImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one SecretStore by ID.
     * </pre>
     */
    public void get(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a SecretStore by ID.
     * </pre>
     */
    public void update(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a SecretStore by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of SecretStores matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateRequest,
                com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetRequest,
                com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateRequest,
                com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteRequest,
                com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListRequest,
                com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * SecretStores are servers where resource secrets (passwords, keys) are stored.
   * </pre>
   */
  public static final class SecretStoresStub extends io.grpc.stub.AbstractStub<SecretStoresStub> {
    private SecretStoresStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecretStoresStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretStoresStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecretStoresStub(channel, callOptions);
    }

    /**
     */
    public void create(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one SecretStore by ID.
     * </pre>
     */
    public void get(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a SecretStore by ID.
     * </pre>
     */
    public void update(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a SecretStore by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of SecretStores matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SecretStores are servers where resource secrets (passwords, keys) are stored.
   * </pre>
   */
  public static final class SecretStoresBlockingStub extends io.grpc.stub.AbstractStub<SecretStoresBlockingStub> {
    private SecretStoresBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecretStoresBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretStoresBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecretStoresBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateResponse create(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one SecretStore by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetResponse get(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a SecretStore by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateResponse update(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a SecretStore by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteResponse delete(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of SecretStores matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListResponse list(com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SecretStores are servers where resource secrets (passwords, keys) are stored.
   * </pre>
   */
  public static final class SecretStoresFutureStub extends io.grpc.stub.AbstractStub<SecretStoresFutureStub> {
    private SecretStoresFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecretStoresFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretStoresFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecretStoresFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateResponse> create(
        com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one SecretStore by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetResponse> get(
        com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a SecretStore by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateResponse> update(
        com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a SecretStore by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteResponse> delete(
        com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of SecretStores matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListResponse> list(
        com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListRequest request) {
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
    private final SecretStoresImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecretStoresImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreGetResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.SecretStoresPlumbing.SecretStoreListResponse>) responseObserver);
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

  private static abstract class SecretStoresBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecretStoresBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.SecretStoresPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecretStores");
    }
  }

  private static final class SecretStoresFileDescriptorSupplier
      extends SecretStoresBaseDescriptorSupplier {
    SecretStoresFileDescriptorSupplier() {}
  }

  private static final class SecretStoresMethodDescriptorSupplier
      extends SecretStoresBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecretStoresMethodDescriptorSupplier(String methodName) {
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
      synchronized (SecretStoresGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecretStoresFileDescriptorSupplier())
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
