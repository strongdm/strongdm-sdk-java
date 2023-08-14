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
 * WorkflowsHistory provides records of all changes to the state of a Workflow.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: workflows_history.proto")
public final class WorkflowsHistoryGrpc {

  private WorkflowsHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.WorkflowsHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListRequest,
      com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListRequest,
      com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListRequest, com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListResponse> getListMethod;
    if ((getListMethod = WorkflowsHistoryGrpc.getListMethod) == null) {
      synchronized (WorkflowsHistoryGrpc.class) {
        if ((getListMethod = WorkflowsHistoryGrpc.getListMethod) == null) {
          WorkflowsHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListRequest, com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowsHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsHistoryStub>() {
        @java.lang.Override
        public WorkflowsHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsHistoryStub(channel, callOptions);
        }
      };
    return WorkflowsHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowsHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsHistoryBlockingStub>() {
        @java.lang.Override
        public WorkflowsHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsHistoryBlockingStub(channel, callOptions);
        }
      };
    return WorkflowsHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowsHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsHistoryFutureStub>() {
        @java.lang.Override
        public WorkflowsHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsHistoryFutureStub(channel, callOptions);
        }
      };
    return WorkflowsHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * WorkflowsHistory provides records of all changes to the state of a Workflow.
   * </pre>
   */
  public static abstract class WorkflowsHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of WorkflowHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListRequest,
                com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * WorkflowsHistory provides records of all changes to the state of a Workflow.
   * </pre>
   */
  public static final class WorkflowsHistoryStub extends io.grpc.stub.AbstractAsyncStub<WorkflowsHistoryStub> {
    private WorkflowsHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of WorkflowHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * WorkflowsHistory provides records of all changes to the state of a Workflow.
   * </pre>
   */
  public static final class WorkflowsHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<WorkflowsHistoryBlockingStub> {
    private WorkflowsHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of WorkflowHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListResponse list(com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * WorkflowsHistory provides records of all changes to the state of a Workflow.
   * </pre>
   */
  public static final class WorkflowsHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<WorkflowsHistoryFutureStub> {
    private WorkflowsHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of WorkflowHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListResponse> list(
        com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListRequest request) {
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
    private final WorkflowsHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkflowsHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.WorkflowHistoryListResponse>) responseObserver);
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

  private static abstract class WorkflowsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowsHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.WorkflowsHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowsHistory");
    }
  }

  private static final class WorkflowsHistoryFileDescriptorSupplier
      extends WorkflowsHistoryBaseDescriptorSupplier {
    WorkflowsHistoryFileDescriptorSupplier() {}
  }

  private static final class WorkflowsHistoryMethodDescriptorSupplier
      extends WorkflowsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowsHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowsHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowsHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
