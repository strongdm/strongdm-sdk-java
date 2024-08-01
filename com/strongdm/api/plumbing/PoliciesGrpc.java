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
 * Policies are the collection of one or more statements that enforce fine-grained access
 * control for the users of an organization.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: policies.proto")
public final class PoliciesGrpc {

  private PoliciesGrpc() {}

  public static final String SERVICE_NAME = "v1.Policies";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateRequest,
      com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateRequest.class,
      responseType = com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateRequest,
      com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateRequest, com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateResponse> getCreateMethod;
    if ((getCreateMethod = PoliciesGrpc.getCreateMethod) == null) {
      synchronized (PoliciesGrpc.class) {
        if ((getCreateMethod = PoliciesGrpc.getCreateMethod) == null) {
          PoliciesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateRequest, com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteRequest,
      com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteRequest,
      com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteRequest, com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = PoliciesGrpc.getDeleteMethod) == null) {
      synchronized (PoliciesGrpc.class) {
        if ((getDeleteMethod = PoliciesGrpc.getDeleteMethod) == null) {
          PoliciesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteRequest, com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateRequest,
      com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateRequest.class,
      responseType = com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateRequest,
      com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateRequest, com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = PoliciesGrpc.getUpdateMethod) == null) {
      synchronized (PoliciesGrpc.class) {
        if ((getUpdateMethod = PoliciesGrpc.getUpdateMethod) == null) {
          PoliciesGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateRequest, com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetRequest,
      com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetRequest.class,
      responseType = com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetRequest,
      com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetRequest, com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetResponse> getGetMethod;
    if ((getGetMethod = PoliciesGrpc.getGetMethod) == null) {
      synchronized (PoliciesGrpc.class) {
        if ((getGetMethod = PoliciesGrpc.getGetMethod) == null) {
          PoliciesGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetRequest, com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListRequest,
      com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListRequest.class,
      responseType = com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListRequest,
      com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListRequest, com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListResponse> getListMethod;
    if ((getListMethod = PoliciesGrpc.getListMethod) == null) {
      synchronized (PoliciesGrpc.class) {
        if ((getListMethod = PoliciesGrpc.getListMethod) == null) {
          PoliciesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListRequest, com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PoliciesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PoliciesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PoliciesStub>() {
        @java.lang.Override
        public PoliciesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PoliciesStub(channel, callOptions);
        }
      };
    return PoliciesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PoliciesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PoliciesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PoliciesBlockingStub>() {
        @java.lang.Override
        public PoliciesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PoliciesBlockingStub(channel, callOptions);
        }
      };
    return PoliciesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PoliciesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PoliciesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PoliciesFutureStub>() {
        @java.lang.Override
        public PoliciesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PoliciesFutureStub(channel, callOptions);
        }
      };
    return PoliciesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Policies are the collection of one or more statements that enforce fine-grained access
   * control for the users of an organization.
   * </pre>
   */
  public static abstract class PoliciesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates a new Policy.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a Policy by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Policy by ID.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one Policy by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Policy matching a given set of criteria
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateRequest,
                com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteRequest,
                com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateRequest,
                com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetRequest,
                com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListRequest,
                com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * Policies are the collection of one or more statements that enforce fine-grained access
   * control for the users of an organization.
   * </pre>
   */
  public static final class PoliciesStub extends io.grpc.stub.AbstractAsyncStub<PoliciesStub> {
    private PoliciesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoliciesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PoliciesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new Policy.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a Policy by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Policy by ID.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one Policy by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Policy matching a given set of criteria
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Policies are the collection of one or more statements that enforce fine-grained access
   * control for the users of an organization.
   * </pre>
   */
  public static final class PoliciesBlockingStub extends io.grpc.stub.AbstractBlockingStub<PoliciesBlockingStub> {
    private PoliciesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoliciesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PoliciesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new Policy.
     * </pre>
     */
    public com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateResponse create(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a Policy by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteResponse delete(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Policy by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateResponse update(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one Policy by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetResponse get(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of Policy matching a given set of criteria
     * </pre>
     */
    public com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListResponse list(com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Policies are the collection of one or more statements that enforce fine-grained access
   * control for the users of an organization.
   * </pre>
   */
  public static final class PoliciesFutureStub extends io.grpc.stub.AbstractFutureStub<PoliciesFutureStub> {
    private PoliciesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoliciesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PoliciesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new Policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateResponse> create(
        com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a Policy by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteResponse> delete(
        com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Policy by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateResponse> update(
        com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one Policy by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetResponse> get(
        com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of Policy matching a given set of criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListResponse> list(
        com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_LIST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PoliciesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PoliciesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyCreateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyDeleteResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyUpdateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyGetResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesPlumbing.PolicyListResponse>) responseObserver);
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

  private static abstract class PoliciesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PoliciesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.PoliciesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Policies");
    }
  }

  private static final class PoliciesFileDescriptorSupplier
      extends PoliciesBaseDescriptorSupplier {
    PoliciesFileDescriptorSupplier() {}
  }

  private static final class PoliciesMethodDescriptorSupplier
      extends PoliciesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PoliciesMethodDescriptorSupplier(String methodName) {
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
      synchronized (PoliciesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PoliciesFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
