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
 * AccountResourcesHistory records all changes to the state of a AccountResource.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: account_resources_history.proto")
public final class AccountResourcesHistoryGrpc {

  private AccountResourcesHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.AccountResourcesHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListRequest,
      com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListRequest,
      com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListRequest, com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListResponse> getListMethod;
    if ((getListMethod = AccountResourcesHistoryGrpc.getListMethod) == null) {
      synchronized (AccountResourcesHistoryGrpc.class) {
        if ((getListMethod = AccountResourcesHistoryGrpc.getListMethod) == null) {
          AccountResourcesHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListRequest, com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountResourcesHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountResourcesHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountResourcesHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountResourcesHistoryStub>() {
        @java.lang.Override
        public AccountResourcesHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountResourcesHistoryStub(channel, callOptions);
        }
      };
    return AccountResourcesHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountResourcesHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountResourcesHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountResourcesHistoryBlockingStub>() {
        @java.lang.Override
        public AccountResourcesHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountResourcesHistoryBlockingStub(channel, callOptions);
        }
      };
    return AccountResourcesHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountResourcesHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountResourcesHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountResourcesHistoryFutureStub>() {
        @java.lang.Override
        public AccountResourcesHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountResourcesHistoryFutureStub(channel, callOptions);
        }
      };
    return AccountResourcesHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AccountResourcesHistory records all changes to the state of a AccountResource.
   * </pre>
   */
  public static abstract class AccountResourcesHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of AccountResourceHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListRequest,
                com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * AccountResourcesHistory records all changes to the state of a AccountResource.
   * </pre>
   */
  public static final class AccountResourcesHistoryStub extends io.grpc.stub.AbstractAsyncStub<AccountResourcesHistoryStub> {
    private AccountResourcesHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountResourcesHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountResourcesHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountResourceHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AccountResourcesHistory records all changes to the state of a AccountResource.
   * </pre>
   */
  public static final class AccountResourcesHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountResourcesHistoryBlockingStub> {
    private AccountResourcesHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountResourcesHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountResourcesHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountResourceHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListResponse list(com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AccountResourcesHistory records all changes to the state of a AccountResource.
   * </pre>
   */
  public static final class AccountResourcesHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<AccountResourcesHistoryFutureStub> {
    private AccountResourcesHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountResourcesHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountResourcesHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountResourceHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListResponse> list(
        com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListRequest request) {
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
    private final AccountResourcesHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountResourcesHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.AccountResourceHistoryListResponse>) responseObserver);
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

  private static abstract class AccountResourcesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountResourcesHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.AccountResourcesHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountResourcesHistory");
    }
  }

  private static final class AccountResourcesHistoryFileDescriptorSupplier
      extends AccountResourcesHistoryBaseDescriptorSupplier {
    AccountResourcesHistoryFileDescriptorSupplier() {}
  }

  private static final class AccountResourcesHistoryMethodDescriptorSupplier
      extends AccountResourcesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountResourcesHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountResourcesHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountResourcesHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
