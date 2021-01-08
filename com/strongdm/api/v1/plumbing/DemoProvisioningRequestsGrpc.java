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
package com.strongdm.api.v1.plumbing;

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
 * DemoProvisioningRequests coordinate provisioning of demo resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: demo_provisioning_requests.proto")
public final class DemoProvisioningRequestsGrpc {

  private DemoProvisioningRequestsGrpc() {}

  public static final String SERVICE_NAME = "v1.DemoProvisioningRequests";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateRequest,
      com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateRequest,
      com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateRequest, com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateResponse> getCreateMethod;
    if ((getCreateMethod = DemoProvisioningRequestsGrpc.getCreateMethod) == null) {
      synchronized (DemoProvisioningRequestsGrpc.class) {
        if ((getCreateMethod = DemoProvisioningRequestsGrpc.getCreateMethod) == null) {
          DemoProvisioningRequestsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateRequest, com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DemoProvisioningRequestsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationRequest,
      com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationResponse> getListForOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListForOrganization",
      requestType = com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationRequest.class,
      responseType = com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationRequest,
      com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationResponse> getListForOrganizationMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationRequest, com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationResponse> getListForOrganizationMethod;
    if ((getListForOrganizationMethod = DemoProvisioningRequestsGrpc.getListForOrganizationMethod) == null) {
      synchronized (DemoProvisioningRequestsGrpc.class) {
        if ((getListForOrganizationMethod = DemoProvisioningRequestsGrpc.getListForOrganizationMethod) == null) {
          DemoProvisioningRequestsGrpc.getListForOrganizationMethod = getListForOrganizationMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationRequest, com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListForOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DemoProvisioningRequestsMethodDescriptorSupplier("ListForOrganization"))
              .build();
        }
      }
    }
    return getListForOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteRequest,
      com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteRequest.class,
      responseType = com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteRequest,
      com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteRequest, com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = DemoProvisioningRequestsGrpc.getDeleteMethod) == null) {
      synchronized (DemoProvisioningRequestsGrpc.class) {
        if ((getDeleteMethod = DemoProvisioningRequestsGrpc.getDeleteMethod) == null) {
          DemoProvisioningRequestsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteRequest, com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DemoProvisioningRequestsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllRequest,
      com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllResponse> getListAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAll",
      requestType = com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllRequest.class,
      responseType = com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllRequest,
      com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllResponse> getListAllMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllRequest, com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllResponse> getListAllMethod;
    if ((getListAllMethod = DemoProvisioningRequestsGrpc.getListAllMethod) == null) {
      synchronized (DemoProvisioningRequestsGrpc.class) {
        if ((getListAllMethod = DemoProvisioningRequestsGrpc.getListAllMethod) == null) {
          DemoProvisioningRequestsGrpc.getListAllMethod = getListAllMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllRequest, com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DemoProvisioningRequestsMethodDescriptorSupplier("ListAll"))
              .build();
        }
      }
    }
    return getListAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateRequest,
      com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateRequest,
      com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateRequest, com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = DemoProvisioningRequestsGrpc.getUpdateMethod) == null) {
      synchronized (DemoProvisioningRequestsGrpc.class) {
        if ((getUpdateMethod = DemoProvisioningRequestsGrpc.getUpdateMethod) == null) {
          DemoProvisioningRequestsGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateRequest, com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DemoProvisioningRequestsMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DemoProvisioningRequestsStub newStub(io.grpc.Channel channel) {
    return new DemoProvisioningRequestsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DemoProvisioningRequestsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DemoProvisioningRequestsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DemoProvisioningRequestsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DemoProvisioningRequestsFutureStub(channel);
  }

  /**
   * <pre>
   * DemoProvisioningRequests coordinate provisioning of demo resources.
   * </pre>
   */
  public static abstract class DemoProvisioningRequestsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create
     * </pre>
     */
    public void create(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListForOrganization gets a list of DemoProvisioningRequests in your organization
     * matching a given set of criteria. This operation can be done by account
     * administrators.
     * </pre>
     */
    public void listForOrganization(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListForOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete deletes a DemoProvisioningRequest.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAll gets a list of DemoProvisioningRequests across all orgs matching a given
     * set of criteria. This operation can only be done by operators and the
     * trial provisioner.
     * </pre>
     */
    public void listAll(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update updates a DemoProvisioningRequest.
     * </pre>
     */
    public void update(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateRequest,
                com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getListForOrganizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationRequest,
                com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationResponse>(
                  this, METHODID_LIST_FOR_ORGANIZATION)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteRequest,
                com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllRequest,
                com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllResponse>(
                  this, METHODID_LIST_ALL)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateRequest,
                com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateResponse>(
                  this, METHODID_UPDATE)))
          .build();
    }
  }

  /**
   * <pre>
   * DemoProvisioningRequests coordinate provisioning of demo resources.
   * </pre>
   */
  public static final class DemoProvisioningRequestsStub extends io.grpc.stub.AbstractStub<DemoProvisioningRequestsStub> {
    private DemoProvisioningRequestsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoProvisioningRequestsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoProvisioningRequestsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoProvisioningRequestsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public void create(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListForOrganization gets a list of DemoProvisioningRequests in your organization
     * matching a given set of criteria. This operation can be done by account
     * administrators.
     * </pre>
     */
    public void listForOrganization(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListForOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete deletes a DemoProvisioningRequest.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAll gets a list of DemoProvisioningRequests across all orgs matching a given
     * set of criteria. This operation can only be done by operators and the
     * trial provisioner.
     * </pre>
     */
    public void listAll(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update updates a DemoProvisioningRequest.
     * </pre>
     */
    public void update(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * DemoProvisioningRequests coordinate provisioning of demo resources.
   * </pre>
   */
  public static final class DemoProvisioningRequestsBlockingStub extends io.grpc.stub.AbstractStub<DemoProvisioningRequestsBlockingStub> {
    private DemoProvisioningRequestsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoProvisioningRequestsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoProvisioningRequestsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoProvisioningRequestsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateResponse create(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListForOrganization gets a list of DemoProvisioningRequests in your organization
     * matching a given set of criteria. This operation can be done by account
     * administrators.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationResponse listForOrganization(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getListForOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete deletes a DemoProvisioningRequest.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteResponse delete(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAll gets a list of DemoProvisioningRequests across all orgs matching a given
     * set of criteria. This operation can only be done by operators and the
     * trial provisioner.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllResponse listAll(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update updates a DemoProvisioningRequest.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateResponse update(com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * DemoProvisioningRequests coordinate provisioning of demo resources.
   * </pre>
   */
  public static final class DemoProvisioningRequestsFutureStub extends io.grpc.stub.AbstractStub<DemoProvisioningRequestsFutureStub> {
    private DemoProvisioningRequestsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoProvisioningRequestsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoProvisioningRequestsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoProvisioningRequestsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateResponse> create(
        com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListForOrganization gets a list of DemoProvisioningRequests in your organization
     * matching a given set of criteria. This operation can be done by account
     * administrators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationResponse> listForOrganization(
        com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListForOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete deletes a DemoProvisioningRequest.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteResponse> delete(
        com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAll gets a list of DemoProvisioningRequests across all orgs matching a given
     * set of criteria. This operation can only be done by operators and the
     * trial provisioner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllResponse> listAll(
        com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update updates a DemoProvisioningRequest.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateResponse> update(
        com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_LIST_FOR_ORGANIZATION = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_LIST_ALL = 3;
  private static final int METHODID_UPDATE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DemoProvisioningRequestsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DemoProvisioningRequestsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestCreateResponse>) responseObserver);
          break;
        case METHODID_LIST_FOR_ORGANIZATION:
          serviceImpl.listForOrganization((com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListForOrganizationResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST_ALL:
          serviceImpl.listAll((com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestListAllResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.DemoProvisioningRequestUpdateResponse>) responseObserver);
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

  private static abstract class DemoProvisioningRequestsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DemoProvisioningRequestsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.DemoProvisioningRequestsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DemoProvisioningRequests");
    }
  }

  private static final class DemoProvisioningRequestsFileDescriptorSupplier
      extends DemoProvisioningRequestsBaseDescriptorSupplier {
    DemoProvisioningRequestsFileDescriptorSupplier() {}
  }

  private static final class DemoProvisioningRequestsMethodDescriptorSupplier
      extends DemoProvisioningRequestsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DemoProvisioningRequestsMethodDescriptorSupplier(String methodName) {
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
      synchronized (DemoProvisioningRequestsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DemoProvisioningRequestsFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getListForOrganizationMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListAllMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
