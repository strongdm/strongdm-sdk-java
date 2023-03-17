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
 * RolesHistory records all changes to the state of a Role.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: roles_history.proto")
public final class RolesHistoryGrpc {

  private RolesHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.RolesHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListRequest,
      com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListRequest,
      com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListRequest, com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListResponse> getListMethod;
    if ((getListMethod = RolesHistoryGrpc.getListMethod) == null) {
      synchronized (RolesHistoryGrpc.class) {
        if ((getListMethod = RolesHistoryGrpc.getListMethod) == null) {
          RolesHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListRequest, com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RolesHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RolesHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RolesHistoryStub>() {
        @java.lang.Override
        public RolesHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RolesHistoryStub(channel, callOptions);
        }
      };
    return RolesHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RolesHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RolesHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RolesHistoryBlockingStub>() {
        @java.lang.Override
        public RolesHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RolesHistoryBlockingStub(channel, callOptions);
        }
      };
    return RolesHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RolesHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RolesHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RolesHistoryFutureStub>() {
        @java.lang.Override
        public RolesHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RolesHistoryFutureStub(channel, callOptions);
        }
      };
    return RolesHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RolesHistory records all changes to the state of a Role.
   * </pre>
   */
  public static abstract class RolesHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of RoleHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListRequest,
                com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * RolesHistory records all changes to the state of a Role.
   * </pre>
   */
  public static final class RolesHistoryStub extends io.grpc.stub.AbstractAsyncStub<RolesHistoryStub> {
    private RolesHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RolesHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RoleHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RolesHistory records all changes to the state of a Role.
   * </pre>
   */
  public static final class RolesHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<RolesHistoryBlockingStub> {
    private RolesHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RolesHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RoleHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListResponse list(com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RolesHistory records all changes to the state of a Role.
   * </pre>
   */
  public static final class RolesHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<RolesHistoryFutureStub> {
    private RolesHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RolesHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RoleHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListResponse> list(
        com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListRequest request) {
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
    private final RolesHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RolesHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RolesHistoryPlumbing.RoleHistoryListResponse>) responseObserver);
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

  private static abstract class RolesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RolesHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.RolesHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RolesHistory");
    }
  }

  private static final class RolesHistoryFileDescriptorSupplier
      extends RolesHistoryBaseDescriptorSupplier {
    RolesHistoryFileDescriptorSupplier() {}
  }

  private static final class RolesHistoryMethodDescriptorSupplier
      extends RolesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RolesHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (RolesHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RolesHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
