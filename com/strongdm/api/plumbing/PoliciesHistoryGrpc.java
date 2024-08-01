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
 * PoliciesHistory records all changes to the state of a Policy.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: policies_history.proto")
public final class PoliciesHistoryGrpc {

  private PoliciesHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.PoliciesHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListRequest,
      com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListRequest,
      com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListRequest, com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListResponse> getListMethod;
    if ((getListMethod = PoliciesHistoryGrpc.getListMethod) == null) {
      synchronized (PoliciesHistoryGrpc.class) {
        if ((getListMethod = PoliciesHistoryGrpc.getListMethod) == null) {
          PoliciesHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListRequest, com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PoliciesHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PoliciesHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PoliciesHistoryStub>() {
        @java.lang.Override
        public PoliciesHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PoliciesHistoryStub(channel, callOptions);
        }
      };
    return PoliciesHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PoliciesHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PoliciesHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PoliciesHistoryBlockingStub>() {
        @java.lang.Override
        public PoliciesHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PoliciesHistoryBlockingStub(channel, callOptions);
        }
      };
    return PoliciesHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PoliciesHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PoliciesHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PoliciesHistoryFutureStub>() {
        @java.lang.Override
        public PoliciesHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PoliciesHistoryFutureStub(channel, callOptions);
        }
      };
    return PoliciesHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * PoliciesHistory records all changes to the state of a Policy.
   * </pre>
   */
  public static abstract class PoliciesHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of PolicyHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListRequest,
                com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * PoliciesHistory records all changes to the state of a Policy.
   * </pre>
   */
  public static final class PoliciesHistoryStub extends io.grpc.stub.AbstractAsyncStub<PoliciesHistoryStub> {
    private PoliciesHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoliciesHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PoliciesHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of PolicyHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * PoliciesHistory records all changes to the state of a Policy.
   * </pre>
   */
  public static final class PoliciesHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<PoliciesHistoryBlockingStub> {
    private PoliciesHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoliciesHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PoliciesHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of PolicyHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListResponse list(com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * PoliciesHistory records all changes to the state of a Policy.
   * </pre>
   */
  public static final class PoliciesHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<PoliciesHistoryFutureStub> {
    private PoliciesHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoliciesHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PoliciesHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of PolicyHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListResponse> list(
        com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListRequest request) {
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
    private final PoliciesHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PoliciesHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.PoliciesHistoryPlumbing.PoliciesHistoryListResponse>) responseObserver);
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

  private static abstract class PoliciesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PoliciesHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.PoliciesHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PoliciesHistory");
    }
  }

  private static final class PoliciesHistoryFileDescriptorSupplier
      extends PoliciesHistoryBaseDescriptorSupplier {
    PoliciesHistoryFileDescriptorSupplier() {}
  }

  private static final class PoliciesHistoryMethodDescriptorSupplier
      extends PoliciesHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PoliciesHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (PoliciesHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PoliciesHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
