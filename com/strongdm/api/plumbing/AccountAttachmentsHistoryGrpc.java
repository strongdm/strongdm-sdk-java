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
 * AccountAttachmentsHistory records all changes to the state of an AccountAttachment.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: account_attachments_history.proto")
public final class AccountAttachmentsHistoryGrpc {

  private AccountAttachmentsHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.AccountAttachmentsHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListRequest,
      com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListRequest,
      com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListRequest, com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListResponse> getListMethod;
    if ((getListMethod = AccountAttachmentsHistoryGrpc.getListMethod) == null) {
      synchronized (AccountAttachmentsHistoryGrpc.class) {
        if ((getListMethod = AccountAttachmentsHistoryGrpc.getListMethod) == null) {
          AccountAttachmentsHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListRequest, com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountAttachmentsHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountAttachmentsHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountAttachmentsHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountAttachmentsHistoryStub>() {
        @java.lang.Override
        public AccountAttachmentsHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountAttachmentsHistoryStub(channel, callOptions);
        }
      };
    return AccountAttachmentsHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountAttachmentsHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountAttachmentsHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountAttachmentsHistoryBlockingStub>() {
        @java.lang.Override
        public AccountAttachmentsHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountAttachmentsHistoryBlockingStub(channel, callOptions);
        }
      };
    return AccountAttachmentsHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountAttachmentsHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountAttachmentsHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountAttachmentsHistoryFutureStub>() {
        @java.lang.Override
        public AccountAttachmentsHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountAttachmentsHistoryFutureStub(channel, callOptions);
        }
      };
    return AccountAttachmentsHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AccountAttachmentsHistory records all changes to the state of an AccountAttachment.
   * </pre>
   */
  public static abstract class AccountAttachmentsHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of AccountAttachmentHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListRequest,
                com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * AccountAttachmentsHistory records all changes to the state of an AccountAttachment.
   * </pre>
   */
  public static final class AccountAttachmentsHistoryStub extends io.grpc.stub.AbstractAsyncStub<AccountAttachmentsHistoryStub> {
    private AccountAttachmentsHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountAttachmentsHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountAttachmentsHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountAttachmentHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AccountAttachmentsHistory records all changes to the state of an AccountAttachment.
   * </pre>
   */
  public static final class AccountAttachmentsHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountAttachmentsHistoryBlockingStub> {
    private AccountAttachmentsHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountAttachmentsHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountAttachmentsHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountAttachmentHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListResponse list(com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AccountAttachmentsHistory records all changes to the state of an AccountAttachment.
   * </pre>
   */
  public static final class AccountAttachmentsHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<AccountAttachmentsHistoryFutureStub> {
    private AccountAttachmentsHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountAttachmentsHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountAttachmentsHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccountAttachmentHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListResponse> list(
        com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListRequest request) {
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
    private final AccountAttachmentsHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountAttachmentsHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.AccountAttachmentHistoryListResponse>) responseObserver);
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

  private static abstract class AccountAttachmentsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountAttachmentsHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.AccountAttachmentsHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountAttachmentsHistory");
    }
  }

  private static final class AccountAttachmentsHistoryFileDescriptorSupplier
      extends AccountAttachmentsHistoryBaseDescriptorSupplier {
    AccountAttachmentsHistoryFileDescriptorSupplier() {}
  }

  private static final class AccountAttachmentsHistoryMethodDescriptorSupplier
      extends AccountAttachmentsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountAttachmentsHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountAttachmentsHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountAttachmentsHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
