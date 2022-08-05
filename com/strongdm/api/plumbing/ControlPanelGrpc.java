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
 * ControlPanel contains all administrative controls.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: control_panel.proto")
public final class ControlPanelGrpc {

  private ControlPanelGrpc() {}

  public static final String SERVICE_NAME = "v1.ControlPanel";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyRequest,
      com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyResponse> getGetSSHCAPublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSSHCAPublicKey",
      requestType = com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyRequest.class,
      responseType = com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyRequest,
      com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyResponse> getGetSSHCAPublicKeyMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyRequest, com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyResponse> getGetSSHCAPublicKeyMethod;
    if ((getGetSSHCAPublicKeyMethod = ControlPanelGrpc.getGetSSHCAPublicKeyMethod) == null) {
      synchronized (ControlPanelGrpc.class) {
        if ((getGetSSHCAPublicKeyMethod = ControlPanelGrpc.getGetSSHCAPublicKeyMethod) == null) {
          ControlPanelGrpc.getGetSSHCAPublicKeyMethod = getGetSSHCAPublicKeyMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyRequest, com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSSHCAPublicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ControlPanelMethodDescriptorSupplier("GetSSHCAPublicKey"))
              .build();
        }
      }
    }
    return getGetSSHCAPublicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTRequest,
      com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTResponse> getVerifyJWTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyJWT",
      requestType = com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTRequest.class,
      responseType = com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTRequest,
      com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTResponse> getVerifyJWTMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTRequest, com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTResponse> getVerifyJWTMethod;
    if ((getVerifyJWTMethod = ControlPanelGrpc.getVerifyJWTMethod) == null) {
      synchronized (ControlPanelGrpc.class) {
        if ((getVerifyJWTMethod = ControlPanelGrpc.getVerifyJWTMethod) == null) {
          ControlPanelGrpc.getVerifyJWTMethod = getVerifyJWTMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTRequest, com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyJWT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ControlPanelMethodDescriptorSupplier("VerifyJWT"))
              .build();
        }
      }
    }
    return getVerifyJWTMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ControlPanelStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ControlPanelStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ControlPanelStub>() {
        @java.lang.Override
        public ControlPanelStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ControlPanelStub(channel, callOptions);
        }
      };
    return ControlPanelStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ControlPanelBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ControlPanelBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ControlPanelBlockingStub>() {
        @java.lang.Override
        public ControlPanelBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ControlPanelBlockingStub(channel, callOptions);
        }
      };
    return ControlPanelBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ControlPanelFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ControlPanelFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ControlPanelFutureStub>() {
        @java.lang.Override
        public ControlPanelFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ControlPanelFutureStub(channel, callOptions);
        }
      };
    return ControlPanelFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ControlPanel contains all administrative controls.
   * </pre>
   */
  public static abstract class ControlPanelImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetSSHCAPublicKey retrieves the SSH CA public key.
     * </pre>
     */
    public void getSSHCAPublicKey(com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSSHCAPublicKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * VerifyJWT reports whether the given JWT token (x-sdm-token) is valid.
     * </pre>
     */
    public void verifyJWT(com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyJWTMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSSHCAPublicKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyRequest,
                com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyResponse>(
                  this, METHODID_GET_SSHCAPUBLIC_KEY)))
          .addMethod(
            getVerifyJWTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTRequest,
                com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTResponse>(
                  this, METHODID_VERIFY_JWT)))
          .build();
    }
  }

  /**
   * <pre>
   * ControlPanel contains all administrative controls.
   * </pre>
   */
  public static final class ControlPanelStub extends io.grpc.stub.AbstractAsyncStub<ControlPanelStub> {
    private ControlPanelStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControlPanelStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ControlPanelStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSSHCAPublicKey retrieves the SSH CA public key.
     * </pre>
     */
    public void getSSHCAPublicKey(com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSSHCAPublicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VerifyJWT reports whether the given JWT token (x-sdm-token) is valid.
     * </pre>
     */
    public void verifyJWT(com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyJWTMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ControlPanel contains all administrative controls.
   * </pre>
   */
  public static final class ControlPanelBlockingStub extends io.grpc.stub.AbstractBlockingStub<ControlPanelBlockingStub> {
    private ControlPanelBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControlPanelBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ControlPanelBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSSHCAPublicKey retrieves the SSH CA public key.
     * </pre>
     */
    public com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyResponse getSSHCAPublicKey(com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSSHCAPublicKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VerifyJWT reports whether the given JWT token (x-sdm-token) is valid.
     * </pre>
     */
    public com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTResponse verifyJWT(com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerifyJWTMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ControlPanel contains all administrative controls.
   * </pre>
   */
  public static final class ControlPanelFutureStub extends io.grpc.stub.AbstractFutureStub<ControlPanelFutureStub> {
    private ControlPanelFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControlPanelFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ControlPanelFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSSHCAPublicKey retrieves the SSH CA public key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyResponse> getSSHCAPublicKey(
        com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSSHCAPublicKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VerifyJWT reports whether the given JWT token (x-sdm-token) is valid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTResponse> verifyJWT(
        com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyJWTMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SSHCAPUBLIC_KEY = 0;
  private static final int METHODID_VERIFY_JWT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ControlPanelImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ControlPanelImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SSHCAPUBLIC_KEY:
          serviceImpl.getSSHCAPublicKey((com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelGetSSHCAPublicKeyResponse>) responseObserver);
          break;
        case METHODID_VERIFY_JWT:
          serviceImpl.verifyJWT((com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ControlPanelPlumbing.ControlPanelVerifyJWTResponse>) responseObserver);
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

  private static abstract class ControlPanelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ControlPanelBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.ControlPanelPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ControlPanel");
    }
  }

  private static final class ControlPanelFileDescriptorSupplier
      extends ControlPanelBaseDescriptorSupplier {
    ControlPanelFileDescriptorSupplier() {}
  }

  private static final class ControlPanelMethodDescriptorSupplier
      extends ControlPanelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ControlPanelMethodDescriptorSupplier(String methodName) {
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
      synchronized (ControlPanelGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ControlPanelFileDescriptorSupplier())
              .addMethod(getGetSSHCAPublicKeyMethod())
              .addMethod(getVerifyJWTMethod())
              .build();
        }
      }
    }
    return result;
  }
}
