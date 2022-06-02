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
 * RoleAttachments represent relationships between composite roles and the roles
 * that make up those composite roles. When a composite role is attached to another
 * role, the permissions granted to members of the composite role are augmented to
 * include the permissions granted to members of the attached role.
 * 
 * Deprecated: use multi-role via AccountAttachments instead.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: role_attachments.proto")
@java.lang.Deprecated
public final class RoleAttachmentsGrpc {

  private RoleAttachmentsGrpc() {}

  public static final String SERVICE_NAME = "v1.RoleAttachments";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateRequest,
      com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateRequest,
      com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateRequest, com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateResponse> getCreateMethod;
    if ((getCreateMethod = RoleAttachmentsGrpc.getCreateMethod) == null) {
      synchronized (RoleAttachmentsGrpc.class) {
        if ((getCreateMethod = RoleAttachmentsGrpc.getCreateMethod) == null) {
          RoleAttachmentsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateRequest, com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleAttachmentsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetRequest,
      com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetRequest,
      com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetRequest, com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetResponse> getGetMethod;
    if ((getGetMethod = RoleAttachmentsGrpc.getGetMethod) == null) {
      synchronized (RoleAttachmentsGrpc.class) {
        if ((getGetMethod = RoleAttachmentsGrpc.getGetMethod) == null) {
          RoleAttachmentsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetRequest, com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleAttachmentsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest,
      com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest,
      com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest, com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = RoleAttachmentsGrpc.getDeleteMethod) == null) {
      synchronized (RoleAttachmentsGrpc.class) {
        if ((getDeleteMethod = RoleAttachmentsGrpc.getDeleteMethod) == null) {
          RoleAttachmentsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest, com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleAttachmentsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListRequest,
      com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListRequest,
      com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListRequest, com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListResponse> getListMethod;
    if ((getListMethod = RoleAttachmentsGrpc.getListMethod) == null) {
      synchronized (RoleAttachmentsGrpc.class) {
        if ((getListMethod = RoleAttachmentsGrpc.getListMethod) == null) {
          RoleAttachmentsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListRequest, com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleAttachmentsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoleAttachmentsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleAttachmentsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleAttachmentsStub>() {
        @java.lang.Override
        public RoleAttachmentsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleAttachmentsStub(channel, callOptions);
        }
      };
    return RoleAttachmentsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoleAttachmentsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleAttachmentsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleAttachmentsBlockingStub>() {
        @java.lang.Override
        public RoleAttachmentsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleAttachmentsBlockingStub(channel, callOptions);
        }
      };
    return RoleAttachmentsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoleAttachmentsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleAttachmentsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleAttachmentsFutureStub>() {
        @java.lang.Override
        public RoleAttachmentsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleAttachmentsFutureStub(channel, callOptions);
        }
      };
    return RoleAttachmentsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RoleAttachments represent relationships between composite roles and the roles
   * that make up those composite roles. When a composite role is attached to another
   * role, the permissions granted to members of the composite role are augmented to
   * include the permissions granted to members of the attached role.
   * 
   * Deprecated: use multi-role via AccountAttachments instead.
   * </pre>
   */
  @java.lang.Deprecated
  public static abstract class RoleAttachmentsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create registers a new RoleAttachment.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void create(com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one RoleAttachment by ID.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void get(com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a RoleAttachment by ID.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void delete(com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of RoleAttachments matching a given set of criteria.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void list(com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateRequest,
                com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetRequest,
                com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest,
                com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListRequest,
                com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * RoleAttachments represent relationships between composite roles and the roles
   * that make up those composite roles. When a composite role is attached to another
   * role, the permissions granted to members of the composite role are augmented to
   * include the permissions granted to members of the attached role.
   * 
   * Deprecated: use multi-role via AccountAttachments instead.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RoleAttachmentsStub extends io.grpc.stub.AbstractAsyncStub<RoleAttachmentsStub> {
    private RoleAttachmentsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleAttachmentsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleAttachmentsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new RoleAttachment.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void create(com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one RoleAttachment by ID.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void get(com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a RoleAttachment by ID.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void delete(com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of RoleAttachments matching a given set of criteria.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public void list(com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RoleAttachments represent relationships between composite roles and the roles
   * that make up those composite roles. When a composite role is attached to another
   * role, the permissions granted to members of the composite role are augmented to
   * include the permissions granted to members of the attached role.
   * 
   * Deprecated: use multi-role via AccountAttachments instead.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RoleAttachmentsBlockingStub extends io.grpc.stub.AbstractBlockingStub<RoleAttachmentsBlockingStub> {
    private RoleAttachmentsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleAttachmentsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleAttachmentsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new RoleAttachment.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateResponse create(com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one RoleAttachment by ID.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetResponse get(com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a RoleAttachment by ID.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse delete(com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of RoleAttachments matching a given set of criteria.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListResponse list(com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RoleAttachments represent relationships between composite roles and the roles
   * that make up those composite roles. When a composite role is attached to another
   * role, the permissions granted to members of the composite role are augmented to
   * include the permissions granted to members of the attached role.
   * 
   * Deprecated: use multi-role via AccountAttachments instead.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RoleAttachmentsFutureStub extends io.grpc.stub.AbstractFutureStub<RoleAttachmentsFutureStub> {
    private RoleAttachmentsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleAttachmentsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleAttachmentsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new RoleAttachment.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateResponse> create(
        com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one RoleAttachment by ID.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetResponse> get(
        com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a RoleAttachment by ID.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse> delete(
        com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of RoleAttachments matching a given set of criteria.
     * 
     * Deprecated: use multi-role via AccountAttachments instead.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListResponse> list(
        com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListRequest request) {
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
    private final RoleAttachmentsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoleAttachmentsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.RoleAttachmentListResponse>) responseObserver);
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

  private static abstract class RoleAttachmentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoleAttachmentsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoleAttachments");
    }
  }

  private static final class RoleAttachmentsFileDescriptorSupplier
      extends RoleAttachmentsBaseDescriptorSupplier {
    RoleAttachmentsFileDescriptorSupplier() {}
  }

  private static final class RoleAttachmentsMethodDescriptorSupplier
      extends RoleAttachmentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoleAttachmentsMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoleAttachmentsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoleAttachmentsFileDescriptorSupplier())
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
