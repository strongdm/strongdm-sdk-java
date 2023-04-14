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
package v1;

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
 * NodeChannelOverrides allows one to pin a node to a specific channel.
 * That means that they will not receive updates according to their org's channel, but according to
 * the channel they are then pinned to. This -only- affects updates, it does not affect feature flags.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: node_channel_overrides.proto")
public final class NodeChannelOverridesGrpc {

  private NodeChannelOverridesGrpc() {}

  public static final String SERVICE_NAME = "v1.NodeChannelOverrides";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateRequest,
      v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateRequest.class,
      responseType = v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateRequest,
      v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateRequest, v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateResponse> getCreateMethod;
    if ((getCreateMethod = NodeChannelOverridesGrpc.getCreateMethod) == null) {
      synchronized (NodeChannelOverridesGrpc.class) {
        if ((getCreateMethod = NodeChannelOverridesGrpc.getCreateMethod) == null) {
          NodeChannelOverridesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateRequest, v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeChannelOverridesMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListRequest,
      v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListRequest.class,
      responseType = v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListRequest,
      v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListResponse> getListMethod() {
    io.grpc.MethodDescriptor<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListRequest, v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListResponse> getListMethod;
    if ((getListMethod = NodeChannelOverridesGrpc.getListMethod) == null) {
      synchronized (NodeChannelOverridesGrpc.class) {
        if ((getListMethod = NodeChannelOverridesGrpc.getListMethod) == null) {
          NodeChannelOverridesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListRequest, v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeChannelOverridesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteRequest,
      v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteRequest.class,
      responseType = v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteRequest,
      v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteRequest, v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = NodeChannelOverridesGrpc.getDeleteMethod) == null) {
      synchronized (NodeChannelOverridesGrpc.class) {
        if ((getDeleteMethod = NodeChannelOverridesGrpc.getDeleteMethod) == null) {
          NodeChannelOverridesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteRequest, v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeChannelOverridesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NodeChannelOverridesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeChannelOverridesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeChannelOverridesStub>() {
        @java.lang.Override
        public NodeChannelOverridesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeChannelOverridesStub(channel, callOptions);
        }
      };
    return NodeChannelOverridesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NodeChannelOverridesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeChannelOverridesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeChannelOverridesBlockingStub>() {
        @java.lang.Override
        public NodeChannelOverridesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeChannelOverridesBlockingStub(channel, callOptions);
        }
      };
    return NodeChannelOverridesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NodeChannelOverridesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeChannelOverridesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeChannelOverridesFutureStub>() {
        @java.lang.Override
        public NodeChannelOverridesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeChannelOverridesFutureStub(channel, callOptions);
        }
      };
    return NodeChannelOverridesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * NodeChannelOverrides allows one to pin a node to a specific channel.
   * That means that they will not receive updates according to their org's channel, but according to
   * the channel they are then pinned to. This -only- affects updates, it does not affect feature flags.
   * </pre>
   */
  public static abstract class NodeChannelOverridesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create pins a node to a channel. If a pin is already present, it will remove the existing
     * pin.
     * </pre>
     */
    public void create(v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateRequest request,
        io.grpc.stub.StreamObserver<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * List is currently unimplemented.
     * TODO: enable sdmctl commands to use this to see what pins are currently in place
     * </pre>
     */
    public void list(v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListRequest request,
        io.grpc.stub.StreamObserver<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes all overrides for a given node (at most one). If none are present,
     * it will return that it did not change any rows.
     * </pre>
     */
    public void delete(v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteRequest request,
        io.grpc.stub.StreamObserver<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateRequest,
                v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListRequest,
                v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteRequest,
                v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * NodeChannelOverrides allows one to pin a node to a specific channel.
   * That means that they will not receive updates according to their org's channel, but according to
   * the channel they are then pinned to. This -only- affects updates, it does not affect feature flags.
   * </pre>
   */
  public static final class NodeChannelOverridesStub extends io.grpc.stub.AbstractAsyncStub<NodeChannelOverridesStub> {
    private NodeChannelOverridesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeChannelOverridesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeChannelOverridesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create pins a node to a channel. If a pin is already present, it will remove the existing
     * pin.
     * </pre>
     */
    public void create(v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateRequest request,
        io.grpc.stub.StreamObserver<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List is currently unimplemented.
     * TODO: enable sdmctl commands to use this to see what pins are currently in place
     * </pre>
     */
    public void list(v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListRequest request,
        io.grpc.stub.StreamObserver<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes all overrides for a given node (at most one). If none are present,
     * it will return that it did not change any rows.
     * </pre>
     */
    public void delete(v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteRequest request,
        io.grpc.stub.StreamObserver<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * NodeChannelOverrides allows one to pin a node to a specific channel.
   * That means that they will not receive updates according to their org's channel, but according to
   * the channel they are then pinned to. This -only- affects updates, it does not affect feature flags.
   * </pre>
   */
  public static final class NodeChannelOverridesBlockingStub extends io.grpc.stub.AbstractBlockingStub<NodeChannelOverridesBlockingStub> {
    private NodeChannelOverridesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeChannelOverridesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeChannelOverridesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create pins a node to a channel. If a pin is already present, it will remove the existing
     * pin.
     * </pre>
     */
    public v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateResponse create(v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List is currently unimplemented.
     * TODO: enable sdmctl commands to use this to see what pins are currently in place
     * </pre>
     */
    public v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListResponse list(v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes all overrides for a given node (at most one). If none are present,
     * it will return that it did not change any rows.
     * </pre>
     */
    public v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteResponse delete(v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * NodeChannelOverrides allows one to pin a node to a specific channel.
   * That means that they will not receive updates according to their org's channel, but according to
   * the channel they are then pinned to. This -only- affects updates, it does not affect feature flags.
   * </pre>
   */
  public static final class NodeChannelOverridesFutureStub extends io.grpc.stub.AbstractFutureStub<NodeChannelOverridesFutureStub> {
    private NodeChannelOverridesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeChannelOverridesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeChannelOverridesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create pins a node to a channel. If a pin is already present, it will remove the existing
     * pin.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateResponse> create(
        v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List is currently unimplemented.
     * TODO: enable sdmctl commands to use this to see what pins are currently in place
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListResponse> list(
        v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes all overrides for a given node (at most one). If none are present,
     * it will return that it did not change any rows.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteResponse> delete(
        v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NodeChannelOverridesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NodeChannelOverridesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateRequest) request,
              (io.grpc.stub.StreamObserver<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideCreateResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListRequest) request,
              (io.grpc.stub.StreamObserver<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideListResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteRequest) request,
              (io.grpc.stub.StreamObserver<v1.NodeChannelOverridesOuterClass.NodeChannelOverrideDeleteResponse>) responseObserver);
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

  private static abstract class NodeChannelOverridesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NodeChannelOverridesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return v1.NodeChannelOverridesOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NodeChannelOverrides");
    }
  }

  private static final class NodeChannelOverridesFileDescriptorSupplier
      extends NodeChannelOverridesBaseDescriptorSupplier {
    NodeChannelOverridesFileDescriptorSupplier() {}
  }

  private static final class NodeChannelOverridesMethodDescriptorSupplier
      extends NodeChannelOverridesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NodeChannelOverridesMethodDescriptorSupplier(String methodName) {
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
      synchronized (NodeChannelOverridesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NodeChannelOverridesFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getListMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
