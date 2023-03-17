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
 * A Replay captures the data transferred over a long-running SSH, RDP, or Kubernetes interactive session
 * (otherwise referred to as a query). The Replays service is read-only.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: replays.proto")
public final class ReplaysGrpc {

  private ReplaysGrpc() {}

  public static final String SERVICE_NAME = "v1.Replays";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListRequest,
      com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListRequest.class,
      responseType = com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListRequest,
      com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListRequest, com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListResponse> getListMethod;
    if ((getListMethod = ReplaysGrpc.getListMethod) == null) {
      synchronized (ReplaysGrpc.class) {
        if ((getListMethod = ReplaysGrpc.getListMethod) == null) {
          ReplaysGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListRequest, com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReplaysMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReplaysStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReplaysStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReplaysStub>() {
        @java.lang.Override
        public ReplaysStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReplaysStub(channel, callOptions);
        }
      };
    return ReplaysStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReplaysBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReplaysBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReplaysBlockingStub>() {
        @java.lang.Override
        public ReplaysBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReplaysBlockingStub(channel, callOptions);
        }
      };
    return ReplaysBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReplaysFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReplaysFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReplaysFutureStub>() {
        @java.lang.Override
        public ReplaysFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReplaysFutureStub(channel, callOptions);
        }
      };
    return ReplaysFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A Replay captures the data transferred over a long-running SSH, RDP, or Kubernetes interactive session
   * (otherwise referred to as a query). The Replays service is read-only.
   * </pre>
   */
  public static abstract class ReplaysImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of ReplayChunks for the Query ID specified by the filter criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListRequest,
                com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A Replay captures the data transferred over a long-running SSH, RDP, or Kubernetes interactive session
   * (otherwise referred to as a query). The Replays service is read-only.
   * </pre>
   */
  public static final class ReplaysStub extends io.grpc.stub.AbstractAsyncStub<ReplaysStub> {
    private ReplaysStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReplaysStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReplaysStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of ReplayChunks for the Query ID specified by the filter criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A Replay captures the data transferred over a long-running SSH, RDP, or Kubernetes interactive session
   * (otherwise referred to as a query). The Replays service is read-only.
   * </pre>
   */
  public static final class ReplaysBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReplaysBlockingStub> {
    private ReplaysBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReplaysBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReplaysBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of ReplayChunks for the Query ID specified by the filter criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListResponse list(com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A Replay captures the data transferred over a long-running SSH, RDP, or Kubernetes interactive session
   * (otherwise referred to as a query). The Replays service is read-only.
   * </pre>
   */
  public static final class ReplaysFutureStub extends io.grpc.stub.AbstractFutureStub<ReplaysFutureStub> {
    private ReplaysFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReplaysFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReplaysFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of ReplayChunks for the Query ID specified by the filter criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListResponse> list(
        com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReplaysImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReplaysImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ReplaysPlumbing.ReplayListResponse>) responseObserver);
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

  private static abstract class ReplaysBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReplaysBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.ReplaysPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Replays");
    }
  }

  private static final class ReplaysFileDescriptorSupplier
      extends ReplaysBaseDescriptorSupplier {
    ReplaysFileDescriptorSupplier() {}
  }

  private static final class ReplaysMethodDescriptorSupplier
      extends ReplaysBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReplaysMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReplaysGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReplaysFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
