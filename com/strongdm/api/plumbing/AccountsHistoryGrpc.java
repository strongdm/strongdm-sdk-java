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
 * AccountsHistory records all changes to the state of an Account.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: accounts_history.proto")
public final class AccountsHistoryGrpc {

  private AccountsHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.AccountsHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListRequest,
      com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListRequest,
      com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListRequest, com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListResponse> getListMethod;
    if ((getListMethod = AccountsHistoryGrpc.getListMethod) == null) {
      synchronized (AccountsHistoryGrpc.class) {
        if ((getListMethod = AccountsHistoryGrpc.getListMethod) == null) {
          AccountsHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListRequest, com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountsHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsHistoryStub>() {
        @java.lang.Override
        public AccountsHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsHistoryStub(channel, callOptions);
        }
      };
    return AccountsHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountsHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsHistoryBlockingStub>() {
        @java.lang.Override
        public AccountsHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsHistoryBlockingStub(channel, callOptions);
        }
      };
    return AccountsHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountsHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsHistoryFutureStub>() {
        @java.lang.Override
        public AccountsHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsHistoryFutureStub(channel, callOptions);
        }
      };
    return AccountsHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AccountsHistory records all changes to the state of an Account.
   * </pre>
   */
  public static abstract class AccountsHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of AccountHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListRequest,
                com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * AccountsHistory records all changes to the state of an Account.
   * </pre>
   */
  public static final class AccountsHistoryStub extends io.grpc.stub.AbstractAsyncStub<AccountsHistoryStub> {
    private AccountsHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AccountsHistory records all changes to the state of an Account.
   * </pre>
   */
  public static final class AccountsHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountsHistoryBlockingStub> {
    private AccountsHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListResponse list(com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AccountsHistory records all changes to the state of an Account.
   * </pre>
   */
  public static final class AccountsHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<AccountsHistoryFutureStub> {
    private AccountsHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListResponse> list(
        com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountsHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountsHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsHistoryPlumbing.AccountHistoryListResponse>) responseObserver);
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

  private static abstract class AccountsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountsHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.AccountsHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountsHistory");
    }
  }

  private static final class AccountsHistoryFileDescriptorSupplier
      extends AccountsHistoryBaseDescriptorSupplier {
    AccountsHistoryFileDescriptorSupplier() {}
  }

  private static final class AccountsHistoryMethodDescriptorSupplier
      extends AccountsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountsHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountsHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountsHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
