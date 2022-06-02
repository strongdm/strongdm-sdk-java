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
 * AccountGrants assign a resource directly to an account, giving the account the permission to connect to that resource.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: account_grants.proto")
public final class AccountGrantsGrpc {

  private AccountGrantsGrpc() {}

  public static final String SERVICE_NAME = "v1.AccountGrants";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateRequest,
      com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateRequest,
      com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateRequest, com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateResponse> getCreateMethod;
    if ((getCreateMethod = AccountGrantsGrpc.getCreateMethod) == null) {
      synchronized (AccountGrantsGrpc.class) {
        if ((getCreateMethod = AccountGrantsGrpc.getCreateMethod) == null) {
          AccountGrantsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateRequest, com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountGrantsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetRequest,
      com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetRequest.class,
      responseType = com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetRequest,
      com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetRequest, com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetResponse> getGetMethod;
    if ((getGetMethod = AccountGrantsGrpc.getGetMethod) == null) {
      synchronized (AccountGrantsGrpc.class) {
        if ((getGetMethod = AccountGrantsGrpc.getGetMethod) == null) {
          AccountGrantsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetRequest, com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountGrantsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteRequest,
      com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteRequest.class,
      responseType = com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteRequest,
      com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteRequest, com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = AccountGrantsGrpc.getDeleteMethod) == null) {
      synchronized (AccountGrantsGrpc.class) {
        if ((getDeleteMethod = AccountGrantsGrpc.getDeleteMethod) == null) {
          AccountGrantsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteRequest, com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountGrantsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListRequest,
      com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListRequest.class,
      responseType = com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListRequest,
      com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListRequest, com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListResponse> getListMethod;
    if ((getListMethod = AccountGrantsGrpc.getListMethod) == null) {
      synchronized (AccountGrantsGrpc.class) {
        if ((getListMethod = AccountGrantsGrpc.getListMethod) == null) {
          AccountGrantsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListRequest, com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountGrantsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountGrantsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountGrantsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountGrantsStub>() {
        @java.lang.Override
        public AccountGrantsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountGrantsStub(channel, callOptions);
        }
      };
    return AccountGrantsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountGrantsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountGrantsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountGrantsBlockingStub>() {
        @java.lang.Override
        public AccountGrantsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountGrantsBlockingStub(channel, callOptions);
        }
      };
    return AccountGrantsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountGrantsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountGrantsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountGrantsFutureStub>() {
        @java.lang.Override
        public AccountGrantsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountGrantsFutureStub(channel, callOptions);
        }
      };
    return AccountGrantsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AccountGrants assign a resource directly to an account, giving the account the permission to connect to that resource.
   * </pre>
   */
  public static abstract class AccountGrantsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create registers a new AccountGrant.
     * </pre>
     */
    public void create(com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one AccountGrant by ID.
     * </pre>
     */
    public void get(com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a AccountGrant by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of AccountGrants matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateRequest,
                com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetRequest,
                com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteRequest,
                com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListRequest,
                com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * AccountGrants assign a resource directly to an account, giving the account the permission to connect to that resource.
   * </pre>
   */
  public static final class AccountGrantsStub extends io.grpc.stub.AbstractAsyncStub<AccountGrantsStub> {
    private AccountGrantsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountGrantsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountGrantsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new AccountGrant.
     * </pre>
     */
    public void create(com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one AccountGrant by ID.
     * </pre>
     */
    public void get(com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a AccountGrant by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of AccountGrants matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AccountGrants assign a resource directly to an account, giving the account the permission to connect to that resource.
   * </pre>
   */
  public static final class AccountGrantsBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountGrantsBlockingStub> {
    private AccountGrantsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountGrantsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountGrantsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new AccountGrant.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateResponse create(com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one AccountGrant by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetResponse get(com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a AccountGrant by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteResponse delete(com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of AccountGrants matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListResponse list(com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AccountGrants assign a resource directly to an account, giving the account the permission to connect to that resource.
   * </pre>
   */
  public static final class AccountGrantsFutureStub extends io.grpc.stub.AbstractFutureStub<AccountGrantsFutureStub> {
    private AccountGrantsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountGrantsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountGrantsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new AccountGrant.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateResponse> create(
        com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one AccountGrant by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetResponse> get(
        com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a AccountGrant by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteResponse> delete(
        com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of AccountGrants matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListResponse> list(
        com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListRequest request) {
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
    private final AccountGrantsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountGrantsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.AccountGrantListResponse>) responseObserver);
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

  private static abstract class AccountGrantsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountGrantsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountGrants");
    }
  }

  private static final class AccountGrantsFileDescriptorSupplier
      extends AccountGrantsBaseDescriptorSupplier {
    AccountGrantsFileDescriptorSupplier() {}
  }

  private static final class AccountGrantsMethodDescriptorSupplier
      extends AccountGrantsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountGrantsMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountGrantsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountGrantsFileDescriptorSupplier())
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
