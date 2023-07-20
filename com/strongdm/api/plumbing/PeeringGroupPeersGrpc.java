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
 * PeeringGroupPeers provides the building blocks necessary to link two peering groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: peering_group_peers.proto")
public final class PeeringGroupPeersGrpc {

  private PeeringGroupPeersGrpc() {}

  public static final String SERVICE_NAME = "v1.PeeringGroupPeers";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest,
      com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest.class,
      responseType = com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest,
      com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest, com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse> getCreateMethod;
    if ((getCreateMethod = PeeringGroupPeersGrpc.getCreateMethod) == null) {
      synchronized (PeeringGroupPeersGrpc.class) {
        if ((getCreateMethod = PeeringGroupPeersGrpc.getCreateMethod) == null) {
          PeeringGroupPeersGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest, com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PeeringGroupPeersMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest,
      com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest,
      com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest, com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = PeeringGroupPeersGrpc.getDeleteMethod) == null) {
      synchronized (PeeringGroupPeersGrpc.class) {
        if ((getDeleteMethod = PeeringGroupPeersGrpc.getDeleteMethod) == null) {
          PeeringGroupPeersGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest, com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PeeringGroupPeersMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest,
      com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest.class,
      responseType = com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest,
      com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest, com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse> getGetMethod;
    if ((getGetMethod = PeeringGroupPeersGrpc.getGetMethod) == null) {
      synchronized (PeeringGroupPeersGrpc.class) {
        if ((getGetMethod = PeeringGroupPeersGrpc.getGetMethod) == null) {
          PeeringGroupPeersGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest, com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PeeringGroupPeersMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest,
      com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest.class,
      responseType = com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest,
      com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest, com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse> getListMethod;
    if ((getListMethod = PeeringGroupPeersGrpc.getListMethod) == null) {
      synchronized (PeeringGroupPeersGrpc.class) {
        if ((getListMethod = PeeringGroupPeersGrpc.getListMethod) == null) {
          PeeringGroupPeersGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest, com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PeeringGroupPeersMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PeeringGroupPeersStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PeeringGroupPeersStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PeeringGroupPeersStub>() {
        @java.lang.Override
        public PeeringGroupPeersStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PeeringGroupPeersStub(channel, callOptions);
        }
      };
    return PeeringGroupPeersStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PeeringGroupPeersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PeeringGroupPeersBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PeeringGroupPeersBlockingStub>() {
        @java.lang.Override
        public PeeringGroupPeersBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PeeringGroupPeersBlockingStub(channel, callOptions);
        }
      };
    return PeeringGroupPeersBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PeeringGroupPeersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PeeringGroupPeersFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PeeringGroupPeersFutureStub>() {
        @java.lang.Override
        public PeeringGroupPeersFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PeeringGroupPeersFutureStub(channel, callOptions);
        }
      };
    return PeeringGroupPeersFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * PeeringGroupPeers provides the building blocks necessary to link two peering groups.
   * </pre>
   */
  public static abstract class PeeringGroupPeersImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create links two peering groups.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete unlinks two peering groups.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads the information of one peering group link.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of peering group links.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest,
                com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest,
                com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest,
                com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest,
                com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * PeeringGroupPeers provides the building blocks necessary to link two peering groups.
   * </pre>
   */
  public static final class PeeringGroupPeersStub extends io.grpc.stub.AbstractAsyncStub<PeeringGroupPeersStub> {
    private PeeringGroupPeersStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeeringGroupPeersStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PeeringGroupPeersStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create links two peering groups.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete unlinks two peering groups.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads the information of one peering group link.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of peering group links.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * PeeringGroupPeers provides the building blocks necessary to link two peering groups.
   * </pre>
   */
  public static final class PeeringGroupPeersBlockingStub extends io.grpc.stub.AbstractBlockingStub<PeeringGroupPeersBlockingStub> {
    private PeeringGroupPeersBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeeringGroupPeersBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PeeringGroupPeersBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create links two peering groups.
     * </pre>
     */
    public com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse create(com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete unlinks two peering groups.
     * </pre>
     */
    public com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse delete(com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads the information of one peering group link.
     * </pre>
     */
    public com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse get(com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of peering group links.
     * </pre>
     */
    public com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse list(com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * PeeringGroupPeers provides the building blocks necessary to link two peering groups.
   * </pre>
   */
  public static final class PeeringGroupPeersFutureStub extends io.grpc.stub.AbstractFutureStub<PeeringGroupPeersFutureStub> {
    private PeeringGroupPeersFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeeringGroupPeersFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PeeringGroupPeersFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create links two peering groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse> create(
        com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete unlinks two peering groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse> delete(
        com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads the information of one peering group link.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse> get(
        com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of peering group links.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse> list(
        com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_LIST = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PeeringGroupPeersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PeeringGroupPeersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse>) responseObserver);
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

  private static abstract class PeeringGroupPeersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PeeringGroupPeersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.PeeringGroupPeersPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PeeringGroupPeers");
    }
  }

  private static final class PeeringGroupPeersFileDescriptorSupplier
      extends PeeringGroupPeersBaseDescriptorSupplier {
    PeeringGroupPeersFileDescriptorSupplier() {}
  }

  private static final class PeeringGroupPeersMethodDescriptorSupplier
      extends PeeringGroupPeersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PeeringGroupPeersMethodDescriptorSupplier(String methodName) {
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
      synchronized (PeeringGroupPeersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PeeringGroupPeersFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
