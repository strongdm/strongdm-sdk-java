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
 * A RemoteIdentityGroup is a named grouping of Remote Identities for Accounts.
 * An Account's relationship to a RemoteIdentityGroup is defined via RemoteIdentity objects.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: remote_identity_groups.proto")
public final class RemoteIdentityGroupsGrpc {

  private RemoteIdentityGroupsGrpc() {}

  public static final String SERVICE_NAME = "v1.RemoteIdentityGroups";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetRequest,
      com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetRequest.class,
      responseType = com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetRequest,
      com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetRequest, com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetResponse> getGetMethod;
    if ((getGetMethod = RemoteIdentityGroupsGrpc.getGetMethod) == null) {
      synchronized (RemoteIdentityGroupsGrpc.class) {
        if ((getGetMethod = RemoteIdentityGroupsGrpc.getGetMethod) == null) {
          RemoteIdentityGroupsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetRequest, com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteIdentityGroupsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListRequest,
      com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListRequest.class,
      responseType = com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListRequest,
      com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListRequest, com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListResponse> getListMethod;
    if ((getListMethod = RemoteIdentityGroupsGrpc.getListMethod) == null) {
      synchronized (RemoteIdentityGroupsGrpc.class) {
        if ((getListMethod = RemoteIdentityGroupsGrpc.getListMethod) == null) {
          RemoteIdentityGroupsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListRequest, com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteIdentityGroupsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RemoteIdentityGroupsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteIdentityGroupsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteIdentityGroupsStub>() {
        @java.lang.Override
        public RemoteIdentityGroupsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteIdentityGroupsStub(channel, callOptions);
        }
      };
    return RemoteIdentityGroupsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RemoteIdentityGroupsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteIdentityGroupsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteIdentityGroupsBlockingStub>() {
        @java.lang.Override
        public RemoteIdentityGroupsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteIdentityGroupsBlockingStub(channel, callOptions);
        }
      };
    return RemoteIdentityGroupsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RemoteIdentityGroupsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteIdentityGroupsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteIdentityGroupsFutureStub>() {
        @java.lang.Override
        public RemoteIdentityGroupsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteIdentityGroupsFutureStub(channel, callOptions);
        }
      };
    return RemoteIdentityGroupsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A RemoteIdentityGroup is a named grouping of Remote Identities for Accounts.
   * An Account's relationship to a RemoteIdentityGroup is defined via RemoteIdentity objects.
   * </pre>
   */
  public static abstract class RemoteIdentityGroupsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get reads one RemoteIdentityGroup by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentityGroups matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetRequest,
                com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListRequest,
                com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A RemoteIdentityGroup is a named grouping of Remote Identities for Accounts.
   * An Account's relationship to a RemoteIdentityGroup is defined via RemoteIdentity objects.
   * </pre>
   */
  public static final class RemoteIdentityGroupsStub extends io.grpc.stub.AbstractAsyncStub<RemoteIdentityGroupsStub> {
    private RemoteIdentityGroupsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteIdentityGroupsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteIdentityGroupsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get reads one RemoteIdentityGroup by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentityGroups matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A RemoteIdentityGroup is a named grouping of Remote Identities for Accounts.
   * An Account's relationship to a RemoteIdentityGroup is defined via RemoteIdentity objects.
   * </pre>
   */
  public static final class RemoteIdentityGroupsBlockingStub extends io.grpc.stub.AbstractBlockingStub<RemoteIdentityGroupsBlockingStub> {
    private RemoteIdentityGroupsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteIdentityGroupsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteIdentityGroupsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get reads one RemoteIdentityGroup by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetResponse get(com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentityGroups matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListResponse list(com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A RemoteIdentityGroup is a named grouping of Remote Identities for Accounts.
   * An Account's relationship to a RemoteIdentityGroup is defined via RemoteIdentity objects.
   * </pre>
   */
  public static final class RemoteIdentityGroupsFutureStub extends io.grpc.stub.AbstractFutureStub<RemoteIdentityGroupsFutureStub> {
    private RemoteIdentityGroupsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteIdentityGroupsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteIdentityGroupsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get reads one RemoteIdentityGroup by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetResponse> get(
        com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of RemoteIdentityGroups matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListResponse> list(
        com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RemoteIdentityGroupsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RemoteIdentityGroupsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupGetResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.RemoteIdentityGroupListResponse>) responseObserver);
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

  private static abstract class RemoteIdentityGroupsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RemoteIdentityGroupsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.RemoteIdentityGroupsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RemoteIdentityGroups");
    }
  }

  private static final class RemoteIdentityGroupsFileDescriptorSupplier
      extends RemoteIdentityGroupsBaseDescriptorSupplier {
    RemoteIdentityGroupsFileDescriptorSupplier() {}
  }

  private static final class RemoteIdentityGroupsMethodDescriptorSupplier
      extends RemoteIdentityGroupsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RemoteIdentityGroupsMethodDescriptorSupplier(String methodName) {
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
      synchronized (RemoteIdentityGroupsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RemoteIdentityGroupsFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
