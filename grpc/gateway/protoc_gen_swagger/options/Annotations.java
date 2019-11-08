// This file is necessary to keep the compiler happy. protoc_gen_swagger
// doesn't appear to generate Java files, so javac gets upset. We don't care
// about the swagger annotations at all, so this file just fills in the
// necessary gaps to make things compile.

package grpc.gateway.protoc_gen_swagger.options;

public class Annotations {
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      com.strongdm.api.v1.plumbing.Options.FieldOptions> openapiv2Operation = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.strongdm.api.v1.plumbing.Options.FieldOptions.class,
        com.strongdm.api.v1.plumbing.Options.FieldOptions.getDefaultInstance());
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      com.strongdm.api.v1.plumbing.Options.FieldOptions> openapiv2Schema = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.strongdm.api.v1.plumbing.Options.FieldOptions.class,
        com.strongdm.api.v1.plumbing.Options.FieldOptions.getDefaultInstance());
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      com.strongdm.api.v1.plumbing.Options.FieldOptions> openapiv2Swagger = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.strongdm.api.v1.plumbing.Options.FieldOptions.class,
        com.strongdm.api.v1.plumbing.Options.FieldOptions.getDefaultInstance());
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(new String[]{},
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    openapiv2Operation.internalInit(com.strongdm.api.v1.plumbing.Options.fieldOptions.getDescriptor());
    openapiv2Schema.internalInit(com.strongdm.api.v1.plumbing.Options.fieldOptions.getDescriptor());
    openapiv2Swagger.internalInit(com.strongdm.api.v1.plumbing.Options.fieldOptions.getDescriptor());
  }
}