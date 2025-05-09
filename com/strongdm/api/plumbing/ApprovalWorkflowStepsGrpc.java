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
 * ApprovalWorkflowSteps link approval workflow steps to an ApprovalWorkflow
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: approval_workflow_steps.proto")
@java.lang.Deprecated
public final class ApprovalWorkflowStepsGrpc {

  private ApprovalWorkflowStepsGrpc() {}

  public static final String SERVICE_NAME = "v1.ApprovalWorkflowSteps";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateRequest, com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateResponse> getCreateMethod;
    if ((getCreateMethod = ApprovalWorkflowStepsGrpc.getCreateMethod) == null) {
      synchronized (ApprovalWorkflowStepsGrpc.class) {
        if ((getCreateMethod = ApprovalWorkflowStepsGrpc.getCreateMethod) == null) {
          ApprovalWorkflowStepsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateRequest, com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowStepsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetRequest, com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetResponse> getGetMethod;
    if ((getGetMethod = ApprovalWorkflowStepsGrpc.getGetMethod) == null) {
      synchronized (ApprovalWorkflowStepsGrpc.class) {
        if ((getGetMethod = ApprovalWorkflowStepsGrpc.getGetMethod) == null) {
          ApprovalWorkflowStepsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetRequest, com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowStepsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteRequest, com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ApprovalWorkflowStepsGrpc.getDeleteMethod) == null) {
      synchronized (ApprovalWorkflowStepsGrpc.class) {
        if ((getDeleteMethod = ApprovalWorkflowStepsGrpc.getDeleteMethod) == null) {
          ApprovalWorkflowStepsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteRequest, com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowStepsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListRequest, com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListResponse> getListMethod;
    if ((getListMethod = ApprovalWorkflowStepsGrpc.getListMethod) == null) {
      synchronized (ApprovalWorkflowStepsGrpc.class) {
        if ((getListMethod = ApprovalWorkflowStepsGrpc.getListMethod) == null) {
          ApprovalWorkflowStepsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListRequest, com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowStepsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApprovalWorkflowStepsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowStepsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowStepsStub>() {
        @java.lang.Override
        public ApprovalWorkflowStepsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowStepsStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowStepsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApprovalWorkflowStepsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowStepsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowStepsBlockingStub>() {
        @java.lang.Override
        public ApprovalWorkflowStepsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowStepsBlockingStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowStepsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApprovalWorkflowStepsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowStepsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowStepsFutureStub>() {
        @java.lang.Override
        public ApprovalWorkflowStepsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowStepsFutureStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowStepsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ApprovalWorkflowSteps link approval workflow steps to an ApprovalWorkflow
   * </pre>
   */
  @java.lang.Deprecated
  public static abstract class ApprovalWorkflowStepsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Deprecated: Create creates a new approval workflow step.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Get reads one approval workflow step by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Delete deletes an existing approval workflow step.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Lists existing approval workflow steps.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * ApprovalWorkflowSteps link approval workflow steps to an ApprovalWorkflow
   * </pre>
   */
  @java.lang.Deprecated
  public static final class ApprovalWorkflowStepsStub extends io.grpc.stub.AbstractAsyncStub<ApprovalWorkflowStepsStub> {
    private ApprovalWorkflowStepsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowStepsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowStepsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Deprecated: Create creates a new approval workflow step.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Get reads one approval workflow step by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Delete deletes an existing approval workflow step.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Lists existing approval workflow steps.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ApprovalWorkflowSteps link approval workflow steps to an ApprovalWorkflow
   * </pre>
   */
  @java.lang.Deprecated
  public static final class ApprovalWorkflowStepsBlockingStub extends io.grpc.stub.AbstractBlockingStub<ApprovalWorkflowStepsBlockingStub> {
    private ApprovalWorkflowStepsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowStepsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowStepsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Deprecated: Create creates a new approval workflow step.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateResponse create(com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Get reads one approval workflow step by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetResponse get(com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Delete deletes an existing approval workflow step.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteResponse delete(com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Lists existing approval workflow steps.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListResponse list(com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ApprovalWorkflowSteps link approval workflow steps to an ApprovalWorkflow
   * </pre>
   */
  @java.lang.Deprecated
  public static final class ApprovalWorkflowStepsFutureStub extends io.grpc.stub.AbstractFutureStub<ApprovalWorkflowStepsFutureStub> {
    private ApprovalWorkflowStepsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowStepsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowStepsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Deprecated: Create creates a new approval workflow step.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateResponse> create(
        com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Get reads one approval workflow step by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetResponse> get(
        com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Delete deletes an existing approval workflow step.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteResponse> delete(
        com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Lists existing approval workflow steps.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListResponse> list(
        com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListRequest request) {
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
    private final ApprovalWorkflowStepsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApprovalWorkflowStepsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.ApprovalWorkflowStepListResponse>) responseObserver);
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

  private static abstract class ApprovalWorkflowStepsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApprovalWorkflowStepsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.ApprovalWorkflowStepsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApprovalWorkflowSteps");
    }
  }

  private static final class ApprovalWorkflowStepsFileDescriptorSupplier
      extends ApprovalWorkflowStepsBaseDescriptorSupplier {
    ApprovalWorkflowStepsFileDescriptorSupplier() {}
  }

  private static final class ApprovalWorkflowStepsMethodDescriptorSupplier
      extends ApprovalWorkflowStepsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApprovalWorkflowStepsMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApprovalWorkflowStepsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApprovalWorkflowStepsFileDescriptorSupplier())
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
