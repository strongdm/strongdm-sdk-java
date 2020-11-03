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
package com.strongdm.api.v1.plumbing;

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
 * Audit exposes the endpoints to extract point-in-time snapshot of data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: audits.proto")
public final class AuditsGrpc {

  private AuditsGrpc() {}

  public static final String SERVICE_NAME = "v1.Audits";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesRequest,
      com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesResponse> getGetAccessRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccessRules",
      requestType = com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesRequest.class,
      responseType = com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesRequest,
      com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesResponse> getGetAccessRulesMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesRequest, com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesResponse> getGetAccessRulesMethod;
    if ((getGetAccessRulesMethod = AuditsGrpc.getGetAccessRulesMethod) == null) {
      synchronized (AuditsGrpc.class) {
        if ((getGetAccessRulesMethod = AuditsGrpc.getGetAccessRulesMethod) == null) {
          AuditsGrpc.getGetAccessRulesMethod = getGetAccessRulesMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesRequest, com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccessRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuditsMethodDescriptorSupplier("GetAccessRules"))
              .build();
        }
      }
    }
    return getGetAccessRulesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuditsStub newStub(io.grpc.Channel channel) {
    return new AuditsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuditsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuditsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuditsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuditsFutureStub(channel);
  }

  /**
   * <pre>
   * Audit exposes the endpoints to extract point-in-time snapshot of data.
   * </pre>
   */
  public static abstract class AuditsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetAccessRules gets a list of Access Rules at point-in-time.
     * </pre>
     */
    public void getAccessRules(com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccessRulesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccessRulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesRequest,
                com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesResponse>(
                  this, METHODID_GET_ACCESS_RULES)))
          .build();
    }
  }

  /**
   * <pre>
   * Audit exposes the endpoints to extract point-in-time snapshot of data.
   * </pre>
   */
  public static final class AuditsStub extends io.grpc.stub.AbstractStub<AuditsStub> {
    private AuditsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuditsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuditsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuditsStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetAccessRules gets a list of Access Rules at point-in-time.
     * </pre>
     */
    public void getAccessRules(com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccessRulesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Audit exposes the endpoints to extract point-in-time snapshot of data.
   * </pre>
   */
  public static final class AuditsBlockingStub extends io.grpc.stub.AbstractStub<AuditsBlockingStub> {
    private AuditsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuditsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuditsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuditsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetAccessRules gets a list of Access Rules at point-in-time.
     * </pre>
     */
    public com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesResponse getAccessRules(com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccessRulesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Audit exposes the endpoints to extract point-in-time snapshot of data.
   * </pre>
   */
  public static final class AuditsFutureStub extends io.grpc.stub.AbstractStub<AuditsFutureStub> {
    private AuditsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuditsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuditsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuditsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetAccessRules gets a list of Access Rules at point-in-time.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesResponse> getAccessRules(
        com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccessRulesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCESS_RULES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuditsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuditsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCESS_RULES:
          serviceImpl.getAccessRules((com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.v1.plumbing.AuditsPlumbing.GetAccessRulesResponse>) responseObserver);
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

  private static abstract class AuditsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuditsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.v1.plumbing.AuditsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Audits");
    }
  }

  private static final class AuditsFileDescriptorSupplier
      extends AuditsBaseDescriptorSupplier {
    AuditsFileDescriptorSupplier() {}
  }

  private static final class AuditsMethodDescriptorSupplier
      extends AuditsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuditsMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuditsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuditsFileDescriptorSupplier())
              .addMethod(getGetAccessRulesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
