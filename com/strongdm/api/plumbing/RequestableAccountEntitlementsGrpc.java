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
 * RequestableAccountEntitlements enumerates the resources that an account is permitted to request access to.
 * The RequestableAccountEntitlements service is read-only.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: requestable_account_entitlements.proto")
public final class RequestableAccountEntitlementsGrpc {

  private RequestableAccountEntitlementsGrpc() {}

  public static final String SERVICE_NAME = "v1.RequestableAccountEntitlements";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListRequest,
      com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListRequest.class,
      responseType = com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListRequest,
      com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListRequest, com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListResponse> getListMethod;
    if ((getListMethod = RequestableAccountEntitlementsGrpc.getListMethod) == null) {
      synchronized (RequestableAccountEntitlementsGrpc.class) {
        if ((getListMethod = RequestableAccountEntitlementsGrpc.getListMethod) == null) {
          RequestableAccountEntitlementsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListRequest, com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RequestableAccountEntitlementsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RequestableAccountEntitlementsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RequestableAccountEntitlementsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RequestableAccountEntitlementsStub>() {
        @java.lang.Override
        public RequestableAccountEntitlementsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RequestableAccountEntitlementsStub(channel, callOptions);
        }
      };
    return RequestableAccountEntitlementsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RequestableAccountEntitlementsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RequestableAccountEntitlementsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RequestableAccountEntitlementsBlockingStub>() {
        @java.lang.Override
        public RequestableAccountEntitlementsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RequestableAccountEntitlementsBlockingStub(channel, callOptions);
        }
      };
    return RequestableAccountEntitlementsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RequestableAccountEntitlementsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RequestableAccountEntitlementsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RequestableAccountEntitlementsFutureStub>() {
        @java.lang.Override
        public RequestableAccountEntitlementsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RequestableAccountEntitlementsFutureStub(channel, callOptions);
        }
      };
    return RequestableAccountEntitlementsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RequestableAccountEntitlements enumerates the resources that an account is permitted to request access to.
   * The RequestableAccountEntitlements service is read-only.
   * </pre>
   */
  public static abstract class RequestableAccountEntitlementsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of RequestableAccountEntitlement records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListRequest,
                com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * RequestableAccountEntitlements enumerates the resources that an account is permitted to request access to.
   * The RequestableAccountEntitlements service is read-only.
   * </pre>
   */
  public static final class RequestableAccountEntitlementsStub extends io.grpc.stub.AbstractAsyncStub<RequestableAccountEntitlementsStub> {
    private RequestableAccountEntitlementsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RequestableAccountEntitlementsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RequestableAccountEntitlementsStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RequestableAccountEntitlement records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RequestableAccountEntitlements enumerates the resources that an account is permitted to request access to.
   * The RequestableAccountEntitlements service is read-only.
   * </pre>
   */
  public static final class RequestableAccountEntitlementsBlockingStub extends io.grpc.stub.AbstractBlockingStub<RequestableAccountEntitlementsBlockingStub> {
    private RequestableAccountEntitlementsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RequestableAccountEntitlementsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RequestableAccountEntitlementsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RequestableAccountEntitlement records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListResponse list(com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RequestableAccountEntitlements enumerates the resources that an account is permitted to request access to.
   * The RequestableAccountEntitlements service is read-only.
   * </pre>
   */
  public static final class RequestableAccountEntitlementsFutureStub extends io.grpc.stub.AbstractFutureStub<RequestableAccountEntitlementsFutureStub> {
    private RequestableAccountEntitlementsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RequestableAccountEntitlementsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RequestableAccountEntitlementsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RequestableAccountEntitlement records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListResponse> list(
        com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListRequest request) {
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
    private final RequestableAccountEntitlementsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RequestableAccountEntitlementsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.RequestableAccountEntitlementListResponse>) responseObserver);
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

  private static abstract class RequestableAccountEntitlementsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RequestableAccountEntitlementsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.RequestableAccountEntitlementsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RequestableAccountEntitlements");
    }
  }

  private static final class RequestableAccountEntitlementsFileDescriptorSupplier
      extends RequestableAccountEntitlementsBaseDescriptorSupplier {
    RequestableAccountEntitlementsFileDescriptorSupplier() {}
  }

  private static final class RequestableAccountEntitlementsMethodDescriptorSupplier
      extends RequestableAccountEntitlementsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RequestableAccountEntitlementsMethodDescriptorSupplier(String methodName) {
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
      synchronized (RequestableAccountEntitlementsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RequestableAccountEntitlementsFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
