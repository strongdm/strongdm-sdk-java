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
 * ApprovalWorkflows are the mechanism by which requests for access can be viewed by authorized
 * approvers and be approved or denied.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: approval_workflows.proto")
public final class ApprovalWorkflowsGrpc {

  private ApprovalWorkflowsGrpc() {}

  public static final String SERVICE_NAME = "v1.ApprovalWorkflows";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateRequest, com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateResponse> getCreateMethod;
    if ((getCreateMethod = ApprovalWorkflowsGrpc.getCreateMethod) == null) {
      synchronized (ApprovalWorkflowsGrpc.class) {
        if ((getCreateMethod = ApprovalWorkflowsGrpc.getCreateMethod) == null) {
          ApprovalWorkflowsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateRequest, com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetRequest, com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetResponse> getGetMethod;
    if ((getGetMethod = ApprovalWorkflowsGrpc.getGetMethod) == null) {
      synchronized (ApprovalWorkflowsGrpc.class) {
        if ((getGetMethod = ApprovalWorkflowsGrpc.getGetMethod) == null) {
          ApprovalWorkflowsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetRequest, com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteRequest, com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ApprovalWorkflowsGrpc.getDeleteMethod) == null) {
      synchronized (ApprovalWorkflowsGrpc.class) {
        if ((getDeleteMethod = ApprovalWorkflowsGrpc.getDeleteMethod) == null) {
          ApprovalWorkflowsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteRequest, com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateRequest, com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = ApprovalWorkflowsGrpc.getUpdateMethod) == null) {
      synchronized (ApprovalWorkflowsGrpc.class) {
        if ((getUpdateMethod = ApprovalWorkflowsGrpc.getUpdateMethod) == null) {
          ApprovalWorkflowsGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateRequest, com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowsMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListRequest.class,
      responseType = com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListRequest,
      com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListRequest, com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListResponse> getListMethod;
    if ((getListMethod = ApprovalWorkflowsGrpc.getListMethod) == null) {
      synchronized (ApprovalWorkflowsGrpc.class) {
        if ((getListMethod = ApprovalWorkflowsGrpc.getListMethod) == null) {
          ApprovalWorkflowsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListRequest, com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApprovalWorkflowsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApprovalWorkflowsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowsStub>() {
        @java.lang.Override
        public ApprovalWorkflowsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowsStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApprovalWorkflowsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowsBlockingStub>() {
        @java.lang.Override
        public ApprovalWorkflowsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowsBlockingStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApprovalWorkflowsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApprovalWorkflowsFutureStub>() {
        @java.lang.Override
        public ApprovalWorkflowsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApprovalWorkflowsFutureStub(channel, callOptions);
        }
      };
    return ApprovalWorkflowsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ApprovalWorkflows are the mechanism by which requests for access can be viewed by authorized
   * approvers and be approved or denied.
   * </pre>
   */
  public static abstract class ApprovalWorkflowsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates a new approval workflow and requires a name and approval mode for the approval workflow.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one approval workflow by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete deletes an existing approval workflow.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update updates an existing approval workflow.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing approval workflows.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListRequest,
                com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * ApprovalWorkflows are the mechanism by which requests for access can be viewed by authorized
   * approvers and be approved or denied.
   * </pre>
   */
  public static final class ApprovalWorkflowsStub extends io.grpc.stub.AbstractAsyncStub<ApprovalWorkflowsStub> {
    private ApprovalWorkflowsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new approval workflow and requires a name and approval mode for the approval workflow.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one approval workflow by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete deletes an existing approval workflow.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update updates an existing approval workflow.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing approval workflows.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ApprovalWorkflows are the mechanism by which requests for access can be viewed by authorized
   * approvers and be approved or denied.
   * </pre>
   */
  public static final class ApprovalWorkflowsBlockingStub extends io.grpc.stub.AbstractBlockingStub<ApprovalWorkflowsBlockingStub> {
    private ApprovalWorkflowsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new approval workflow and requires a name and approval mode for the approval workflow.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateResponse create(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one approval workflow by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetResponse get(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete deletes an existing approval workflow.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteResponse delete(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update updates an existing approval workflow.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateResponse update(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing approval workflows.
     * </pre>
     */
    public com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListResponse list(com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ApprovalWorkflows are the mechanism by which requests for access can be viewed by authorized
   * approvers and be approved or denied.
   * </pre>
   */
  public static final class ApprovalWorkflowsFutureStub extends io.grpc.stub.AbstractFutureStub<ApprovalWorkflowsFutureStub> {
    private ApprovalWorkflowsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApprovalWorkflowsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApprovalWorkflowsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new approval workflow and requires a name and approval mode for the approval workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateResponse> create(
        com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one approval workflow by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetResponse> get(
        com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete deletes an existing approval workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteResponse> delete(
        com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update updates an existing approval workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateResponse> update(
        com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing approval workflows.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListResponse> list(
        com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_LIST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApprovalWorkflowsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApprovalWorkflowsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowDeleteResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowUpdateResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.ApprovalWorkflowListResponse>) responseObserver);
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

  private static abstract class ApprovalWorkflowsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApprovalWorkflowsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.ApprovalWorkflowsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApprovalWorkflows");
    }
  }

  private static final class ApprovalWorkflowsFileDescriptorSupplier
      extends ApprovalWorkflowsBaseDescriptorSupplier {
    ApprovalWorkflowsFileDescriptorSupplier() {}
  }

  private static final class ApprovalWorkflowsMethodDescriptorSupplier
      extends ApprovalWorkflowsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApprovalWorkflowsMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApprovalWorkflowsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApprovalWorkflowsFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
