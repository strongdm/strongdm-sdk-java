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
 * WorkflowAssignments links a Resource to a Workflow. The assigned resources are those that a user can request
 * access to via the workflow.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: workflow_assignments.proto")
public final class WorkflowAssignmentsGrpc {

  private WorkflowAssignmentsGrpc() {}

  public static final String SERVICE_NAME = "v1.WorkflowAssignments";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListRequest,
      com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListRequest,
      com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListRequest, com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListResponse> getListMethod;
    if ((getListMethod = WorkflowAssignmentsGrpc.getListMethod) == null) {
      synchronized (WorkflowAssignmentsGrpc.class) {
        if ((getListMethod = WorkflowAssignmentsGrpc.getListMethod) == null) {
          WorkflowAssignmentsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListRequest, com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowAssignmentsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowAssignmentsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowAssignmentsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowAssignmentsStub>() {
        @java.lang.Override
        public WorkflowAssignmentsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowAssignmentsStub(channel, callOptions);
        }
      };
    return WorkflowAssignmentsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowAssignmentsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowAssignmentsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowAssignmentsBlockingStub>() {
        @java.lang.Override
        public WorkflowAssignmentsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowAssignmentsBlockingStub(channel, callOptions);
        }
      };
    return WorkflowAssignmentsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowAssignmentsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowAssignmentsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowAssignmentsFutureStub>() {
        @java.lang.Override
        public WorkflowAssignmentsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowAssignmentsFutureStub(channel, callOptions);
        }
      };
    return WorkflowAssignmentsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * WorkflowAssignments links a Resource to a Workflow. The assigned resources are those that a user can request
   * access to via the workflow.
   * </pre>
   */
  public static abstract class WorkflowAssignmentsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists existing workflow assignments.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListRequest,
                com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * WorkflowAssignments links a Resource to a Workflow. The assigned resources are those that a user can request
   * access to via the workflow.
   * </pre>
   */
  public static final class WorkflowAssignmentsStub extends io.grpc.stub.AbstractAsyncStub<WorkflowAssignmentsStub> {
    private WorkflowAssignmentsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowAssignmentsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowAssignmentsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists existing workflow assignments.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * WorkflowAssignments links a Resource to a Workflow. The assigned resources are those that a user can request
   * access to via the workflow.
   * </pre>
   */
  public static final class WorkflowAssignmentsBlockingStub extends io.grpc.stub.AbstractBlockingStub<WorkflowAssignmentsBlockingStub> {
    private WorkflowAssignmentsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowAssignmentsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowAssignmentsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists existing workflow assignments.
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListResponse list(com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * WorkflowAssignments links a Resource to a Workflow. The assigned resources are those that a user can request
   * access to via the workflow.
   * </pre>
   */
  public static final class WorkflowAssignmentsFutureStub extends io.grpc.stub.AbstractFutureStub<WorkflowAssignmentsFutureStub> {
    private WorkflowAssignmentsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowAssignmentsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowAssignmentsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists existing workflow assignments.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListResponse> list(
        com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListRequest request) {
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
    private final WorkflowAssignmentsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkflowAssignmentsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.WorkflowAssignmentsListResponse>) responseObserver);
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

  private static abstract class WorkflowAssignmentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowAssignmentsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.WorkflowAssignmentsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowAssignments");
    }
  }

  private static final class WorkflowAssignmentsFileDescriptorSupplier
      extends WorkflowAssignmentsBaseDescriptorSupplier {
    WorkflowAssignmentsFileDescriptorSupplier() {}
  }

  private static final class WorkflowAssignmentsMethodDescriptorSupplier
      extends WorkflowAssignmentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowAssignmentsMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowAssignmentsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowAssignmentsFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
