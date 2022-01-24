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

/**
 * <pre>
 * Roles are tools for controlling user access to resources. Each Role holds a
 * list of resources which they grant access to. Composite roles are a special
 * type of Role which have no resource associations of their own, but instead
 * grant access to the combined resources associated with a set of child roles.
 * Each user can be a member of one Role or composite role.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: roles.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RolesGrpc {

  private RolesGrpc() {}

  public static final String SERVICE_NAME = "v1.Roles";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateRequest,
      com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateRequest,
      com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateRequest, com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateResponse> getCreateMethod;
    if ((getCreateMethod = RolesGrpc.getCreateMethod) == null) {
      synchronized (RolesGrpc.class) {
        if ((getCreateMethod = RolesGrpc.getCreateMethod) == null) {
          RolesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateRequest, com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetRequest,
      com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetRequest,
      com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetRequest, com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetResponse> getGetMethod;
    if ((getGetMethod = RolesGrpc.getGetMethod) == null) {
      synchronized (RolesGrpc.class) {
        if ((getGetMethod = RolesGrpc.getGetMethod) == null) {
          RolesGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetRequest, com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateRequest,
      com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateRequest,
      com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateRequest, com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = RolesGrpc.getUpdateMethod) == null) {
      synchronized (RolesGrpc.class) {
        if ((getUpdateMethod = RolesGrpc.getUpdateMethod) == null) {
          RolesGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateRequest, com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteRequest,
      com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteRequest,
      com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteRequest, com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = RolesGrpc.getDeleteMethod) == null) {
      synchronized (RolesGrpc.class) {
        if ((getDeleteMethod = RolesGrpc.getDeleteMethod) == null) {
          RolesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteRequest, com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListRequest,
      com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListRequest.class,
      responseType = com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListRequest,
      com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListRequest, com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListResponse> getListMethod;
    if ((getListMethod = RolesGrpc.getListMethod) == null) {
      synchronized (RolesGrpc.class) {
        if ((getListMethod = RolesGrpc.getListMethod) == null) {
          RolesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListRequest, com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RolesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RolesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RolesStub>() {
        @java.lang.Override
        public RolesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RolesStub(channel, callOptions);
        }
      };
    return RolesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RolesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RolesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RolesBlockingStub>() {
        @java.lang.Override
        public RolesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RolesBlockingStub(channel, callOptions);
        }
      };
    return RolesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RolesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RolesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RolesFutureStub>() {
        @java.lang.Override
        public RolesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RolesFutureStub(channel, callOptions);
        }
      };
    return RolesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Roles are tools for controlling user access to resources. Each Role holds a
   * list of resources which they grant access to. Composite roles are a special
   * type of Role which have no resource associations of their own, but instead
   * grant access to the combined resources associated with a set of child roles.
   * Each user can be a member of one Role or composite role.
   * </pre>
   */
  public static abstract class RolesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create registers a new Role.
     * </pre>
     */
    public void create(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one Role by ID.
     * </pre>
     */
    public void get(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update patches a Role by ID.
     * </pre>
     */
    public void update(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a Role by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Roles matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateRequest,
                com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetRequest,
                com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateRequest,
                com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteRequest,
                com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListRequest,
                com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * Roles are tools for controlling user access to resources. Each Role holds a
   * list of resources which they grant access to. Composite roles are a special
   * type of Role which have no resource associations of their own, but instead
   * grant access to the combined resources associated with a set of child roles.
   * Each user can be a member of one Role or composite role.
   * </pre>
   */
  public static final class RolesStub extends io.grpc.stub.AbstractAsyncStub<RolesStub> {
    private RolesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RolesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new Role.
     * </pre>
     */
    public void create(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one Role by ID.
     * </pre>
     */
    public void get(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update patches a Role by ID.
     * </pre>
     */
    public void update(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a Role by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Roles matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Roles are tools for controlling user access to resources. Each Role holds a
   * list of resources which they grant access to. Composite roles are a special
   * type of Role which have no resource associations of their own, but instead
   * grant access to the combined resources associated with a set of child roles.
   * Each user can be a member of one Role or composite role.
   * </pre>
   */
  public static final class RolesBlockingStub extends io.grpc.stub.AbstractBlockingStub<RolesBlockingStub> {
    private RolesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RolesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new Role.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateResponse create(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one Role by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetResponse get(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update patches a Role by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateResponse update(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a Role by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteResponse delete(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of Roles matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListResponse list(com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Roles are tools for controlling user access to resources. Each Role holds a
   * list of resources which they grant access to. Composite roles are a special
   * type of Role which have no resource associations of their own, but instead
   * grant access to the combined resources associated with a set of child roles.
   * Each user can be a member of one Role or composite role.
   * </pre>
   */
  public static final class RolesFutureStub extends io.grpc.stub.AbstractFutureStub<RolesFutureStub> {
    private RolesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RolesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new Role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateResponse> create(
        com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one Role by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetResponse> get(
        com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update patches a Role by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateResponse> update(
        com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a Role by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteResponse> delete(
        com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of Roles matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListResponse> list(
        com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_LIST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RolesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RolesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleGetResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.RolesPlumbing.RoleListResponse>) responseObserver);
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

  private static abstract class RolesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RolesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.RolesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Roles");
    }
  }

  private static final class RolesFileDescriptorSupplier
      extends RolesBaseDescriptorSupplier {
    RolesFileDescriptorSupplier() {}
  }

  private static final class RolesMethodDescriptorSupplier
      extends RolesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RolesMethodDescriptorSupplier(String methodName) {
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
      synchronized (RolesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RolesFileDescriptorSupplier())
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
