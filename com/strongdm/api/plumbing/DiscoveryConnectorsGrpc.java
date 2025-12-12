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
 * A Discovery Connector is a configuration object for performing Resource
 * Scans in remote systems such as AWS, GCP, Azure, and other systems.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: discovery_connectors.proto")
public final class DiscoveryConnectorsGrpc {

  private DiscoveryConnectorsGrpc() {}

  public static final String SERVICE_NAME = "v1.DiscoveryConnectors";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateRequest,
      com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateRequest.class,
      responseType = com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateRequest,
      com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateRequest, com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateResponse> getCreateMethod;
    if ((getCreateMethod = DiscoveryConnectorsGrpc.getCreateMethod) == null) {
      synchronized (DiscoveryConnectorsGrpc.class) {
        if ((getCreateMethod = DiscoveryConnectorsGrpc.getCreateMethod) == null) {
          DiscoveryConnectorsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateRequest, com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiscoveryConnectorsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetRequest,
      com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetRequest.class,
      responseType = com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetRequest,
      com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetRequest, com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetResponse> getGetMethod;
    if ((getGetMethod = DiscoveryConnectorsGrpc.getGetMethod) == null) {
      synchronized (DiscoveryConnectorsGrpc.class) {
        if ((getGetMethod = DiscoveryConnectorsGrpc.getGetMethod) == null) {
          DiscoveryConnectorsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetRequest, com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiscoveryConnectorsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateRequest,
      com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateRequest.class,
      responseType = com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateRequest,
      com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateRequest, com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = DiscoveryConnectorsGrpc.getUpdateMethod) == null) {
      synchronized (DiscoveryConnectorsGrpc.class) {
        if ((getUpdateMethod = DiscoveryConnectorsGrpc.getUpdateMethod) == null) {
          DiscoveryConnectorsGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateRequest, com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiscoveryConnectorsMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteRequest,
      com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteRequest,
      com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteRequest, com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = DiscoveryConnectorsGrpc.getDeleteMethod) == null) {
      synchronized (DiscoveryConnectorsGrpc.class) {
        if ((getDeleteMethod = DiscoveryConnectorsGrpc.getDeleteMethod) == null) {
          DiscoveryConnectorsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteRequest, com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiscoveryConnectorsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListRequest,
      com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListRequest.class,
      responseType = com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListRequest,
      com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListRequest, com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListResponse> getListMethod;
    if ((getListMethod = DiscoveryConnectorsGrpc.getListMethod) == null) {
      synchronized (DiscoveryConnectorsGrpc.class) {
        if ((getListMethod = DiscoveryConnectorsGrpc.getListMethod) == null) {
          DiscoveryConnectorsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListRequest, com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiscoveryConnectorsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiscoveryConnectorsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscoveryConnectorsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscoveryConnectorsStub>() {
        @java.lang.Override
        public DiscoveryConnectorsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscoveryConnectorsStub(channel, callOptions);
        }
      };
    return DiscoveryConnectorsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiscoveryConnectorsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscoveryConnectorsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscoveryConnectorsBlockingStub>() {
        @java.lang.Override
        public DiscoveryConnectorsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscoveryConnectorsBlockingStub(channel, callOptions);
        }
      };
    return DiscoveryConnectorsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiscoveryConnectorsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscoveryConnectorsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscoveryConnectorsFutureStub>() {
        @java.lang.Override
        public DiscoveryConnectorsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscoveryConnectorsFutureStub(channel, callOptions);
        }
      };
    return DiscoveryConnectorsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A Discovery Connector is a configuration object for performing Resource
   * Scans in remote systems such as AWS, GCP, Azure, and other systems.
   * </pre>
   */
  public static abstract class DiscoveryConnectorsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create adds a new Connector.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get reads one Connector by ID
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Connector by ID.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes a Connector by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Connectors matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateRequest,
                com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetRequest,
                com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateRequest,
                com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteRequest,
                com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListRequest,
                com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A Discovery Connector is a configuration object for performing Resource
   * Scans in remote systems such as AWS, GCP, Azure, and other systems.
   * </pre>
   */
  public static final class DiscoveryConnectorsStub extends io.grpc.stub.AbstractAsyncStub<DiscoveryConnectorsStub> {
    private DiscoveryConnectorsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryConnectorsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscoveryConnectorsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create adds a new Connector.
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get reads one Connector by ID
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Connector by ID.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes a Connector by ID.
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Connectors matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A Discovery Connector is a configuration object for performing Resource
   * Scans in remote systems such as AWS, GCP, Azure, and other systems.
   * </pre>
   */
  public static final class DiscoveryConnectorsBlockingStub extends io.grpc.stub.AbstractBlockingStub<DiscoveryConnectorsBlockingStub> {
    private DiscoveryConnectorsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryConnectorsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscoveryConnectorsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create adds a new Connector.
     * </pre>
     */
    public com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateResponse create(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get reads one Connector by ID
     * </pre>
     */
    public com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetResponse get(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Connector by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateResponse update(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes a Connector by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteResponse delete(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of Connectors matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListResponse list(com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A Discovery Connector is a configuration object for performing Resource
   * Scans in remote systems such as AWS, GCP, Azure, and other systems.
   * </pre>
   */
  public static final class DiscoveryConnectorsFutureStub extends io.grpc.stub.AbstractFutureStub<DiscoveryConnectorsFutureStub> {
    private DiscoveryConnectorsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryConnectorsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscoveryConnectorsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create adds a new Connector.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateResponse> create(
        com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get reads one Connector by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetResponse> get(
        com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update replaces all the fields of a Connector by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateResponse> update(
        com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes a Connector by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteResponse> delete(
        com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of Connectors matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListResponse> list(
        com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListRequest request) {
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
    private final DiscoveryConnectorsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DiscoveryConnectorsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorCreateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorGetResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.ConnectorListResponse>) responseObserver);
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

  private static abstract class DiscoveryConnectorsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiscoveryConnectorsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.DiscoveryConnectorsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DiscoveryConnectors");
    }
  }

  private static final class DiscoveryConnectorsFileDescriptorSupplier
      extends DiscoveryConnectorsBaseDescriptorSupplier {
    DiscoveryConnectorsFileDescriptorSupplier() {}
  }

  private static final class DiscoveryConnectorsMethodDescriptorSupplier
      extends DiscoveryConnectorsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DiscoveryConnectorsMethodDescriptorSupplier(String methodName) {
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
      synchronized (DiscoveryConnectorsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiscoveryConnectorsFileDescriptorSupplier())
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
