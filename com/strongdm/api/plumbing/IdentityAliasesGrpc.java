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
 * IdentityAliases assign an alias to an account within an IdentitySet.
 * The alias is used as the username when connecting to a identity supported resource.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: identity_aliases.proto")
public final class IdentityAliasesGrpc {

  private IdentityAliasesGrpc() {}

  public static final String SERVICE_NAME = "v1.IdentityAliases";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateRequest,
      com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateRequest.class,
      responseType = com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateRequest,
      com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateRequest, com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateResponse> getCreateMethod;
    if ((getCreateMethod = IdentityAliasesGrpc.getCreateMethod) == null) {
      synchronized (IdentityAliasesGrpc.class) {
        if ((getCreateMethod = IdentityAliasesGrpc.getCreateMethod) == null) {
          IdentityAliasesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateRequest, com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityAliasesMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetRequest,
      com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetRequest.class,
      responseType = com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetRequest,
      com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetRequest, com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetResponse> getGetMethod;
    if ((getGetMethod = IdentityAliasesGrpc.getGetMethod) == null) {
      synchronized (IdentityAliasesGrpc.class) {
        if ((getGetMethod = IdentityAliasesGrpc.getGetMethod) == null) {
          IdentityAliasesGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetRequest, com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityAliasesMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateRequest,
      com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateRequest.class,
      responseType = com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateRequest,
      com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateRequest, com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = IdentityAliasesGrpc.getUpdateMethod) == null) {
      synchronized (IdentityAliasesGrpc.class) {
        if ((getUpdateMethod = IdentityAliasesGrpc.getUpdateMethod) == null) {
          IdentityAliasesGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateRequest, com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityAliasesMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteRequest,
      com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteRequest,
      com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteRequest, com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = IdentityAliasesGrpc.getDeleteMethod) == null) {
      synchronized (IdentityAliasesGrpc.class) {
        if ((getDeleteMethod = IdentityAliasesGrpc.getDeleteMethod) == null) {
          IdentityAliasesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteRequest, com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityAliasesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListRequest,
      com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListRequest.class,
      responseType = com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListRequest,
      com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListRequest, com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListResponse> getListMethod;
    if ((getListMethod = IdentityAliasesGrpc.getListMethod) == null) {
      synchronized (IdentityAliasesGrpc.class) {
        if ((getListMethod = IdentityAliasesGrpc.getListMethod) == null) {
          IdentityAliasesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListRequest, com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityAliasesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IdentityAliasesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityAliasesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityAliasesStub>() {
        @java.lang.Override
        public IdentityAliasesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityAliasesStub(channel, callOptions);
        }
      };
    return IdentityAliasesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IdentityAliasesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityAliasesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityAliasesBlockingStub>() {
        @java.lang.Override
        public IdentityAliasesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityAliasesBlockingStub(channel, callOptions);
        }
      };
    return IdentityAliasesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IdentityAliasesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityAliasesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityAliasesFutureStub>() {
        @java.lang.Override
        public IdentityAliasesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityAliasesFutureStub(channel, callOptions);
        }
      };
    return IdentityAliasesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * IdentityAliases assign an alias to an account within an IdentitySet.
   * The alias is used as the username when connecting to a identity supported resource.
   * </pre>
   */
  public static abstract class IdentityAliasesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create registers a new IdentityAlias.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one IdentityAlias by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a IdentityAlias by ID.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a IdentityAlias by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of IdentityAliases matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateRequest,
                com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetRequest,
                com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateRequest,
                com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteRequest,
                com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListRequest,
                com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * IdentityAliases assign an alias to an account within an IdentitySet.
   * The alias is used as the username when connecting to a identity supported resource.
   * </pre>
   */
  public static final class IdentityAliasesStub extends io.grpc.stub.AbstractAsyncStub<IdentityAliasesStub> {
    private IdentityAliasesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityAliasesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityAliasesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new IdentityAlias.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one IdentityAlias by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a IdentityAlias by ID.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a IdentityAlias by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of IdentityAliases matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * IdentityAliases assign an alias to an account within an IdentitySet.
   * The alias is used as the username when connecting to a identity supported resource.
   * </pre>
   */
  public static final class IdentityAliasesBlockingStub extends io.grpc.stub.AbstractBlockingStub<IdentityAliasesBlockingStub> {
    private IdentityAliasesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityAliasesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityAliasesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new IdentityAlias.
     * </pre>
     */
    public com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateResponse create(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one IdentityAlias by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetResponse get(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a IdentityAlias by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateResponse update(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a IdentityAlias by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteResponse delete(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of IdentityAliases matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListResponse list(com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * IdentityAliases assign an alias to an account within an IdentitySet.
   * The alias is used as the username when connecting to a identity supported resource.
   * </pre>
   */
  public static final class IdentityAliasesFutureStub extends io.grpc.stub.AbstractFutureStub<IdentityAliasesFutureStub> {
    private IdentityAliasesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityAliasesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityAliasesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create registers a new IdentityAlias.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateResponse> create(
        com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one IdentityAlias by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetResponse> get(
        com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a IdentityAlias by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateResponse> update(
        com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a IdentityAlias by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteResponse> delete(
        com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of IdentityAliases matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListResponse> list(
        com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListRequest request) {
      return futureUnaryCall(
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
    private final IdentityAliasesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IdentityAliasesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasGetResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesPlumbing.IdentityAliasListResponse>) responseObserver);
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

  private static abstract class IdentityAliasesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IdentityAliasesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.IdentityAliasesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IdentityAliases");
    }
  }

  private static final class IdentityAliasesFileDescriptorSupplier
      extends IdentityAliasesBaseDescriptorSupplier {
    IdentityAliasesFileDescriptorSupplier() {}
  }

  private static final class IdentityAliasesMethodDescriptorSupplier
      extends IdentityAliasesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IdentityAliasesMethodDescriptorSupplier(String methodName) {
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
      synchronized (IdentityAliasesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IdentityAliasesFileDescriptorSupplier())
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
