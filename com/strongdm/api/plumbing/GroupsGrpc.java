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
 * A Group is a set of principals.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: groups.proto")
public final class GroupsGrpc {

  private GroupsGrpc() {}

  public static final String SERVICE_NAME = "v1.Groups";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateRequest,
      com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateRequest.class,
      responseType = com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateRequest,
      com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateRequest, com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateResponse> getCreateMethod;
    if ((getCreateMethod = GroupsGrpc.getCreateMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getCreateMethod = GroupsGrpc.getCreateMethod) == null) {
          GroupsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateRequest, com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesRequest,
      com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesResponse> getCreateFromRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFromRoles",
      requestType = com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesRequest.class,
      responseType = com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesRequest,
      com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesResponse> getCreateFromRolesMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesRequest, com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesResponse> getCreateFromRolesMethod;
    if ((getCreateFromRolesMethod = GroupsGrpc.getCreateFromRolesMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getCreateFromRolesMethod = GroupsGrpc.getCreateFromRolesMethod) == null) {
          GroupsGrpc.getCreateFromRolesMethod = getCreateFromRolesMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesRequest, com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFromRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("CreateFromRoles"))
              .build();
        }
      }
    }
    return getCreateFromRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupGetRequest,
      com.strongdm.api.plumbing.GroupsPlumbing.GroupGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.GroupsPlumbing.GroupGetRequest.class,
      responseType = com.strongdm.api.plumbing.GroupsPlumbing.GroupGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupGetRequest,
      com.strongdm.api.plumbing.GroupsPlumbing.GroupGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupGetRequest, com.strongdm.api.plumbing.GroupsPlumbing.GroupGetResponse> getGetMethod;
    if ((getGetMethod = GroupsGrpc.getGetMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getGetMethod = GroupsGrpc.getGetMethod) == null) {
          GroupsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GroupsPlumbing.GroupGetRequest, com.strongdm.api.plumbing.GroupsPlumbing.GroupGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsPlumbing.GroupGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsPlumbing.GroupGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateRequest,
      com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateRequest.class,
      responseType = com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateRequest,
      com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateRequest, com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = GroupsGrpc.getUpdateMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getUpdateMethod = GroupsGrpc.getUpdateMethod) == null) {
          GroupsGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateRequest, com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteRequest,
      com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteRequest,
      com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteRequest, com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = GroupsGrpc.getDeleteMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getDeleteMethod = GroupsGrpc.getDeleteMethod) == null) {
          GroupsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteRequest, com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupListRequest,
      com.strongdm.api.plumbing.GroupsPlumbing.GroupListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.GroupsPlumbing.GroupListRequest.class,
      responseType = com.strongdm.api.plumbing.GroupsPlumbing.GroupListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupListRequest,
      com.strongdm.api.plumbing.GroupsPlumbing.GroupListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsPlumbing.GroupListRequest, com.strongdm.api.plumbing.GroupsPlumbing.GroupListResponse> getListMethod;
    if ((getListMethod = GroupsGrpc.getListMethod) == null) {
      synchronized (GroupsGrpc.class) {
        if ((getListMethod = GroupsGrpc.getListMethod) == null) {
          GroupsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GroupsPlumbing.GroupListRequest, com.strongdm.api.plumbing.GroupsPlumbing.GroupListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsPlumbing.GroupListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsPlumbing.GroupListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupsStub>() {
        @java.lang.Override
        public GroupsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupsStub(channel, callOptions);
        }
      };
    return GroupsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupsBlockingStub>() {
        @java.lang.Override
        public GroupsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupsBlockingStub(channel, callOptions);
        }
      };
    return GroupsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupsFutureStub>() {
        @java.lang.Override
        public GroupsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupsFutureStub(channel, callOptions);
        }
      };
    return GroupsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A Group is a set of principals.
   * </pre>
   */
  public static abstract class GroupsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create registers a new Group.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void createFromRoles(com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateFromRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one Group by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.GroupsPlumbing.GroupGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Group by ID.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a Group by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Groups matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.GroupsPlumbing.GroupListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateRequest,
                com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCreateFromRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesRequest,
                com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesResponse>(
                  this, METHODID_CREATE_FROM_ROLES)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GroupsPlumbing.GroupGetRequest,
                com.strongdm.api.plumbing.GroupsPlumbing.GroupGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateRequest,
                com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteRequest,
                com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GroupsPlumbing.GroupListRequest,
                com.strongdm.api.plumbing.GroupsPlumbing.GroupListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A Group is a set of principals.
   * </pre>
   */
  public static final class GroupsStub extends io.grpc.stub.AbstractAsyncStub<GroupsStub> {
    private GroupsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new Group.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFromRoles(com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateFromRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one Group by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.GroupsPlumbing.GroupGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Group by ID.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a Group by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Groups matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.GroupsPlumbing.GroupListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A Group is a set of principals.
   * </pre>
   */
  public static final class GroupsBlockingStub extends io.grpc.stub.AbstractBlockingStub<GroupsBlockingStub> {
    private GroupsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new Group.
     * </pre>
     */
    public com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateResponse create(com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesResponse createFromRoles(com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateFromRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one Group by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.GroupsPlumbing.GroupGetResponse get(com.strongdm.api.plumbing.GroupsPlumbing.GroupGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Group by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateResponse update(com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a Group by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteResponse delete(com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of Groups matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.GroupsPlumbing.GroupListResponse list(com.strongdm.api.plumbing.GroupsPlumbing.GroupListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A Group is a set of principals.
   * </pre>
   */
  public static final class GroupsFutureStub extends io.grpc.stub.AbstractFutureStub<GroupsFutureStub> {
    private GroupsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new Group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateResponse> create(
        com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesResponse> createFromRoles(
        com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateFromRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one Group by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GroupsPlumbing.GroupGetResponse> get(
        com.strongdm.api.plumbing.GroupsPlumbing.GroupGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Group by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateResponse> update(
        com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a Group by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteResponse> delete(
        com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of Groups matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GroupsPlumbing.GroupListResponse> list(
        com.strongdm.api.plumbing.GroupsPlumbing.GroupListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CREATE_FROM_ROLES = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateResponse>) responseObserver);
          break;
        case METHODID_CREATE_FROM_ROLES:
          serviceImpl.createFromRoles((com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupCreateFromRolesResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.GroupsPlumbing.GroupGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupGetResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.GroupsPlumbing.GroupListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsPlumbing.GroupListResponse>) responseObserver);
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

  private static abstract class GroupsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.GroupsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Groups");
    }
  }

  private static final class GroupsFileDescriptorSupplier
      extends GroupsBaseDescriptorSupplier {
    GroupsFileDescriptorSupplier() {}
  }

  private static final class GroupsMethodDescriptorSupplier
      extends GroupsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupsMethodDescriptorSupplier(String methodName) {
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
      synchronized (GroupsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupsFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getCreateFromRolesMethod())
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
