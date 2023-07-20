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
 * PeeringGroupResources provides the building blocks necessary to obtain attach a resource to a peering group.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: peering_group_resources.proto")
public final class PeeringGroupResourcesGrpc {

  private PeeringGroupResourcesGrpc() {}

  public static final String SERVICE_NAME = "v1.PeeringGroupResources";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateRequest,
      com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateRequest.class,
      responseType = com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateRequest,
      com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateRequest, com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateResponse> getCreateMethod;
    if ((getCreateMethod = PeeringGroupResourcesGrpc.getCreateMethod) == null) {
      synchronized (PeeringGroupResourcesGrpc.class) {
        if ((getCreateMethod = PeeringGroupResourcesGrpc.getCreateMethod) == null) {
          PeeringGroupResourcesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateRequest, com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PeeringGroupResourcesMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteRequest,
      com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteRequest,
      com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteRequest, com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = PeeringGroupResourcesGrpc.getDeleteMethod) == null) {
      synchronized (PeeringGroupResourcesGrpc.class) {
        if ((getDeleteMethod = PeeringGroupResourcesGrpc.getDeleteMethod) == null) {
          PeeringGroupResourcesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteRequest, com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PeeringGroupResourcesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetRequest,
      com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetRequest.class,
      responseType = com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetRequest,
      com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetRequest, com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetResponse> getGetMethod;
    if ((getGetMethod = PeeringGroupResourcesGrpc.getGetMethod) == null) {
      synchronized (PeeringGroupResourcesGrpc.class) {
        if ((getGetMethod = PeeringGroupResourcesGrpc.getGetMethod) == null) {
          PeeringGroupResourcesGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetRequest, com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PeeringGroupResourcesMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListRequest,
      com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListRequest.class,
      responseType = com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListRequest,
      com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListRequest, com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListResponse> getListMethod;
    if ((getListMethod = PeeringGroupResourcesGrpc.getListMethod) == null) {
      synchronized (PeeringGroupResourcesGrpc.class) {
        if ((getListMethod = PeeringGroupResourcesGrpc.getListMethod) == null) {
          PeeringGroupResourcesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListRequest, com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PeeringGroupResourcesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PeeringGroupResourcesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PeeringGroupResourcesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PeeringGroupResourcesStub>() {
        @java.lang.Override
        public PeeringGroupResourcesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PeeringGroupResourcesStub(channel, callOptions);
        }
      };
    return PeeringGroupResourcesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PeeringGroupResourcesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PeeringGroupResourcesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PeeringGroupResourcesBlockingStub>() {
        @java.lang.Override
        public PeeringGroupResourcesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PeeringGroupResourcesBlockingStub(channel, callOptions);
        }
      };
    return PeeringGroupResourcesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PeeringGroupResourcesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PeeringGroupResourcesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PeeringGroupResourcesFutureStub>() {
        @java.lang.Override
        public PeeringGroupResourcesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PeeringGroupResourcesFutureStub(channel, callOptions);
        }
      };
    return PeeringGroupResourcesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * PeeringGroupResources provides the building blocks necessary to obtain attach a resource to a peering group.
   * </pre>
   */
  public static abstract class PeeringGroupResourcesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create attaches a Resource to a PeeringGroup
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete detaches a Resource to a PeeringGroup
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads the information of one peering group to resource attachment.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of peering group resource attachments.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateRequest,
                com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteRequest,
                com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetRequest,
                com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListRequest,
                com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * PeeringGroupResources provides the building blocks necessary to obtain attach a resource to a peering group.
   * </pre>
   */
  public static final class PeeringGroupResourcesStub extends io.grpc.stub.AbstractAsyncStub<PeeringGroupResourcesStub> {
    private PeeringGroupResourcesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeeringGroupResourcesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PeeringGroupResourcesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create attaches a Resource to a PeeringGroup
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete detaches a Resource to a PeeringGroup
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads the information of one peering group to resource attachment.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of peering group resource attachments.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * PeeringGroupResources provides the building blocks necessary to obtain attach a resource to a peering group.
   * </pre>
   */
  public static final class PeeringGroupResourcesBlockingStub extends io.grpc.stub.AbstractBlockingStub<PeeringGroupResourcesBlockingStub> {
    private PeeringGroupResourcesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeeringGroupResourcesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PeeringGroupResourcesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create attaches a Resource to a PeeringGroup
     * </pre>
     */
    public com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateResponse create(com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete detaches a Resource to a PeeringGroup
     * </pre>
     */
    public com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteResponse delete(com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads the information of one peering group to resource attachment.
     * </pre>
     */
    public com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetResponse get(com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of peering group resource attachments.
     * </pre>
     */
    public com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListResponse list(com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * PeeringGroupResources provides the building blocks necessary to obtain attach a resource to a peering group.
   * </pre>
   */
  public static final class PeeringGroupResourcesFutureStub extends io.grpc.stub.AbstractFutureStub<PeeringGroupResourcesFutureStub> {
    private PeeringGroupResourcesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeeringGroupResourcesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PeeringGroupResourcesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create attaches a Resource to a PeeringGroup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateResponse> create(
        com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete detaches a Resource to a PeeringGroup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteResponse> delete(
        com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads the information of one peering group to resource attachment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetResponse> get(
        com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of peering group resource attachments.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListResponse> list(
        com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListRequest request) {
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
    private final PeeringGroupResourcesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PeeringGroupResourcesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceCreateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceDeleteResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceGetResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.PeeringGroupResourceListResponse>) responseObserver);
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

  private static abstract class PeeringGroupResourcesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PeeringGroupResourcesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.PeeringGroupResourcesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PeeringGroupResources");
    }
  }

  private static final class PeeringGroupResourcesFileDescriptorSupplier
      extends PeeringGroupResourcesBaseDescriptorSupplier {
    PeeringGroupResourcesFileDescriptorSupplier() {}
  }

  private static final class PeeringGroupResourcesMethodDescriptorSupplier
      extends PeeringGroupResourcesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PeeringGroupResourcesMethodDescriptorSupplier(String methodName) {
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
      synchronized (PeeringGroupResourcesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PeeringGroupResourcesFileDescriptorSupplier())
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
