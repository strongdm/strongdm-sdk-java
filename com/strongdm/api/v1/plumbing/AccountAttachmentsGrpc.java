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
 * AccountAttachments assign an account to a role or composite role.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: account_attachments.proto")
public final class AccountAttachmentsGrpc {

  private AccountAttachmentsGrpc() {}

  public static final String SERVICE_NAME = "v1.AccountAttachments";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateRequest,
      com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateRequest,
      com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateRequest, com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateResponse> getCreateMethod;
    if ((getCreateMethod = AccountAttachmentsGrpc.getCreateMethod) == null) {
      synchronized (AccountAttachmentsGrpc.class) {
        if ((getCreateMethod = AccountAttachmentsGrpc.getCreateMethod) == null) {
          AccountAttachmentsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateRequest, com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountAttachmentsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetRequest,
      com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetRequest.class,
      responseType = com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetRequest,
      com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetRequest, com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetResponse> getGetMethod;
    if ((getGetMethod = AccountAttachmentsGrpc.getGetMethod) == null) {
      synchronized (AccountAttachmentsGrpc.class) {
        if ((getGetMethod = AccountAttachmentsGrpc.getGetMethod) == null) {
          AccountAttachmentsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetRequest, com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountAttachmentsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest,
      com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest.class,
      responseType = com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest,
      com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest, com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = AccountAttachmentsGrpc.getDeleteMethod) == null) {
      synchronized (AccountAttachmentsGrpc.class) {
        if ((getDeleteMethod = AccountAttachmentsGrpc.getDeleteMethod) == null) {
          AccountAttachmentsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest, com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountAttachmentsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListRequest,
      com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListRequest.class,
      responseType = com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListRequest,
      com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListRequest, com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListResponse> getListMethod;
    if ((getListMethod = AccountAttachmentsGrpc.getListMethod) == null) {
      synchronized (AccountAttachmentsGrpc.class) {
        if ((getListMethod = AccountAttachmentsGrpc.getListMethod) == null) {
          AccountAttachmentsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListRequest, com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountAttachmentsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountAttachmentsStub newStub(io.grpc.Channel channel) {
    return new AccountAttachmentsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountAttachmentsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountAttachmentsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountAttachmentsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountAttachmentsFutureStub(channel);
  }

  /**
   * <pre>
   * AccountAttachments assign an account to a role or composite role.
   * </pre>
   */
  public static abstract class AccountAttachmentsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create registers a new AccountAttachment.
     * </pre>
     */
    public void create(com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one AccountAttachment by ID.
     * </pre>
     */
    public void get(com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a AccountAttachment by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of AccountAttachments matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateRequest,
                com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetRequest,
                com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest,
                com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListRequest,
                com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * AccountAttachments assign an account to a role or composite role.
   * </pre>
   */
  public static final class AccountAttachmentsStub extends io.grpc.stub.AbstractStub<AccountAttachmentsStub> {
    private AccountAttachmentsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountAttachmentsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountAttachmentsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountAttachmentsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new AccountAttachment.
     * </pre>
     */
    public void create(com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one AccountAttachment by ID.
     * </pre>
     */
    public void get(com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a AccountAttachment by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of AccountAttachments matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AccountAttachments assign an account to a role or composite role.
   * </pre>
   */
  public static final class AccountAttachmentsBlockingStub extends io.grpc.stub.AbstractStub<AccountAttachmentsBlockingStub> {
    private AccountAttachmentsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountAttachmentsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountAttachmentsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountAttachmentsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new AccountAttachment.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateResponse create(com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one AccountAttachment by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetResponse get(com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a AccountAttachment by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse delete(com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of AccountAttachments matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListResponse list(com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AccountAttachments assign an account to a role or composite role.
   * </pre>
   */
  public static final class AccountAttachmentsFutureStub extends io.grpc.stub.AbstractStub<AccountAttachmentsFutureStub> {
    private AccountAttachmentsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountAttachmentsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountAttachmentsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountAttachmentsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new AccountAttachment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateResponse> create(
        com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one AccountAttachment by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetResponse> get(
        com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a AccountAttachment by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse> delete(
        com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of AccountAttachments matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListResponse> list(
        com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListRequest request) {
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
    private final AccountAttachmentsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountAttachmentsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.AccountAttachmentListResponse>) responseObserver);
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

  private static abstract class AccountAttachmentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountAttachmentsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.AccountAttachmentsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountAttachments");
    }
  }

  private static final class AccountAttachmentsFileDescriptorSupplier
      extends AccountAttachmentsBaseDescriptorSupplier {
    AccountAttachmentsFileDescriptorSupplier() {}
  }

  private static final class AccountAttachmentsMethodDescriptorSupplier
      extends AccountAttachmentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountAttachmentsMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountAttachmentsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountAttachmentsFileDescriptorSupplier())
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
