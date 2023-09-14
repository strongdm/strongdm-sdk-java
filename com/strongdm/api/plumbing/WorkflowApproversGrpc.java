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
 * WorkflowApprovers is an account with the ability to approve requests bound to a workflow.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: workflow_approvers.proto")
public final class WorkflowApproversGrpc {

  private WorkflowApproversGrpc() {}

  public static final String SERVICE_NAME = "v1.WorkflowApprovers";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateRequest,
      com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateRequest,
      com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateRequest, com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateResponse> getCreateMethod;
    if ((getCreateMethod = WorkflowApproversGrpc.getCreateMethod) == null) {
      synchronized (WorkflowApproversGrpc.class) {
        if ((getCreateMethod = WorkflowApproversGrpc.getCreateMethod) == null) {
          WorkflowApproversGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateRequest, com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowApproversMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetRequest,
      com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetRequest,
      com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetRequest, com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetResponse> getGetMethod;
    if ((getGetMethod = WorkflowApproversGrpc.getGetMethod) == null) {
      synchronized (WorkflowApproversGrpc.class) {
        if ((getGetMethod = WorkflowApproversGrpc.getGetMethod) == null) {
          WorkflowApproversGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetRequest, com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowApproversMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteRequest,
      com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteRequest,
      com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteRequest, com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = WorkflowApproversGrpc.getDeleteMethod) == null) {
      synchronized (WorkflowApproversGrpc.class) {
        if ((getDeleteMethod = WorkflowApproversGrpc.getDeleteMethod) == null) {
          WorkflowApproversGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteRequest, com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowApproversMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListRequest,
      com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListRequest,
      com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListRequest, com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListResponse> getListMethod;
    if ((getListMethod = WorkflowApproversGrpc.getListMethod) == null) {
      synchronized (WorkflowApproversGrpc.class) {
        if ((getListMethod = WorkflowApproversGrpc.getListMethod) == null) {
          WorkflowApproversGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListRequest, com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowApproversMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowApproversStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowApproversStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowApproversStub>() {
        @java.lang.Override
        public WorkflowApproversStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowApproversStub(channel, callOptions);
        }
      };
    return WorkflowApproversStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowApproversBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowApproversBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowApproversBlockingStub>() {
        @java.lang.Override
        public WorkflowApproversBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowApproversBlockingStub(channel, callOptions);
        }
      };
    return WorkflowApproversBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowApproversFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowApproversFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowApproversFutureStub>() {
        @java.lang.Override
        public WorkflowApproversFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowApproversFutureStub(channel, callOptions);
        }
      };
    return WorkflowApproversFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * WorkflowApprovers is an account with the ability to approve requests bound to a workflow.
   * </pre>
   */
  public static abstract class WorkflowApproversImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates a new workflow approver
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one workflow approver by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete deletes a workflow approver
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing workflow approvers.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateRequest,
                com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetRequest,
                com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteRequest,
                com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListRequest,
                com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * WorkflowApprovers is an account with the ability to approve requests bound to a workflow.
   * </pre>
   */
  public static final class WorkflowApproversStub extends io.grpc.stub.AbstractAsyncStub<WorkflowApproversStub> {
    private WorkflowApproversStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowApproversStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowApproversStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new workflow approver
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one workflow approver by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete deletes a workflow approver
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing workflow approvers.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * WorkflowApprovers is an account with the ability to approve requests bound to a workflow.
   * </pre>
   */
  public static final class WorkflowApproversBlockingStub extends io.grpc.stub.AbstractBlockingStub<WorkflowApproversBlockingStub> {
    private WorkflowApproversBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowApproversBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowApproversBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new workflow approver
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateResponse create(com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one workflow approver by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetResponse get(com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete deletes a workflow approver
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteResponse delete(com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing workflow approvers.
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListResponse list(com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * WorkflowApprovers is an account with the ability to approve requests bound to a workflow.
   * </pre>
   */
  public static final class WorkflowApproversFutureStub extends io.grpc.stub.AbstractFutureStub<WorkflowApproversFutureStub> {
    private WorkflowApproversFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowApproversFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowApproversFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new workflow approver
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateResponse> create(
        com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one workflow approver by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetResponse> get(
        com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete deletes a workflow approver
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteResponse> delete(
        com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing workflow approvers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListResponse> list(
        com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_LIST = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WorkflowApproversImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkflowApproversImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproverGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowApproversPlumbing.WorkflowApproversListResponse>) responseObserver);
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

  private static abstract class WorkflowApproversBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowApproversBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.WorkflowApproversPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowApprovers");
    }
  }

  private static final class WorkflowApproversFileDescriptorSupplier
      extends WorkflowApproversBaseDescriptorSupplier {
    WorkflowApproversFileDescriptorSupplier() {}
  }

  private static final class WorkflowApproversMethodDescriptorSupplier
      extends WorkflowApproversBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowApproversMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowApproversGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowApproversFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
