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
 * ApprovalWorkflowApprovers link approval workflow approvers to an ApprovalWorkflowStep
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: approval_workflow_approvers.proto")
public final class ApprovalWorkflowApproversGrpc {

  private ApprovalWorkflowApproversGrpc() {}

  public static final String SERVICE_NAME = "v1.ApprovalWorkflowApprovers";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateRequest, com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateResponse> getCreateMethod;
    if ((getCreateMethod = ApprovalWorkflowApproversGrpc.getCreateMethod) == null) {
      synchronized (ApprovalWorkflowApproversGrpc.class) {
        if ((getCreateMethod = ApprovalWorkflowApproversGrpc.getCreateMethod) == null) {
          ApprovalWorkflowApproversGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateRequest, com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowApproversMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetRequest, com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetResponse> getGetMethod;
    if ((getGetMethod = ApprovalWorkflowApproversGrpc.getGetMethod) == null) {
      synchronized (ApprovalWorkflowApproversGrpc.class) {
        if ((getGetMethod = ApprovalWorkflowApproversGrpc.getGetMethod) == null) {
          ApprovalWorkflowApproversGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetRequest, com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowApproversMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteRequest, com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ApprovalWorkflowApproversGrpc.getDeleteMethod) == null) {
      synchronized (ApprovalWorkflowApproversGrpc.class) {
        if ((getDeleteMethod = ApprovalWorkflowApproversGrpc.getDeleteMethod) == null) {
          ApprovalWorkflowApproversGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteRequest, com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowApproversMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListRequest, com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListResponse> getListMethod;
    if ((getListMethod = ApprovalWorkflowApproversGrpc.getListMethod) == null) {
      synchronized (ApprovalWorkflowApproversGrpc.class) {
        if ((getListMethod = ApprovalWorkflowApproversGrpc.getListMethod) == null) {
          ApprovalWorkflowApproversGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListRequest, com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowApproversMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApprovalWorkflowApproversStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowApproversStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowApproversStub>() {
        @java.lang.Override
        public ApprovalWorkflowApproversStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowApproversStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowApproversStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApprovalWorkflowApproversBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowApproversBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowApproversBlockingStub>() {
        @java.lang.Override
        public ApprovalWorkflowApproversBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowApproversBlockingStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowApproversBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApprovalWorkflowApproversFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowApproversFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowApproversFutureStub>() {
        @java.lang.Override
        public ApprovalWorkflowApproversFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowApproversFutureStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowApproversFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ApprovalWorkflowApprovers link approval workflow approvers to an ApprovalWorkflowStep
   * </pre>
   */
  public static abstract class ApprovalWorkflowApproversImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates a new approval workflow approver.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one approval workflow approver by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete deletes an existing approval workflow approver.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing approval workflow approvers.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * ApprovalWorkflowApprovers link approval workflow approvers to an ApprovalWorkflowStep
   * </pre>
   */
  public static final class ApprovalWorkflowApproversStub extends io.grpc.stub.AbstractAsyncStub<ApprovalWorkflowApproversStub> {
    private ApprovalWorkflowApproversStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowApproversStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowApproversStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new approval workflow approver.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one approval workflow approver by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete deletes an existing approval workflow approver.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing approval workflow approvers.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ApprovalWorkflowApprovers link approval workflow approvers to an ApprovalWorkflowStep
   * </pre>
   */
  public static final class ApprovalWorkflowApproversBlockingStub extends io.grpc.stub.AbstractBlockingStub<ApprovalWorkflowApproversBlockingStub> {
    private ApprovalWorkflowApproversBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowApproversBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowApproversBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new approval workflow approver.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateResponse create(com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one approval workflow approver by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetResponse get(com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete deletes an existing approval workflow approver.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteResponse delete(com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing approval workflow approvers.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListResponse list(com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ApprovalWorkflowApprovers link approval workflow approvers to an ApprovalWorkflowStep
   * </pre>
   */
  public static final class ApprovalWorkflowApproversFutureStub extends io.grpc.stub.AbstractFutureStub<ApprovalWorkflowApproversFutureStub> {
    private ApprovalWorkflowApproversFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowApproversFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowApproversFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new approval workflow approver.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateResponse> create(
        com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one approval workflow approver by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetResponse> get(
        com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete deletes an existing approval workflow approver.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteResponse> delete(
        com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing approval workflow approvers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListResponse> list(
        com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListRequest request) {
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
    private final ApprovalWorkflowApproversImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApprovalWorkflowApproversImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.ApprovalWorkflowApproverListResponse>) responseObserver);
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

  private static abstract class ApprovalWorkflowApproversBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApprovalWorkflowApproversBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.ApprovalWorkflowApproversPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApprovalWorkflowApprovers");
    }
  }

  private static final class ApprovalWorkflowApproversFileDescriptorSupplier
      extends ApprovalWorkflowApproversBaseDescriptorSupplier {
    ApprovalWorkflowApproversFileDescriptorSupplier() {}
  }

  private static final class ApprovalWorkflowApproversMethodDescriptorSupplier
      extends ApprovalWorkflowApproversBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApprovalWorkflowApproversMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApprovalWorkflowApproversGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApprovalWorkflowApproversFileDescriptorSupplier())
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
