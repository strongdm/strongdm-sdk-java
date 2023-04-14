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
 * A Query is a record of a single client request to a resource, such as a SQL query.
 * Long-running SSH, RDP, or Kubernetes interactive sessions also count as queries.
 * The Queries service is read-only.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: queries.proto")
public final class QueriesGrpc {

  private QueriesGrpc() {}

  public static final String SERVICE_NAME = "v1.Queries";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.QueriesPlumbing.QueryListRequest,
      com.strongdm.api.plumbing.QueriesPlumbing.QueryListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.QueriesPlumbing.QueryListRequest.class,
      responseType = com.strongdm.api.plumbing.QueriesPlumbing.QueryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.QueriesPlumbing.QueryListRequest,
      com.strongdm.api.plumbing.QueriesPlumbing.QueryListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.QueriesPlumbing.QueryListRequest, com.strongdm.api.plumbing.QueriesPlumbing.QueryListResponse> getListMethod;
    if ((getListMethod = QueriesGrpc.getListMethod) == null) {
      synchronized (QueriesGrpc.class) {
        if ((getListMethod = QueriesGrpc.getListMethod) == null) {
          QueriesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.QueriesPlumbing.QueryListRequest, com.strongdm.api.plumbing.QueriesPlumbing.QueryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.QueriesPlumbing.QueryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.QueriesPlumbing.QueryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueriesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueriesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueriesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueriesStub>() {
        @java.lang.Override
        public QueriesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueriesStub(channel, callOptions);
        }
      };
    return QueriesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueriesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueriesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueriesBlockingStub>() {
        @java.lang.Override
        public QueriesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueriesBlockingStub(channel, callOptions);
        }
      };
    return QueriesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueriesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueriesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueriesFutureStub>() {
        @java.lang.Override
        public QueriesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueriesFutureStub(channel, callOptions);
        }
      };
    return QueriesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A Query is a record of a single client request to a resource, such as a SQL query.
   * Long-running SSH, RDP, or Kubernetes interactive sessions also count as queries.
   * The Queries service is read-only.
   * </pre>
   */
  public static abstract class QueriesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List gets a list of Queries matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.QueriesPlumbing.QueryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.QueriesPlumbing.QueryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.QueriesPlumbing.QueryListRequest,
                com.strongdm.api.plumbing.QueriesPlumbing.QueryListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * A Query is a record of a single client request to a resource, such as a SQL query.
   * Long-running SSH, RDP, or Kubernetes interactive sessions also count as queries.
   * The Queries service is read-only.
   * </pre>
   */
  public static final class QueriesStub extends io.grpc.stub.AbstractAsyncStub<QueriesStub> {
    private QueriesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueriesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueriesStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of Queries matching a given set of criteria.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.QueriesPlumbing.QueryListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.QueriesPlumbing.QueryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A Query is a record of a single client request to a resource, such as a SQL query.
   * Long-running SSH, RDP, or Kubernetes interactive sessions also count as queries.
   * The Queries service is read-only.
   * </pre>
   */
  public static final class QueriesBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueriesBlockingStub> {
    private QueriesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueriesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueriesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of Queries matching a given set of criteria.
     * </pre>
     */
    public com.strongdm.api.plumbing.QueriesPlumbing.QueryListResponse list(com.strongdm.api.plumbing.QueriesPlumbing.QueryListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A Query is a record of a single client request to a resource, such as a SQL query.
   * Long-running SSH, RDP, or Kubernetes interactive sessions also count as queries.
   * The Queries service is read-only.
   * </pre>
   */
  public static final class QueriesFutureStub extends io.grpc.stub.AbstractFutureStub<QueriesFutureStub> {
    private QueriesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueriesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueriesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List gets a list of Queries matching a given set of criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.QueriesPlumbing.QueryListResponse> list(
        com.strongdm.api.plumbing.QueriesPlumbing.QueryListRequest request) {
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
    private final QueriesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueriesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.QueriesPlumbing.QueryListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.QueriesPlumbing.QueryListResponse>) responseObserver);
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

  private static abstract class QueriesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueriesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.QueriesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Queries");
    }
  }

  private static final class QueriesFileDescriptorSupplier
      extends QueriesBaseDescriptorSupplier {
    QueriesFileDescriptorSupplier() {}
  }

  private static final class QueriesMethodDescriptorSupplier
      extends QueriesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueriesMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueriesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueriesFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
