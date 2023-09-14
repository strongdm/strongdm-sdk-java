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
 * Workflows are the collection of rules that define the resources to which access can be requested,
 * the users that can request that access, and the mechanism for approving those requests which can either
 * be automatic approval or a set of users authorized to approve the requests.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: workflows.proto")
public final class WorkflowsGrpc {

  private WorkflowsGrpc() {}

  public static final String SERVICE_NAME = "v1.Workflows";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateRequest,
      com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateRequest,
      com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateRequest, com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateResponse> getCreateMethod;
    if ((getCreateMethod = WorkflowsGrpc.getCreateMethod) == null) {
      synchronized (WorkflowsGrpc.class) {
        if ((getCreateMethod = WorkflowsGrpc.getCreateMethod) == null) {
          WorkflowsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateRequest, com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetRequest,
      com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetRequest,
      com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetRequest, com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetResponse> getGetMethod;
    if ((getGetMethod = WorkflowsGrpc.getGetMethod) == null) {
      synchronized (WorkflowsGrpc.class) {
        if ((getGetMethod = WorkflowsGrpc.getGetMethod) == null) {
          WorkflowsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetRequest, com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteRequest,
      com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteRequest,
      com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteRequest, com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = WorkflowsGrpc.getDeleteMethod) == null) {
      synchronized (WorkflowsGrpc.class) {
        if ((getDeleteMethod = WorkflowsGrpc.getDeleteMethod) == null) {
          WorkflowsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteRequest, com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateRequest,
      com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateRequest,
      com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateRequest, com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = WorkflowsGrpc.getUpdateMethod) == null) {
      synchronized (WorkflowsGrpc.class) {
        if ((getUpdateMethod = WorkflowsGrpc.getUpdateMethod) == null) {
          WorkflowsGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateRequest, com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListRequest,
      com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListRequest.class,
      responseType = com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListRequest,
      com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListRequest, com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListResponse> getListMethod;
    if ((getListMethod = WorkflowsGrpc.getListMethod) == null) {
      synchronized (WorkflowsGrpc.class) {
        if ((getListMethod = WorkflowsGrpc.getListMethod) == null) {
          WorkflowsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListRequest, com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsStub>() {
        @java.lang.Override
        public WorkflowsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsStub(channel, callOptions);
        }
      };
    return WorkflowsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsBlockingStub>() {
        @java.lang.Override
        public WorkflowsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsBlockingStub(channel, callOptions);
        }
      };
    return WorkflowsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsFutureStub>() {
        @java.lang.Override
        public WorkflowsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsFutureStub(channel, callOptions);
        }
      };
    return WorkflowsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Workflows are the collection of rules that define the resources to which access can be requested,
   * the users that can request that access, and the mechanism for approving those requests which can either
   * be automatic approval or a set of users authorized to approve the requests.
   * </pre>
   */
  public static abstract class WorkflowsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates a new workflow and requires a name for the workflow.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one workflow by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete deletes an existing workflow.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update updates an existing workflow.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists existing workflows.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateRequest,
                com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetRequest,
                com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteRequest,
                com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateRequest,
                com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListRequest,
                com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * Workflows are the collection of rules that define the resources to which access can be requested,
   * the users that can request that access, and the mechanism for approving those requests which can either
   * be automatic approval or a set of users authorized to approve the requests.
   * </pre>
   */
  public static final class WorkflowsStub extends io.grpc.stub.AbstractAsyncStub<WorkflowsStub> {
    private WorkflowsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new workflow and requires a name for the workflow.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one workflow by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete deletes an existing workflow.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update updates an existing workflow.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing workflows.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Workflows are the collection of rules that define the resources to which access can be requested,
   * the users that can request that access, and the mechanism for approving those requests which can either
   * be automatic approval or a set of users authorized to approve the requests.
   * </pre>
   */
  public static final class WorkflowsBlockingStub extends io.grpc.stub.AbstractBlockingStub<WorkflowsBlockingStub> {
    private WorkflowsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new workflow and requires a name for the workflow.
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateResponse create(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one workflow by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetResponse get(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete deletes an existing workflow.
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteResponse delete(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update updates an existing workflow.
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateResponse update(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing workflows.
     * </pre>
     */
    public com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListResponse list(com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Workflows are the collection of rules that define the resources to which access can be requested,
   * the users that can request that access, and the mechanism for approving those requests which can either
   * be automatic approval or a set of users authorized to approve the requests.
   * </pre>
   */
  public static final class WorkflowsFutureStub extends io.grpc.stub.AbstractFutureStub<WorkflowsFutureStub> {
    private WorkflowsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new workflow and requires a name for the workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateResponse> create(
        com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one workflow by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetResponse> get(
        com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete deletes an existing workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteResponse> delete(
        com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update updates an existing workflow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateResponse> update(
        com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing workflows.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListResponse> list(
        com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListRequest request) {
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
    private final WorkflowsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkflowsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowDeleteResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowUpdateResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.WorkflowsPlumbing.WorkflowListResponse>) responseObserver);
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

  private static abstract class WorkflowsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.WorkflowsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Workflows");
    }
  }

  private static final class WorkflowsFileDescriptorSupplier
      extends WorkflowsBaseDescriptorSupplier {
    WorkflowsFileDescriptorSupplier() {}
  }

  private static final class WorkflowsMethodDescriptorSupplier
      extends WorkflowsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowsMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowsFileDescriptorSupplier())
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
