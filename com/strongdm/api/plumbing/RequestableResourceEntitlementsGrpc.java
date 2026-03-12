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
 * RequestableResourceEntitlements enumerates the accounts that are permitted to request access to a given resource.
 * The RequestableResourceEntitlements service is read-only.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: requestable_resource_entitlements.proto")
public final class RequestableResourceEntitlementsGrpc {

  private RequestableResourceEntitlementsGrpc() {}

  public static final String SERVICE_NAME = "v1.RequestableResourceEntitlements";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListRequest,
      com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListRequest.class,
      responseType = com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListRequest,
      com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListRequest, com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListResponse> getListMethod;
    if ((getListMethod = RequestableResourceEntitlementsGrpc.getListMethod) == null) {
      synchronized (RequestableResourceEntitlementsGrpc.class) {
        if ((getListMethod = RequestableResourceEntitlementsGrpc.getListMethod) == null) {
          RequestableResourceEntitlementsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListRequest, com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RequestableResourceEntitlementsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RequestableResourceEntitlementsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RequestableResourceEntitlementsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RequestableResourceEntitlementsStub>() {
        @java.lang.Override
        public RequestableResourceEntitlementsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RequestableResourceEntitlementsStub(channel, callOptions);
        }
      };
    return RequestableResourceEntitlementsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RequestableResourceEntitlementsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RequestableResourceEntitlementsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RequestableResourceEntitlementsBlockingStub>() {
        @java.lang.Override
        public RequestableResourceEntitlementsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RequestableResourceEntitlementsBlockingStub(channel, callOptions);
        }
      };
    return RequestableResourceEntitlementsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RequestableResourceEntitlementsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RequestableResourceEntitlementsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RequestableResourceEntitlementsFutureStub>() {
        @java.lang.Override
        public RequestableResourceEntitlementsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RequestableResourceEntitlementsFutureStub(channel, callOptions);
        }
      };
    return RequestableResourceEntitlementsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RequestableResourceEntitlements enumerates the accounts that are permitted to request access to a given resource.
   * The RequestableResourceEntitlements service is read-only.
   * </pre>
   */
  public static abstract class RequestableResourceEntitlementsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of RequestableResourceEntitlement records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListRequest,
                com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * RequestableResourceEntitlements enumerates the accounts that are permitted to request access to a given resource.
   * The RequestableResourceEntitlements service is read-only.
   * </pre>
   */
  public static final class RequestableResourceEntitlementsStub extends io.grpc.stub.AbstractAsyncStub<RequestableResourceEntitlementsStub> {
    private RequestableResourceEntitlementsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RequestableResourceEntitlementsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RequestableResourceEntitlementsStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RequestableResourceEntitlement records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RequestableResourceEntitlements enumerates the accounts that are permitted to request access to a given resource.
   * The RequestableResourceEntitlements service is read-only.
   * </pre>
   */
  public static final class RequestableResourceEntitlementsBlockingStub extends io.grpc.stub.AbstractBlockingStub<RequestableResourceEntitlementsBlockingStub> {
    private RequestableResourceEntitlementsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RequestableResourceEntitlementsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RequestableResourceEntitlementsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RequestableResourceEntitlement records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListResponse list(com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RequestableResourceEntitlements enumerates the accounts that are permitted to request access to a given resource.
   * The RequestableResourceEntitlements service is read-only.
   * </pre>
   */
  public static final class RequestableResourceEntitlementsFutureStub extends io.grpc.stub.AbstractFutureStub<RequestableResourceEntitlementsFutureStub> {
    private RequestableResourceEntitlementsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RequestableResourceEntitlementsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RequestableResourceEntitlementsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RequestableResourceEntitlement records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListResponse> list(
        com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListRequest request) {
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
    private final RequestableResourceEntitlementsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RequestableResourceEntitlementsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.RequestableResourceEntitlementListResponse>) responseObserver);
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

  private static abstract class RequestableResourceEntitlementsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RequestableResourceEntitlementsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.RequestableResourceEntitlementsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RequestableResourceEntitlements");
    }
  }

  private static final class RequestableResourceEntitlementsFileDescriptorSupplier
      extends RequestableResourceEntitlementsBaseDescriptorSupplier {
    RequestableResourceEntitlementsFileDescriptorSupplier() {}
  }

  private static final class RequestableResourceEntitlementsMethodDescriptorSupplier
      extends RequestableResourceEntitlementsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RequestableResourceEntitlementsMethodDescriptorSupplier(String methodName) {
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
      synchronized (RequestableResourceEntitlementsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RequestableResourceEntitlementsFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
