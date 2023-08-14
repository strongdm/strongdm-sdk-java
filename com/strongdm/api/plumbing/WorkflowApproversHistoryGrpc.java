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
 * WorkflowApproversHistory provides records of all changes to the state of a WorkflowApprover.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: workflow_approvers_history.proto")
public final class WorkflowApproversHistoryGrpc {

  private WorkflowApproversHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.WorkflowApproversHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListRequest,
      com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListRequest,
      com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListRequest, com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListResponse> getListMethod;
    if ((getListMethod = WorkflowApproversHistoryGrpc.getListMethod) == null) {
      synchronized (WorkflowApproversHistoryGrpc.class) {
        if ((getListMethod = WorkflowApproversHistoryGrpc.getListMethod) == null) {
          WorkflowApproversHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListRequest, com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowApproversHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowApproversHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowApproversHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowApproversHistoryStub>() {
        @java.lang.Override
        public WorkflowApproversHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowApproversHistoryStub(channel, callOptions);
        }
      };
    return WorkflowApproversHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowApproversHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowApproversHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowApproversHistoryBlockingStub>() {
        @java.lang.Override
        public WorkflowApproversHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowApproversHistoryBlockingStub(channel, callOptions);
        }
      };
    return WorkflowApproversHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowApproversHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowApproversHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowApproversHistoryFutureStub>() {
        @java.lang.Override
        public WorkflowApproversHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowApproversHistoryFutureStub(channel, callOptions);
        }
      };
    return WorkflowApproversHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * WorkflowApproversHistory provides records of all changes to the state of a WorkflowApprover.
   * </pre>
   */
  public static abstract class WorkflowApproversHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of WorkflowApproversHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListRequest,
                com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * WorkflowApproversHistory provides records of all changes to the state of a WorkflowApprover.
   * </pre>
   */
  public static final class WorkflowApproversHistoryStub extends io.grpc.stub.AbstractAsyncStub<WorkflowApproversHistoryStub> {
    private WorkflowApproversHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowApproversHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowApproversHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of WorkflowApproversHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * WorkflowApproversHistory provides records of all changes to the state of a WorkflowApprover.
   * </pre>
   */
  public static final class WorkflowApproversHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<WorkflowApproversHistoryBlockingStub> {
    private WorkflowApproversHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowApproversHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowApproversHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of WorkflowApproversHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListResponse list(com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * WorkflowApproversHistory provides records of all changes to the state of a WorkflowApprover.
   * </pre>
   */
  public static final class WorkflowApproversHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<WorkflowApproversHistoryFutureStub> {
    private WorkflowApproversHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowApproversHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowApproversHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of WorkflowApproversHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListResponse> list(
        com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListRequest request) {
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
    private final WorkflowApproversHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkflowApproversHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.WorkflowApproversHistoryListResponse>) responseObserver);
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

  private static abstract class WorkflowApproversHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowApproversHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.WorkflowApproversHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowApproversHistory");
    }
  }

  private static final class WorkflowApproversHistoryFileDescriptorSupplier
      extends WorkflowApproversHistoryBaseDescriptorSupplier {
    WorkflowApproversHistoryFileDescriptorSupplier() {}
  }

  private static final class WorkflowApproversHistoryMethodDescriptorSupplier
      extends WorkflowApproversHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowApproversHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowApproversHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowApproversHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
