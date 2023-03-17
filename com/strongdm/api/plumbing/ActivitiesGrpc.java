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
 * An Activity is a record of an action taken against a strongDM deployment, e.g.
 * a user creation, resource deletion, sso configuration change, etc. The Activities
 * service is read-only.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: activities.proto")
public final class ActivitiesGrpc {

  private ActivitiesGrpc() {}

  public static final String SERVICE_NAME = "v1.Activities";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetRequest,
      com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetRequest.class,
      responseType = com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetRequest,
      com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetRequest, com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetResponse> getGetMethod;
    if ((getGetMethod = ActivitiesGrpc.getGetMethod) == null) {
      synchronized (ActivitiesGrpc.class) {
        if ((getGetMethod = ActivitiesGrpc.getGetMethod) == null) {
          ActivitiesGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetRequest, com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListRequest,
      com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListRequest.class,
      responseType = com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListRequest,
      com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListRequest, com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListResponse> getListMethod;
    if ((getListMethod = ActivitiesGrpc.getListMethod) == null) {
      synchronized (ActivitiesGrpc.class) {
        if ((getListMethod = ActivitiesGrpc.getListMethod) == null) {
          ActivitiesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListRequest, com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ActivitiesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ActivitiesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActivitiesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActivitiesStub>() {
        @java.lang.Override
        public ActivitiesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActivitiesStub(channel, callOptions);
        }
      };
    return ActivitiesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ActivitiesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActivitiesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActivitiesBlockingStub>() {
        @java.lang.Override
        public ActivitiesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActivitiesBlockingStub(channel, callOptions);
        }
      };
    return ActivitiesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ActivitiesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActivitiesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActivitiesFutureStub>() {
        @java.lang.Override
        public ActivitiesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActivitiesFutureStub(channel, callOptions);
        }
      };
    return ActivitiesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An Activity is a record of an action taken against a strongDM deployment, e.g.
   * a user creation, resource deletion, sso configuration change, etc. The Activities
   * service is read-only.
   * </pre>
   */
  public static abstract class ActivitiesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get reads one Activity by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Activities matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetRequest,
                com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListRequest,
                com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * An Activity is a record of an action taken against a strongDM deployment, e.g.
   * a user creation, resource deletion, sso configuration change, etc. The Activities
   * service is read-only.
   * </pre>
   */
  public static final class ActivitiesStub extends io.grpc.stub.AbstractAsyncStub<ActivitiesStub> {
    private ActivitiesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActivitiesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActivitiesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get reads one Activity by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of Activities matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * An Activity is a record of an action taken against a strongDM deployment, e.g.
   * a user creation, resource deletion, sso configuration change, etc. The Activities
   * service is read-only.
   * </pre>
   */
  public static final class ActivitiesBlockingStub extends io.grpc.stub.AbstractBlockingStub<ActivitiesBlockingStub> {
    private ActivitiesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActivitiesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActivitiesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get reads one Activity by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetResponse get(com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of Activities matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListResponse list(com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * An Activity is a record of an action taken against a strongDM deployment, e.g.
   * a user creation, resource deletion, sso configuration change, etc. The Activities
   * service is read-only.
   * </pre>
   */
  public static final class ActivitiesFutureStub extends io.grpc.stub.AbstractFutureStub<ActivitiesFutureStub> {
    private ActivitiesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActivitiesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActivitiesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get reads one Activity by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetResponse> get(
        com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of Activities matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListResponse> list(
        com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListRequest request) {
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
    private final ActivitiesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ActivitiesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityGetResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ActivitiesPlumbing.ActivityListResponse>) responseObserver);
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

  private static abstract class ActivitiesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ActivitiesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.ActivitiesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Activities");
    }
  }

  private static final class ActivitiesFileDescriptorSupplier
      extends ActivitiesBaseDescriptorSupplier {
    ActivitiesFileDescriptorSupplier() {}
  }

  private static final class ActivitiesMethodDescriptorSupplier
      extends ActivitiesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ActivitiesMethodDescriptorSupplier(String methodName) {
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
      synchronized (ActivitiesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ActivitiesFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
