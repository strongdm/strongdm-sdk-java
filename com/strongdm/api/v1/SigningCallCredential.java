package com.strongdm.api.v1;

import io.grpc.*;
import java.util.concurrent.Executor;

public class SigningCallCredential extends CallCredentials {
  private final String apiAccessKey;
  private final String signature;

  public SigningCallCredential(String apiAccessKey, String signature) {
    this.apiAccessKey = apiAccessKey;
    this.signature = signature;
  }

  @Override
  public void applyRequestMetadata(
      RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier) {
    executor.execute(
        new Runnable() {
          @Override
          public void run() {
            try {
              Metadata headers = new Metadata();
              Metadata.Key<String> apiAccessMD =
                  Metadata.Key.of("x-sdm-authentication", Metadata.ASCII_STRING_MARSHALLER);
              headers.put(apiAccessMD, apiAccessKey);
              Metadata.Key<String> signatureMD =
                  Metadata.Key.of("x-sdm-signature", Metadata.ASCII_STRING_MARSHALLER);
              headers.put(signatureMD, signature);
              metadataApplier.apply(headers);
            } catch (Throwable e) {
              e.printStackTrace();
              metadataApplier.fail(Status.UNAUTHENTICATED.withCause(e));
            }
          }
        });
  }

  @Override
  public void thisUsesUnstableApi() {}
}
