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
 * RemoteIdentitiesHistory records all changes to the state of a RemoteIdentity.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: remote_identities_history.proto")
@java.lang.Deprecated
public final class RemoteIdentitiesHistoryGrpc {

  private RemoteIdentitiesHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.RemoteIdentitiesHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest,
      com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest,
      com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest, com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse> getListMethod;
    if ((getListMethod = RemoteIdentitiesHistoryGrpc.getListMethod) == null) {
      synchronized (RemoteIdentitiesHistoryGrpc.class) {
        if ((getListMethod = RemoteIdentitiesHistoryGrpc.getListMethod) == null) {
          RemoteIdentitiesHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest, com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteIdentitiesHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RemoteIdentitiesHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteIdentitiesHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteIdentitiesHistoryStub>() {
        @java.lang.Override
        public RemoteIdentitiesHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteIdentitiesHistoryStub(channel, callOptions);
        }
      };
    return RemoteIdentitiesHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RemoteIdentitiesHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteIdentitiesHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteIdentitiesHistoryBlockingStub>() {
        @java.lang.Override
        public RemoteIdentitiesHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteIdentitiesHistoryBlockingStub(channel, callOptions);
        }
      };
    return RemoteIdentitiesHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RemoteIdentitiesHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteIdentitiesHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteIdentitiesHistoryFutureStub>() {
        @java.lang.Override
        public RemoteIdentitiesHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteIdentitiesHistoryFutureStub(channel, callOptions);
        }
      };
    return RemoteIdentitiesHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RemoteIdentitiesHistory records all changes to the state of a RemoteIdentity.
   * </pre>
   */
  @java.lang.Deprecated
  public static abstract class RemoteIdentitiesHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of RemoteIdentityHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest,
                com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * RemoteIdentitiesHistory records all changes to the state of a RemoteIdentity.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RemoteIdentitiesHistoryStub extends io.grpc.stub.AbstractAsyncStub<RemoteIdentitiesHistoryStub> {
    private RemoteIdentitiesHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteIdentitiesHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteIdentitiesHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentityHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RemoteIdentitiesHistory records all changes to the state of a RemoteIdentity.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RemoteIdentitiesHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<RemoteIdentitiesHistoryBlockingStub> {
    private RemoteIdentitiesHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteIdentitiesHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteIdentitiesHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentityHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse list(com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RemoteIdentitiesHistory records all changes to the state of a RemoteIdentity.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RemoteIdentitiesHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<RemoteIdentitiesHistoryFutureStub> {
    private RemoteIdentitiesHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteIdentitiesHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteIdentitiesHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentityHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse> list(
        com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest request) {
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
    private final RemoteIdentitiesHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RemoteIdentitiesHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse>) responseObserver);
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

  private static abstract class RemoteIdentitiesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RemoteIdentitiesHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RemoteIdentitiesHistory");
    }
  }

  private static final class RemoteIdentitiesHistoryFileDescriptorSupplier
      extends RemoteIdentitiesHistoryBaseDescriptorSupplier {
    RemoteIdentitiesHistoryFileDescriptorSupplier() {}
  }

  private static final class RemoteIdentitiesHistoryMethodDescriptorSupplier
      extends RemoteIdentitiesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RemoteIdentitiesHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (RemoteIdentitiesHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RemoteIdentitiesHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
