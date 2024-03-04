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
 * ApprovalWorkflowApproversHistory records all changes to the state of an ApprovalWorkflowApprover.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: approval_workflow_approvers_history.proto")
public final class ApprovalWorkflowApproversHistoryGrpc {

  private ApprovalWorkflowApproversHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.ApprovalWorkflowApproversHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListRequest, com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListResponse> getListMethod;
    if ((getListMethod = ApprovalWorkflowApproversHistoryGrpc.getListMethod) == null) {
      synchronized (ApprovalWorkflowApproversHistoryGrpc.class) {
        if ((getListMethod = ApprovalWorkflowApproversHistoryGrpc.getListMethod) == null) {
          ApprovalWorkflowApproversHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListRequest, com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowApproversHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApprovalWorkflowApproversHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowApproversHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowApproversHistoryStub>() {
        @java.lang.Override
        public ApprovalWorkflowApproversHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowApproversHistoryStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowApproversHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApprovalWorkflowApproversHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowApproversHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowApproversHistoryBlockingStub>() {
        @java.lang.Override
        public ApprovalWorkflowApproversHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowApproversHistoryBlockingStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowApproversHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApprovalWorkflowApproversHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowApproversHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowApproversHistoryFutureStub>() {
        @java.lang.Override
        public ApprovalWorkflowApproversHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowApproversHistoryFutureStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowApproversHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ApprovalWorkflowApproversHistory records all changes to the state of an ApprovalWorkflowApprover.
   * </pre>
   */
  public static abstract class ApprovalWorkflowApproversHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of ApprovalWorkflowApproverHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * ApprovalWorkflowApproversHistory records all changes to the state of an ApprovalWorkflowApprover.
   * </pre>
   */
  public static final class ApprovalWorkflowApproversHistoryStub extends io.grpc.stub.AbstractAsyncStub<ApprovalWorkflowApproversHistoryStub> {
    private ApprovalWorkflowApproversHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowApproversHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowApproversHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of ApprovalWorkflowApproverHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ApprovalWorkflowApproversHistory records all changes to the state of an ApprovalWorkflowApprover.
   * </pre>
   */
  public static final class ApprovalWorkflowApproversHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<ApprovalWorkflowApproversHistoryBlockingStub> {
    private ApprovalWorkflowApproversHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowApproversHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowApproversHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of ApprovalWorkflowApproverHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListResponse list(com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ApprovalWorkflowApproversHistory records all changes to the state of an ApprovalWorkflowApprover.
   * </pre>
   */
  public static final class ApprovalWorkflowApproversHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<ApprovalWorkflowApproversHistoryFutureStub> {
    private ApprovalWorkflowApproversHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowApproversHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowApproversHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of ApprovalWorkflowApproverHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListResponse> list(
        com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListRequest request) {
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
    private final ApprovalWorkflowApproversHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApprovalWorkflowApproversHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.ApprovalWorkflowApproverHistoryListResponse>) responseObserver);
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

  private static abstract class ApprovalWorkflowApproversHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApprovalWorkflowApproversHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.ApprovalWorkflowApproversHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApprovalWorkflowApproversHistory");
    }
  }

  private static final class ApprovalWorkflowApproversHistoryFileDescriptorSupplier
      extends ApprovalWorkflowApproversHistoryBaseDescriptorSupplier {
    ApprovalWorkflowApproversHistoryFileDescriptorSupplier() {}
  }

  private static final class ApprovalWorkflowApproversHistoryMethodDescriptorSupplier
      extends ApprovalWorkflowApproversHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApprovalWorkflowApproversHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApprovalWorkflowApproversHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApprovalWorkflowApproversHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
