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
 * AccessRequestsHistory provides records of all changes to the state of an AccessRequest.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: access_requests_history.proto")
public final class AccessRequestsHistoryGrpc {

  private AccessRequestsHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.AccessRequestsHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListRequest,
      com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListRequest,
      com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListRequest, com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListResponse> getListMethod;
    if ((getListMethod = AccessRequestsHistoryGrpc.getListMethod) == null) {
      synchronized (AccessRequestsHistoryGrpc.class) {
        if ((getListMethod = AccessRequestsHistoryGrpc.getListMethod) == null) {
          AccessRequestsHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListRequest, com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRequestsHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessRequestsHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessRequestsHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessRequestsHistoryStub>() {
        @java.lang.Override
        public AccessRequestsHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessRequestsHistoryStub(channel, callOptions);
        }
      };
    return AccessRequestsHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessRequestsHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessRequestsHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessRequestsHistoryBlockingStub>() {
        @java.lang.Override
        public AccessRequestsHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessRequestsHistoryBlockingStub(channel, callOptions);
        }
      };
    return AccessRequestsHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessRequestsHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessRequestsHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessRequestsHistoryFutureStub>() {
        @java.lang.Override
        public AccessRequestsHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessRequestsHistoryFutureStub(channel, callOptions);
        }
      };
    return AccessRequestsHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AccessRequestsHistory provides records of all changes to the state of an AccessRequest.
   * </pre>
   */
  public static abstract class AccessRequestsHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of AccessRequestHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListRequest,
                com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * AccessRequestsHistory provides records of all changes to the state of an AccessRequest.
   * </pre>
   */
  public static final class AccessRequestsHistoryStub extends io.grpc.stub.AbstractAsyncStub<AccessRequestsHistoryStub> {
    private AccessRequestsHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessRequestsHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessRequestsHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccessRequestHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AccessRequestsHistory provides records of all changes to the state of an AccessRequest.
   * </pre>
   */
  public static final class AccessRequestsHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccessRequestsHistoryBlockingStub> {
    private AccessRequestsHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessRequestsHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessRequestsHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccessRequestHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListResponse list(com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AccessRequestsHistory provides records of all changes to the state of an AccessRequest.
   * </pre>
   */
  public static final class AccessRequestsHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<AccessRequestsHistoryFutureStub> {
    private AccessRequestsHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessRequestsHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessRequestsHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of AccessRequestHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListResponse> list(
        com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListRequest request) {
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
    private final AccessRequestsHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessRequestsHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.AccessRequestHistoryListResponse>) responseObserver);
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

  private static abstract class AccessRequestsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessRequestsHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.AccessRequestsHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessRequestsHistory");
    }
  }

  private static final class AccessRequestsHistoryFileDescriptorSupplier
      extends AccessRequestsHistoryBaseDescriptorSupplier {
    AccessRequestsHistoryFileDescriptorSupplier() {}
  }

  private static final class AccessRequestsHistoryMethodDescriptorSupplier
      extends AccessRequestsHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessRequestsHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessRequestsHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessRequestsHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
