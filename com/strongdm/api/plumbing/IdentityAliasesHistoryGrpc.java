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
 * IdentityAliasesHistory records all changes to the state of a IdentityAlias.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: identity_aliases_history.proto")
public final class IdentityAliasesHistoryGrpc {

  private IdentityAliasesHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.IdentityAliasesHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListRequest,
      com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListRequest,
      com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListRequest, com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListResponse> getListMethod;
    if ((getListMethod = IdentityAliasesHistoryGrpc.getListMethod) == null) {
      synchronized (IdentityAliasesHistoryGrpc.class) {
        if ((getListMethod = IdentityAliasesHistoryGrpc.getListMethod) == null) {
          IdentityAliasesHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListRequest, com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityAliasesHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IdentityAliasesHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityAliasesHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityAliasesHistoryStub>() {
        @java.lang.Override
        public IdentityAliasesHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityAliasesHistoryStub(channel, callOptions);
        }
      };
    return IdentityAliasesHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IdentityAliasesHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityAliasesHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityAliasesHistoryBlockingStub>() {
        @java.lang.Override
        public IdentityAliasesHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityAliasesHistoryBlockingStub(channel, callOptions);
        }
      };
    return IdentityAliasesHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IdentityAliasesHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityAliasesHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityAliasesHistoryFutureStub>() {
        @java.lang.Override
        public IdentityAliasesHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityAliasesHistoryFutureStub(channel, callOptions);
        }
      };
    return IdentityAliasesHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * IdentityAliasesHistory records all changes to the state of a IdentityAlias.
   * </pre>
   */
  public static abstract class IdentityAliasesHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of IdentityAliasHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListRequest,
                com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * IdentityAliasesHistory records all changes to the state of a IdentityAlias.
   * </pre>
   */
  public static final class IdentityAliasesHistoryStub extends io.grpc.stub.AbstractAsyncStub<IdentityAliasesHistoryStub> {
    private IdentityAliasesHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityAliasesHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityAliasesHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of IdentityAliasHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * IdentityAliasesHistory records all changes to the state of a IdentityAlias.
   * </pre>
   */
  public static final class IdentityAliasesHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<IdentityAliasesHistoryBlockingStub> {
    private IdentityAliasesHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityAliasesHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityAliasesHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of IdentityAliasHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListResponse list(com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * IdentityAliasesHistory records all changes to the state of a IdentityAlias.
   * </pre>
   */
  public static final class IdentityAliasesHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<IdentityAliasesHistoryFutureStub> {
    private IdentityAliasesHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityAliasesHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityAliasesHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of IdentityAliasHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListResponse> list(
        com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListRequest request) {
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
    private final IdentityAliasesHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IdentityAliasesHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.IdentityAliasHistoryListResponse>) responseObserver);
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

  private static abstract class IdentityAliasesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IdentityAliasesHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.IdentityAliasesHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IdentityAliasesHistory");
    }
  }

  private static final class IdentityAliasesHistoryFileDescriptorSupplier
      extends IdentityAliasesHistoryBaseDescriptorSupplier {
    IdentityAliasesHistoryFileDescriptorSupplier() {}
  }

  private static final class IdentityAliasesHistoryMethodDescriptorSupplier
      extends IdentityAliasesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IdentityAliasesHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (IdentityAliasesHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IdentityAliasesHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
