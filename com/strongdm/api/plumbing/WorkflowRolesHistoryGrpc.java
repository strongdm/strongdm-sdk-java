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
 * WorkflowRolesHistory provides records of all changes to the state of a WorkflowRole
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: workflow_roles_history.proto")
public final class WorkflowRolesHistoryGrpc {

  private WorkflowRolesHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.WorkflowRolesHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListRequest,
      com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListRequest,
      com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListRequest, com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListResponse> getListMethod;
    if ((getListMethod = WorkflowRolesHistoryGrpc.getListMethod) == null) {
      synchronized (WorkflowRolesHistoryGrpc.class) {
        if ((getListMethod = WorkflowRolesHistoryGrpc.getListMethod) == null) {
          WorkflowRolesHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListRequest, com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowRolesHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowRolesHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowRolesHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowRolesHistoryStub>() {
        @java.lang.Override
        public WorkflowRolesHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowRolesHistoryStub(channel, callOptions);
        }
      };
    return WorkflowRolesHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowRolesHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowRolesHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowRolesHistoryBlockingStub>() {
        @java.lang.Override
        public WorkflowRolesHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowRolesHistoryBlockingStub(channel, callOptions);
        }
      };
    return WorkflowRolesHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowRolesHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowRolesHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowRolesHistoryFutureStub>() {
        @java.lang.Override
        public WorkflowRolesHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowRolesHistoryFutureStub(channel, callOptions);
        }
      };
    return WorkflowRolesHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * WorkflowRolesHistory provides records of all changes to the state of a WorkflowRole
   * </pre>
   */
  public static abstract class WorkflowRolesHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of WorkflowRolesHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListRequest,
                com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * WorkflowRolesHistory provides records of all changes to the state of a WorkflowRole
   * </pre>
   */
  public static final class WorkflowRolesHistoryStub extends io.grpc.stub.AbstractAsyncStub<WorkflowRolesHistoryStub> {
    private WorkflowRolesHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowRolesHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowRolesHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of WorkflowRolesHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * WorkflowRolesHistory provides records of all changes to the state of a WorkflowRole
   * </pre>
   */
  public static final class WorkflowRolesHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<WorkflowRolesHistoryBlockingStub> {
    private WorkflowRolesHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowRolesHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowRolesHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of WorkflowRolesHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListResponse list(com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * WorkflowRolesHistory provides records of all changes to the state of a WorkflowRole
   * </pre>
   */
  public static final class WorkflowRolesHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<WorkflowRolesHistoryFutureStub> {
    private WorkflowRolesHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowRolesHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowRolesHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of WorkflowRolesHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListResponse> list(
        com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListRequest request) {
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
    private final WorkflowRolesHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkflowRolesHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.WorkflowRolesHistoryListResponse>) responseObserver);
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

  private static abstract class WorkflowRolesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowRolesHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.WorkflowRolesHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowRolesHistory");
    }
  }

  private static final class WorkflowRolesHistoryFileDescriptorSupplier
      extends WorkflowRolesHistoryBaseDescriptorSupplier {
    WorkflowRolesHistoryFileDescriptorSupplier() {}
  }

  private static final class WorkflowRolesHistoryMethodDescriptorSupplier
      extends WorkflowRolesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowRolesHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowRolesHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowRolesHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
