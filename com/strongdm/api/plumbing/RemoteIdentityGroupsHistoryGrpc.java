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
 * RemoteIdentityGroupsHistory records all changes to the state of a RemoteIdentityGroup.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: remote_identity_groups_history.proto")
@java.lang.Deprecated
public final class RemoteIdentityGroupsHistoryGrpc {

  private RemoteIdentityGroupsHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.RemoteIdentityGroupsHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListRequest,
      com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListRequest,
      com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListRequest, com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListResponse> getListMethod;
    if ((getListMethod = RemoteIdentityGroupsHistoryGrpc.getListMethod) == null) {
      synchronized (RemoteIdentityGroupsHistoryGrpc.class) {
        if ((getListMethod = RemoteIdentityGroupsHistoryGrpc.getListMethod) == null) {
          RemoteIdentityGroupsHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListRequest, com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteIdentityGroupsHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RemoteIdentityGroupsHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteIdentityGroupsHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteIdentityGroupsHistoryStub>() {
        @java.lang.Override
        public RemoteIdentityGroupsHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteIdentityGroupsHistoryStub(channel, callOptions);
        }
      };
    return RemoteIdentityGroupsHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RemoteIdentityGroupsHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteIdentityGroupsHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteIdentityGroupsHistoryBlockingStub>() {
        @java.lang.Override
        public RemoteIdentityGroupsHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteIdentityGroupsHistoryBlockingStub(channel, callOptions);
        }
      };
    return RemoteIdentityGroupsHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RemoteIdentityGroupsHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteIdentityGroupsHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteIdentityGroupsHistoryFutureStub>() {
        @java.lang.Override
        public RemoteIdentityGroupsHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteIdentityGroupsHistoryFutureStub(channel, callOptions);
        }
      };
    return RemoteIdentityGroupsHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RemoteIdentityGroupsHistory records all changes to the state of a RemoteIdentityGroup.
   * </pre>
   */
  @java.lang.Deprecated
  public static abstract class RemoteIdentityGroupsHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of RemoteIdentityGroupHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListRequest,
                com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * RemoteIdentityGroupsHistory records all changes to the state of a RemoteIdentityGroup.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RemoteIdentityGroupsHistoryStub extends io.grpc.stub.AbstractAsyncStub<RemoteIdentityGroupsHistoryStub> {
    private RemoteIdentityGroupsHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteIdentityGroupsHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteIdentityGroupsHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentityGroupHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RemoteIdentityGroupsHistory records all changes to the state of a RemoteIdentityGroup.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RemoteIdentityGroupsHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<RemoteIdentityGroupsHistoryBlockingStub> {
    private RemoteIdentityGroupsHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteIdentityGroupsHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteIdentityGroupsHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentityGroupHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListResponse list(com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RemoteIdentityGroupsHistory records all changes to the state of a RemoteIdentityGroup.
   * </pre>
   */
  @java.lang.Deprecated
  public static final class RemoteIdentityGroupsHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<RemoteIdentityGroupsHistoryFutureStub> {
    private RemoteIdentityGroupsHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteIdentityGroupsHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteIdentityGroupsHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentityGroupHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListResponse> list(
        com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListRequest request) {
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
    private final RemoteIdentityGroupsHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RemoteIdentityGroupsHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.RemoteIdentityGroupHistoryListResponse>) responseObserver);
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

  private static abstract class RemoteIdentityGroupsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RemoteIdentityGroupsHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.RemoteIdentityGroupsHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RemoteIdentityGroupsHistory");
    }
  }

  private static final class RemoteIdentityGroupsHistoryFileDescriptorSupplier
      extends RemoteIdentityGroupsHistoryBaseDescriptorSupplier {
    RemoteIdentityGroupsHistoryFileDescriptorSupplier() {}
  }

  private static final class RemoteIdentityGroupsHistoryMethodDescriptorSupplier
      extends RemoteIdentityGroupsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RemoteIdentityGroupsHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (RemoteIdentityGroupsHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RemoteIdentityGroupsHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
