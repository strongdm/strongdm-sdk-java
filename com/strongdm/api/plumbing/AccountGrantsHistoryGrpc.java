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
 * AccountGrantsHistory records all changes to the state of an AccountGrant.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: account_grants_history.proto")
public final class AccountGrantsHistoryGrpc {

  private AccountGrantsHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.AccountGrantsHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListRequest,
      com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListRequest,
      com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListRequest, com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListResponse> getListMethod;
    if ((getListMethod = AccountGrantsHistoryGrpc.getListMethod) == null) {
      synchronized (AccountGrantsHistoryGrpc.class) {
        if ((getListMethod = AccountGrantsHistoryGrpc.getListMethod) == null) {
          AccountGrantsHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListRequest, com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountGrantsHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountGrantsHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountGrantsHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountGrantsHistoryStub>() {
        @java.lang.Override
        public AccountGrantsHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountGrantsHistoryStub(channel, callOptions);
        }
      };
    return AccountGrantsHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountGrantsHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountGrantsHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountGrantsHistoryBlockingStub>() {
        @java.lang.Override
        public AccountGrantsHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountGrantsHistoryBlockingStub(channel, callOptions);
        }
      };
    return AccountGrantsHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountGrantsHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountGrantsHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountGrantsHistoryFutureStub>() {
        @java.lang.Override
        public AccountGrantsHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountGrantsHistoryFutureStub(channel, callOptions);
        }
      };
    return AccountGrantsHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AccountGrantsHistory records all changes to the state of an AccountGrant.
   * </pre>
   */
  public static abstract class AccountGrantsHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of AccountGrantHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListRequest,
                com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * AccountGrantsHistory records all changes to the state of an AccountGrant.
   * </pre>
   */
  public static final class AccountGrantsHistoryStub extends io.grpc.stub.AbstractAsyncStub<AccountGrantsHistoryStub> {
    private AccountGrantsHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountGrantsHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountGrantsHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountGrantHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AccountGrantsHistory records all changes to the state of an AccountGrant.
   * </pre>
   */
  public static final class AccountGrantsHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountGrantsHistoryBlockingStub> {
    private AccountGrantsHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountGrantsHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountGrantsHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountGrantHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListResponse list(com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AccountGrantsHistory records all changes to the state of an AccountGrant.
   * </pre>
   */
  public static final class AccountGrantsHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<AccountGrantsHistoryFutureStub> {
    private AccountGrantsHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountGrantsHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountGrantsHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountGrantHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListResponse> list(
        com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListRequest request) {
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
    private final AccountGrantsHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountGrantsHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.AccountGrantHistoryListResponse>) responseObserver);
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

  private static abstract class AccountGrantsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountGrantsHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.AccountGrantsHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountGrantsHistory");
    }
  }

  private static final class AccountGrantsHistoryFileDescriptorSupplier
      extends AccountGrantsHistoryBaseDescriptorSupplier {
    AccountGrantsHistoryFileDescriptorSupplier() {}
  }

  private static final class AccountGrantsHistoryMethodDescriptorSupplier
      extends AccountGrantsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountGrantsHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountGrantsHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountGrantsHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
