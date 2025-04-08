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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: secret_engines.proto")
public final class SecretEnginesGrpc {

  private SecretEnginesGrpc() {}

  public static final String SERVICE_NAME = "v1.SecretEngines";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListRequest.class,
      responseType = com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListResponse> getListMethod;
    if ((getListMethod = SecretEnginesGrpc.getListMethod) == null) {
      synchronized (SecretEnginesGrpc.class) {
        if ((getListMethod = SecretEnginesGrpc.getListMethod) == null) {
          SecretEnginesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretEnginesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetRequest.class,
      responseType = com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetResponse> getGetMethod;
    if ((getGetMethod = SecretEnginesGrpc.getGetMethod) == null) {
      synchronized (SecretEnginesGrpc.class) {
        if ((getGetMethod = SecretEnginesGrpc.getGetMethod) == null) {
          SecretEnginesGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretEnginesMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateRequest.class,
      responseType = com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateResponse> getCreateMethod;
    if ((getCreateMethod = SecretEnginesGrpc.getCreateMethod) == null) {
      synchronized (SecretEnginesGrpc.class) {
        if ((getCreateMethod = SecretEnginesGrpc.getCreateMethod) == null) {
          SecretEnginesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretEnginesMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateRequest.class,
      responseType = com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = SecretEnginesGrpc.getUpdateMethod) == null) {
      synchronized (SecretEnginesGrpc.class) {
        if ((getUpdateMethod = SecretEnginesGrpc.getUpdateMethod) == null) {
          SecretEnginesGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretEnginesMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = SecretEnginesGrpc.getDeleteMethod) == null) {
      synchronized (SecretEnginesGrpc.class) {
        if ((getDeleteMethod = SecretEnginesGrpc.getDeleteMethod) == null) {
          SecretEnginesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretEnginesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListRequest,
      com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListResponse> getListSecretStoresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSecretStores",
      requestType = com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListRequest.class,
      responseType = com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListRequest,
      com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListResponse> getListSecretStoresMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListRequest, com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListResponse> getListSecretStoresMethod;
    if ((getListSecretStoresMethod = SecretEnginesGrpc.getListSecretStoresMethod) == null) {
      synchronized (SecretEnginesGrpc.class) {
        if ((getListSecretStoresMethod = SecretEnginesGrpc.getListSecretStoresMethod) == null) {
          SecretEnginesGrpc.getListSecretStoresMethod = getListSecretStoresMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListRequest, com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSecretStores"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretEnginesMethodDescriptorSupplier("ListSecretStores"))
              .build();
        }
      }
    }
    return getListSecretStoresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysResponse> getGenerateKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateKeys",
      requestType = com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysRequest.class,
      responseType = com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysResponse> getGenerateKeysMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysResponse> getGenerateKeysMethod;
    if ((getGenerateKeysMethod = SecretEnginesGrpc.getGenerateKeysMethod) == null) {
      synchronized (SecretEnginesGrpc.class) {
        if ((getGenerateKeysMethod = SecretEnginesGrpc.getGenerateKeysMethod) == null) {
          SecretEnginesGrpc.getGenerateKeysMethod = getGenerateKeysMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretEnginesMethodDescriptorSupplier("GenerateKeys"))
              .build();
        }
      }
    }
    return getGenerateKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckResponse> getHealthcheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Healthcheck",
      requestType = com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckRequest.class,
      responseType = com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckResponse> getHealthcheckMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckResponse> getHealthcheckMethod;
    if ((getHealthcheckMethod = SecretEnginesGrpc.getHealthcheckMethod) == null) {
      synchronized (SecretEnginesGrpc.class) {
        if ((getHealthcheckMethod = SecretEnginesGrpc.getHealthcheckMethod) == null) {
          SecretEnginesGrpc.getHealthcheckMethod = getHealthcheckMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Healthcheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretEnginesMethodDescriptorSupplier("Healthcheck"))
              .build();
        }
      }
    }
    return getHealthcheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateResponse> getRotateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rotate",
      requestType = com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateRequest.class,
      responseType = com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateRequest,
      com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateResponse> getRotateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateResponse> getRotateMethod;
    if ((getRotateMethod = SecretEnginesGrpc.getRotateMethod) == null) {
      synchronized (SecretEnginesGrpc.class) {
        if ((getRotateMethod = SecretEnginesGrpc.getRotateMethod) == null) {
          SecretEnginesGrpc.getRotateMethod = getRotateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateRequest, com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rotate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretEnginesMethodDescriptorSupplier("Rotate"))
              .build();
        }
      }
    }
    return getRotateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecretEnginesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretEnginesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretEnginesStub>() {
        @java.lang.Override
        public SecretEnginesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretEnginesStub(channel, callOptions);
        }
      };
    return SecretEnginesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecretEnginesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretEnginesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretEnginesBlockingStub>() {
        @java.lang.Override
        public SecretEnginesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretEnginesBlockingStub(channel, callOptions);
        }
      };
    return SecretEnginesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecretEnginesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretEnginesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretEnginesFutureStub>() {
        @java.lang.Override
        public SecretEnginesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretEnginesFutureStub(channel, callOptions);
        }
      };
    return SecretEnginesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SecretEnginesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List returns a list of Secret Engines
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get returns a secret engine details
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create creates a secret engine
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update updates a secret engine
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete deletes a secret engine
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListSecretStores returns a list of Secret Stores that can be used as a backing store
     * for Secret Engine
     * </pre>
     */
    public void listSecretStores(com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSecretStoresMethod(), responseObserver);
    }

    /**
     * <pre>
     * GenerateKeys generates a private key, stores it in a secret store and stores a public key in a secret engine
     * </pre>
     */
    public void generateKeys(com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Healthcheck triggers a healthcheck for all nodes serving a secret engine
     * </pre>
     */
    public void healthcheck(com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHealthcheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rotate rotates secret engine's credentials
     * </pre>
     */
    public void rotate(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRotateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListRequest,
                com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetRequest,
                com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateRequest,
                com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateRequest,
                com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteRequest,
                com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getListSecretStoresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListRequest,
                com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListResponse>(
                  this, METHODID_LIST_SECRET_STORES)))
          .addMethod(
            getGenerateKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysRequest,
                com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysResponse>(
                  this, METHODID_GENERATE_KEYS)))
          .addMethod(
            getHealthcheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckRequest,
                com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckResponse>(
                  this, METHODID_HEALTHCHECK)))
          .addMethod(
            getRotateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateRequest,
                com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateResponse>(
                  this, METHODID_ROTATE)))
          .build();
    }
  }

