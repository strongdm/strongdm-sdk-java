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
 * Proxy Cluster Keys are authentication keys for all proxies within a cluster.
 * The proxies within a cluster share the same key. One cluster can have
 * multiple keys in order to facilitate key rotation.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: proxy_cluster_keys.proto")
public final class ProxyClusterKeysGrpc {

  private ProxyClusterKeysGrpc() {}

  public static final String SERVICE_NAME = "v1.ProxyClusterKeys";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateRequest,
      com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateRequest.class,
      responseType = com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateRequest,
      com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateRequest, com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateResponse> getCreateMethod;
    if ((getCreateMethod = ProxyClusterKeysGrpc.getCreateMethod) == null) {
      synchronized (ProxyClusterKeysGrpc.class) {
        if ((getCreateMethod = ProxyClusterKeysGrpc.getCreateMethod) == null) {
          ProxyClusterKeysGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateRequest, com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyClusterKeysMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetRequest,
      com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetRequest.class,
      responseType = com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetRequest,
      com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetRequest, com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetResponse> getGetMethod;
    if ((getGetMethod = ProxyClusterKeysGrpc.getGetMethod) == null) {
      synchronized (ProxyClusterKeysGrpc.class) {
        if ((getGetMethod = ProxyClusterKeysGrpc.getGetMethod) == null) {
          ProxyClusterKeysGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetRequest, com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyClusterKeysMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteRequest,
      com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteRequest,
      com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteRequest, com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ProxyClusterKeysGrpc.getDeleteMethod) == null) {
      synchronized (ProxyClusterKeysGrpc.class) {
        if ((getDeleteMethod = ProxyClusterKeysGrpc.getDeleteMethod) == null) {
          ProxyClusterKeysGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteRequest, com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyClusterKeysMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListRequest,
      com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListRequest.class,
      responseType = com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListRequest,
      com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListRequest, com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListResponse> getListMethod;
    if ((getListMethod = ProxyClusterKeysGrpc.getListMethod) == null) {
      synchronized (ProxyClusterKeysGrpc.class) {
        if ((getListMethod = ProxyClusterKeysGrpc.getListMethod) == null) {
          ProxyClusterKeysGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListRequest, com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyClusterKeysMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProxyClusterKeysStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyClusterKeysStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyClusterKeysStub>() {
        @java.lang.Override
        public ProxyClusterKeysStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyClusterKeysStub(channel, callOptions);
        }
      };
    return ProxyClusterKeysStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProxyClusterKeysBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyClusterKeysBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyClusterKeysBlockingStub>() {
        @java.lang.Override
        public ProxyClusterKeysBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyClusterKeysBlockingStub(channel, callOptions);
        }
      };
    return ProxyClusterKeysBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProxyClusterKeysFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyClusterKeysFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyClusterKeysFutureStub>() {
        @java.lang.Override
        public ProxyClusterKeysFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyClusterKeysFutureStub(channel, callOptions);
        }
      };
    return ProxyClusterKeysFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Proxy Cluster Keys are authentication keys for all proxies within a cluster.
   * The proxies within a cluster share the same key. One cluster can have
   * multiple keys in order to facilitate key rotation.
   * </pre>
   */
  public static abstract class ProxyClusterKeysImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create registers a new ProxyClusterKey.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one ProxyClusterKey by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a ProxyClusterKey by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of ProxyClusterKeys matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateRequest,
                com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetRequest,
                com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteRequest,
                com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListRequest,
                com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * Proxy Cluster Keys are authentication keys for all proxies within a cluster.
   * The proxies within a cluster share the same key. One cluster can have
   * multiple keys in order to facilitate key rotation.
   * </pre>
   */
  public static final class ProxyClusterKeysStub extends io.grpc.stub.AbstractAsyncStub<ProxyClusterKeysStub> {
    private ProxyClusterKeysStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyClusterKeysStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyClusterKeysStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new ProxyClusterKey.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one ProxyClusterKey by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a ProxyClusterKey by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of ProxyClusterKeys matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Proxy Cluster Keys are authentication keys for all proxies within a cluster.
   * The proxies within a cluster share the same key. One cluster can have
   * multiple keys in order to facilitate key rotation.
   * </pre>
   */
  public static final class ProxyClusterKeysBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProxyClusterKeysBlockingStub> {
    private ProxyClusterKeysBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyClusterKeysBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyClusterKeysBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new ProxyClusterKey.
     * </pre>
     */
    public com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateResponse create(com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one ProxyClusterKey by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetResponse get(com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a ProxyClusterKey by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteResponse delete(com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of ProxyClusterKeys matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListResponse list(com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Proxy Cluster Keys are authentication keys for all proxies within a cluster.
   * The proxies within a cluster share the same key. One cluster can have
   * multiple keys in order to facilitate key rotation.
   * </pre>
   */
  public static final class ProxyClusterKeysFutureStub extends io.grpc.stub.AbstractFutureStub<ProxyClusterKeysFutureStub> {
    private ProxyClusterKeysFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyClusterKeysFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyClusterKeysFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new ProxyClusterKey.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateResponse> create(
        com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one ProxyClusterKey by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetResponse> get(
        com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a ProxyClusterKey by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteResponse> delete(
        com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of ProxyClusterKeys matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListResponse> list(
        com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListRequest request) {
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
    private final ProxyClusterKeysImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProxyClusterKeysImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.ProxyClusterKeyListResponse>) responseObserver);
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

  private static abstract class ProxyClusterKeysBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProxyClusterKeysBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.ProxyClusterKeysPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProxyClusterKeys");
    }
  }

  private static final class ProxyClusterKeysFileDescriptorSupplier
      extends ProxyClusterKeysBaseDescriptorSupplier {
    ProxyClusterKeysFileDescriptorSupplier() {}
  }

  private static final class ProxyClusterKeysMethodDescriptorSupplier
      extends ProxyClusterKeysBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProxyClusterKeysMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProxyClusterKeysGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProxyClusterKeysFileDescriptorSupplier())
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
