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
 * Resources are databases, servers, clusters, websites, or clouds that strongDM
 * delegates access to.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: resources.proto")
public final class ResourcesGrpc {

  private ResourcesGrpc() {}

  public static final String SERVICE_NAME = "v1.Resources";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsRequest,
      com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsResponse> getEnumerateTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnumerateTags",
      requestType = com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsRequest.class,
      responseType = com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsRequest,
      com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsResponse> getEnumerateTagsMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsRequest, com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsResponse> getEnumerateTagsMethod;
    if ((getEnumerateTagsMethod = ResourcesGrpc.getEnumerateTagsMethod) == null) {
      synchronized (ResourcesGrpc.class) {
        if ((getEnumerateTagsMethod = ResourcesGrpc.getEnumerateTagsMethod) == null) {
          ResourcesGrpc.getEnumerateTagsMethod = getEnumerateTagsMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsRequest, com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnumerateTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesMethodDescriptorSupplier("EnumerateTags"))
              .build();
        }
      }
    }
    return getEnumerateTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateRequest,
      com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateRequest,
      com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateRequest, com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateResponse> getCreateMethod;
    if ((getCreateMethod = ResourcesGrpc.getCreateMethod) == null) {
      synchronized (ResourcesGrpc.class) {
        if ((getCreateMethod = ResourcesGrpc.getCreateMethod) == null) {
          ResourcesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateRequest, com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetRequest,
      com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetRequest.class,
      responseType = com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetRequest,
      com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetRequest, com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetResponse> getGetMethod;
    if ((getGetMethod = ResourcesGrpc.getGetMethod) == null) {
      synchronized (ResourcesGrpc.class) {
        if ((getGetMethod = ResourcesGrpc.getGetMethod) == null) {
          ResourcesGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetRequest, com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateRequest,
      com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateRequest,
      com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateRequest, com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = ResourcesGrpc.getUpdateMethod) == null) {
      synchronized (ResourcesGrpc.class) {
        if ((getUpdateMethod = ResourcesGrpc.getUpdateMethod) == null) {
          ResourcesGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateRequest, com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteRequest,
      com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteRequest.class,
      responseType = com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteRequest,
      com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteRequest, com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ResourcesGrpc.getDeleteMethod) == null) {
      synchronized (ResourcesGrpc.class) {
        if ((getDeleteMethod = ResourcesGrpc.getDeleteMethod) == null) {
          ResourcesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteRequest, com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListRequest,
      com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListRequest.class,
      responseType = com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListRequest,
      com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListRequest, com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListResponse> getListMethod;
    if ((getListMethod = ResourcesGrpc.getListMethod) == null) {
      synchronized (ResourcesGrpc.class) {
        if ((getListMethod = ResourcesGrpc.getListMethod) == null) {
          ResourcesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListRequest, com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourcesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourcesStub newStub(io.grpc.Channel channel) {
    return new ResourcesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourcesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ResourcesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourcesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ResourcesFutureStub(channel);
  }

  /**
   * <pre>
   * Resources are databases, servers, clusters, websites, or clouds that strongDM
   * delegates access to.
   * </pre>
   */
  public static abstract class ResourcesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * EnumerateTags gets a list of the filter matching tags.
     * </pre>
     */
    public void enumerateTags(com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEnumerateTagsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create registers a new Resource.
     * </pre>
     */
    public void create(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one Resource by ID.
     * </pre>
     */
    public void get(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Resource by ID.
     * </pre>
     */
    public void update(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a Resource by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Resources matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnumerateTagsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsRequest,
                com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsResponse>(
                  this, METHODID_ENUMERATE_TAGS)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateRequest,
                com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetRequest,
                com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateRequest,
                com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteRequest,
                com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListRequest,
                com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * Resources are databases, servers, clusters, websites, or clouds that strongDM
   * delegates access to.
   * </pre>
   */
  public static final class ResourcesStub extends io.grpc.stub.AbstractStub<ResourcesStub> {
    private ResourcesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResourcesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourcesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResourcesStub(channel, callOptions);
    }

    /**
     * <pre>
     * EnumerateTags gets a list of the filter matching tags.
     * </pre>
     */
    public void enumerateTags(com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnumerateTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create registers a new Resource.
     * </pre>
     */
    public void create(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one Resource by ID.
     * </pre>
     */
    public void get(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Resource by ID.
     * </pre>
     */
    public void update(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a Resource by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Resources matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Resources are databases, servers, clusters, websites, or clouds that strongDM
   * delegates access to.
   * </pre>
   */
  public static final class ResourcesBlockingStub extends io.grpc.stub.AbstractStub<ResourcesBlockingStub> {
    private ResourcesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResourcesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourcesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResourcesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * EnumerateTags gets a list of the filter matching tags.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsResponse enumerateTags(com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsRequest request) {
      return blockingUnaryCall(
          getChannel(), getEnumerateTagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create registers a new Resource.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateResponse create(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one Resource by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetResponse get(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Resource by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateResponse update(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a Resource by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteResponse delete(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of Resources matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListResponse list(com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Resources are databases, servers, clusters, websites, or clouds that strongDM
   * delegates access to.
   * </pre>
   */
  public static final class ResourcesFutureStub extends io.grpc.stub.AbstractStub<ResourcesFutureStub> {
    private ResourcesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResourcesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourcesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResourcesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * EnumerateTags gets a list of the filter matching tags.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsResponse> enumerateTags(
        com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEnumerateTagsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create registers a new Resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateResponse> create(
        com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one Resource by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetResponse> get(
        com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Resource by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateResponse> update(
        com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a Resource by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteResponse> delete(
        com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of Resources matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListResponse> list(
        com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENUMERATE_TAGS = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourcesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourcesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENUMERATE_TAGS:
          serviceImpl.enumerateTags((com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.EnumerateTagsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceGetResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.ResourcesPlumbing.ResourceListResponse>) responseObserver);
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

  private static abstract class ResourcesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourcesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.ResourcesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Resources");
    }
  }

  private static final class ResourcesFileDescriptorSupplier
      extends ResourcesBaseDescriptorSupplier {
    ResourcesFileDescriptorSupplier() {}
  }

  private static final class ResourcesMethodDescriptorSupplier
      extends ResourcesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourcesMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourcesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourcesFileDescriptorSupplier())
              .addMethod(getEnumerateTagsMethod())
              .addMethod(getCreateMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
