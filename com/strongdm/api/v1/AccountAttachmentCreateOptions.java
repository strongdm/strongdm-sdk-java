package com.strongdm.api.v1;

// AccountAttachmentCreateOptions specifies extra options for creating an
// AccountAttachment.
public class AccountAttachmentCreateOptions {
  private boolean overwrite;
  // Overwrite clears all account grants before the attachment.
  public boolean getOverwrite() {
    return this.overwrite;
  }
  // Overwrite clears all account grants before the attachment.
  public AccountAttachmentCreateOptions setOverwrite(boolean in) {
    this.overwrite = in;
    return this;
  }
}
