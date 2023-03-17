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
 * RoleResourcesHistory records all changes to the state of a RoleResource.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: role_resources_history.proto")
public final class RoleResourcesHistoryGrpc {

  private RoleResourcesHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.RoleResourcesHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListRequest,
      com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListRequest,
      com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListRequest, com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListResponse> getListMethod;
    if ((getListMethod = RoleResourcesHistoryGrpc.getListMethod) == null) {
      synchronized (RoleResourcesHistoryGrpc.class) {
        if ((getListMethod = RoleResourcesHistoryGrpc.getListMethod) == null) {
          RoleResourcesHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListRequest, com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleResourcesHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoleResourcesHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleResourcesHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleResourcesHistoryStub>() {
        @java.lang.Override
        public RoleResourcesHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleResourcesHistoryStub(channel, callOptions);
        }
      };
    return RoleResourcesHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoleResourcesHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleResourcesHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleResourcesHistoryBlockingStub>() {
        @java.lang.Override
        public RoleResourcesHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleResourcesHistoryBlockingStub(channel, callOptions);
        }
      };
    return RoleResourcesHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoleResourcesHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleResourcesHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleResourcesHistoryFutureStub>() {
        @java.lang.Override
        public RoleResourcesHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleResourcesHistoryFutureStub(channel, callOptions);
        }
      };
    return RoleResourcesHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RoleResourcesHistory records all changes to the state of a RoleResource.
   * </pre>
   */
  public static abstract class RoleResourcesHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of RoleResourceHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListRequest,
                com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * RoleResourcesHistory records all changes to the state of a RoleResource.
   * </pre>
   */
  public static final class RoleResourcesHistoryStub extends io.grpc.stub.AbstractAsyncStub<RoleResourcesHistoryStub> {
    private RoleResourcesHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleResourcesHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleResourcesHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RoleResourceHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RoleResourcesHistory records all changes to the state of a RoleResource.
   * </pre>
   */
  public static final class RoleResourcesHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<RoleResourcesHistoryBlockingStub> {
    private RoleResourcesHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleResourcesHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleResourcesHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RoleResourceHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListResponse list(com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RoleResourcesHistory records all changes to the state of a RoleResource.
   * </pre>
   */
  public static final class RoleResourcesHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<RoleResourcesHistoryFutureStub> {
    private RoleResourcesHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleResourcesHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleResourcesHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RoleResourceHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListResponse> list(
        com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListRequest request) {
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
    private final RoleResourcesHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoleResourcesHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.RoleResourceHistoryListResponse>) responseObserver);
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

  private static abstract class RoleResourcesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoleResourcesHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.RoleResourcesHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoleResourcesHistory");
    }
  }

  private static final class RoleResourcesHistoryFileDescriptorSupplier
      extends RoleResourcesHistoryBaseDescriptorSupplier {
    RoleResourcesHistoryFileDescriptorSupplier() {}
  }

  private static final class RoleResourcesHistoryMethodDescriptorSupplier
      extends RoleResourcesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoleResourcesHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoleResourcesHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoleResourcesHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
