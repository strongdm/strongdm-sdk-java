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
 * SecretStoresHistory records all changes to the state of a SecretStore.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: secret_stores_history.proto")
public final class SecretStoresHistoryGrpc {

  private SecretStoresHistoryGrpc() {}

  public static final String SERVICE_NAME = "v1.SecretStoresHistory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListRequest,
      com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListRequest.class,
      responseType = com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListRequest,
      com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListRequest, com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListResponse> getListMethod;
    if ((getListMethod = SecretStoresHistoryGrpc.getListMethod) == null) {
      synchronized (SecretStoresHistoryGrpc.class) {
        if ((getListMethod = SecretStoresHistoryGrpc.getListMethod) == null) {
          SecretStoresHistoryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListRequest, com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretStoresHistoryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecretStoresHistoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretStoresHistoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretStoresHistoryStub>() {
        @java.lang.Override
        public SecretStoresHistoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretStoresHistoryStub(channel, callOptions);
        }
      };
    return SecretStoresHistoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecretStoresHistoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretStoresHistoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretStoresHistoryBlockingStub>() {
        @java.lang.Override
        public SecretStoresHistoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretStoresHistoryBlockingStub(channel, callOptions);
        }
      };
    return SecretStoresHistoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecretStoresHistoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretStoresHistoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretStoresHistoryFutureStub>() {
        @java.lang.Override
        public SecretStoresHistoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretStoresHistoryFutureStub(channel, callOptions);
        }
      };
    return SecretStoresHistoryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SecretStoresHistory records all changes to the state of a SecretStore.
   * </pre>
   */
  public static abstract class SecretStoresHistoryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of SecretStoreHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListRequest,
                com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * SecretStoresHistory records all changes to the state of a SecretStore.
   * </pre>
   */
  public static final class SecretStoresHistoryStub extends io.grpc.stub.AbstractAsyncStub<SecretStoresHistoryStub> {
    private SecretStoresHistoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretStoresHistoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretStoresHistoryStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of SecretStoreHistory records matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SecretStoresHistory records all changes to the state of a SecretStore.
   * </pre>
   */
  public static final class SecretStoresHistoryBlockingStub extends io.grpc.stub.AbstractBlockingStub<SecretStoresHistoryBlockingStub> {
    private SecretStoresHistoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretStoresHistoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretStoresHistoryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of SecretStoreHistory records matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListResponse list(com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SecretStoresHistory records all changes to the state of a SecretStore.
   * </pre>
   */
  public static final class SecretStoresHistoryFutureStub extends io.grpc.stub.AbstractFutureStub<SecretStoresHistoryFutureStub> {
    private SecretStoresHistoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretStoresHistoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretStoresHistoryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of SecretStoreHistory records matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListResponse> list(
        com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListRequest request) {
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
    private final SecretStoresHistoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecretStoresHistoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.SecretStoreHistoryListResponse>) responseObserver);
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

  private static abstract class SecretStoresHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecretStoresHistoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.SecretStoresHistoryPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecretStoresHistory");
    }
  }

  private static final class SecretStoresHistoryFileDescriptorSupplier
      extends SecretStoresHistoryBaseDescriptorSupplier {
    SecretStoresHistoryFileDescriptorSupplier() {}
  }

  private static final class SecretStoresHistoryMethodDescriptorSupplier
      extends SecretStoresHistoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecretStoresHistoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (SecretStoresHistoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecretStoresHistoryFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
