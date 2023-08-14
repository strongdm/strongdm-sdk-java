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
 * WorkflowAssignmentsHistory provides records of all changes to the state of a WorkflowAssignment.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: workflow_assignments_history.proto")
public final class WorkflowAssignmentsHistoryGrpc {

  private WorkflowAssignmentsHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.WorkflowAssignmentsHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListRequest,
      com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListRequest,
      com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListRequest, com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListResponse> getListMethod;
    if ((getListMethod = WorkflowAssignmentsHistoryGrpc.getListMethod) == null) {
      synchronized (WorkflowAssignmentsHistoryGrpc.class) {
        if ((getListMethod = WorkflowAssignmentsHistoryGrpc.getListMethod) == null) {
          WorkflowAssignmentsHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListRequest, com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowAssignmentsHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowAssignmentsHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowAssignmentsHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowAssignmentsHistoryStub>() {
        @java.lang.Override
        public WorkflowAssignmentsHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowAssignmentsHistoryStub(channel, callOptions);
        }
      };
    return WorkflowAssignmentsHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowAssignmentsHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowAssignmentsHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowAssignmentsHistoryBlockingStub>() {
        @java.lang.Override
        public WorkflowAssignmentsHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowAssignmentsHistoryBlockingStub(channel, callOptions);
        }
      };
    return WorkflowAssignmentsHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowAssignmentsHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowAssignmentsHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowAssignmentsHistoryFutureStub>() {
        @java.lang.Override
        public WorkflowAssignmentsHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowAssignmentsHistoryFutureStub(channel, callOptions);
        }
      };
    return WorkflowAssignmentsHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * WorkflowAssignmentsHistory provides records of all changes to the state of a WorkflowAssignment.
   * </pre>
   */
  public static abstract class WorkflowAssignmentsHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of WorkflowAssignmentsHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListRequest,
                com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * WorkflowAssignmentsHistory provides records of all changes to the state of a WorkflowAssignment.
   * </pre>
   */
  public static final class WorkflowAssignmentsHistoryStub extends io.grpc.stub.AbstractAsyncStub<WorkflowAssignmentsHistoryStub> {
    private WorkflowAssignmentsHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowAssignmentsHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowAssignmentsHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of WorkflowAssignmentsHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * WorkflowAssignmentsHistory provides records of all changes to the state of a WorkflowAssignment.
   * </pre>
   */
  public static final class WorkflowAssignmentsHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<WorkflowAssignmentsHistoryBlockingStub> {
    private WorkflowAssignmentsHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowAssignmentsHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowAssignmentsHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of WorkflowAssignmentsHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListResponse list(com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * WorkflowAssignmentsHistory provides records of all changes to the state of a WorkflowAssignment.
   * </pre>
   */
  public static final class WorkflowAssignmentsHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<WorkflowAssignmentsHistoryFutureStub> {
    private WorkflowAssignmentsHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowAssignmentsHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowAssignmentsHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of WorkflowAssignmentsHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListResponse> list(
        com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListRequest request) {
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
    private final WorkflowAssignmentsHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkflowAssignmentsHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.WorkflowAssignmentsHistoryListResponse>) responseObserver);
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

  private static abstract class WorkflowAssignmentsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowAssignmentsHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.WorkflowAssignmentsHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowAssignmentsHistory");
    }
  }

  private static final class WorkflowAssignmentsHistoryFileDescriptorSupplier
      extends WorkflowAssignmentsHistoryBaseDescriptorSupplier {
    WorkflowAssignmentsHistoryFileDescriptorSupplier() {}
  }

  private static final class WorkflowAssignmentsHistoryMethodDescriptorSupplier
      extends WorkflowAssignmentsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowAssignmentsHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowAssignmentsHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowAssignmentsHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