  /**
   */
  public static final class SecretEnginesStub extends io.grpc.stub.AbstractAsyncStub<SecretEnginesStub> {
    private SecretEnginesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretEnginesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretEnginesStub(channel, callOptions);
    }

    /**
     * <pre>
     * List returns a list of Secret Engines
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get returns a secret engine details
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create creates a secret engine
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update updates a secret engine
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete deletes a secret engine
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListSecretStores returns a list of Secret Stores that can be used as a backing store
     * for Secret Engine
     * </pre>
     */
    public void listSecretStores(com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSecretStoresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GenerateKeys generates a private key, stores it in a secret store and stores a public key in a secret engine
     * </pre>
     */
    public void generateKeys(com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Healthcheck triggers a healthcheck for all nodes serving a secret engine
     * </pre>
     */
    public void healthcheck(com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHealthcheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rotate rotates secret engine's credentials
     * </pre>
     */
    public void rotate(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRotateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SecretEnginesBlockingStub extends io.grpc.stub.AbstractBlockingStub<SecretEnginesBlockingStub> {
    private SecretEnginesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretEnginesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretEnginesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List returns a list of Secret Engines
     * </pre>
     */
    public com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListResponse list(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get returns a secret engine details
     * </pre>
     */
    public com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetResponse get(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create creates a secret engine
     * </pre>
     */
    public com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateResponse create(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update updates a secret engine
     * </pre>
     */
    public com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateResponse update(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete deletes a secret engine
     * </pre>
     */
    public com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteResponse delete(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListSecretStores returns a list of Secret Stores that can be used as a backing store
     * for Secret Engine
     * </pre>
     */
    public com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListResponse listSecretStores(com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSecretStoresMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GenerateKeys generates a private key, stores it in a secret store and stores a public key in a secret engine
     * </pre>
     */
    public com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysResponse generateKeys(com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Healthcheck triggers a healthcheck for all nodes serving a secret engine
     * </pre>
     */
    public com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckResponse healthcheck(com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getHealthcheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rotate rotates secret engine's credentials
     * </pre>
     */
    public com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateResponse rotate(com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateRequest request) {
      return blockingUnaryCall(
          getChannel(), getRotateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SecretEnginesFutureStub extends io.grpc.stub.AbstractFutureStub<SecretEnginesFutureStub> {
    private SecretEnginesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretEnginesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretEnginesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List returns a list of Secret Engines
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListResponse> list(
        com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get returns a secret engine details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetResponse> get(
        com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create creates a secret engine
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateResponse> create(
        com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update updates a secret engine
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateResponse> update(
        com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete deletes a secret engine
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteResponse> delete(
        com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListSecretStores returns a list of Secret Stores that can be used as a backing store
     * for Secret Engine
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListResponse> listSecretStores(
        com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSecretStoresMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GenerateKeys generates a private key, stores it in a secret store and stores a public key in a secret engine
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysResponse> generateKeys(
        com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Healthcheck triggers a healthcheck for all nodes serving a secret engine
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckResponse> healthcheck(
        com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHealthcheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rotate rotates secret engine's credentials
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateResponse> rotate(
        com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRotateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_LIST_SECRET_STORES = 5;
  private static final int METHODID_GENERATE_KEYS = 6;
  private static final int METHODID_HEALTHCHECK = 7;
  private static final int METHODID_ROTATE = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecretEnginesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecretEnginesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineListResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineGetResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineCreateResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST_SECRET_STORES:
          serviceImpl.listSecretStores((com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretStoresPlumbing.SecretStoreListResponse>) responseObserver);
          break;
        case METHODID_GENERATE_KEYS:
          serviceImpl.generateKeys((com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.GenerateKeysResponse>) responseObserver);
          break;
        case METHODID_HEALTHCHECK:
          serviceImpl.healthcheck((com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.HealthcheckResponse>) responseObserver);
          break;
        case METHODID_ROTATE:
          serviceImpl.rotate((com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.SecretEnginesPlumbing.SecretEngineRotateResponse>) responseObserver);
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

  private static abstract class SecretEnginesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecretEnginesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.SecretEnginesPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecretEngines");
    }
  }

  private static final class SecretEnginesFileDescriptorSupplier
      extends SecretEnginesBaseDescriptorSupplier {
    SecretEnginesFileDescriptorSupplier() {}
  }

  private static final class SecretEnginesMethodDescriptorSupplier
      extends SecretEnginesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecretEnginesMethodDescriptorSupplier(String methodName) {
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
      synchronized (SecretEnginesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecretEnginesFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListSecretStoresMethod())
              .addMethod(getGenerateKeysMethod())
              .addMethod(getHealthcheckMethod())
              .addMethod(getRotateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
