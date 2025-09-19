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
 * An AccountGroup links an account and a group.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: accounts_groups.proto")
public final class AccountsGroupsGrpc {

  private AccountsGroupsGrpc() {}

  public static final String SERVICE_NAME = "v1.AccountsGroups";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateRequest,
      com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateRequest.class,
      responseType = com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateRequest,
      com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateRequest, com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateResponse> getCreateMethod;
    if ((getCreateMethod = AccountsGroupsGrpc.getCreateMethod) == null) {
      synchronized (AccountsGroupsGrpc.class) {
        if ((getCreateMethod = AccountsGroupsGrpc.getCreateMethod) == null) {
          AccountsGroupsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateRequest, com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsGroupsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetRequest,
      com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetRequest.class,
      responseType = com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetRequest,
      com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetRequest, com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetResponse> getGetMethod;
    if ((getGetMethod = AccountsGroupsGrpc.getGetMethod) == null) {
      synchronized (AccountsGroupsGrpc.class) {
        if ((getGetMethod = AccountsGroupsGrpc.getGetMethod) == null) {
          AccountsGroupsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetRequest, com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsGroupsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteRequest,
      com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteRequest,
      com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteRequest, com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = AccountsGroupsGrpc.getDeleteMethod) == null) {
      synchronized (AccountsGroupsGrpc.class) {
        if ((getDeleteMethod = AccountsGroupsGrpc.getDeleteMethod) == null) {
          AccountsGroupsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteRequest, com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsGroupsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListRequest,
      com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListRequest.class,
      responseType = com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListRequest,
      com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListRequest, com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListResponse> getListMethod;
    if ((getListMethod = AccountsGroupsGrpc.getListMethod) == null) {
      synchronized (AccountsGroupsGrpc.class) {
        if ((getListMethod = AccountsGroupsGrpc.getListMethod) == null) {
          AccountsGroupsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListRequest, com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsGroupsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountsGroupsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsGroupsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsGroupsStub>() {
        @java.lang.Override
        public AccountsGroupsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsGroupsStub(channel, callOptions);
        }
      };
    return AccountsGroupsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountsGroupsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsGroupsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsGroupsBlockingStub>() {
        @java.lang.Override
        public AccountsGroupsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsGroupsBlockingStub(channel, callOptions);
        }
      };
    return AccountsGroupsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountsGroupsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsGroupsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsGroupsFutureStub>() {
        @java.lang.Override
        public AccountsGroupsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsGroupsFutureStub(channel, callOptions);
        }
      };
    return AccountsGroupsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An AccountGroup links an account and a group.
   * </pre>
   */
  public static abstract class AccountsGroupsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create create a new AccountGroup.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one AccountGroup by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes an AccountGroup by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of AccountGroups matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateRequest,
                com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetRequest,
                com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteRequest,
                com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListRequest,
                com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * An AccountGroup links an account and a group.
   * </pre>
   */
  public static final class AccountsGroupsStub extends io.grpc.stub.AbstractAsyncStub<AccountsGroupsStub> {
    private AccountsGroupsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsGroupsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsGroupsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create create a new AccountGroup.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one AccountGroup by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes an AccountGroup by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of AccountGroups matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * An AccountGroup links an account and a group.
   * </pre>
   */
  public static final class AccountsGroupsBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountsGroupsBlockingStub> {
    private AccountsGroupsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsGroupsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsGroupsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create create a new AccountGroup.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateResponse create(com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one AccountGroup by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetResponse get(com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes an AccountGroup by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteResponse delete(com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of AccountGroups matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListResponse list(com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * An AccountGroup links an account and a group.
   * </pre>
   */
  public static final class AccountsGroupsFutureStub extends io.grpc.stub.AbstractFutureStub<AccountsGroupsFutureStub> {
    private AccountsGroupsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsGroupsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsGroupsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create create a new AccountGroup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateResponse> create(
        com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one AccountGroup by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetResponse> get(
        com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes an AccountGroup by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteResponse> delete(
        com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of AccountGroups matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListResponse> list(
        com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListRequest request) {
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
    private final AccountsGroupsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountsGroupsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsPlumbing.AccountGroupListResponse>) responseObserver);
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

  private static abstract class AccountsGroupsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountsGroupsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.AccountsGroupsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountsGroups");
    }
  }

  private static final class AccountsGroupsFileDescriptorSupplier
      extends AccountsGroupsBaseDescriptorSupplier {
    AccountsGroupsFileDescriptorSupplier() {}
  }

  private static final class AccountsGroupsMethodDescriptorSupplier
      extends AccountsGroupsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountsGroupsMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountsGroupsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountsGroupsFileDescriptorSupplier())
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
