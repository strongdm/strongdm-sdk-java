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
 * RoleResources enumerates the resources to which roles have access.
 * The RoleResources service is read-only.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: role_resources.proto")
public final class RoleResourcesGrpc {

  private RoleResourcesGrpc() {}

  public static final String SERVICE_NAME = "v1.RoleResources";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListRequest,
      com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListRequest.class,
      responseType = com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListRequest,
      com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListRequest, com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListResponse> getListMethod;
    if ((getListMethod = RoleResourcesGrpc.getListMethod) == null) {
      synchronized (RoleResourcesGrpc.class) {
        if ((getListMethod = RoleResourcesGrpc.getListMethod) == null) {
          RoleResourcesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListRequest, com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RoleResourcesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoleResourcesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleResourcesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleResourcesStub>() {
        @java.lang.Override
        public RoleResourcesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleResourcesStub(channel, callOptions);
        }
      };
    return RoleResourcesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoleResourcesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleResourcesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleResourcesBlockingStub>() {
        @java.lang.Override
        public RoleResourcesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleResourcesBlockingStub(channel, callOptions);
        }
      };
    return RoleResourcesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoleResourcesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoleResourcesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoleResourcesFutureStub>() {
        @java.lang.Override
        public RoleResourcesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoleResourcesFutureStub(channel, callOptions);
        }
      };
    return RoleResourcesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RoleResources enumerates the resources to which roles have access.
   * The RoleResources service is read-only.
   * </pre>
   */
  public static abstract class RoleResourcesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of RoleResource records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListRequest,
                com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * RoleResources enumerates the resources to which roles have access.
   * The RoleResources service is read-only.
   * </pre>
   */
  public static final class RoleResourcesStub extends io.grpc.stub.AbstractAsyncStub<RoleResourcesStub> {
    private RoleResourcesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleResourcesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleResourcesStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RoleResource records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RoleResources enumerates the resources to which roles have access.
   * The RoleResources service is read-only.
   * </pre>
   */
  public static final class RoleResourcesBlockingStub extends io.grpc.stub.AbstractBlockingStub<RoleResourcesBlockingStub> {
    private RoleResourcesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleResourcesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleResourcesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RoleResource records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListResponse list(com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RoleResources enumerates the resources to which roles have access.
   * The RoleResources service is read-only.
   * </pre>
   */
  public static final class RoleResourcesFutureStub extends io.grpc.stub.AbstractFutureStub<RoleResourcesFutureStub> {
    private RoleResourcesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleResourcesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoleResourcesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RoleResource records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListResponse> list(
        com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListRequest request) {
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
    private final RoleResourcesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoleResourcesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RoleResourcesPlumbing.RoleResourceListResponse>) responseObserver);
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

  private static abstract class RoleResourcesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoleResourcesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.RoleResourcesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoleResources");
    }
  }

  private static final class RoleResourcesFileDescriptorSupplier
      extends RoleResourcesBaseDescriptorSupplier {
    RoleResourcesFileDescriptorSupplier() {}
  }

  private static final class RoleResourcesMethodDescriptorSupplier
      extends RoleResourcesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoleResourcesMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoleResourcesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoleResourcesFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
