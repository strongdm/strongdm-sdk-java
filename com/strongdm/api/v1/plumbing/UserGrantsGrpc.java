package com.strongdm.api.v1.plumbing;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * UserGrants represent relationships between composite roles and the roles
 * that make up those composite roles. When a composite role is attached to another
 * role, the permissions granted to members of the composite role are augmented to
 * include the permissions granted to members of the attached role.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: user_grants.proto")
public final class UserGrantsGrpc {

  private UserGrantsGrpc() {}

  public static final String SERVICE_NAME = "v1.UserGrants";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateRequest,
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateResponse>
      getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateRequest.class,
      responseType = com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateRequest,
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateResponse>
      getCreateMethod() {
    io.grpc.MethodDescriptor<
            com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateRequest,
            com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateResponse>
        getCreateMethod;
    if ((getCreateMethod = UserGrantsGrpc.getCreateMethod) == null) {
      synchronized (UserGrantsGrpc.class) {
        if ((getCreateMethod = UserGrantsGrpc.getCreateMethod) == null) {
          UserGrantsGrpc.getCreateMethod =
              getCreateMethod =
                  io.grpc.MethodDescriptor
                      .<com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateRequest,
                          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.UserGrantsPlumbing
                                  .UserGrantCreateResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new UserGrantsMethodDescriptorSupplier("Create"))
                      .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetRequest,
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetResponse>
      getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetRequest.class,
      responseType = com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetRequest,
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetResponse>
      getGetMethod() {
    io.grpc.MethodDescriptor<
            com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetRequest,
            com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetResponse>
        getGetMethod;
    if ((getGetMethod = UserGrantsGrpc.getGetMethod) == null) {
      synchronized (UserGrantsGrpc.class) {
        if ((getGetMethod = UserGrantsGrpc.getGetMethod) == null) {
          UserGrantsGrpc.getGetMethod =
              getGetMethod =
                  io.grpc.MethodDescriptor
                      .<com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetRequest,
                          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new UserGrantsMethodDescriptorSupplier("Get"))
                      .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteRequest,
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteResponse>
      getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteRequest.class,
      responseType = com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteRequest,
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteResponse>
      getDeleteMethod() {
    io.grpc.MethodDescriptor<
            com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteRequest,
            com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteResponse>
        getDeleteMethod;
    if ((getDeleteMethod = UserGrantsGrpc.getDeleteMethod) == null) {
      synchronized (UserGrantsGrpc.class) {
        if ((getDeleteMethod = UserGrantsGrpc.getDeleteMethod) == null) {
          UserGrantsGrpc.getDeleteMethod =
              getDeleteMethod =
                  io.grpc.MethodDescriptor
                      .<com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteRequest,
                          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.UserGrantsPlumbing
                                  .UserGrantDeleteResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new UserGrantsMethodDescriptorSupplier("Delete"))
                      .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListRequest,
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListResponse>
      getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListRequest.class,
      responseType = com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListRequest,
          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListResponse>
      getListMethod() {
    io.grpc.MethodDescriptor<
            com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListRequest,
            com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListResponse>
        getListMethod;
    if ((getListMethod = UserGrantsGrpc.getListMethod) == null) {
      synchronized (UserGrantsGrpc.class) {
        if ((getListMethod = UserGrantsGrpc.getListMethod) == null) {
          UserGrantsGrpc.getListMethod =
              getListMethod =
                  io.grpc.MethodDescriptor
                      .<com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListRequest,
                          com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new UserGrantsMethodDescriptorSupplier("List"))
                      .build();
        }
      }
    }
    return getListMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static UserGrantsStub newStub(io.grpc.Channel channel) {
    return new UserGrantsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserGrantsBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new UserGrantsBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static UserGrantsFutureStub newFutureStub(io.grpc.Channel channel) {
    return new UserGrantsFutureStub(channel);
  }

  /**
   *
   *
   * <pre>
   * UserGrants represent relationships between composite roles and the roles
   * that make up those composite roles. When a composite role is attached to another
   * role, the permissions granted to members of the composite role are augmented to
   * include the permissions granted to members of the attached role.
   * </pre>
   */
  public abstract static class UserGrantsImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Create registers a new UserGrant.
     * </pre>
     */
    public void create(
        com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateRequest request,
        io.grpc.stub.StreamObserver<
                com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Get reads one UserGrant by ID.
     * </pre>
     */
    public void get(
        com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetRequest request,
        io.grpc.stub.StreamObserver<
                com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Delete removes a UserGrant by ID.
     * </pre>
     */
    public void delete(
        com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteRequest request,
        io.grpc.stub.StreamObserver<
                com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * List gets a list of UserGrants matching a given set of criteria.
     * </pre>
     */
    public void list(
        com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListRequest request,
        io.grpc.stub.StreamObserver<
                com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateRequest,
                      com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateResponse>(
                      this, METHODID_CREATE)))
          .addMethod(
              getGetMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetRequest,
                      com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetResponse>(
                      this, METHODID_GET)))
          .addMethod(
              getDeleteMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteRequest,
                      com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteResponse>(
                      this, METHODID_DELETE)))
          .addMethod(
              getListMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListRequest,
                      com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListResponse>(
                      this, METHODID_LIST)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * UserGrants represent relationships between composite roles and the roles
   * that make up those composite roles. When a composite role is attached to another
   * role, the permissions granted to members of the composite role are augmented to
   * include the permissions granted to members of the attached role.
   * </pre>
   */
  public static final class UserGrantsStub extends io.grpc.stub.AbstractStub<UserGrantsStub> {
    private UserGrantsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserGrantsStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrantsStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserGrantsStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Create registers a new UserGrant.
     * </pre>
     */
    public void create(
        com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateRequest request,
        io.grpc.stub.StreamObserver<
                com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Get reads one UserGrant by ID.
     * </pre>
     */
    public void get(
        com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetRequest request,
        io.grpc.stub.StreamObserver<
                com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Delete removes a UserGrant by ID.
     * </pre>
     */
    public void delete(
        com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteRequest request,
        io.grpc.stub.StreamObserver<
                com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * List gets a list of UserGrants matching a given set of criteria.
     * </pre>
     */
    public void list(
        com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListRequest request,
        io.grpc.stub.StreamObserver<
                com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * UserGrants represent relationships between composite roles and the roles
   * that make up those composite roles. When a composite role is attached to another
   * role, the permissions granted to members of the composite role are augmented to
   * include the permissions granted to members of the attached role.
   * </pre>
   */
  public static final class UserGrantsBlockingStub
      extends io.grpc.stub.AbstractStub<UserGrantsBlockingStub> {
    private UserGrantsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserGrantsBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrantsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserGrantsBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Create registers a new UserGrant.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateResponse create(
        com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateRequest request) {
      return blockingUnaryCall(getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Get reads one UserGrant by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetResponse get(
        com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetRequest request) {
      return blockingUnaryCall(getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Delete removes a UserGrant by ID.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteResponse delete(
        com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * List gets a list of UserGrants matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListResponse list(
        com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListRequest request) {
      return blockingUnaryCall(getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * UserGrants represent relationships between composite roles and the roles
   * that make up those composite roles. When a composite role is attached to another
   * role, the permissions granted to members of the composite role are augmented to
   * include the permissions granted to members of the attached role.
   * </pre>
   */
  public static final class UserGrantsFutureStub
      extends io.grpc.stub.AbstractStub<UserGrantsFutureStub> {
    private UserGrantsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserGrantsFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrantsFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserGrantsFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Create registers a new UserGrant.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateResponse>
        create(com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateRequest request) {
      return futureUnaryCall(getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Get reads one UserGrant by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetResponse>
        get(com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetRequest request) {
      return futureUnaryCall(getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Delete removes a UserGrant by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteResponse>
        delete(com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteRequest request) {
      return futureUnaryCall(getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * List gets a list of UserGrants matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListResponse>
        list(com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListRequest request) {
      return futureUnaryCall(getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_LIST = 3;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserGrantsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserGrantsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create(
              (com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantCreateResponse>)
                  responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get(
              (com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantGetResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete(
              (com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantDeleteResponse>)
                  responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list(
              (com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.strongdm.api.v1.plumbing.UserGrantsPlumbing.UserGrantListResponse>)
                  responseObserver);
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

  private abstract static class UserGrantsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserGrantsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.UserGrantsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserGrants");
    }
  }

  private static final class UserGrantsFileDescriptorSupplier
      extends UserGrantsBaseDescriptorSupplier {
    UserGrantsFileDescriptorSupplier() {}
  }

  private static final class UserGrantsMethodDescriptorSupplier
      extends UserGrantsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserGrantsMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserGrantsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new UserGrantsFileDescriptorSupplier())
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
