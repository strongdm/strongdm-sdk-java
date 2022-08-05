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
 * Accounts are users that have access to strongDM. There are two types of accounts:
 * 1. **Users:** humans who are authenticated through username and password or SSO.
 * 2. **Service Accounts:** machines that are authenticated using a service token.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: accounts.proto")
public final class AccountsGrpc {

  private AccountsGrpc() {}

  public static final String SERVICE_NAME = "v1.Accounts";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateRequest,
      com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateRequest.class,
      responseType = com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateRequest,
      com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateRequest, com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateResponse> getCreateMethod;
    if ((getCreateMethod = AccountsGrpc.getCreateMethod) == null) {
      synchronized (AccountsGrpc.class) {
        if ((getCreateMethod = AccountsGrpc.getCreateMethod) == null) {
          AccountsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateRequest, com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountGetRequest,
      com.strongdm.api.plumbing.AccountsPlumbing.AccountGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.AccountsPlumbing.AccountGetRequest.class,
      responseType = com.strongdm.api.plumbing.AccountsPlumbing.AccountGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountGetRequest,
      com.strongdm.api.plumbing.AccountsPlumbing.AccountGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountGetRequest, com.strongdm.api.plumbing.AccountsPlumbing.AccountGetResponse> getGetMethod;
    if ((getGetMethod = AccountsGrpc.getGetMethod) == null) {
      synchronized (AccountsGrpc.class) {
        if ((getGetMethod = AccountsGrpc.getGetMethod) == null) {
          AccountsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountsPlumbing.AccountGetRequest, com.strongdm.api.plumbing.AccountsPlumbing.AccountGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsPlumbing.AccountGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsPlumbing.AccountGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateRequest,
      com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateRequest.class,
      responseType = com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateRequest,
      com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateRequest, com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = AccountsGrpc.getUpdateMethod) == null) {
      synchronized (AccountsGrpc.class) {
        if ((getUpdateMethod = AccountsGrpc.getUpdateMethod) == null) {
          AccountsGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateRequest, com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteRequest,
      com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteRequest,
      com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteRequest, com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = AccountsGrpc.getDeleteMethod) == null) {
      synchronized (AccountsGrpc.class) {
        if ((getDeleteMethod = AccountsGrpc.getDeleteMethod) == null) {
          AccountsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteRequest, com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountListRequest,
      com.strongdm.api.plumbing.AccountsPlumbing.AccountListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.AccountsPlumbing.AccountListRequest.class,
      responseType = com.strongdm.api.plumbing.AccountsPlumbing.AccountListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountListRequest,
      com.strongdm.api.plumbing.AccountsPlumbing.AccountListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsPlumbing.AccountListRequest, com.strongdm.api.plumbing.AccountsPlumbing.AccountListResponse> getListMethod;
    if ((getListMethod = AccountsGrpc.getListMethod) == null) {
      synchronized (AccountsGrpc.class) {
        if ((getListMethod = AccountsGrpc.getListMethod) == null) {
          AccountsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountsPlumbing.AccountListRequest, com.strongdm.api.plumbing.AccountsPlumbing.AccountListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsPlumbing.AccountListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsPlumbing.AccountListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsStub>() {
        @java.lang.Override
        public AccountsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsStub(channel, callOptions);
        }
      };
    return AccountsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsBlockingStub>() {
        @java.lang.Override
        public AccountsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsBlockingStub(channel, callOptions);
        }
      };
    return AccountsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsFutureStub>() {
        @java.lang.Override
        public AccountsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsFutureStub(channel, callOptions);
        }
      };
    return AccountsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Accounts are users that have access to strongDM. There are two types of accounts:
   * 1. **Users:** humans who are authenticated through username and password or SSO.
   * 2. **Service Accounts:** machines that are authenticated using a service token.
   * </pre>
   */
  public static abstract class AccountsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create registers a new Account.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one Account by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.AccountsPlumbing.AccountGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of an Account by ID.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes an Account by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Accounts matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountsPlumbing.AccountListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateRequest,
                com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountsPlumbing.AccountGetRequest,
                com.strongdm.api.plumbing.AccountsPlumbing.AccountGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateRequest,
                com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteRequest,
                com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountsPlumbing.AccountListRequest,
                com.strongdm.api.plumbing.AccountsPlumbing.AccountListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * Accounts are users that have access to strongDM. There are two types of accounts:
   * 1. **Users:** humans who are authenticated through username and password or SSO.
   * 2. **Service Accounts:** machines that are authenticated using a service token.
   * </pre>
   */
  public static final class AccountsStub extends io.grpc.stub.AbstractAsyncStub<AccountsStub> {
    private AccountsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new Account.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one Account by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.AccountsPlumbing.AccountGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of an Account by ID.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes an Account by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Accounts matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountsPlumbing.AccountListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Accounts are users that have access to strongDM. There are two types of accounts:
   * 1. **Users:** humans who are authenticated through username and password or SSO.
   * 2. **Service Accounts:** machines that are authenticated using a service token.
   * </pre>
   */
  public static final class AccountsBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountsBlockingStub> {
    private AccountsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new Account.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateResponse create(com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one Account by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountsPlumbing.AccountGetResponse get(com.strongdm.api.plumbing.AccountsPlumbing.AccountGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of an Account by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateResponse update(com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes an Account by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteResponse delete(com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of Accounts matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountsPlumbing.AccountListResponse list(com.strongdm.api.plumbing.AccountsPlumbing.AccountListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Accounts are users that have access to strongDM. There are two types of accounts:
   * 1. **Users:** humans who are authenticated through username and password or SSO.
   * 2. **Service Accounts:** machines that are authenticated using a service token.
   * </pre>
   */
  public static final class AccountsFutureStub extends io.grpc.stub.AbstractFutureStub<AccountsFutureStub> {
    private AccountsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new Account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateResponse> create(
        com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one Account by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountsPlumbing.AccountGetResponse> get(
        com.strongdm.api.plumbing.AccountsPlumbing.AccountGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of an Account by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateResponse> update(
        com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes an Account by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteResponse> delete(
        com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of Accounts matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountsPlumbing.AccountListResponse> list(
        com.strongdm.api.plumbing.AccountsPlumbing.AccountListRequest request) {
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
    private final AccountsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.AccountsPlumbing.AccountGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountGetResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.AccountsPlumbing.AccountListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsPlumbing.AccountListResponse>) responseObserver);
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

  private static abstract class AccountsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.AccountsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Accounts");
    }
  }

  private static final class AccountsFileDescriptorSupplier
      extends AccountsBaseDescriptorSupplier {
    AccountsFileDescriptorSupplier() {}
  }

  private static final class AccountsMethodDescriptorSupplier
      extends AccountsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountsMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountsFileDescriptorSupplier())
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
