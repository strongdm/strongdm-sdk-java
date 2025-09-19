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
 * AccountsGroupsHistory records all changes to the state of an AccountGroup.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: accounts_groups_history.proto")
public final class AccountsGroupsHistoryGrpc {

  private AccountsGroupsHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.AccountsGroupsHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListRequest,
      com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListRequest,
      com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListRequest, com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListResponse> getListMethod;
    if ((getListMethod = AccountsGroupsHistoryGrpc.getListMethod) == null) {
      synchronized (AccountsGroupsHistoryGrpc.class) {
        if ((getListMethod = AccountsGroupsHistoryGrpc.getListMethod) == null) {
          AccountsGroupsHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListRequest, com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountsGroupsHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountsGroupsHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsGroupsHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsGroupsHistoryStub>() {
        @java.lang.Override
        public AccountsGroupsHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsGroupsHistoryStub(channel, callOptions);
        }
      };
    return AccountsGroupsHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountsGroupsHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsGroupsHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsGroupsHistoryBlockingStub>() {
        @java.lang.Override
        public AccountsGroupsHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsGroupsHistoryBlockingStub(channel, callOptions);
        }
      };
    return AccountsGroupsHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountsGroupsHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountsGroupsHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountsGroupsHistoryFutureStub>() {
        @java.lang.Override
        public AccountsGroupsHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountsGroupsHistoryFutureStub(channel, callOptions);
        }
      };
    return AccountsGroupsHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AccountsGroupsHistory records all changes to the state of an AccountGroup.
   * </pre>
   */
  public static abstract class AccountsGroupsHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of AccountGroupHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListRequest,
                com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * AccountsGroupsHistory records all changes to the state of an AccountGroup.
   * </pre>
   */
  public static final class AccountsGroupsHistoryStub extends io.grpc.stub.AbstractAsyncStub<AccountsGroupsHistoryStub> {
    private AccountsGroupsHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsGroupsHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsGroupsHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountGroupHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AccountsGroupsHistory records all changes to the state of an AccountGroup.
   * </pre>
   */
  public static final class AccountsGroupsHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountsGroupsHistoryBlockingStub> {
    private AccountsGroupsHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsGroupsHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsGroupsHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountGroupHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListResponse list(com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AccountsGroupsHistory records all changes to the state of an AccountGroup.
   * </pre>
   */
  public static final class AccountsGroupsHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<AccountsGroupsHistoryFutureStub> {
    private AccountsGroupsHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountsGroupsHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountsGroupsHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountGroupHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListResponse> list(
        com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListRequest request) {
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
    private final AccountsGroupsHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountsGroupsHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.AccountGroupHistoryListResponse>) responseObserver);
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

  private static abstract class AccountsGroupsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountsGroupsHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.AccountsGroupsHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountsGroupsHistory");
    }
  }

  private static final class AccountsGroupsHistoryFileDescriptorSupplier
      extends AccountsGroupsHistoryBaseDescriptorSupplier {
    AccountsGroupsHistoryFileDescriptorSupplier() {}
  }

  private static final class AccountsGroupsHistoryMethodDescriptorSupplier
      extends AccountsGroupsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountsGroupsHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountsGroupsHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountsGroupsHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
