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
 * Organizations exposes organization configuration. Most RPCs remain private to the
 * go_private SDK; public MFA management is exposed to all public SDK targets.
 * The terraform-provider target is opted out at the service level because the
 * provider's data-source generator assumes every service has a List RPC; MFA is
 * instead surfaced via a hand-written resource template.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: organizations.proto")
public final class OrganizationsGrpc {

  private OrganizationsGrpc() {}

  public static final String SERVICE_NAME = "v1.Organizations";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateRequest,
      com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateRequest.class,
      responseType = com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateRequest,
      com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateRequest, com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = OrganizationsGrpc.getUpdateMethod) == null) {
      synchronized (OrganizationsGrpc.class) {
        if ((getUpdateMethod = OrganizationsGrpc.getUpdateMethod) == null) {
          OrganizationsGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateRequest, com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetRequest,
      com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetRequest.class,
      responseType = com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetRequest,
      com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetRequest, com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetResponse> getGetMethod;
    if ((getGetMethod = OrganizationsGrpc.getGetMethod) == null) {
      synchronized (OrganizationsGrpc.class) {
        if ((getGetMethod = OrganizationsGrpc.getGetMethod) == null) {
          OrganizationsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetRequest, com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFARequest,
      com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFAResponse> getGetMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMFA",
      requestType = com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFARequest.class,
      responseType = com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFARequest,
      com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFAResponse> getGetMFAMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFARequest, com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFAResponse> getGetMFAMethod;
    if ((getGetMFAMethod = OrganizationsGrpc.getGetMFAMethod) == null) {
      synchronized (OrganizationsGrpc.class) {
        if ((getGetMFAMethod = OrganizationsGrpc.getGetMFAMethod) == null) {
          OrganizationsGrpc.getGetMFAMethod = getGetMFAMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFARequest, com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsMethodDescriptorSupplier("GetMFA"))
              .build();
        }
      }
    }
    return getGetMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFARequest,
      com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFAResponse> getUpdateMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMFA",
      requestType = com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFARequest.class,
      responseType = com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFARequest,
      com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFAResponse> getUpdateMFAMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFARequest, com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFAResponse> getUpdateMFAMethod;
    if ((getUpdateMFAMethod = OrganizationsGrpc.getUpdateMFAMethod) == null) {
      synchronized (OrganizationsGrpc.class) {
        if ((getUpdateMFAMethod = OrganizationsGrpc.getUpdateMFAMethod) == null) {
          OrganizationsGrpc.getUpdateMFAMethod = getUpdateMFAMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFARequest, com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsMethodDescriptorSupplier("UpdateMFA"))
              .build();
        }
      }
    }
    return getUpdateMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFARequest,
      com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFAResponse> getTestMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestMFA",
      requestType = com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFARequest.class,
      responseType = com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFARequest,
      com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFAResponse> getTestMFAMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFARequest, com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFAResponse> getTestMFAMethod;
    if ((getTestMFAMethod = OrganizationsGrpc.getTestMFAMethod) == null) {
      synchronized (OrganizationsGrpc.class) {
        if ((getTestMFAMethod = OrganizationsGrpc.getTestMFAMethod) == null) {
          OrganizationsGrpc.getTestMFAMethod = getTestMFAMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFARequest, com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsMethodDescriptorSupplier("TestMFA"))
              .build();
        }
      }
    }
    return getTestMFAMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrganizationsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationsStub>() {
        @java.lang.Override
        public OrganizationsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationsStub(channel, callOptions);
        }
      };
    return OrganizationsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrganizationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationsBlockingStub>() {
        @java.lang.Override
        public OrganizationsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationsBlockingStub(channel, callOptions);
        }
      };
    return OrganizationsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrganizationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationsFutureStub>() {
        @java.lang.Override
        public OrganizationsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationsFutureStub(channel, callOptions);
        }
      };
    return OrganizationsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Organizations exposes organization configuration. Most RPCs remain private to the
   * go_private SDK; public MFA management is exposed to all public SDK targets.
   * The terraform-provider target is opted out at the service level because the
   * provider's data-source generator assumes every service has a List RPC; MFA is
   * instead surfaced via a hand-written resource template.
   * </pre>
   */
  public static abstract class OrganizationsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Update updates an existing organization.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets an organization
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMFA gets the organization's MFA configuration.
     * </pre>
     */
    public void getMFA(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFARequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFAResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMFAMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateMFA updates the organization's MFA configuration.
     * </pre>
     */
    public void updateMFA(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFARequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFAResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMFAMethod(), responseObserver);
    }

    /**
     * <pre>
     * TestMFA validates MFA connectivity without persisting changes.
     * </pre>
     */
    public void testMFA(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFARequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFAResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTestMFAMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateRequest,
                com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetRequest,
                com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getGetMFAMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFARequest,
                com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFAResponse>(
                  this, METHODID_GET_MFA)))
          .addMethod(
            getUpdateMFAMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFARequest,
                com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFAResponse>(
                  this, METHODID_UPDATE_MFA)))
          .addMethod(
            getTestMFAMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFARequest,
                com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFAResponse>(
                  this, METHODID_TEST_MFA)))
          .build();
    }
  }

  /**
   * <pre>
   * Organizations exposes organization configuration. Most RPCs remain private to the
   * go_private SDK; public MFA management is exposed to all public SDK targets.
   * The terraform-provider target is opted out at the service level because the
   * provider's data-source generator assumes every service has a List RPC; MFA is
   * instead surfaced via a hand-written resource template.
   * </pre>
   */
  public static final class OrganizationsStub extends io.grpc.stub.AbstractAsyncStub<OrganizationsStub> {
    private OrganizationsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Update updates an existing organization.
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets an organization
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMFA gets the organization's MFA configuration.
     * </pre>
     */
    public void getMFA(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFARequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFAResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateMFA updates the organization's MFA configuration.
     * </pre>
     */
    public void updateMFA(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFARequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFAResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TestMFA validates MFA connectivity without persisting changes.
     * </pre>
     */
    public void testMFA(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFARequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFAResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestMFAMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Organizations exposes organization configuration. Most RPCs remain private to the
   * go_private SDK; public MFA management is exposed to all public SDK targets.
   * The terraform-provider target is opted out at the service level because the
   * provider's data-source generator assumes every service has a List RPC; MFA is
   * instead surfaced via a hand-written resource template.
   * </pre>
   */
  public static final class OrganizationsBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrganizationsBlockingStub> {
    private OrganizationsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Update updates an existing organization.
     * </pre>
     */
    public com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateResponse update(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets an organization
     * </pre>
     */
    public com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetResponse get(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMFA gets the organization's MFA configuration.
     * </pre>
     */
    public com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFAResponse getMFA(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFARequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMFAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateMFA updates the organization's MFA configuration.
     * </pre>
     */
    public com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFAResponse updateMFA(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFARequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMFAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TestMFA validates MFA connectivity without persisting changes.
     * </pre>
     */
    public com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFAResponse testMFA(com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFARequest request) {
      return blockingUnaryCall(
          getChannel(), getTestMFAMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Organizations exposes organization configuration. Most RPCs remain private to the
   * go_private SDK; public MFA management is exposed to all public SDK targets.
   * The terraform-provider target is opted out at the service level because the
   * provider's data-source generator assumes every service has a List RPC; MFA is
   * instead surfaced via a hand-written resource template.
   * </pre>
   */
  public static final class OrganizationsFutureStub extends io.grpc.stub.AbstractFutureStub<OrganizationsFutureStub> {
    private OrganizationsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Update updates an existing organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateResponse> update(
        com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets an organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetResponse> get(
        com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMFA gets the organization's MFA configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFAResponse> getMFA(
        com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFARequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMFAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateMFA updates the organization's MFA configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFAResponse> updateMFA(
        com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFARequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMFAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TestMFA validates MFA connectivity without persisting changes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFAResponse> testMFA(
        com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFARequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestMFAMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_GET_MFA = 2;
  private static final int METHODID_UPDATE_MFA = 3;
  private static final int METHODID_TEST_MFA = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrganizationsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrganizationsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetResponse>) responseObserver);
          break;
        case METHODID_GET_MFA:
          serviceImpl.getMFA((com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFARequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationGetMFAResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MFA:
          serviceImpl.updateMFA((com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFARequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationUpdateMFAResponse>) responseObserver);
          break;
        case METHODID_TEST_MFA:
          serviceImpl.testMFA((com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFARequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.OrganizationsPlumbing.OrganizationTestMFAResponse>) responseObserver);
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

  private static abstract class OrganizationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrganizationsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.OrganizationsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Organizations");
    }
  }

  private static final class OrganizationsFileDescriptorSupplier
      extends OrganizationsBaseDescriptorSupplier {
    OrganizationsFileDescriptorSupplier() {}
  }

  private static final class OrganizationsMethodDescriptorSupplier
      extends OrganizationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrganizationsMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrganizationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrganizationsFileDescriptorSupplier())
              .addMethod(getUpdateMethod())
              .addMethod(getGetMethod())
              .addMethod(getGetMFAMethod())
              .addMethod(getUpdateMFAMethod())
              .addMethod(getTestMFAMethod())
              .build();
        }
      }
    }
    return result;
  }
}
