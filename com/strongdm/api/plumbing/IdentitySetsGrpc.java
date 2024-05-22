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
 * A IdentitySet is a named grouping of Identity Aliases for Accounts.
 * An Account's relationship to a IdentitySet is defined via IdentityAlias objects.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: identity_sets.proto")
public final class IdentitySetsGrpc {

  private IdentitySetsGrpc() {}

  public static final String SERVICE_NAME = "v1.IdentitySets";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetRequest,
      com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetRequest.class,
      responseType = com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetRequest,
      com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetRequest, com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetResponse> getGetMethod;
    if ((getGetMethod = IdentitySetsGrpc.getGetMethod) == null) {
      synchronized (IdentitySetsGrpc.class) {
        if ((getGetMethod = IdentitySetsGrpc.getGetMethod) == null) {
          IdentitySetsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetRequest, com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentitySetsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListRequest,
      com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListRequest.class,
      responseType = com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListRequest,
      com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListRequest, com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListResponse> getListMethod;
    if ((getListMethod = IdentitySetsGrpc.getListMethod) == null) {
      synchronized (IdentitySetsGrpc.class) {
        if ((getListMethod = IdentitySetsGrpc.getListMethod) == null) {
          IdentitySetsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListRequest, com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentitySetsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IdentitySetsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentitySetsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentitySetsStub>() {
        @java.lang.Override
        public IdentitySetsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentitySetsStub(channel, callOptions);
        }
      };
    return IdentitySetsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IdentitySetsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentitySetsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentitySetsBlockingStub>() {
        @java.lang.Override
        public IdentitySetsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentitySetsBlockingStub(channel, callOptions);
        }
      };
    return IdentitySetsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IdentitySetsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentitySetsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentitySetsFutureStub>() {
        @java.lang.Override
        public IdentitySetsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentitySetsFutureStub(channel, callOptions);
        }
      };
    return IdentitySetsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A IdentitySet is a named grouping of Identity Aliases for Accounts.
   * An Account's relationship to a IdentitySet is defined via IdentityAlias objects.
   * </pre>
   */
  public static abstract class IdentitySetsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get reads one IdentitySet by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gets a list of IdentitySets matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetRequest,
                com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListRequest,
                com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A IdentitySet is a named grouping of Identity Aliases for Accounts.
   * An Account's relationship to a IdentitySet is defined via IdentityAlias objects.
   * </pre>
   */
  public static final class IdentitySetsStub extends io.grpc.stub.AbstractAsyncStub<IdentitySetsStub> {
    private IdentitySetsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentitySetsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentitySetsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get reads one IdentitySet by ID.
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gets a list of IdentitySets matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A IdentitySet is a named grouping of Identity Aliases for Accounts.
   * An Account's relationship to a IdentitySet is defined via IdentityAlias objects.
   * </pre>
   */
  public static final class IdentitySetsBlockingStub extends io.grpc.stub.AbstractBlockingStub<IdentitySetsBlockingStub> {
    private IdentitySetsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentitySetsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentitySetsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get reads one IdentitySet by ID.
     * </pre>
     */
    public com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetResponse get(com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gets a list of IdentitySets matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListResponse list(com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A IdentitySet is a named grouping of Identity Aliases for Accounts.
   * An Account's relationship to a IdentitySet is defined via IdentityAlias objects.
   * </pre>
   */
  public static final class IdentitySetsFutureStub extends io.grpc.stub.AbstractFutureStub<IdentitySetsFutureStub> {
    private IdentitySetsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentitySetsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentitySetsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get reads one IdentitySet by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetResponse> get(
        com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gets a list of IdentitySets matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListResponse> list(
        com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListRequest request) {
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
    private final IdentitySetsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IdentitySetsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetGetResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentitySetsPlumbing.IdentitySetListResponse>) responseObserver);
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

  private static abstract class IdentitySetsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IdentitySetsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.IdentitySetsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IdentitySets");
    }
  }

  private static final class IdentitySetsFileDescriptorSupplier
      extends IdentitySetsBaseDescriptorSupplier {
    IdentitySetsFileDescriptorSupplier() {}
  }

  private static final class IdentitySetsMethodDescriptorSupplier
      extends IdentitySetsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IdentitySetsMethodDescriptorSupplier(String methodName) {
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
      synchronized (IdentitySetsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IdentitySetsFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
