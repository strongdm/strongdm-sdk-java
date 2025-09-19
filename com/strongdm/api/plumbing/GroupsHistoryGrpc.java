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
 * GroupsHistory records all changes to the state of a Group.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: groups_history.proto")
public final class GroupsHistoryGrpc {

  private GroupsHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.GroupsHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListRequest,
      com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListRequest,
      com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListRequest, com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListResponse> getListMethod;
    if ((getListMethod = GroupsHistoryGrpc.getListMethod) == null) {
      synchronized (GroupsHistoryGrpc.class) {
        if ((getListMethod = GroupsHistoryGrpc.getListMethod) == null) {
          GroupsHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListRequest, com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupsHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupsHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupsHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupsHistoryStub>() {
        @java.lang.Override
        public GroupsHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupsHistoryStub(channel, callOptions);
        }
      };
    return GroupsHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupsHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupsHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupsHistoryBlockingStub>() {
        @java.lang.Override
        public GroupsHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupsHistoryBlockingStub(channel, callOptions);
        }
      };
    return GroupsHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupsHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupsHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupsHistoryFutureStub>() {
        @java.lang.Override
        public GroupsHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupsHistoryFutureStub(channel, callOptions);
        }
      };
    return GroupsHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * GroupsHistory records all changes to the state of a Group.
   * </pre>
   */
  public static abstract class GroupsHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of GroupHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListRequest,
                com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * GroupsHistory records all changes to the state of a Group.
   * </pre>
   */
  public static final class GroupsHistoryStub extends io.grpc.stub.AbstractAsyncStub<GroupsHistoryStub> {
    private GroupsHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupsHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of GroupHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * GroupsHistory records all changes to the state of a Group.
   * </pre>
   */
  public static final class GroupsHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<GroupsHistoryBlockingStub> {
    private GroupsHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupsHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of GroupHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListResponse list(com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * GroupsHistory records all changes to the state of a Group.
   * </pre>
   */
  public static final class GroupsHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<GroupsHistoryFutureStub> {
    private GroupsHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupsHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of GroupHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListResponse> list(
        com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListRequest request) {
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
    private final GroupsHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupsHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsHistoryPlumbing.GroupHistoryListResponse>) responseObserver);
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

  private static abstract class GroupsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupsHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.GroupsHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GroupsHistory");
    }
  }

  private static final class GroupsHistoryFileDescriptorSupplier
      extends GroupsHistoryBaseDescriptorSupplier {
    GroupsHistoryFileDescriptorSupplier() {}
  }

  private static final class GroupsHistoryMethodDescriptorSupplier
      extends GroupsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupsHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (GroupsHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupsHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
