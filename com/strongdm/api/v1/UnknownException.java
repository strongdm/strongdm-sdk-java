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

package com.strongdm.api.v1;

// UnknownException is a generic wrapper that indicates an unknown internal error in the SDK.
public final class UnknownException extends RpcException {
  static final long serialVersionUID = 1;

  public UnknownException(String errorMessage) {
    super(errorMessage, 2);
  }

  public UnknownException(String errorMessage, Throwable innerError) {
    super(errorMessage, innerError, 2);
  }
}