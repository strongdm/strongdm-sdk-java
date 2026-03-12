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
 * RequestableRoleEntitlements enumerates the resources that a role permits its members to request access to.
 * The RequestableRoleEntitlements service is read-only.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: requestable_role_entitlements.proto")
public final class RequestableRoleEntitlementsGrpc {

  private RequestableRoleEntitlementsGrpc() {}

  public static final String SERVICE_NAME = "v1.RequestableRoleEntitlements";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListRequest,
      com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListRequest.class,
      responseType = com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListRequest,
      com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListRequest, com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListResponse> getListMethod;
    if ((getListMethod = RequestableRoleEntitlementsGrpc.getListMethod) == null) {
      synchronized (RequestableRoleEntitlementsGrpc.class) {
        if ((getListMethod = RequestableRoleEntitlementsGrpc.getListMethod) == null) {
          RequestableRoleEntitlementsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListRequest, com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RequestableRoleEntitlementsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RequestableRoleEntitlementsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RequestableRoleEntitlementsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RequestableRoleEntitlementsStub>() {
        @java.lang.Override
        public RequestableRoleEntitlementsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RequestableRoleEntitlementsStub(channel, callOptions);
        }
      };
    return RequestableRoleEntitlementsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RequestableRoleEntitlementsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RequestableRoleEntitlementsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RequestableRoleEntitlementsBlockingStub>() {
        @java.lang.Override
        public RequestableRoleEntitlementsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RequestableRoleEntitlementsBlockingStub(channel, callOptions);
        }
      };
    return RequestableRoleEntitlementsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RequestableRoleEntitlementsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RequestableRoleEntitlementsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RequestableRoleEntitlementsFutureStub>() {
        @java.lang.Override
        public RequestableRoleEntitlementsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RequestableRoleEntitlementsFutureStub(channel, callOptions);
        }
      };
    return RequestableRoleEntitlementsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RequestableRoleEntitlements enumerates the resources that a role permits its members to request access to.
   * The RequestableRoleEntitlements service is read-only.
   * </pre>
   */
  public static abstract class RequestableRoleEntitlementsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of RequestableRoleEntitlement records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListRequest,
                com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * RequestableRoleEntitlements enumerates the resources that a role permits its members to request access to.
   * The RequestableRoleEntitlements service is read-only.
   * </pre>
   */
  public static final class RequestableRoleEntitlementsStub extends io.grpc.stub.AbstractAsyncStub<RequestableRoleEntitlementsStub> {
    private RequestableRoleEntitlementsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RequestableRoleEntitlementsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RequestableRoleEntitlementsStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RequestableRoleEntitlement records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RequestableRoleEntitlements enumerates the resources that a role permits its members to request access to.
   * The RequestableRoleEntitlements service is read-only.
   * </pre>
   */
  public static final class RequestableRoleEntitlementsBlockingStub extends io.grpc.stub.AbstractBlockingStub<RequestableRoleEntitlementsBlockingStub> {
    private RequestableRoleEntitlementsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RequestableRoleEntitlementsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RequestableRoleEntitlementsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RequestableRoleEntitlement records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListResponse list(com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RequestableRoleEntitlements enumerates the resources that a role permits its members to request access to.
   * The RequestableRoleEntitlements service is read-only.
   * </pre>
   */
  public static final class RequestableRoleEntitlementsFutureStub extends io.grpc.stub.AbstractFutureStub<RequestableRoleEntitlementsFutureStub> {
    private RequestableRoleEntitlementsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RequestableRoleEntitlementsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RequestableRoleEntitlementsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of RequestableRoleEntitlement records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListResponse> list(
        com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListRequest request) {
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
    private final RequestableRoleEntitlementsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RequestableRoleEntitlementsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.RequestableRoleEntitlementListResponse>) responseObserver);
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

  private static abstract class RequestableRoleEntitlementsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RequestableRoleEntitlementsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.RequestableRoleEntitlementsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RequestableRoleEntitlements");
    }
  }

  private static final class RequestableRoleEntitlementsFileDescriptorSupplier
      extends RequestableRoleEntitlementsBaseDescriptorSupplier {
    RequestableRoleEntitlementsFileDescriptorSupplier() {}
  }

  private static final class RequestableRoleEntitlementsMethodDescriptorSupplier
      extends RequestableRoleEntitlementsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RequestableRoleEntitlementsMethodDescriptorSupplier(String methodName) {
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
      synchronized (RequestableRoleEntitlementsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RequestableRoleEntitlementsFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
