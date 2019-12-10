package com.strongdm.api.v1;

import io.grpc.*;
import java.util.concurrent.Executor;

/** Created by rayt on 10/6/16. */
public class JwtCallCredential extends CallCredentials {
  private final String jwt;

  public JwtCallCredential(String jwt) {
    this.jwt = jwt;
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
              Metadata.Key<String> jwtKey =
                  Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);
              headers.put(jwtKey, jwt);
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
