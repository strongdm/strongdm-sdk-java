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
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * Nodes are proxies in the strongDM network. They come in two flavors: relays,
 * which communicate with resources, and gateways, which communicate with
 * clients.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: nodes.proto")
public final class NodesGrpc {

  private NodesGrpc() {}

  public static final String SERVICE_NAME = "v1.Nodes";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateRequest,
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateResponse>
      getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateRequest,
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateResponse>
      getCreateMethod() {
    io.grpc.MethodDescriptor<
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateRequest,
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateResponse>
        getCreateMethod;
    if ((getCreateMethod = NodesGrpc.getCreateMethod) == null) {
      synchronized (NodesGrpc.class) {
        if ((getCreateMethod = NodesGrpc.getCreateMethod) == null) {
          NodesGrpc.getCreateMethod =
              getCreateMethod =
                  io.grpc.MethodDescriptor
                      .<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateRequest,
                          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new NodesMethodDescriptorSupplier("Create"))
                      .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetRequest,
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetResponse>
      getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetRequest.class,
      responseType = com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetRequest,
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetResponse>
      getGetMethod() {
    io.grpc.MethodDescriptor<
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetRequest,
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetResponse>
        getGetMethod;
    if ((getGetMethod = NodesGrpc.getGetMethod) == null) {
      synchronized (NodesGrpc.class) {
        if ((getGetMethod = NodesGrpc.getGetMethod) == null) {
          NodesGrpc.getGetMethod =
              getGetMethod =
                  io.grpc.MethodDescriptor
                      .<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetRequest,
                          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new NodesMethodDescriptorSupplier("Get"))
                      .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateRequest,
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateResponse>
      getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateRequest,
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateResponse>
      getUpdateMethod() {
    io.grpc.MethodDescriptor<
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateRequest,
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateResponse>
        getUpdateMethod;
    if ((getUpdateMethod = NodesGrpc.getUpdateMethod) == null) {
      synchronized (NodesGrpc.class) {
        if ((getUpdateMethod = NodesGrpc.getUpdateMethod) == null) {
          NodesGrpc.getUpdateMethod =
              getUpdateMethod =
                  io.grpc.MethodDescriptor
                      .<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateRequest,
                          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new NodesMethodDescriptorSupplier("Update"))
                      .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteRequest,
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteResponse>
      getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteRequest.class,
      responseType = com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteRequest,
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteResponse>
      getDeleteMethod() {
    io.grpc.MethodDescriptor<
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteRequest,
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteResponse>
        getDeleteMethod;
    if ((getDeleteMethod = NodesGrpc.getDeleteMethod) == null) {
      synchronized (NodesGrpc.class) {
        if ((getDeleteMethod = NodesGrpc.getDeleteMethod) == null) {
          NodesGrpc.getDeleteMethod =
              getDeleteMethod =
                  io.grpc.MethodDescriptor
                      .<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteRequest,
                          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new NodesMethodDescriptorSupplier("Delete"))
                      .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListRequest,
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListResponse>
      getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListRequest.class,
      responseType = com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListRequest,
          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListResponse>
      getListMethod() {
    io.grpc.MethodDescriptor<
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListRequest,
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListResponse>
        getListMethod;
    if ((getListMethod = NodesGrpc.getListMethod) == null) {
      synchronized (NodesGrpc.class) {
        if ((getListMethod = NodesGrpc.getListMethod) == null) {
          NodesGrpc.getListMethod =
              getListMethod =
                  io.grpc.MethodDescriptor
                      .<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListRequest,
                          com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new NodesMethodDescriptorSupplier("List"))
                      .build();
        }
      }
    }
    return getListMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static NodesStub newStub(io.grpc.Channel channel) {
    return new NodesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NodesBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new NodesBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static NodesFutureStub newFutureStub(io.grpc.Channel channel) {
    return new NodesFutureStub(channel);
  }

  /**
   *
   *
   * <pre>
   * Nodes are proxies in the strongDM network. They come in two flavors: relays,
   * which communicate with resources, and gateways, which communicate with
   * clients.
   * </pre>
   */
  public abstract static class NodesImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Create registers a new Node.
     * </pre>
     */
    public void create(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Get reads one Node by ID.
     * </pre>
     */
    public void get(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Update patches a Node by ID.
     * </pre>
     */
    public void update(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Delete removes a Node by ID.
     * </pre>
     */
    public void delete(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * List gets a list of Nodes matching a given set of criteria.
     * </pre>
     */
    public void list(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateRequest,
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateResponse>(
                      this, METHODID_CREATE)))
          .addMethod(
              getGetMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetRequest,
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetResponse>(
                      this, METHODID_GET)))
          .addMethod(
              getUpdateMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateRequest,
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateResponse>(
                      this, METHODID_UPDATE)))
          .addMethod(
              getDeleteMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteRequest,
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteResponse>(
                      this, METHODID_DELETE)))
          .addMethod(
              getListMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListRequest,
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListResponse>(
                      this, METHODID_LIST)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Nodes are proxies in the strongDM network. They come in two flavors: relays,
   * which communicate with resources, and gateways, which communicate with
   * clients.
   * </pre>
   */
  public static final class NodesStub extends io.grpc.stub.AbstractStub<NodesStub> {
    private NodesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodesStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodesStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodesStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Create registers a new Node.
     * </pre>
     */
    public void create(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Get reads one Node by ID.
     * </pre>
     */
    public void get(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Update patches a Node by ID.
     * </pre>
     */
    public void update(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Delete removes a Node by ID.
     * </pre>
     */
    public void delete(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * List gets a list of Nodes matching a given set of criteria.
     * </pre>
     */
    public void list(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Nodes are proxies in the strongDM network. They come in two flavors: relays,
   * which communicate with resources, and gateways, which communicate with
   * clients.
   * </pre>
   */
  public static final class NodesBlockingStub extends io.grpc.stub.AbstractStub<NodesBlockingStub> {
    private NodesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodesBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodesBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodesBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Create registers a new Node.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateResponse create(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateRequest request) {
      return blockingUnaryCall(getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Get reads one Node by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetResponse get(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetRequest request) {
      return blockingUnaryCall(getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Update patches a Node by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateResponse update(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Delete removes a Node by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteResponse delete(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * List gets a list of Nodes matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListResponse list(
        com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListRequest request) {
      return blockingUnaryCall(getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Nodes are proxies in the strongDM network. They come in two flavors: relays,
   * which communicate with resources, and gateways, which communicate with
   * clients.
   * </pre>
   */
  public static final class NodesFutureStub extends io.grpc.stub.AbstractStub<NodesFutureStub> {
    private NodesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodesFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodesFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodesFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Create registers a new Node.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateResponse>
        create(com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateRequest request) {
      return futureUnaryCall(getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Get reads one Node by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetResponse>
        get(com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetRequest request) {
      return futureUnaryCall(getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Update patches a Node by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateResponse>
        update(com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateRequest request) {
      return futureUnaryCall(getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Delete removes a Node by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteResponse>
        delete(com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteRequest request) {
      return futureUnaryCall(getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * List gets a list of Nodes matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListResponse>
        list(com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListRequest request) {
      return futureUnaryCall(getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_LIST = 4;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NodesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NodesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create(
              (com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeCreateResponse>)
                  responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get(
              (com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeGetResponse>)
                  responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update(
              (com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeUpdateResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete(
              (com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeDeleteResponse>)
                  responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list(
              (com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.strongdm.api.v1.plumbing.NodesPlumbing.NodeListResponse>)
                  responseObserver);
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

  private abstract static class NodesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NodesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.NodesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Nodes");
    }
  }

  private static final class NodesFileDescriptorSupplier extends NodesBaseDescriptorSupplier {
    NodesFileDescriptorSupplier() {}
  }

  private static final class NodesMethodDescriptorSupplier extends NodesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NodesMethodDescriptorSupplier(String methodName) {
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
      synchronized (NodesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new NodesFileDescriptorSupplier())
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
