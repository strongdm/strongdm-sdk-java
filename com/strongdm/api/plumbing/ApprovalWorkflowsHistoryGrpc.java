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
 * ApprovalWorkflowsHistory records all changes to the state of an ApprovalWorkflow.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: approval_workflows_history.proto")
public final class ApprovalWorkflowsHistoryGrpc {

  private ApprovalWorkflowsHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.ApprovalWorkflowsHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListRequest, com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListResponse> getListMethod;
    if ((getListMethod = ApprovalWorkflowsHistoryGrpc.getListMethod) == null) {
      synchronized (ApprovalWorkflowsHistoryGrpc.class) {
        if ((getListMethod = ApprovalWorkflowsHistoryGrpc.getListMethod) == null) {
          ApprovalWorkflowsHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListRequest, com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowsHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApprovalWorkflowsHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowsHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowsHistoryStub>() {
        @java.lang.Override
        public ApprovalWorkflowsHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowsHistoryStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowsHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApprovalWorkflowsHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowsHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowsHistoryBlockingStub>() {
        @java.lang.Override
        public ApprovalWorkflowsHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowsHistoryBlockingStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowsHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApprovalWorkflowsHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowsHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowsHistoryFutureStub>() {
        @java.lang.Override
        public ApprovalWorkflowsHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowsHistoryFutureStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowsHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ApprovalWorkflowsHistory records all changes to the state of an ApprovalWorkflow.
   * </pre>
   */
  public static abstract class ApprovalWorkflowsHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of ApprovalWorkflowHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * ApprovalWorkflowsHistory records all changes to the state of an ApprovalWorkflow.
   * </pre>
   */
  public static final class ApprovalWorkflowsHistoryStub extends io.grpc.stub.AbstractAsyncStub<ApprovalWorkflowsHistoryStub> {
    private ApprovalWorkflowsHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowsHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowsHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of ApprovalWorkflowHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ApprovalWorkflowsHistory records all changes to the state of an ApprovalWorkflow.
   * </pre>
   */
  public static final class ApprovalWorkflowsHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<ApprovalWorkflowsHistoryBlockingStub> {
    private ApprovalWorkflowsHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowsHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowsHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of ApprovalWorkflowHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListResponse list(com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ApprovalWorkflowsHistory records all changes to the state of an ApprovalWorkflow.
   * </pre>
   */
  public static final class ApprovalWorkflowsHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<ApprovalWorkflowsHistoryFutureStub> {
    private ApprovalWorkflowsHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowsHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowsHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of ApprovalWorkflowHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListResponse> list(
        com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListRequest request) {
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
    private final ApprovalWorkflowsHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApprovalWorkflowsHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.ApprovalWorkflowHistoryListResponse>) responseObserver);
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

  private static abstract class ApprovalWorkflowsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApprovalWorkflowsHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.ApprovalWorkflowsHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApprovalWorkflowsHistory");
    }
  }

  private static final class ApprovalWorkflowsHistoryFileDescriptorSupplier
      extends ApprovalWorkflowsHistoryBaseDescriptorSupplier {
    ApprovalWorkflowsHistoryFileDescriptorSupplier() {}
  }

  private static final class ApprovalWorkflowsHistoryMethodDescriptorSupplier
      extends ApprovalWorkflowsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApprovalWorkflowsHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApprovalWorkflowsHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApprovalWorkflowsHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
