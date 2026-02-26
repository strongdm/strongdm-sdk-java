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
 * GrantedAccountEntitlements enumerates the resources to which an account has been granted access.
 * The GrantedAccountEntitlements service is read-only.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: granted_account_entitlements.proto")
public final class GrantedAccountEntitlementsGrpc {

  private GrantedAccountEntitlementsGrpc() {}

  public static final String SERVICE_NAME = "v1.GrantedAccountEntitlements";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListRequest,
      com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListRequest.class,
      responseType = com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListRequest,
      com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListRequest, com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListResponse> getListMethod;
    if ((getListMethod = GrantedAccountEntitlementsGrpc.getListMethod) == null) {
      synchronized (GrantedAccountEntitlementsGrpc.class) {
        if ((getListMethod = GrantedAccountEntitlementsGrpc.getListMethod) == null) {
          GrantedAccountEntitlementsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListRequest, com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrantedAccountEntitlementsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrantedAccountEntitlementsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrantedAccountEntitlementsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrantedAccountEntitlementsStub>() {
        @java.lang.Override
        public GrantedAccountEntitlementsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrantedAccountEntitlementsStub(channel, callOptions);
        }
      };
    return GrantedAccountEntitlementsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrantedAccountEntitlementsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrantedAccountEntitlementsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrantedAccountEntitlementsBlockingStub>() {
        @java.lang.Override
        public GrantedAccountEntitlementsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrantedAccountEntitlementsBlockingStub(channel, callOptions);
        }
      };
    return GrantedAccountEntitlementsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrantedAccountEntitlementsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrantedAccountEntitlementsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrantedAccountEntitlementsFutureStub>() {
        @java.lang.Override
        public GrantedAccountEntitlementsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrantedAccountEntitlementsFutureStub(channel, callOptions);
        }
      };
    return GrantedAccountEntitlementsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * GrantedAccountEntitlements enumerates the resources to which an account has been granted access.
   * The GrantedAccountEntitlements service is read-only.
   * </pre>
   */
  public static abstract class GrantedAccountEntitlementsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of GrantedAccountEntitlement records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListRequest,
                com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * GrantedAccountEntitlements enumerates the resources to which an account has been granted access.
   * The GrantedAccountEntitlements service is read-only.
   * </pre>
   */
  public static final class GrantedAccountEntitlementsStub extends io.grpc.stub.AbstractAsyncStub<GrantedAccountEntitlementsStub> {
    private GrantedAccountEntitlementsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrantedAccountEntitlementsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrantedAccountEntitlementsStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of GrantedAccountEntitlement records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * GrantedAccountEntitlements enumerates the resources to which an account has been granted access.
   * The GrantedAccountEntitlements service is read-only.
   * </pre>
   */
  public static final class GrantedAccountEntitlementsBlockingStub extends io.grpc.stub.AbstractBlockingStub<GrantedAccountEntitlementsBlockingStub> {
    private GrantedAccountEntitlementsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrantedAccountEntitlementsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrantedAccountEntitlementsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of GrantedAccountEntitlement records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListResponse list(com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * GrantedAccountEntitlements enumerates the resources to which an account has been granted access.
   * The GrantedAccountEntitlements service is read-only.
   * </pre>
   */
  public static final class GrantedAccountEntitlementsFutureStub extends io.grpc.stub.AbstractFutureStub<GrantedAccountEntitlementsFutureStub> {
    private GrantedAccountEntitlementsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrantedAccountEntitlementsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrantedAccountEntitlementsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of GrantedAccountEntitlement records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListResponse> list(
        com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListRequest request) {
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
    private final GrantedAccountEntitlementsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrantedAccountEntitlementsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.GrantedAccountEntitlementListResponse>) responseObserver);
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

  private static abstract class GrantedAccountEntitlementsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrantedAccountEntitlementsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.GrantedAccountEntitlementsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrantedAccountEntitlements");
    }
  }

  private static final class GrantedAccountEntitlementsFileDescriptorSupplier
      extends GrantedAccountEntitlementsBaseDescriptorSupplier {
    GrantedAccountEntitlementsFileDescriptorSupplier() {}
  }

  private static final class GrantedAccountEntitlementsMethodDescriptorSupplier
      extends GrantedAccountEntitlementsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrantedAccountEntitlementsMethodDescriptorSupplier(String methodName) {
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
      synchronized (GrantedAccountEntitlementsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrantedAccountEntitlementsFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
