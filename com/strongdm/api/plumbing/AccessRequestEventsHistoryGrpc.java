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
 * AccessRequestEventsHistory provides records of all changes to the state of an AccessRequest.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: access_request_events_history.proto")
public final class AccessRequestEventsHistoryGrpc {

  private AccessRequestEventsHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.AccessRequestEventsHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListRequest,
      com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListRequest,
      com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListRequest, com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListResponse> getListMethod;
    if ((getListMethod = AccessRequestEventsHistoryGrpc.getListMethod) == null) {
      synchronized (AccessRequestEventsHistoryGrpc.class) {
        if ((getListMethod = AccessRequestEventsHistoryGrpc.getListMethod) == null) {
          AccessRequestEventsHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListRequest, com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRequestEventsHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessRequestEventsHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessRequestEventsHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessRequestEventsHistoryStub>() {
        @java.lang.Override
        public AccessRequestEventsHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessRequestEventsHistoryStub(channel, callOptions);
        }
      };
    return AccessRequestEventsHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessRequestEventsHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessRequestEventsHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessRequestEventsHistoryBlockingStub>() {
        @java.lang.Override
        public AccessRequestEventsHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessRequestEventsHistoryBlockingStub(channel, callOptions);
        }
      };
    return AccessRequestEventsHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessRequestEventsHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessRequestEventsHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessRequestEventsHistoryFutureStub>() {
        @java.lang.Override
        public AccessRequestEventsHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessRequestEventsHistoryFutureStub(channel, callOptions);
        }
      };
    return AccessRequestEventsHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AccessRequestEventsHistory provides records of all changes to the state of an AccessRequest.
   * </pre>
   */
  public static abstract class AccessRequestEventsHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of AccessRequestEventHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListRequest,
                com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * AccessRequestEventsHistory provides records of all changes to the state of an AccessRequest.
   * </pre>
   */
  public static final class AccessRequestEventsHistoryStub extends io.grpc.stub.AbstractAsyncStub<AccessRequestEventsHistoryStub> {
    private AccessRequestEventsHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessRequestEventsHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessRequestEventsHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccessRequestEventHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AccessRequestEventsHistory provides records of all changes to the state of an AccessRequest.
   * </pre>
   */
  public static final class AccessRequestEventsHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccessRequestEventsHistoryBlockingStub> {
    private AccessRequestEventsHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessRequestEventsHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessRequestEventsHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccessRequestEventHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListResponse list(com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AccessRequestEventsHistory provides records of all changes to the state of an AccessRequest.
   * </pre>
   */
  public static final class AccessRequestEventsHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<AccessRequestEventsHistoryFutureStub> {
    private AccessRequestEventsHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessRequestEventsHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessRequestEventsHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccessRequestEventHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListResponse> list(
        com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListRequest request) {
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
    private final AccessRequestEventsHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessRequestEventsHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.AccessRequestEventHistoryListResponse>) responseObserver);
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

  private static abstract class AccessRequestEventsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessRequestEventsHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.AccessRequestEventsHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessRequestEventsHistory");
    }
  }

  private static final class AccessRequestEventsHistoryFileDescriptorSupplier
      extends AccessRequestEventsHistoryBaseDescriptorSupplier {
    AccessRequestEventsHistoryFileDescriptorSupplier() {}
  }

  private static final class AccessRequestEventsHistoryMethodDescriptorSupplier
      extends AccessRequestEventsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessRequestEventsHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessRequestEventsHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessRequestEventsHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
