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
 * ManagedSecret is a private vertical for creating, reading, updating,
 * deleting, listing and rotating the managed secrets in the secrets engines as
 * an authenticated user.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: managed_secrets.proto")
public final class ManagedSecretsGrpc {

  private ManagedSecretsGrpc() {}

  public static final String SERVICE_NAME = "v1.ManagedSecrets";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest.class,
      responseType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse> getListMethod;
    if ((getListMethod = ManagedSecretsGrpc.getListMethod) == null) {
      synchronized (ManagedSecretsGrpc.class) {
        if ((getListMethod = ManagedSecretsGrpc.getListMethod) == null) {
          ManagedSecretsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagedSecretsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse> getListByActorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListByActor",
      requestType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest.class,
      responseType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse> getListByActorMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse> getListByActorMethod;
    if ((getListByActorMethod = ManagedSecretsGrpc.getListByActorMethod) == null) {
      synchronized (ManagedSecretsGrpc.class) {
        if ((getListByActorMethod = ManagedSecretsGrpc.getListByActorMethod) == null) {
          ManagedSecretsGrpc.getListByActorMethod = getListByActorMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListByActor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagedSecretsMethodDescriptorSupplier("ListByActor"))
              .build();
        }
      }
    }
    return getListByActorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateRequest.class,
      responseType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateResponse> getCreateMethod;
    if ((getCreateMethod = ManagedSecretsGrpc.getCreateMethod) == null) {
      synchronized (ManagedSecretsGrpc.class) {
        if ((getCreateMethod = ManagedSecretsGrpc.getCreateMethod) == null) {
          ManagedSecretsGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagedSecretsMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateRequest.class,
      responseType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = ManagedSecretsGrpc.getUpdateMethod) == null) {
      synchronized (ManagedSecretsGrpc.class) {
        if ((getUpdateMethod = ManagedSecretsGrpc.getUpdateMethod) == null) {
          ManagedSecretsGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagedSecretsMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateResponse> getRotateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rotate",
      requestType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateRequest.class,
      responseType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateResponse> getRotateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateResponse> getRotateMethod;
    if ((getRotateMethod = ManagedSecretsGrpc.getRotateMethod) == null) {
      synchronized (ManagedSecretsGrpc.class) {
        if ((getRotateMethod = ManagedSecretsGrpc.getRotateMethod) == null) {
          ManagedSecretsGrpc.getRotateMethod = getRotateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rotate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagedSecretsMethodDescriptorSupplier("Rotate"))
              .build();
        }
      }
    }
    return getRotateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ManagedSecretsGrpc.getDeleteMethod) == null) {
      synchronized (ManagedSecretsGrpc.class) {
        if ((getDeleteMethod = ManagedSecretsGrpc.getDeleteMethod) == null) {
          ManagedSecretsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagedSecretsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse> getForceDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ForceDelete",
      requestType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest.class,
      responseType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse> getForceDeleteMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse> getForceDeleteMethod;
    if ((getForceDeleteMethod = ManagedSecretsGrpc.getForceDeleteMethod) == null) {
      synchronized (ManagedSecretsGrpc.class) {
        if ((getForceDeleteMethod = ManagedSecretsGrpc.getForceDeleteMethod) == null) {
          ManagedSecretsGrpc.getForceDeleteMethod = getForceDeleteMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ForceDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagedSecretsMethodDescriptorSupplier("ForceDelete"))
              .build();
        }
      }
    }
    return getForceDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetRequest.class,
      responseType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetResponse> getGetMethod;
    if ((getGetMethod = ManagedSecretsGrpc.getGetMethod) == null) {
      synchronized (ManagedSecretsGrpc.class) {
        if ((getGetMethod = ManagedSecretsGrpc.getGetMethod) == null) {
          ManagedSecretsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagedSecretsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveResponse> getRetrieveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Retrieve",
      requestType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveRequest.class,
      responseType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveResponse> getRetrieveMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveResponse> getRetrieveMethod;
    if ((getRetrieveMethod = ManagedSecretsGrpc.getRetrieveMethod) == null) {
      synchronized (ManagedSecretsGrpc.class) {
        if ((getRetrieveMethod = ManagedSecretsGrpc.getRetrieveMethod) == null) {
          ManagedSecretsGrpc.getRetrieveMethod = getRetrieveMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Retrieve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagedSecretsMethodDescriptorSupplier("Retrieve"))
              .build();
        }
      }
    }
    return getRetrieveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateResponse> getValidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validate",
      requestType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateRequest.class,
      responseType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateResponse> getValidateMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateResponse> getValidateMethod;
    if ((getValidateMethod = ManagedSecretsGrpc.getValidateMethod) == null) {
      synchronized (ManagedSecretsGrpc.class) {
        if ((getValidateMethod = ManagedSecretsGrpc.getValidateMethod) == null) {
          ManagedSecretsGrpc.getValidateMethod = getValidateMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Validate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagedSecretsMethodDescriptorSupplier("Validate"))
              .build();
        }
      }
    }
    return getValidateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsResponse> getLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logs",
      requestType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsRequest.class,
      responseType = com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsRequest,
      com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsResponse> getLogsMethod() {
    io.grpc.MethodDescriptor<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsResponse> getLogsMethod;
    if ((getLogsMethod = ManagedSecretsGrpc.getLogsMethod) == null) {
      synchronized (ManagedSecretsGrpc.class) {
        if ((getLogsMethod = ManagedSecretsGrpc.getLogsMethod) == null) {
          ManagedSecretsGrpc.getLogsMethod = getLogsMethod =
              io.grpc.MethodDescriptor.<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsRequest, com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Logs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagedSecretsMethodDescriptorSupplier("Logs"))
              .build();
        }
      }
    }
    return getLogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManagedSecretsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagedSecretsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagedSecretsStub>() {
        @java.lang.Override
        public ManagedSecretsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagedSecretsStub(channel, callOptions);
        }
      };
    return ManagedSecretsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManagedSecretsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagedSecretsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagedSecretsBlockingStub>() {
        @java.lang.Override
        public ManagedSecretsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagedSecretsBlockingStub(channel, callOptions);
        }
      };
    return ManagedSecretsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManagedSecretsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagedSecretsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagedSecretsFutureStub>() {
        @java.lang.Override
        public ManagedSecretsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagedSecretsFutureStub(channel, callOptions);
        }
      };
    return ManagedSecretsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ManagedSecret is a private vertical for creating, reading, updating,
   * deleting, listing and rotating the managed secrets in the secrets engines as
   * an authenticated user.
   * </pre>
   */
  public static abstract class ManagedSecretsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List returns Managed Secrets from a Secret Engine.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * List returns Managed Secrets for an Actor from a Secret Engine.
     * </pre>
     */
    public void listByActor(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListByActorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create creates a Managed Secret
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update updates a Managed Secret
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rotate forces rotation of Managed Secret
     * </pre>
     */
    public void rotate(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRotateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete deletes a Managed Secret
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * ForceDelete deletes a Managed Secret regardless of errors on external system 
     * </pre>
     */
    public void forceDelete(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getForceDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets details of a Managed Secret without sensitive data
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve returns Managed Secret with sensitive data
     * </pre>
     */
    public void retrieve(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRetrieveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate returns the result of testing the stored credential against the
     * secret engine.
     * </pre>
     */
    public void validate(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Logs returns the audit records for the managed secret. This may be replaced
     * in the future.
     * </pre>
     */
    public void logs(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest,
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getListByActorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest,
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse>(
                  this, METHODID_LIST_BY_ACTOR)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateRequest,
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateRequest,
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getRotateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateRequest,
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateResponse>(
                  this, METHODID_ROTATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest,
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getForceDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest,
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse>(
                  this, METHODID_FORCE_DELETE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetRequest,
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getRetrieveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveRequest,
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveResponse>(
                  this, METHODID_RETRIEVE)))
          .addMethod(
            getValidateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateRequest,
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateResponse>(
                  this, METHODID_VALIDATE)))
          .addMethod(
            getLogsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsRequest,
                com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsResponse>(
                  this, METHODID_LOGS)))
          .build();
    }
  }

  /**
   * <pre>
   * ManagedSecret is a private vertical for creating, reading, updating,
   * deleting, listing and rotating the managed secrets in the secrets engines as
   * an authenticated user.
   * </pre>
   */
  public static final class ManagedSecretsStub extends io.grpc.stub.AbstractAsyncStub<ManagedSecretsStub> {
    private ManagedSecretsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagedSecretsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagedSecretsStub(channel, callOptions);
    }

    /**
     * <pre>
     * List returns Managed Secrets from a Secret Engine.
     * </pre>
     */
    public void list(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List returns Managed Secrets for an Actor from a Secret Engine.
     * </pre>
     */
    public void listByActor(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListByActorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create creates a Managed Secret
     * </pre>
     */
    public void create(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update updates a Managed Secret
     * </pre>
     */
    public void update(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rotate forces rotation of Managed Secret
     * </pre>
     */
    public void rotate(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRotateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete deletes a Managed Secret
     * </pre>
     */
    public void delete(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ForceDelete deletes a Managed Secret regardless of errors on external system 
     * </pre>
     */
    public void forceDelete(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getForceDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets details of a Managed Secret without sensitive data
     * </pre>
     */
    public void get(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve returns Managed Secret with sensitive data
     * </pre>
     */
    public void retrieve(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate returns the result of testing the stored credential against the
     * secret engine.
     * </pre>
     */
    public void validate(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Logs returns the audit records for the managed secret. This may be replaced
     * in the future.
     * </pre>
     */
    public void logs(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsRequest request,
        io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ManagedSecret is a private vertical for creating, reading, updating,
   * deleting, listing and rotating the managed secrets in the secrets engines as
   * an authenticated user.
   * </pre>
   */
  public static final class ManagedSecretsBlockingStub extends io.grpc.stub.AbstractBlockingStub<ManagedSecretsBlockingStub> {
    private ManagedSecretsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagedSecretsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagedSecretsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List returns Managed Secrets from a Secret Engine.
     * </pre>
     */
    public com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse list(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List returns Managed Secrets for an Actor from a Secret Engine.
     * </pre>
     */
    public com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse listByActor(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListByActorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create creates a Managed Secret
     * </pre>
     */
    public com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateResponse create(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update updates a Managed Secret
     * </pre>
     */
    public com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateResponse update(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rotate forces rotation of Managed Secret
     * </pre>
     */
    public com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateResponse rotate(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateRequest request) {
      return blockingUnaryCall(
          getChannel(), getRotateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete deletes a Managed Secret
     * </pre>
     */
    public com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse delete(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ForceDelete deletes a Managed Secret regardless of errors on external system 
     * </pre>
     */
    public com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse forceDelete(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getForceDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets details of a Managed Secret without sensitive data
     * </pre>
     */
    public com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetResponse get(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve returns Managed Secret with sensitive data
     * </pre>
     */
    public com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveResponse retrieve(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveRequest request) {
      return blockingUnaryCall(
          getChannel(), getRetrieveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate returns the result of testing the stored credential against the
     * secret engine.
     * </pre>
     */
    public com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateResponse validate(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Logs returns the audit records for the managed secret. This may be replaced
     * in the future.
     * </pre>
     */
    public com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsResponse logs(com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ManagedSecret is a private vertical for creating, reading, updating,
   * deleting, listing and rotating the managed secrets in the secrets engines as
   * an authenticated user.
   * </pre>
   */
  public static final class ManagedSecretsFutureStub extends io.grpc.stub.AbstractFutureStub<ManagedSecretsFutureStub> {
    private ManagedSecretsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagedSecretsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagedSecretsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List returns Managed Secrets from a Secret Engine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse> list(
        com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List returns Managed Secrets for an Actor from a Secret Engine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse> listByActor(
        com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListByActorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create creates a Managed Secret
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateResponse> create(
        com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update updates a Managed Secret
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateResponse> update(
        com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rotate forces rotation of Managed Secret
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateResponse> rotate(
        com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRotateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete deletes a Managed Secret
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse> delete(
        com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ForceDelete deletes a Managed Secret regardless of errors on external system 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse> forceDelete(
        com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getForceDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets details of a Managed Secret without sensitive data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetResponse> get(
        com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve returns Managed Secret with sensitive data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveResponse> retrieve(
        com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate returns the result of testing the stored credential against the
     * secret engine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateResponse> validate(
        com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Logs returns the audit records for the managed secret. This may be replaced
     * in the future.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsResponse> logs(
        com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_LIST_BY_ACTOR = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_ROTATE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_FORCE_DELETE = 6;
  private static final int METHODID_GET = 7;
  private static final int METHODID_RETRIEVE = 8;
  private static final int METHODID_VALIDATE = 9;
  private static final int METHODID_LOGS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ManagedSecretsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ManagedSecretsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse>) responseObserver);
          break;
        case METHODID_LIST_BY_ACTOR:
          serviceImpl.listByActor((com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretListResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretCreateResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretUpdateResponse>) responseObserver);
          break;
        case METHODID_ROTATE:
          serviceImpl.rotate((com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRotateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse>) responseObserver);
          break;
        case METHODID_FORCE_DELETE:
          serviceImpl.forceDelete((com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretDeleteResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretGetResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE:
          serviceImpl.retrieve((com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretRetrieveResponse>) responseObserver);
          break;
        case METHODID_VALIDATE:
          serviceImpl.validate((com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretValidateResponse>) responseObserver);
          break;
        case METHODID_LOGS:
          serviceImpl.logs((com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsRequest) request,
              (io.grpc.stub.StreamObserver<com.strongdm.api.plumbing.ManagedSecretsPlumbing.ManagedSecretLogsResponse>) responseObserver);
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

  private static abstract class ManagedSecretsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManagedSecretsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.strongdm.api.plumbing.ManagedSecretsPlumbing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ManagedSecrets");
    }
  }

  private static final class ManagedSecretsFileDescriptorSupplier
      extends ManagedSecretsBaseDescriptorSupplier {
    ManagedSecretsFileDescriptorSupplier() {}
  }

  private static final class ManagedSecretsMethodDescriptorSupplier
      extends ManagedSecretsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ManagedSecretsMethodDescriptorSupplier(String methodName) {
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
      synchronized (ManagedSecretsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManagedSecretsFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getListByActorMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getRotateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getForceDeleteMethod())
              .addMethod(getGetMethod())
              .addMethod(getRetrieveMethod())
              .addMethod(getValidateMethod())
              .addMethod(getLogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
