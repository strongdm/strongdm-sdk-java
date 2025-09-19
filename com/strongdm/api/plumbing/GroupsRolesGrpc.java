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
 * A GroupRole is an assignment of a Group to a Role.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: groups_roles.proto")
public final class GroupsRolesGrpc {

  private GroupsRolesGrpc() {}

  public static final String SERVICE_NAME = "v1.GroupsRoles";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateRequest,
      com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateRequest.class,
      responseType = com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateRequest,
      com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateRequest, com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateResponse> getCreateMethod;
    if ((getCreateMethod = GroupsRolesGrpc.getCreateMethod) == null) {
      synchronized (GroupsRolesGrpc.class) {
        if ((getCreateMethod = GroupsRolesGrpc.getCreateMethod) == null) {
          GroupsRolesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateRequest, com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupsRolesMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetRequest,
      com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetRequest.class,
      responseType = com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetRequest,
      com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetRequest, com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetResponse> getGetMethod;
    if ((getGetMethod = GroupsRolesGrpc.getGetMethod) == null) {
      synchronized (GroupsRolesGrpc.class) {
        if ((getGetMethod = GroupsRolesGrpc.getGetMethod) == null) {
          GroupsRolesGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetRequest, com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupsRolesMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteRequest,
      com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteRequest,
      com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteRequest, com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = GroupsRolesGrpc.getDeleteMethod) == null) {
      synchronized (GroupsRolesGrpc.class) {
        if ((getDeleteMethod = GroupsRolesGrpc.getDeleteMethod) == null) {
          GroupsRolesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteRequest, com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupsRolesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListRequest,
      com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListRequest.class,
      responseType = com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListRequest,
      com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListRequest, com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListResponse> getListMethod;
    if ((getListMethod = GroupsRolesGrpc.getListMethod) == null) {
      synchronized (GroupsRolesGrpc.class) {
        if ((getListMethod = GroupsRolesGrpc.getListMethod) == null) {
          GroupsRolesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListRequest, com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupsRolesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupsRolesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupsRolesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupsRolesStub>() {
        @java.lang.Override
        public GroupsRolesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupsRolesStub(channel, callOptions);
        }
      };
    return GroupsRolesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupsRolesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupsRolesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupsRolesBlockingStub>() {
        @java.lang.Override
        public GroupsRolesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupsRolesBlockingStub(channel, callOptions);
        }
      };
    return GroupsRolesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupsRolesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupsRolesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupsRolesFutureStub>() {
        @java.lang.Override
        public GroupsRolesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupsRolesFutureStub(channel, callOptions);
        }
      };
    return GroupsRolesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A GroupRole is an assignment of a Group to a Role.
   * </pre>
   */
  public static abstract class GroupsRolesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create registers a new GroupRole.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one GroupRole by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a GroupRole by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of GroupRoles matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateRequest,
                com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetRequest,
                com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteRequest,
                com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListRequest,
                com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A GroupRole is an assignment of a Group to a Role.
   * </pre>
   */
  public static final class GroupsRolesStub extends io.grpc.stub.AbstractAsyncStub<GroupsRolesStub> {
    private GroupsRolesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsRolesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupsRolesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new GroupRole.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one GroupRole by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a GroupRole by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of GroupRoles matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A GroupRole is an assignment of a Group to a Role.
   * </pre>
   */
  public static final class GroupsRolesBlockingStub extends io.grpc.stub.AbstractBlockingStub<GroupsRolesBlockingStub> {
    private GroupsRolesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsRolesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupsRolesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new GroupRole.
     * </pre>
     */
    public com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateResponse create(com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one GroupRole by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetResponse get(com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a GroupRole by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteResponse delete(com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of GroupRoles matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListResponse list(com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A GroupRole is an assignment of a Group to a Role.
   * </pre>
   */
  public static final class GroupsRolesFutureStub extends io.grpc.stub.AbstractFutureStub<GroupsRolesFutureStub> {
    private GroupsRolesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupsRolesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupsRolesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new GroupRole.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateResponse> create(
        com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one GroupRole by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetResponse> get(
        com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a GroupRole by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteResponse> delete(
        com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of GroupRoles matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListResponse> list(
        com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListRequest request) {
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
    private final GroupsRolesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupsRolesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleGetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GroupsRolesPlumbing.GroupRoleListResponse>) responseObserver);
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

  private static abstract class GroupsRolesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupsRolesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.GroupsRolesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GroupsRoles");
    }
  }

  private static final class GroupsRolesFileDescriptorSupplier
      extends GroupsRolesBaseDescriptorSupplier {
    GroupsRolesFileDescriptorSupplier() {}
  }

  private static final class GroupsRolesMethodDescriptorSupplier
      extends GroupsRolesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupsRolesMethodDescriptorSupplier(String methodName) {
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
      synchronized (GroupsRolesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupsRolesFileDescriptorSupplier())
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
