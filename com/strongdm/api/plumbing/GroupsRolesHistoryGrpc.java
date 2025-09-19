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
 * GroupsRolesHistory records all changes to the state of a GroupRole.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: groups_roles_history.proto")
public final class GroupsRolesHistoryGrpc {

  private GroupsRolesHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.GroupsRolesHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListRequest,
      com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListRequest,
      com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListRequest, com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListResponse> getListMethod;
    if ((getListMethod = GroupsRolesHistoryGrpc.getListMethod) == null) {
      synchronized (GroupsRolesHistoryGrpc.class) {
        if ((getListMethod = GroupsRolesHistoryGrpc.getListMethod) == null) {
          GroupsRolesHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListRequest, com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupsRolesHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupsRolesHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupsRolesHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupsRolesHistoryStub>() {
        @java.lang.Override
        public GroupsRolesHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupsRolesHistoryStub(channel, callOptions);
        }
      };
    return GroupsRolesHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupsRolesHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupsRolesHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupsRolesHistoryBlockingStub>() {
        @java.lang.Override
        public GroupsRolesHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupsRolesHistoryBlockingStub(channel, callOptions);
        }
      };
    return GroupsRolesHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupsRolesHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupsRolesHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupsRolesHistoryFutureStub>() {
        @java.lang.Override
        public GroupsRolesHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupsRolesHistoryFutureStub(channel, callOptions);
        }
      };
    return GroupsRolesHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * GroupsRolesHistory records all changes to the state of a GroupRole.
   * </pre>
   */
  public static abstract class GroupsRolesHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of GroupRoleHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListRequest,
                com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * GroupsRolesHistory records all changes to the state of a GroupRole.
   * </pre>
   */
  public static final class GroupsRolesHistoryStub extends io.grpc.stub.AbstractAsyncStub<GroupsRolesHistoryStub> {
    private GroupsRolesHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsRolesHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupsRolesHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of GroupRoleHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * GroupsRolesHistory records all changes to the state of a GroupRole.
   * </pre>
   */
  public static final class GroupsRolesHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<GroupsRolesHistoryBlockingStub> {
    private GroupsRolesHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsRolesHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupsRolesHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of GroupRoleHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListResponse list(com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * GroupsRolesHistory records all changes to the state of a GroupRole.
   * </pre>
   */
  public static final class GroupsRolesHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<GroupsRolesHistoryFutureStub> {
    private GroupsRolesHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsRolesHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupsRolesHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of GroupRoleHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListResponse> list(
        com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListRequest request) {
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
    private final GroupsRolesHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupsRolesHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.GroupRoleHistoryListResponse>) responseObserver);
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

  private static abstract class GroupsRolesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupsRolesHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.GroupsRolesHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GroupsRolesHistory");
    }
  }

  private static final class GroupsRolesHistoryFileDescriptorSupplier
      extends GroupsRolesHistoryBaseDescriptorSupplier {
    GroupsRolesHistoryFileDescriptorSupplier() {}
  }

  private static final class GroupsRolesHistoryMethodDescriptorSupplier
      extends GroupsRolesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupsRolesHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (GroupsRolesHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupsRolesHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
