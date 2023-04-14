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
package v1;

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
 * AccountChannelOverrides allows one to pin an account to a specific channel.
 * That means that they will not receive updates according to their org's channel, but according to
 * the channel they are then pinned to. This -only- affects updates, it does not affect feature flags.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: account_channel_overrides.proto")
public final class AccountChannelOverridesGrpc {

  private AccountChannelOverridesGrpc() {}

  public static final String SERVICE_NAME = "v1.AccountChannelOverrides";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateRequest,
      v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateRequest.class,
      responseType = v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateRequest,
      v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateRequest, v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateResponse> getCreateMethod;
    if ((getCreateMethod = AccountChannelOverridesGrpc.getCreateMethod) == null) {
      synchronized (AccountChannelOverridesGrpc.class) {
        if ((getCreateMethod = AccountChannelOverridesGrpc.getCreateMethod) == null) {
          AccountChannelOverridesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateRequest, v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountChannelOverridesMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListRequest,
      v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListRequest.class,
      responseType = v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListRequest,
      v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListResponse> getListMethod() {
    io.grpc.MethodDescriptor<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListRequest, v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListResponse> getListMethod;
    if ((getListMethod = AccountChannelOverridesGrpc.getListMethod) == null) {
      synchronized (AccountChannelOverridesGrpc.class) {
        if ((getListMethod = AccountChannelOverridesGrpc.getListMethod) == null) {
          AccountChannelOverridesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListRequest, v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountChannelOverridesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteRequest,
      v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteRequest.class,
      responseType = v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteRequest,
      v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteRequest, v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = AccountChannelOverridesGrpc.getDeleteMethod) == null) {
      synchronized (AccountChannelOverridesGrpc.class) {
        if ((getDeleteMethod = AccountChannelOverridesGrpc.getDeleteMethod) == null) {
          AccountChannelOverridesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteRequest, v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountChannelOverridesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountChannelOverridesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountChannelOverridesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountChannelOverridesStub>() {
        @java.lang.Override
        public AccountChannelOverridesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountChannelOverridesStub(channel, callOptions);
        }
      };
    return AccountChannelOverridesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountChannelOverridesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountChannelOverridesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountChannelOverridesBlockingStub>() {
        @java.lang.Override
        public AccountChannelOverridesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountChannelOverridesBlockingStub(channel, callOptions);
        }
      };
    return AccountChannelOverridesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountChannelOverridesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountChannelOverridesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountChannelOverridesFutureStub>() {
        @java.lang.Override
        public AccountChannelOverridesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountChannelOverridesFutureStub(channel, callOptions);
        }
      };
    return AccountChannelOverridesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AccountChannelOverrides allows one to pin an account to a specific channel.
   * That means that they will not receive updates according to their org's channel, but according to
   * the channel they are then pinned to. This -only- affects updates, it does not affect feature flags.
   * </pre>
   */
  public static abstract class AccountChannelOverridesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create pins an account to a channel. If a pin is already present, it will remove the existing
     * pin.
     * </pre>
     */
    public void create(v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateRequest request,
        io.grpc.stub.StreamObserver<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * List is currently unimplemented.
     * TODO: enable sdmctl commands to use this to see what pins are currently in place
     * </pre>
     */
    public void list(v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListRequest request,
        io.grpc.stub.StreamObserver<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removes all overrides for a given account (at most one). If none are present,
     * it will return that it did not change any rows.
     * </pre>
     */
    public void delete(v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteRequest request,
        io.grpc.stub.StreamObserver<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateRequest,
                v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListRequest,
                v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteRequest,
                v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * AccountChannelOverrides allows one to pin an account to a specific channel.
   * That means that they will not receive updates according to their org's channel, but according to
   * the channel they are then pinned to. This -only- affects updates, it does not affect feature flags.
   * </pre>
   */
  public static final class AccountChannelOverridesStub extends io.grpc.stub.AbstractAsyncStub<AccountChannelOverridesStub> {
    private AccountChannelOverridesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountChannelOverridesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountChannelOverridesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create pins an account to a channel. If a pin is already present, it will remove the existing
     * pin.
     * </pre>
     */
    public void create(v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateRequest request,
        io.grpc.stub.StreamObserver<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List is currently unimplemented.
     * TODO: enable sdmctl commands to use this to see what pins are currently in place
     * </pre>
     */
    public void list(v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListRequest request,
        io.grpc.stub.StreamObserver<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removes all overrides for a given account (at most one). If none are present,
     * it will return that it did not change any rows.
     * </pre>
     */
    public void delete(v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteRequest request,
        io.grpc.stub.StreamObserver<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AccountChannelOverrides allows one to pin an account to a specific channel.
   * That means that they will not receive updates according to their org's channel, but according to
   * the channel they are then pinned to. This -only- affects updates, it does not affect feature flags.
   * </pre>
   */
  public static final class AccountChannelOverridesBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountChannelOverridesBlockingStub> {
    private AccountChannelOverridesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountChannelOverridesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountChannelOverridesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create pins an account to a channel. If a pin is already present, it will remove the existing
     * pin.
     * </pre>
     */
    public v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateResponse create(v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List is currently unimplemented.
     * TODO: enable sdmctl commands to use this to see what pins are currently in place
     * </pre>
     */
    public v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListResponse list(v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removes all overrides for a given account (at most one). If none are present,
     * it will return that it did not change any rows.
     * </pre>
     */
    public v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteResponse delete(v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AccountChannelOverrides allows one to pin an account to a specific channel.
   * That means that they will not receive updates according to their org's channel, but according to
   * the channel they are then pinned to. This -only- affects updates, it does not affect feature flags.
   * </pre>
   */
  public static final class AccountChannelOverridesFutureStub extends io.grpc.stub.AbstractFutureStub<AccountChannelOverridesFutureStub> {
    private AccountChannelOverridesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountChannelOverridesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountChannelOverridesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create pins an account to a channel. If a pin is already present, it will remove the existing
     * pin.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateResponse> create(
        v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List is currently unimplemented.
     * TODO: enable sdmctl commands to use this to see what pins are currently in place
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListResponse> list(
        v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removes all overrides for a given account (at most one). If none are present,
     * it will return that it did not change any rows.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteResponse> delete(
        v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountChannelOverridesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountChannelOverridesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateRequest) request,
              (io.grpc.stub.StreamObserver<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideCreateResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListRequest) request,
              (io.grpc.stub.StreamObserver<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideListResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteRequest) request,
              (io.grpc.stub.StreamObserver<v1.AccountChannelOverridesOuterClass.AccountChannelOverrideDeleteResponse>) responseObserver);
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

  private static abstract class AccountChannelOverridesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountChannelOverridesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return v1.AccountChannelOverridesOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountChannelOverrides");
    }
  }

  private static final class AccountChannelOverridesFileDescriptorSupplier
      extends AccountChannelOverridesBaseDescriptorSupplier {
    AccountChannelOverridesFileDescriptorSupplier() {}
  }

  private static final class AccountChannelOverridesMethodDescriptorSupplier
      extends AccountChannelOverridesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountChannelOverridesMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountChannelOverridesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountChannelOverridesFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getListMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
