package com.strongdm.api.v1.plumbing;

import com.google.protobuf.Timestamp;
import com.google.rpc.Code;
import com.strongdm.api.v1.BadRequestException;
import com.strongdm.api.v1.plumbing.AccountGrantsPlumbing.*;
import com.strongdm.api.v1.plumbing.AccountsPlumbing.*;
import com.strongdm.api.v1.plumbing.DriversPlumbing.*;
import com.strongdm.api.v1.plumbing.NodesPlumbing.*;
import com.strongdm.api.v1.plumbing.ResourcesPlumbing.*;
import com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.*;
import com.strongdm.api.v1.plumbing.RolesPlumbing.*;
import com.strongdm.api.v1.plumbing.Spec.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class Plumbing {

  public static String quoteFilterArgs(String filter, Object... args) throws BadRequestException {
    String[] parts =
        (filter + " ").split("\\?"); // trailing space to stop split from discarding last match
    if (parts.length != args.length + 1) {
      throw new BadRequestException("incorrect number of replacements");
    }
    String b = "";
    for (int i = 0; i < parts.length; i++) {
      b += parts[i];
      if (i < args.length) {
        String s = args[i].toString();
        s = JSONObject.valueToString(s);
        b += s;
      }
    }
    return b;
  }

  public static Timestamp timestampToPlumbing(Date t) {
    long ms = t.getTime();
    return Timestamp.newBuilder()
        .setSeconds(ms / 1000)
        .setNanos((int) ((ms % 1000) * 1000000))
        .build();
  }

  public static Date timestampToPorcelain(Timestamp t) {
    return new Date(t.getSeconds() * 1000 + t.getNanos() / 1000000);
  }

  public static com.strongdm.api.v1.CreateResponseMetadata createResponseMetadataToPorcelain(
      CreateResponseMetadata plumbing) {
    com.strongdm.api.v1.CreateResponseMetadata porcelain =
        new com.strongdm.api.v1.CreateResponseMetadata();
    return porcelain;
  }

  public static CreateResponseMetadata createResponseMetadataToPlumbing(
      com.strongdm.api.v1.CreateResponseMetadata porcelain) {
    if (porcelain == null) {
      return null;
    }
    CreateResponseMetadata.Builder builder = CreateResponseMetadata.newBuilder();
    return builder.build();
  }

  public static List<com.strongdm.api.v1.CreateResponseMetadata>
      repeatedCreateResponseMetadataToPorcelain(Collection<CreateResponseMetadata> plumbings) {
    return plumbings.stream()
        .map(plumbing -> createResponseMetadataToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<CreateResponseMetadata> repeatedCreateResponseMetadataToPlumbing(
      Collection<com.strongdm.api.v1.CreateResponseMetadata> porcelains) {
    return porcelains.stream()
        .map(porcelain -> createResponseMetadataToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.GetResponseMetadata getResponseMetadataToPorcelain(
      GetResponseMetadata plumbing) {
    com.strongdm.api.v1.GetResponseMetadata porcelain =
        new com.strongdm.api.v1.GetResponseMetadata();
    return porcelain;
  }

  public static GetResponseMetadata getResponseMetadataToPlumbing(
      com.strongdm.api.v1.GetResponseMetadata porcelain) {
    if (porcelain == null) {
      return null;
    }
    GetResponseMetadata.Builder builder = GetResponseMetadata.newBuilder();
    return builder.build();
  }

  public static List<com.strongdm.api.v1.GetResponseMetadata>
      repeatedGetResponseMetadataToPorcelain(Collection<GetResponseMetadata> plumbings) {
    return plumbings.stream()
        .map(plumbing -> getResponseMetadataToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<GetResponseMetadata> repeatedGetResponseMetadataToPlumbing(
      Collection<com.strongdm.api.v1.GetResponseMetadata> porcelains) {
    return porcelains.stream()
        .map(porcelain -> getResponseMetadataToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.UpdateResponseMetadata updateResponseMetadataToPorcelain(
      UpdateResponseMetadata plumbing) {
    com.strongdm.api.v1.UpdateResponseMetadata porcelain =
        new com.strongdm.api.v1.UpdateResponseMetadata();
    return porcelain;
  }

  public static UpdateResponseMetadata updateResponseMetadataToPlumbing(
      com.strongdm.api.v1.UpdateResponseMetadata porcelain) {
    if (porcelain == null) {
      return null;
    }
    UpdateResponseMetadata.Builder builder = UpdateResponseMetadata.newBuilder();
    return builder.build();
  }

  public static List<com.strongdm.api.v1.UpdateResponseMetadata>
      repeatedUpdateResponseMetadataToPorcelain(Collection<UpdateResponseMetadata> plumbings) {
    return plumbings.stream()
        .map(plumbing -> updateResponseMetadataToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<UpdateResponseMetadata> repeatedUpdateResponseMetadataToPlumbing(
      Collection<com.strongdm.api.v1.UpdateResponseMetadata> porcelains) {
    return porcelains.stream()
        .map(porcelain -> updateResponseMetadataToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.DeleteResponseMetadata deleteResponseMetadataToPorcelain(
      DeleteResponseMetadata plumbing) {
    com.strongdm.api.v1.DeleteResponseMetadata porcelain =
        new com.strongdm.api.v1.DeleteResponseMetadata();
    return porcelain;
  }

  public static DeleteResponseMetadata deleteResponseMetadataToPlumbing(
      com.strongdm.api.v1.DeleteResponseMetadata porcelain) {
    if (porcelain == null) {
      return null;
    }
    DeleteResponseMetadata.Builder builder = DeleteResponseMetadata.newBuilder();
    return builder.build();
  }

  public static List<com.strongdm.api.v1.DeleteResponseMetadata>
      repeatedDeleteResponseMetadataToPorcelain(Collection<DeleteResponseMetadata> plumbings) {
    return plumbings.stream()
        .map(plumbing -> deleteResponseMetadataToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<DeleteResponseMetadata> repeatedDeleteResponseMetadataToPlumbing(
      Collection<com.strongdm.api.v1.DeleteResponseMetadata> porcelains) {
    return porcelains.stream()
        .map(porcelain -> deleteResponseMetadataToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.RateLimitMetadata rateLimitMetadataToPorcelain(
      RateLimitMetadata plumbing) {
    com.strongdm.api.v1.RateLimitMetadata porcelain = new com.strongdm.api.v1.RateLimitMetadata();
    porcelain.setLimit(plumbing.getLimit());
    porcelain.setRemaining(plumbing.getRemaining());
    porcelain.setResetAt(Plumbing.timestampToPorcelain(plumbing.getResetAt()));
    porcelain.setBucket(plumbing.getBucket());
    return porcelain;
  }

  public static RateLimitMetadata rateLimitMetadataToPlumbing(
      com.strongdm.api.v1.RateLimitMetadata porcelain) {
    if (porcelain == null) {
      return null;
    }
    RateLimitMetadata.Builder builder = RateLimitMetadata.newBuilder();
    builder.setLimit(porcelain.getLimit());
    builder.setRemaining(porcelain.getRemaining());
    if (porcelain.getResetAt() != null) {
      builder.setResetAt(Plumbing.timestampToPlumbing(porcelain.getResetAt()));
    }
    if (porcelain.getBucket() != null) {
      builder.setBucket(porcelain.getBucket());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.RateLimitMetadata> repeatedRateLimitMetadataToPorcelain(
      Collection<RateLimitMetadata> plumbings) {
    return plumbings.stream()
        .map(plumbing -> rateLimitMetadataToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<RateLimitMetadata> repeatedRateLimitMetadataToPlumbing(
      Collection<com.strongdm.api.v1.RateLimitMetadata> porcelains) {
    return porcelains.stream()
        .map(porcelain -> rateLimitMetadataToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.AccountGrantCreateResponse
      accountGrantCreateResponseToPorcelain(AccountGrantCreateResponse plumbing) {
    com.strongdm.api.v1.AccountGrantCreateResponse porcelain =
        new com.strongdm.api.v1.AccountGrantCreateResponse();
    porcelain.setMeta(Plumbing.createResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setAccountGrant(Plumbing.accountGrantToPorcelain(plumbing.getAccountGrant()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static AccountGrantCreateResponse accountGrantCreateResponseToPlumbing(
      com.strongdm.api.v1.AccountGrantCreateResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    AccountGrantCreateResponse.Builder builder = AccountGrantCreateResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.createResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getAccountGrant() != null) {
      builder.setAccountGrant(Plumbing.accountGrantToPlumbing(porcelain.getAccountGrant()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.AccountGrantCreateResponse>
      repeatedAccountGrantCreateResponseToPorcelain(
          Collection<AccountGrantCreateResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> accountGrantCreateResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<AccountGrantCreateResponse> repeatedAccountGrantCreateResponseToPlumbing(
      Collection<com.strongdm.api.v1.AccountGrantCreateResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> accountGrantCreateResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.AccountGrantGetResponse accountGrantGetResponseToPorcelain(
      AccountGrantGetResponse plumbing) {
    com.strongdm.api.v1.AccountGrantGetResponse porcelain =
        new com.strongdm.api.v1.AccountGrantGetResponse();
    porcelain.setMeta(Plumbing.getResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setAccountGrant(Plumbing.accountGrantToPorcelain(plumbing.getAccountGrant()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static AccountGrantGetResponse accountGrantGetResponseToPlumbing(
      com.strongdm.api.v1.AccountGrantGetResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    AccountGrantGetResponse.Builder builder = AccountGrantGetResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.getResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getAccountGrant() != null) {
      builder.setAccountGrant(Plumbing.accountGrantToPlumbing(porcelain.getAccountGrant()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.AccountGrantGetResponse>
      repeatedAccountGrantGetResponseToPorcelain(Collection<AccountGrantGetResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> accountGrantGetResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<AccountGrantGetResponse> repeatedAccountGrantGetResponseToPlumbing(
      Collection<com.strongdm.api.v1.AccountGrantGetResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> accountGrantGetResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.AccountGrantDeleteResponse
      accountGrantDeleteResponseToPorcelain(AccountGrantDeleteResponse plumbing) {
    com.strongdm.api.v1.AccountGrantDeleteResponse porcelain =
        new com.strongdm.api.v1.AccountGrantDeleteResponse();
    porcelain.setMeta(Plumbing.deleteResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static AccountGrantDeleteResponse accountGrantDeleteResponseToPlumbing(
      com.strongdm.api.v1.AccountGrantDeleteResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    AccountGrantDeleteResponse.Builder builder = AccountGrantDeleteResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.deleteResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.AccountGrantDeleteResponse>
      repeatedAccountGrantDeleteResponseToPorcelain(
          Collection<AccountGrantDeleteResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> accountGrantDeleteResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<AccountGrantDeleteResponse> repeatedAccountGrantDeleteResponseToPlumbing(
      Collection<com.strongdm.api.v1.AccountGrantDeleteResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> accountGrantDeleteResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.AccountGrant accountGrantToPorcelain(AccountGrant plumbing) {
    com.strongdm.api.v1.AccountGrant porcelain = new com.strongdm.api.v1.AccountGrant();
    porcelain.setId(plumbing.getId());
    porcelain.setResourceId(plumbing.getResourceId());
    porcelain.setAccountId(plumbing.getAccountId());
    return porcelain;
  }

  public static AccountGrant accountGrantToPlumbing(com.strongdm.api.v1.AccountGrant porcelain) {
    if (porcelain == null) {
      return null;
    }
    AccountGrant.Builder builder = AccountGrant.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getResourceId() != null) {
      builder.setResourceId(porcelain.getResourceId());
    }
    if (porcelain.getAccountId() != null) {
      builder.setAccountId(porcelain.getAccountId());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.AccountGrant> repeatedAccountGrantToPorcelain(
      Collection<AccountGrant> plumbings) {
    return plumbings.stream()
        .map(plumbing -> accountGrantToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<AccountGrant> repeatedAccountGrantToPlumbing(
      Collection<com.strongdm.api.v1.AccountGrant> porcelains) {
    return porcelains.stream()
        .map(porcelain -> accountGrantToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.AccountCreateResponse accountCreateResponseToPorcelain(
      AccountCreateResponse plumbing) {
    com.strongdm.api.v1.AccountCreateResponse porcelain =
        new com.strongdm.api.v1.AccountCreateResponse();
    porcelain.setMeta(Plumbing.createResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setAccount(Plumbing.accountToPorcelain(plumbing.getAccount()));
    porcelain.setToken(plumbing.getToken());
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static AccountCreateResponse accountCreateResponseToPlumbing(
      com.strongdm.api.v1.AccountCreateResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    AccountCreateResponse.Builder builder = AccountCreateResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.createResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getAccount() != null) {
      builder.setAccount(Plumbing.accountToPlumbing(porcelain.getAccount()));
    }
    if (porcelain.getToken() != null) {
      builder.setToken(porcelain.getToken());
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.AccountCreateResponse>
      repeatedAccountCreateResponseToPorcelain(Collection<AccountCreateResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> accountCreateResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<AccountCreateResponse> repeatedAccountCreateResponseToPlumbing(
      Collection<com.strongdm.api.v1.AccountCreateResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> accountCreateResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.AccountGetResponse accountGetResponseToPorcelain(
      AccountGetResponse plumbing) {
    com.strongdm.api.v1.AccountGetResponse porcelain = new com.strongdm.api.v1.AccountGetResponse();
    porcelain.setMeta(Plumbing.getResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setAccount(Plumbing.accountToPorcelain(plumbing.getAccount()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static AccountGetResponse accountGetResponseToPlumbing(
      com.strongdm.api.v1.AccountGetResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    AccountGetResponse.Builder builder = AccountGetResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.getResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getAccount() != null) {
      builder.setAccount(Plumbing.accountToPlumbing(porcelain.getAccount()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.AccountGetResponse> repeatedAccountGetResponseToPorcelain(
      Collection<AccountGetResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> accountGetResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<AccountGetResponse> repeatedAccountGetResponseToPlumbing(
      Collection<com.strongdm.api.v1.AccountGetResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> accountGetResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.AccountUpdateResponse accountUpdateResponseToPorcelain(
      AccountUpdateResponse plumbing) {
    com.strongdm.api.v1.AccountUpdateResponse porcelain =
        new com.strongdm.api.v1.AccountUpdateResponse();
    porcelain.setMeta(Plumbing.updateResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setAccount(Plumbing.accountToPorcelain(plumbing.getAccount()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static AccountUpdateResponse accountUpdateResponseToPlumbing(
      com.strongdm.api.v1.AccountUpdateResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    AccountUpdateResponse.Builder builder = AccountUpdateResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.updateResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getAccount() != null) {
      builder.setAccount(Plumbing.accountToPlumbing(porcelain.getAccount()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.AccountUpdateResponse>
      repeatedAccountUpdateResponseToPorcelain(Collection<AccountUpdateResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> accountUpdateResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<AccountUpdateResponse> repeatedAccountUpdateResponseToPlumbing(
      Collection<com.strongdm.api.v1.AccountUpdateResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> accountUpdateResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.AccountDeleteResponse accountDeleteResponseToPorcelain(
      AccountDeleteResponse plumbing) {
    com.strongdm.api.v1.AccountDeleteResponse porcelain =
        new com.strongdm.api.v1.AccountDeleteResponse();
    porcelain.setMeta(Plumbing.deleteResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static AccountDeleteResponse accountDeleteResponseToPlumbing(
      com.strongdm.api.v1.AccountDeleteResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    AccountDeleteResponse.Builder builder = AccountDeleteResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.deleteResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.AccountDeleteResponse>
      repeatedAccountDeleteResponseToPorcelain(Collection<AccountDeleteResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> accountDeleteResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<AccountDeleteResponse> repeatedAccountDeleteResponseToPlumbing(
      Collection<com.strongdm.api.v1.AccountDeleteResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> accountDeleteResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Account accountToPorcelain(Account plumbing) {
    if (plumbing == null) {
      return null;
    }
    if (plumbing.hasUser()) {
      return userToPorcelain(plumbing.getUser());
    }
    if (plumbing.hasService()) {
      return serviceToPorcelain(plumbing.getService());
    }
    return null;
  }

  public static Account accountToPlumbing(com.strongdm.api.v1.Account porcelain) {
    if (porcelain == null) {
      return null;
    }
    if (porcelain instanceof com.strongdm.api.v1.User) {
      Account.Builder builder = Account.newBuilder();
      builder.setUser(userToPlumbing((com.strongdm.api.v1.User) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Service) {
      Account.Builder builder = Account.newBuilder();
      builder.setService(serviceToPlumbing((com.strongdm.api.v1.Service) porcelain));
      return builder.build();
    }
    return null;
  }

  public static List<com.strongdm.api.v1.Account> repeatedAccountToPorcelain(
      Collection<Account> plumbings) {
    return plumbings.stream()
        .map(plumbing -> accountToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Account> repeatedAccountToPlumbing(
      Collection<com.strongdm.api.v1.Account> porcelains) {
    return porcelains.stream()
        .map(porcelain -> accountToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.User userToPorcelain(User plumbing) {
    com.strongdm.api.v1.User porcelain = new com.strongdm.api.v1.User();
    porcelain.setId(plumbing.getId());
    porcelain.setEmail(plumbing.getEmail());
    porcelain.setFirstName(plumbing.getFirstName());
    porcelain.setLastName(plumbing.getLastName());
    return porcelain;
  }

  public static User userToPlumbing(com.strongdm.api.v1.User porcelain) {
    if (porcelain == null) {
      return null;
    }
    User.Builder builder = User.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getEmail() != null) {
      builder.setEmail(porcelain.getEmail());
    }
    if (porcelain.getFirstName() != null) {
      builder.setFirstName(porcelain.getFirstName());
    }
    if (porcelain.getLastName() != null) {
      builder.setLastName(porcelain.getLastName());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.User> repeatedUserToPorcelain(Collection<User> plumbings) {
    return plumbings.stream()
        .map(plumbing -> userToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<User> repeatedUserToPlumbing(Collection<com.strongdm.api.v1.User> porcelains) {
    return porcelains.stream()
        .map(porcelain -> userToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Service serviceToPorcelain(Service plumbing) {
    com.strongdm.api.v1.Service porcelain = new com.strongdm.api.v1.Service();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    return porcelain;
  }

  public static Service serviceToPlumbing(com.strongdm.api.v1.Service porcelain) {
    if (porcelain == null) {
      return null;
    }
    Service.Builder builder = Service.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Service> repeatedServiceToPorcelain(
      Collection<Service> plumbings) {
    return plumbings.stream()
        .map(plumbing -> serviceToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Service> repeatedServiceToPlumbing(
      Collection<com.strongdm.api.v1.Service> porcelains) {
    return porcelains.stream()
        .map(porcelain -> serviceToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Resource resourceToPorcelain(Resource plumbing) {
    if (plumbing == null) {
      return null;
    }
    if (plumbing.hasAthena()) {
      return athenaToPorcelain(plumbing.getAthena());
    }
    if (plumbing.hasBigQuery()) {
      return bigQueryToPorcelain(plumbing.getBigQuery());
    }
    if (plumbing.hasCassandra()) {
      return cassandraToPorcelain(plumbing.getCassandra());
    }
    if (plumbing.hasDruid()) {
      return druidToPorcelain(plumbing.getDruid());
    }
    if (plumbing.hasDynamoDb()) {
      return dynamoDbToPorcelain(plumbing.getDynamoDb());
    }
    if (plumbing.hasAmazonEs()) {
      return amazonEsToPorcelain(plumbing.getAmazonEs());
    }
    if (plumbing.hasElastic()) {
      return elasticToPorcelain(plumbing.getElastic());
    }
    if (plumbing.hasHttpBasicAuth()) {
      return httpBasicAuthToPorcelain(plumbing.getHttpBasicAuth());
    }
    if (plumbing.hasHttpNoAuth()) {
      return httpNoAuthToPorcelain(plumbing.getHttpNoAuth());
    }
    if (plumbing.hasHttpAuth()) {
      return httpAuthToPorcelain(plumbing.getHttpAuth());
    }
    if (plumbing.hasKubernetes()) {
      return kubernetesToPorcelain(plumbing.getKubernetes());
    }
    if (plumbing.hasKubernetesBasicAuth()) {
      return kubernetesBasicAuthToPorcelain(plumbing.getKubernetesBasicAuth());
    }
    if (plumbing.hasAmazonEks()) {
      return amazonEksToPorcelain(plumbing.getAmazonEks());
    }
    if (plumbing.hasGoogleGke()) {
      return googleGkeToPorcelain(plumbing.getGoogleGke());
    }
    if (plumbing.hasKubernetesServiceAccount()) {
      return kubernetesServiceAccountToPorcelain(plumbing.getKubernetesServiceAccount());
    }
    if (plumbing.hasMemcached()) {
      return memcachedToPorcelain(plumbing.getMemcached());
    }
    if (plumbing.hasMongoLegacyHost()) {
      return mongoLegacyHostToPorcelain(plumbing.getMongoLegacyHost());
    }
    if (plumbing.hasMongoLegacyReplicaset()) {
      return mongoLegacyReplicasetToPorcelain(plumbing.getMongoLegacyReplicaset());
    }
    if (plumbing.hasMongoHost()) {
      return mongoHostToPorcelain(plumbing.getMongoHost());
    }
    if (plumbing.hasMongoReplicaSet()) {
      return mongoReplicaSetToPorcelain(plumbing.getMongoReplicaSet());
    }
    if (plumbing.hasMysql()) {
      return mysqlToPorcelain(plumbing.getMysql());
    }
    if (plumbing.hasAuroraMysql()) {
      return auroraMysqlToPorcelain(plumbing.getAuroraMysql());
    }
    if (plumbing.hasClustrix()) {
      return clustrixToPorcelain(plumbing.getClustrix());
    }
    if (plumbing.hasMaria()) {
      return mariaToPorcelain(plumbing.getMaria());
    }
    if (plumbing.hasMemsql()) {
      return memsqlToPorcelain(plumbing.getMemsql());
    }
    if (plumbing.hasOracle()) {
      return oracleToPorcelain(plumbing.getOracle());
    }
    if (plumbing.hasPostgres()) {
      return postgresToPorcelain(plumbing.getPostgres());
    }
    if (plumbing.hasAuroraPostgres()) {
      return auroraPostgresToPorcelain(plumbing.getAuroraPostgres());
    }
    if (plumbing.hasGreenplum()) {
      return greenplumToPorcelain(plumbing.getGreenplum());
    }
    if (plumbing.hasCockroach()) {
      return cockroachToPorcelain(plumbing.getCockroach());
    }
    if (plumbing.hasRedshift()) {
      return redshiftToPorcelain(plumbing.getRedshift());
    }
    if (plumbing.hasPresto()) {
      return prestoToPorcelain(plumbing.getPresto());
    }
    if (plumbing.hasRdp()) {
      return rdpToPorcelain(plumbing.getRdp());
    }
    if (plumbing.hasRedis()) {
      return redisToPorcelain(plumbing.getRedis());
    }
    if (plumbing.hasElasticacheRedis()) {
      return elasticacheRedisToPorcelain(plumbing.getElasticacheRedis());
    }
    if (plumbing.hasSnowflake()) {
      return snowflakeToPorcelain(plumbing.getSnowflake());
    }
    if (plumbing.hasSqlServer()) {
      return sqlServerToPorcelain(plumbing.getSqlServer());
    }
    if (plumbing.hasSsh()) {
      return sshToPorcelain(plumbing.getSsh());
    }
    if (plumbing.hasSybase()) {
      return sybaseToPorcelain(plumbing.getSybase());
    }
    if (plumbing.hasTeradata()) {
      return teradataToPorcelain(plumbing.getTeradata());
    }
    return null;
  }

  public static Resource resourceToPlumbing(com.strongdm.api.v1.Resource porcelain) {
    if (porcelain == null) {
      return null;
    }
    if (porcelain instanceof com.strongdm.api.v1.Athena) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setAthena(athenaToPlumbing((com.strongdm.api.v1.Athena) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.BigQuery) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setBigQuery(bigQueryToPlumbing((com.strongdm.api.v1.BigQuery) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Cassandra) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setCassandra(cassandraToPlumbing((com.strongdm.api.v1.Cassandra) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Druid) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setDruid(druidToPlumbing((com.strongdm.api.v1.Druid) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.DynamoDB) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setDynamoDb(dynamoDbToPlumbing((com.strongdm.api.v1.DynamoDB) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.AmazonES) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setAmazonEs(amazonEsToPlumbing((com.strongdm.api.v1.AmazonES) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Elastic) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setElastic(elasticToPlumbing((com.strongdm.api.v1.Elastic) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.HTTPBasicAuth) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setHttpBasicAuth(
          httpBasicAuthToPlumbing((com.strongdm.api.v1.HTTPBasicAuth) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.HTTPNoAuth) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setHttpNoAuth(httpNoAuthToPlumbing((com.strongdm.api.v1.HTTPNoAuth) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.HTTPAuth) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setHttpAuth(httpAuthToPlumbing((com.strongdm.api.v1.HTTPAuth) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Kubernetes) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setKubernetes(kubernetesToPlumbing((com.strongdm.api.v1.Kubernetes) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.KubernetesBasicAuth) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setKubernetesBasicAuth(
          kubernetesBasicAuthToPlumbing((com.strongdm.api.v1.KubernetesBasicAuth) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.AmazonEKS) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setAmazonEks(amazonEksToPlumbing((com.strongdm.api.v1.AmazonEKS) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.GoogleGKE) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setGoogleGke(googleGkeToPlumbing((com.strongdm.api.v1.GoogleGKE) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.KubernetesServiceAccount) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setKubernetesServiceAccount(
          kubernetesServiceAccountToPlumbing(
              (com.strongdm.api.v1.KubernetesServiceAccount) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Memcached) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setMemcached(memcachedToPlumbing((com.strongdm.api.v1.Memcached) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.MongoLegacyHost) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setMongoLegacyHost(
          mongoLegacyHostToPlumbing((com.strongdm.api.v1.MongoLegacyHost) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.MongoLegacyReplicaset) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setMongoLegacyReplicaset(
          mongoLegacyReplicasetToPlumbing((com.strongdm.api.v1.MongoLegacyReplicaset) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.MongoHost) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setMongoHost(mongoHostToPlumbing((com.strongdm.api.v1.MongoHost) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.MongoReplicaSet) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setMongoReplicaSet(
          mongoReplicaSetToPlumbing((com.strongdm.api.v1.MongoReplicaSet) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Mysql) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setMysql(mysqlToPlumbing((com.strongdm.api.v1.Mysql) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.AuroraMysql) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setAuroraMysql(auroraMysqlToPlumbing((com.strongdm.api.v1.AuroraMysql) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Clustrix) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setClustrix(clustrixToPlumbing((com.strongdm.api.v1.Clustrix) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Maria) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setMaria(mariaToPlumbing((com.strongdm.api.v1.Maria) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Memsql) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setMemsql(memsqlToPlumbing((com.strongdm.api.v1.Memsql) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Oracle) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setOracle(oracleToPlumbing((com.strongdm.api.v1.Oracle) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Postgres) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setPostgres(postgresToPlumbing((com.strongdm.api.v1.Postgres) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.AuroraPostgres) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setAuroraPostgres(
          auroraPostgresToPlumbing((com.strongdm.api.v1.AuroraPostgres) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Greenplum) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setGreenplum(greenplumToPlumbing((com.strongdm.api.v1.Greenplum) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Cockroach) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setCockroach(cockroachToPlumbing((com.strongdm.api.v1.Cockroach) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Redshift) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setRedshift(redshiftToPlumbing((com.strongdm.api.v1.Redshift) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Presto) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setPresto(prestoToPlumbing((com.strongdm.api.v1.Presto) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.RDP) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setRdp(rdpToPlumbing((com.strongdm.api.v1.RDP) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Redis) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setRedis(redisToPlumbing((com.strongdm.api.v1.Redis) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.ElasticacheRedis) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setElasticacheRedis(
          elasticacheRedisToPlumbing((com.strongdm.api.v1.ElasticacheRedis) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Snowflake) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setSnowflake(snowflakeToPlumbing((com.strongdm.api.v1.Snowflake) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.SQLServer) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setSqlServer(sqlServerToPlumbing((com.strongdm.api.v1.SQLServer) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.SSH) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setSsh(sshToPlumbing((com.strongdm.api.v1.SSH) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Sybase) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setSybase(sybaseToPlumbing((com.strongdm.api.v1.Sybase) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Teradata) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setTeradata(teradataToPlumbing((com.strongdm.api.v1.Teradata) porcelain));
      return builder.build();
    }
    return null;
  }

  public static List<com.strongdm.api.v1.Resource> repeatedResourceToPorcelain(
      Collection<Resource> plumbings) {
    return plumbings.stream()
        .map(plumbing -> resourceToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Resource> repeatedResourceToPlumbing(
      Collection<com.strongdm.api.v1.Resource> porcelains) {
    return porcelains.stream()
        .map(porcelain -> resourceToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Athena athenaToPorcelain(Athena plumbing) {
    com.strongdm.api.v1.Athena porcelain = new com.strongdm.api.v1.Athena();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setAccessKey(plumbing.getAccessKey());
    porcelain.setSecretAccessKey(plumbing.getSecretAccessKey());
    porcelain.setOutput(plumbing.getOutput());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setRegion(plumbing.getRegion());
    return porcelain;
  }

  public static Athena athenaToPlumbing(com.strongdm.api.v1.Athena porcelain) {
    if (porcelain == null) {
      return null;
    }
    Athena.Builder builder = Athena.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getAccessKey() != null) {
      builder.setAccessKey(porcelain.getAccessKey());
    }
    if (porcelain.getSecretAccessKey() != null) {
      builder.setSecretAccessKey(porcelain.getSecretAccessKey());
    }
    if (porcelain.getOutput() != null) {
      builder.setOutput(porcelain.getOutput());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    if (porcelain.getRegion() != null) {
      builder.setRegion(porcelain.getRegion());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Athena> repeatedAthenaToPorcelain(
      Collection<Athena> plumbings) {
    return plumbings.stream()
        .map(plumbing -> athenaToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Athena> repeatedAthenaToPlumbing(
      Collection<com.strongdm.api.v1.Athena> porcelains) {
    return porcelains.stream()
        .map(porcelain -> athenaToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.BigQuery bigQueryToPorcelain(BigQuery plumbing) {
    com.strongdm.api.v1.BigQuery porcelain = new com.strongdm.api.v1.BigQuery();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setPrivateKey(plumbing.getPrivateKey());
    porcelain.setProject(plumbing.getProject());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setEndpoint(plumbing.getEndpoint());
    porcelain.setUsername(plumbing.getUsername());
    return porcelain;
  }

  public static BigQuery bigQueryToPlumbing(com.strongdm.api.v1.BigQuery porcelain) {
    if (porcelain == null) {
      return null;
    }
    BigQuery.Builder builder = BigQuery.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getPrivateKey() != null) {
      builder.setPrivateKey(porcelain.getPrivateKey());
    }
    if (porcelain.getProject() != null) {
      builder.setProject(porcelain.getProject());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    if (porcelain.getEndpoint() != null) {
      builder.setEndpoint(porcelain.getEndpoint());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.BigQuery> repeatedBigQueryToPorcelain(
      Collection<BigQuery> plumbings) {
    return plumbings.stream()
        .map(plumbing -> bigQueryToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<BigQuery> repeatedBigQueryToPlumbing(
      Collection<com.strongdm.api.v1.BigQuery> porcelains) {
    return porcelains.stream()
        .map(porcelain -> bigQueryToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Cassandra cassandraToPorcelain(Cassandra plumbing) {
    com.strongdm.api.v1.Cassandra porcelain = new com.strongdm.api.v1.Cassandra();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    porcelain.setTlsRequired(plumbing.getTlsRequired());
    return porcelain;
  }

  public static Cassandra cassandraToPlumbing(com.strongdm.api.v1.Cassandra porcelain) {
    if (porcelain == null) {
      return null;
    }
    Cassandra.Builder builder = Cassandra.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    builder.setTlsRequired(porcelain.getTlsRequired());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Cassandra> repeatedCassandraToPorcelain(
      Collection<Cassandra> plumbings) {
    return plumbings.stream()
        .map(plumbing -> cassandraToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Cassandra> repeatedCassandraToPlumbing(
      Collection<com.strongdm.api.v1.Cassandra> porcelains) {
    return porcelains.stream()
        .map(porcelain -> cassandraToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Druid druidToPorcelain(Druid plumbing) {
    com.strongdm.api.v1.Druid porcelain = new com.strongdm.api.v1.Druid();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setPort(plumbing.getPort());
    return porcelain;
  }

  public static Druid druidToPlumbing(com.strongdm.api.v1.Druid porcelain) {
    if (porcelain == null) {
      return null;
    }
    Druid.Builder builder = Druid.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    builder.setPort(porcelain.getPort());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Druid> repeatedDruidToPorcelain(
      Collection<Druid> plumbings) {
    return plumbings.stream()
        .map(plumbing -> druidToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Druid> repeatedDruidToPlumbing(
      Collection<com.strongdm.api.v1.Druid> porcelains) {
    return porcelains.stream()
        .map(porcelain -> druidToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.DynamoDB dynamoDbToPorcelain(DynamoDB plumbing) {
    com.strongdm.api.v1.DynamoDB porcelain = new com.strongdm.api.v1.DynamoDB();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setAccessKey(plumbing.getAccessKey());
    porcelain.setSecretAccessKey(plumbing.getSecretAccessKey());
    porcelain.setRegion(plumbing.getRegion());
    porcelain.setEndpoint(plumbing.getEndpoint());
    porcelain.setPortOverride(plumbing.getPortOverride());
    return porcelain;
  }

  public static DynamoDB dynamoDbToPlumbing(com.strongdm.api.v1.DynamoDB porcelain) {
    if (porcelain == null) {
      return null;
    }
    DynamoDB.Builder builder = DynamoDB.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getAccessKey() != null) {
      builder.setAccessKey(porcelain.getAccessKey());
    }
    if (porcelain.getSecretAccessKey() != null) {
      builder.setSecretAccessKey(porcelain.getSecretAccessKey());
    }
    if (porcelain.getRegion() != null) {
      builder.setRegion(porcelain.getRegion());
    }
    if (porcelain.getEndpoint() != null) {
      builder.setEndpoint(porcelain.getEndpoint());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.DynamoDB> repeatedDynamoDBToPorcelain(
      Collection<DynamoDB> plumbings) {
    return plumbings.stream()
        .map(plumbing -> dynamoDbToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<DynamoDB> repeatedDynamoDBToPlumbing(
      Collection<com.strongdm.api.v1.DynamoDB> porcelains) {
    return porcelains.stream()
        .map(porcelain -> dynamoDbToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.AmazonES amazonEsToPorcelain(AmazonES plumbing) {
    com.strongdm.api.v1.AmazonES porcelain = new com.strongdm.api.v1.AmazonES();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setRegion(plumbing.getRegion());
    porcelain.setSecretAccessKey(plumbing.getSecretAccessKey());
    porcelain.setEndpoint(plumbing.getEndpoint());
    porcelain.setAccessKey(plumbing.getAccessKey());
    porcelain.setPortOverride(plumbing.getPortOverride());
    return porcelain;
  }

  public static AmazonES amazonEsToPlumbing(com.strongdm.api.v1.AmazonES porcelain) {
    if (porcelain == null) {
      return null;
    }
    AmazonES.Builder builder = AmazonES.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getRegion() != null) {
      builder.setRegion(porcelain.getRegion());
    }
    if (porcelain.getSecretAccessKey() != null) {
      builder.setSecretAccessKey(porcelain.getSecretAccessKey());
    }
    if (porcelain.getEndpoint() != null) {
      builder.setEndpoint(porcelain.getEndpoint());
    }
    if (porcelain.getAccessKey() != null) {
      builder.setAccessKey(porcelain.getAccessKey());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.AmazonES> repeatedAmazonESToPorcelain(
      Collection<AmazonES> plumbings) {
    return plumbings.stream()
        .map(plumbing -> amazonEsToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<AmazonES> repeatedAmazonESToPlumbing(
      Collection<com.strongdm.api.v1.AmazonES> porcelains) {
    return porcelains.stream()
        .map(porcelain -> amazonEsToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Elastic elasticToPorcelain(Elastic plumbing) {
    com.strongdm.api.v1.Elastic porcelain = new com.strongdm.api.v1.Elastic();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    porcelain.setTlsRequired(plumbing.getTlsRequired());
    return porcelain;
  }

  public static Elastic elasticToPlumbing(com.strongdm.api.v1.Elastic porcelain) {
    if (porcelain == null) {
      return null;
    }
    Elastic.Builder builder = Elastic.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    builder.setTlsRequired(porcelain.getTlsRequired());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Elastic> repeatedElasticToPorcelain(
      Collection<Elastic> plumbings) {
    return plumbings.stream()
        .map(plumbing -> elasticToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Elastic> repeatedElasticToPlumbing(
      Collection<com.strongdm.api.v1.Elastic> porcelains) {
    return porcelains.stream()
        .map(porcelain -> elasticToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.HTTPBasicAuth httpBasicAuthToPorcelain(HTTPBasicAuth plumbing) {
    com.strongdm.api.v1.HTTPBasicAuth porcelain = new com.strongdm.api.v1.HTTPBasicAuth();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setUrl(plumbing.getUrl());
    porcelain.setHealthcheckPath(plumbing.getHealthcheckPath());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setHeadersBlacklist(plumbing.getHeadersBlacklist());
    porcelain.setDefaultPath(plumbing.getDefaultPath());
    porcelain.setSubdomain(plumbing.getSubdomain());
    return porcelain;
  }

  public static HTTPBasicAuth httpBasicAuthToPlumbing(com.strongdm.api.v1.HTTPBasicAuth porcelain) {
    if (porcelain == null) {
      return null;
    }
    HTTPBasicAuth.Builder builder = HTTPBasicAuth.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getUrl() != null) {
      builder.setUrl(porcelain.getUrl());
    }
    if (porcelain.getHealthcheckPath() != null) {
      builder.setHealthcheckPath(porcelain.getHealthcheckPath());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getHeadersBlacklist() != null) {
      builder.setHeadersBlacklist(porcelain.getHeadersBlacklist());
    }
    if (porcelain.getDefaultPath() != null) {
      builder.setDefaultPath(porcelain.getDefaultPath());
    }
    if (porcelain.getSubdomain() != null) {
      builder.setSubdomain(porcelain.getSubdomain());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.HTTPBasicAuth> repeatedHTTPBasicAuthToPorcelain(
      Collection<HTTPBasicAuth> plumbings) {
    return plumbings.stream()
        .map(plumbing -> httpBasicAuthToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<HTTPBasicAuth> repeatedHTTPBasicAuthToPlumbing(
      Collection<com.strongdm.api.v1.HTTPBasicAuth> porcelains) {
    return porcelains.stream()
        .map(porcelain -> httpBasicAuthToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.HTTPNoAuth httpNoAuthToPorcelain(HTTPNoAuth plumbing) {
    com.strongdm.api.v1.HTTPNoAuth porcelain = new com.strongdm.api.v1.HTTPNoAuth();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setUrl(plumbing.getUrl());
    porcelain.setHealthcheckPath(plumbing.getHealthcheckPath());
    porcelain.setHeadersBlacklist(plumbing.getHeadersBlacklist());
    porcelain.setDefaultPath(plumbing.getDefaultPath());
    porcelain.setSubdomain(plumbing.getSubdomain());
    return porcelain;
  }

  public static HTTPNoAuth httpNoAuthToPlumbing(com.strongdm.api.v1.HTTPNoAuth porcelain) {
    if (porcelain == null) {
      return null;
    }
    HTTPNoAuth.Builder builder = HTTPNoAuth.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getUrl() != null) {
      builder.setUrl(porcelain.getUrl());
    }
    if (porcelain.getHealthcheckPath() != null) {
      builder.setHealthcheckPath(porcelain.getHealthcheckPath());
    }
    if (porcelain.getHeadersBlacklist() != null) {
      builder.setHeadersBlacklist(porcelain.getHeadersBlacklist());
    }
    if (porcelain.getDefaultPath() != null) {
      builder.setDefaultPath(porcelain.getDefaultPath());
    }
    if (porcelain.getSubdomain() != null) {
      builder.setSubdomain(porcelain.getSubdomain());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.HTTPNoAuth> repeatedHTTPNoAuthToPorcelain(
      Collection<HTTPNoAuth> plumbings) {
    return plumbings.stream()
        .map(plumbing -> httpNoAuthToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<HTTPNoAuth> repeatedHTTPNoAuthToPlumbing(
      Collection<com.strongdm.api.v1.HTTPNoAuth> porcelains) {
    return porcelains.stream()
        .map(porcelain -> httpNoAuthToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.HTTPAuth httpAuthToPorcelain(HTTPAuth plumbing) {
    com.strongdm.api.v1.HTTPAuth porcelain = new com.strongdm.api.v1.HTTPAuth();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setUrl(plumbing.getUrl());
    porcelain.setHealthcheckPath(plumbing.getHealthcheckPath());
    porcelain.setAuthHeader(plumbing.getAuthHeader());
    porcelain.setHeadersBlacklist(plumbing.getHeadersBlacklist());
    porcelain.setDefaultPath(plumbing.getDefaultPath());
    porcelain.setSubdomain(plumbing.getSubdomain());
    return porcelain;
  }

  public static HTTPAuth httpAuthToPlumbing(com.strongdm.api.v1.HTTPAuth porcelain) {
    if (porcelain == null) {
      return null;
    }
    HTTPAuth.Builder builder = HTTPAuth.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getUrl() != null) {
      builder.setUrl(porcelain.getUrl());
    }
    if (porcelain.getHealthcheckPath() != null) {
      builder.setHealthcheckPath(porcelain.getHealthcheckPath());
    }
    if (porcelain.getAuthHeader() != null) {
      builder.setAuthHeader(porcelain.getAuthHeader());
    }
    if (porcelain.getHeadersBlacklist() != null) {
      builder.setHeadersBlacklist(porcelain.getHeadersBlacklist());
    }
    if (porcelain.getDefaultPath() != null) {
      builder.setDefaultPath(porcelain.getDefaultPath());
    }
    if (porcelain.getSubdomain() != null) {
      builder.setSubdomain(porcelain.getSubdomain());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.HTTPAuth> repeatedHTTPAuthToPorcelain(
      Collection<HTTPAuth> plumbings) {
    return plumbings.stream()
        .map(plumbing -> httpAuthToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<HTTPAuth> repeatedHTTPAuthToPlumbing(
      Collection<com.strongdm.api.v1.HTTPAuth> porcelains) {
    return porcelains.stream()
        .map(porcelain -> httpAuthToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Kubernetes kubernetesToPorcelain(Kubernetes plumbing) {
    com.strongdm.api.v1.Kubernetes porcelain = new com.strongdm.api.v1.Kubernetes();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setPort(plumbing.getPort());
    porcelain.setCertificateAuthority(plumbing.getCertificateAuthority());
    porcelain.setCertificateAuthorityFilename(plumbing.getCertificateAuthorityFilename());
    porcelain.setClientCertificate(plumbing.getClientCertificate());
    porcelain.setClientCertificateFilename(plumbing.getClientCertificateFilename());
    porcelain.setClientKey(plumbing.getClientKey());
    porcelain.setClientKeyFilename(plumbing.getClientKeyFilename());
    return porcelain;
  }

  public static Kubernetes kubernetesToPlumbing(com.strongdm.api.v1.Kubernetes porcelain) {
    if (porcelain == null) {
      return null;
    }
    Kubernetes.Builder builder = Kubernetes.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    builder.setPort(porcelain.getPort());
    if (porcelain.getCertificateAuthority() != null) {
      builder.setCertificateAuthority(porcelain.getCertificateAuthority());
    }
    if (porcelain.getCertificateAuthorityFilename() != null) {
      builder.setCertificateAuthorityFilename(porcelain.getCertificateAuthorityFilename());
    }
    if (porcelain.getClientCertificate() != null) {
      builder.setClientCertificate(porcelain.getClientCertificate());
    }
    if (porcelain.getClientCertificateFilename() != null) {
      builder.setClientCertificateFilename(porcelain.getClientCertificateFilename());
    }
    if (porcelain.getClientKey() != null) {
      builder.setClientKey(porcelain.getClientKey());
    }
    if (porcelain.getClientKeyFilename() != null) {
      builder.setClientKeyFilename(porcelain.getClientKeyFilename());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Kubernetes> repeatedKubernetesToPorcelain(
      Collection<Kubernetes> plumbings) {
    return plumbings.stream()
        .map(plumbing -> kubernetesToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Kubernetes> repeatedKubernetesToPlumbing(
      Collection<com.strongdm.api.v1.Kubernetes> porcelains) {
    return porcelains.stream()
        .map(porcelain -> kubernetesToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.KubernetesBasicAuth kubernetesBasicAuthToPorcelain(
      KubernetesBasicAuth plumbing) {
    com.strongdm.api.v1.KubernetesBasicAuth porcelain =
        new com.strongdm.api.v1.KubernetesBasicAuth();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setPort(plumbing.getPort());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    return porcelain;
  }

  public static KubernetesBasicAuth kubernetesBasicAuthToPlumbing(
      com.strongdm.api.v1.KubernetesBasicAuth porcelain) {
    if (porcelain == null) {
      return null;
    }
    KubernetesBasicAuth.Builder builder = KubernetesBasicAuth.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    builder.setPort(porcelain.getPort());
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.KubernetesBasicAuth>
      repeatedKubernetesBasicAuthToPorcelain(Collection<KubernetesBasicAuth> plumbings) {
    return plumbings.stream()
        .map(plumbing -> kubernetesBasicAuthToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<KubernetesBasicAuth> repeatedKubernetesBasicAuthToPlumbing(
      Collection<com.strongdm.api.v1.KubernetesBasicAuth> porcelains) {
    return porcelains.stream()
        .map(porcelain -> kubernetesBasicAuthToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.AmazonEKS amazonEksToPorcelain(AmazonEKS plumbing) {
    com.strongdm.api.v1.AmazonEKS porcelain = new com.strongdm.api.v1.AmazonEKS();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setEndpoint(plumbing.getEndpoint());
    porcelain.setAccessKey(plumbing.getAccessKey());
    porcelain.setSecretAccessKey(plumbing.getSecretAccessKey());
    porcelain.setCertificateAuthority(plumbing.getCertificateAuthority());
    porcelain.setCertificateAuthorityFilename(plumbing.getCertificateAuthorityFilename());
    porcelain.setRegion(plumbing.getRegion());
    porcelain.setClusterName(plumbing.getClusterName());
    return porcelain;
  }

  public static AmazonEKS amazonEksToPlumbing(com.strongdm.api.v1.AmazonEKS porcelain) {
    if (porcelain == null) {
      return null;
    }
    AmazonEKS.Builder builder = AmazonEKS.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getEndpoint() != null) {
      builder.setEndpoint(porcelain.getEndpoint());
    }
    if (porcelain.getAccessKey() != null) {
      builder.setAccessKey(porcelain.getAccessKey());
    }
    if (porcelain.getSecretAccessKey() != null) {
      builder.setSecretAccessKey(porcelain.getSecretAccessKey());
    }
    if (porcelain.getCertificateAuthority() != null) {
      builder.setCertificateAuthority(porcelain.getCertificateAuthority());
    }
    if (porcelain.getCertificateAuthorityFilename() != null) {
      builder.setCertificateAuthorityFilename(porcelain.getCertificateAuthorityFilename());
    }
    if (porcelain.getRegion() != null) {
      builder.setRegion(porcelain.getRegion());
    }
    if (porcelain.getClusterName() != null) {
      builder.setClusterName(porcelain.getClusterName());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.AmazonEKS> repeatedAmazonEKSToPorcelain(
      Collection<AmazonEKS> plumbings) {
    return plumbings.stream()
        .map(plumbing -> amazonEksToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<AmazonEKS> repeatedAmazonEKSToPlumbing(
      Collection<com.strongdm.api.v1.AmazonEKS> porcelains) {
    return porcelains.stream()
        .map(porcelain -> amazonEksToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.GoogleGKE googleGkeToPorcelain(GoogleGKE plumbing) {
    com.strongdm.api.v1.GoogleGKE porcelain = new com.strongdm.api.v1.GoogleGKE();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setEndpoint(plumbing.getEndpoint());
    porcelain.setCertificateAuthority(plumbing.getCertificateAuthority());
    porcelain.setCertificateAuthorityFilename(plumbing.getCertificateAuthorityFilename());
    porcelain.setServiceAccountKey(plumbing.getServiceAccountKey());
    porcelain.setServiceAccountKeyFilename(plumbing.getServiceAccountKeyFilename());
    return porcelain;
  }

  public static GoogleGKE googleGkeToPlumbing(com.strongdm.api.v1.GoogleGKE porcelain) {
    if (porcelain == null) {
      return null;
    }
    GoogleGKE.Builder builder = GoogleGKE.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getEndpoint() != null) {
      builder.setEndpoint(porcelain.getEndpoint());
    }
    if (porcelain.getCertificateAuthority() != null) {
      builder.setCertificateAuthority(porcelain.getCertificateAuthority());
    }
    if (porcelain.getCertificateAuthorityFilename() != null) {
      builder.setCertificateAuthorityFilename(porcelain.getCertificateAuthorityFilename());
    }
    if (porcelain.getServiceAccountKey() != null) {
      builder.setServiceAccountKey(porcelain.getServiceAccountKey());
    }
    if (porcelain.getServiceAccountKeyFilename() != null) {
      builder.setServiceAccountKeyFilename(porcelain.getServiceAccountKeyFilename());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.GoogleGKE> repeatedGoogleGKEToPorcelain(
      Collection<GoogleGKE> plumbings) {
    return plumbings.stream()
        .map(plumbing -> googleGkeToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<GoogleGKE> repeatedGoogleGKEToPlumbing(
      Collection<com.strongdm.api.v1.GoogleGKE> porcelains) {
    return porcelains.stream()
        .map(porcelain -> googleGkeToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.KubernetesServiceAccount kubernetesServiceAccountToPorcelain(
      KubernetesServiceAccount plumbing) {
    com.strongdm.api.v1.KubernetesServiceAccount porcelain =
        new com.strongdm.api.v1.KubernetesServiceAccount();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setPort(plumbing.getPort());
    porcelain.setToken(plumbing.getToken());
    return porcelain;
  }

  public static KubernetesServiceAccount kubernetesServiceAccountToPlumbing(
      com.strongdm.api.v1.KubernetesServiceAccount porcelain) {
    if (porcelain == null) {
      return null;
    }
    KubernetesServiceAccount.Builder builder = KubernetesServiceAccount.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    builder.setPort(porcelain.getPort());
    if (porcelain.getToken() != null) {
      builder.setToken(porcelain.getToken());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.KubernetesServiceAccount>
      repeatedKubernetesServiceAccountToPorcelain(Collection<KubernetesServiceAccount> plumbings) {
    return plumbings.stream()
        .map(plumbing -> kubernetesServiceAccountToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<KubernetesServiceAccount> repeatedKubernetesServiceAccountToPlumbing(
      Collection<com.strongdm.api.v1.KubernetesServiceAccount> porcelains) {
    return porcelains.stream()
        .map(porcelain -> kubernetesServiceAccountToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Memcached memcachedToPorcelain(Memcached plumbing) {
    com.strongdm.api.v1.Memcached porcelain = new com.strongdm.api.v1.Memcached();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    return porcelain;
  }

  public static Memcached memcachedToPlumbing(com.strongdm.api.v1.Memcached porcelain) {
    if (porcelain == null) {
      return null;
    }
    Memcached.Builder builder = Memcached.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Memcached> repeatedMemcachedToPorcelain(
      Collection<Memcached> plumbings) {
    return plumbings.stream()
        .map(plumbing -> memcachedToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Memcached> repeatedMemcachedToPlumbing(
      Collection<com.strongdm.api.v1.Memcached> porcelains) {
    return porcelains.stream()
        .map(porcelain -> memcachedToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.MongoLegacyHost mongoLegacyHostToPorcelain(
      MongoLegacyHost plumbing) {
    com.strongdm.api.v1.MongoLegacyHost porcelain = new com.strongdm.api.v1.MongoLegacyHost();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setAuthDatabase(plumbing.getAuthDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setPort(plumbing.getPort());
    porcelain.setReplicaSet(plumbing.getReplicaSet());
    porcelain.setTlsRequired(plumbing.getTlsRequired());
    return porcelain;
  }

  public static MongoLegacyHost mongoLegacyHostToPlumbing(
      com.strongdm.api.v1.MongoLegacyHost porcelain) {
    if (porcelain == null) {
      return null;
    }
    MongoLegacyHost.Builder builder = MongoLegacyHost.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getAuthDatabase() != null) {
      builder.setAuthDatabase(porcelain.getAuthDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    builder.setPort(porcelain.getPort());
    if (porcelain.getReplicaSet() != null) {
      builder.setReplicaSet(porcelain.getReplicaSet());
    }
    builder.setTlsRequired(porcelain.getTlsRequired());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.MongoLegacyHost> repeatedMongoLegacyHostToPorcelain(
      Collection<MongoLegacyHost> plumbings) {
    return plumbings.stream()
        .map(plumbing -> mongoLegacyHostToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<MongoLegacyHost> repeatedMongoLegacyHostToPlumbing(
      Collection<com.strongdm.api.v1.MongoLegacyHost> porcelains) {
    return porcelains.stream()
        .map(porcelain -> mongoLegacyHostToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.MongoLegacyReplicaset mongoLegacyReplicasetToPorcelain(
      MongoLegacyReplicaset plumbing) {
    com.strongdm.api.v1.MongoLegacyReplicaset porcelain =
        new com.strongdm.api.v1.MongoLegacyReplicaset();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setAuthDatabase(plumbing.getAuthDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setPort(plumbing.getPort());
    porcelain.setReplicaSet(plumbing.getReplicaSet());
    porcelain.setConnectToReplica(plumbing.getConnectToReplica());
    porcelain.setTlsRequired(plumbing.getTlsRequired());
    return porcelain;
  }

  public static MongoLegacyReplicaset mongoLegacyReplicasetToPlumbing(
      com.strongdm.api.v1.MongoLegacyReplicaset porcelain) {
    if (porcelain == null) {
      return null;
    }
    MongoLegacyReplicaset.Builder builder = MongoLegacyReplicaset.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getAuthDatabase() != null) {
      builder.setAuthDatabase(porcelain.getAuthDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    builder.setPort(porcelain.getPort());
    if (porcelain.getReplicaSet() != null) {
      builder.setReplicaSet(porcelain.getReplicaSet());
    }
    builder.setConnectToReplica(porcelain.getConnectToReplica());
    builder.setTlsRequired(porcelain.getTlsRequired());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.MongoLegacyReplicaset>
      repeatedMongoLegacyReplicasetToPorcelain(Collection<MongoLegacyReplicaset> plumbings) {
    return plumbings.stream()
        .map(plumbing -> mongoLegacyReplicasetToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<MongoLegacyReplicaset> repeatedMongoLegacyReplicasetToPlumbing(
      Collection<com.strongdm.api.v1.MongoLegacyReplicaset> porcelains) {
    return porcelains.stream()
        .map(porcelain -> mongoLegacyReplicasetToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.MongoHost mongoHostToPorcelain(MongoHost plumbing) {
    com.strongdm.api.v1.MongoHost porcelain = new com.strongdm.api.v1.MongoHost();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setAuthDatabase(plumbing.getAuthDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setPort(plumbing.getPort());
    porcelain.setTlsRequired(plumbing.getTlsRequired());
    return porcelain;
  }

  public static MongoHost mongoHostToPlumbing(com.strongdm.api.v1.MongoHost porcelain) {
    if (porcelain == null) {
      return null;
    }
    MongoHost.Builder builder = MongoHost.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getAuthDatabase() != null) {
      builder.setAuthDatabase(porcelain.getAuthDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    builder.setPort(porcelain.getPort());
    builder.setTlsRequired(porcelain.getTlsRequired());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.MongoHost> repeatedMongoHostToPorcelain(
      Collection<MongoHost> plumbings) {
    return plumbings.stream()
        .map(plumbing -> mongoHostToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<MongoHost> repeatedMongoHostToPlumbing(
      Collection<com.strongdm.api.v1.MongoHost> porcelains) {
    return porcelains.stream()
        .map(porcelain -> mongoHostToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.MongoReplicaSet mongoReplicaSetToPorcelain(
      MongoReplicaSet plumbing) {
    com.strongdm.api.v1.MongoReplicaSet porcelain = new com.strongdm.api.v1.MongoReplicaSet();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setAuthDatabase(plumbing.getAuthDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setPort(plumbing.getPort());
    porcelain.setReplicaSet(plumbing.getReplicaSet());
    porcelain.setConnectToReplica(plumbing.getConnectToReplica());
    porcelain.setTlsRequired(plumbing.getTlsRequired());
    return porcelain;
  }

  public static MongoReplicaSet mongoReplicaSetToPlumbing(
      com.strongdm.api.v1.MongoReplicaSet porcelain) {
    if (porcelain == null) {
      return null;
    }
    MongoReplicaSet.Builder builder = MongoReplicaSet.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getAuthDatabase() != null) {
      builder.setAuthDatabase(porcelain.getAuthDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    builder.setPort(porcelain.getPort());
    if (porcelain.getReplicaSet() != null) {
      builder.setReplicaSet(porcelain.getReplicaSet());
    }
    builder.setConnectToReplica(porcelain.getConnectToReplica());
    builder.setTlsRequired(porcelain.getTlsRequired());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.MongoReplicaSet> repeatedMongoReplicaSetToPorcelain(
      Collection<MongoReplicaSet> plumbings) {
    return plumbings.stream()
        .map(plumbing -> mongoReplicaSetToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<MongoReplicaSet> repeatedMongoReplicaSetToPlumbing(
      Collection<com.strongdm.api.v1.MongoReplicaSet> porcelains) {
    return porcelains.stream()
        .map(porcelain -> mongoReplicaSetToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Mysql mysqlToPorcelain(Mysql plumbing) {
    com.strongdm.api.v1.Mysql porcelain = new com.strongdm.api.v1.Mysql();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    return porcelain;
  }

  public static Mysql mysqlToPlumbing(com.strongdm.api.v1.Mysql porcelain) {
    if (porcelain == null) {
      return null;
    }
    Mysql.Builder builder = Mysql.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Mysql> repeatedMysqlToPorcelain(
      Collection<Mysql> plumbings) {
    return plumbings.stream()
        .map(plumbing -> mysqlToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Mysql> repeatedMysqlToPlumbing(
      Collection<com.strongdm.api.v1.Mysql> porcelains) {
    return porcelains.stream()
        .map(porcelain -> mysqlToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.AuroraMysql auroraMysqlToPorcelain(AuroraMysql plumbing) {
    com.strongdm.api.v1.AuroraMysql porcelain = new com.strongdm.api.v1.AuroraMysql();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    return porcelain;
  }

  public static AuroraMysql auroraMysqlToPlumbing(com.strongdm.api.v1.AuroraMysql porcelain) {
    if (porcelain == null) {
      return null;
    }
    AuroraMysql.Builder builder = AuroraMysql.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.AuroraMysql> repeatedAuroraMysqlToPorcelain(
      Collection<AuroraMysql> plumbings) {
    return plumbings.stream()
        .map(plumbing -> auroraMysqlToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<AuroraMysql> repeatedAuroraMysqlToPlumbing(
      Collection<com.strongdm.api.v1.AuroraMysql> porcelains) {
    return porcelains.stream()
        .map(porcelain -> auroraMysqlToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Clustrix clustrixToPorcelain(Clustrix plumbing) {
    com.strongdm.api.v1.Clustrix porcelain = new com.strongdm.api.v1.Clustrix();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    return porcelain;
  }

  public static Clustrix clustrixToPlumbing(com.strongdm.api.v1.Clustrix porcelain) {
    if (porcelain == null) {
      return null;
    }
    Clustrix.Builder builder = Clustrix.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Clustrix> repeatedClustrixToPorcelain(
      Collection<Clustrix> plumbings) {
    return plumbings.stream()
        .map(plumbing -> clustrixToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Clustrix> repeatedClustrixToPlumbing(
      Collection<com.strongdm.api.v1.Clustrix> porcelains) {
    return porcelains.stream()
        .map(porcelain -> clustrixToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Maria mariaToPorcelain(Maria plumbing) {
    com.strongdm.api.v1.Maria porcelain = new com.strongdm.api.v1.Maria();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    return porcelain;
  }

  public static Maria mariaToPlumbing(com.strongdm.api.v1.Maria porcelain) {
    if (porcelain == null) {
      return null;
    }
    Maria.Builder builder = Maria.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Maria> repeatedMariaToPorcelain(
      Collection<Maria> plumbings) {
    return plumbings.stream()
        .map(plumbing -> mariaToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Maria> repeatedMariaToPlumbing(
      Collection<com.strongdm.api.v1.Maria> porcelains) {
    return porcelains.stream()
        .map(porcelain -> mariaToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Memsql memsqlToPorcelain(Memsql plumbing) {
    com.strongdm.api.v1.Memsql porcelain = new com.strongdm.api.v1.Memsql();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    return porcelain;
  }

  public static Memsql memsqlToPlumbing(com.strongdm.api.v1.Memsql porcelain) {
    if (porcelain == null) {
      return null;
    }
    Memsql.Builder builder = Memsql.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Memsql> repeatedMemsqlToPorcelain(
      Collection<Memsql> plumbings) {
    return plumbings.stream()
        .map(plumbing -> memsqlToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Memsql> repeatedMemsqlToPlumbing(
      Collection<com.strongdm.api.v1.Memsql> porcelains) {
    return porcelains.stream()
        .map(porcelain -> memsqlToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Oracle oracleToPorcelain(Oracle plumbing) {
    com.strongdm.api.v1.Oracle porcelain = new com.strongdm.api.v1.Oracle();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPort(plumbing.getPort());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setTlsRequired(plumbing.getTlsRequired());
    return porcelain;
  }

  public static Oracle oracleToPlumbing(com.strongdm.api.v1.Oracle porcelain) {
    if (porcelain == null) {
      return null;
    }
    Oracle.Builder builder = Oracle.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPort(porcelain.getPort());
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setTlsRequired(porcelain.getTlsRequired());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Oracle> repeatedOracleToPorcelain(
      Collection<Oracle> plumbings) {
    return plumbings.stream()
        .map(plumbing -> oracleToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Oracle> repeatedOracleToPlumbing(
      Collection<com.strongdm.api.v1.Oracle> porcelains) {
    return porcelains.stream()
        .map(porcelain -> oracleToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Postgres postgresToPorcelain(Postgres plumbing) {
    com.strongdm.api.v1.Postgres porcelain = new com.strongdm.api.v1.Postgres();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    porcelain.setOverrideDatabase(plumbing.getOverrideDatabase());
    return porcelain;
  }

  public static Postgres postgresToPlumbing(com.strongdm.api.v1.Postgres porcelain) {
    if (porcelain == null) {
      return null;
    }
    Postgres.Builder builder = Postgres.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    builder.setOverrideDatabase(porcelain.getOverrideDatabase());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Postgres> repeatedPostgresToPorcelain(
      Collection<Postgres> plumbings) {
    return plumbings.stream()
        .map(plumbing -> postgresToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Postgres> repeatedPostgresToPlumbing(
      Collection<com.strongdm.api.v1.Postgres> porcelains) {
    return porcelains.stream()
        .map(porcelain -> postgresToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.AuroraPostgres auroraPostgresToPorcelain(
      AuroraPostgres plumbing) {
    com.strongdm.api.v1.AuroraPostgres porcelain = new com.strongdm.api.v1.AuroraPostgres();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    porcelain.setOverrideDatabase(plumbing.getOverrideDatabase());
    return porcelain;
  }

  public static AuroraPostgres auroraPostgresToPlumbing(
      com.strongdm.api.v1.AuroraPostgres porcelain) {
    if (porcelain == null) {
      return null;
    }
    AuroraPostgres.Builder builder = AuroraPostgres.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    builder.setOverrideDatabase(porcelain.getOverrideDatabase());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.AuroraPostgres> repeatedAuroraPostgresToPorcelain(
      Collection<AuroraPostgres> plumbings) {
    return plumbings.stream()
        .map(plumbing -> auroraPostgresToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<AuroraPostgres> repeatedAuroraPostgresToPlumbing(
      Collection<com.strongdm.api.v1.AuroraPostgres> porcelains) {
    return porcelains.stream()
        .map(porcelain -> auroraPostgresToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Greenplum greenplumToPorcelain(Greenplum plumbing) {
    com.strongdm.api.v1.Greenplum porcelain = new com.strongdm.api.v1.Greenplum();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    porcelain.setOverrideDatabase(plumbing.getOverrideDatabase());
    return porcelain;
  }

  public static Greenplum greenplumToPlumbing(com.strongdm.api.v1.Greenplum porcelain) {
    if (porcelain == null) {
      return null;
    }
    Greenplum.Builder builder = Greenplum.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    builder.setOverrideDatabase(porcelain.getOverrideDatabase());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Greenplum> repeatedGreenplumToPorcelain(
      Collection<Greenplum> plumbings) {
    return plumbings.stream()
        .map(plumbing -> greenplumToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Greenplum> repeatedGreenplumToPlumbing(
      Collection<com.strongdm.api.v1.Greenplum> porcelains) {
    return porcelains.stream()
        .map(porcelain -> greenplumToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Cockroach cockroachToPorcelain(Cockroach plumbing) {
    com.strongdm.api.v1.Cockroach porcelain = new com.strongdm.api.v1.Cockroach();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    porcelain.setOverrideDatabase(plumbing.getOverrideDatabase());
    return porcelain;
  }

  public static Cockroach cockroachToPlumbing(com.strongdm.api.v1.Cockroach porcelain) {
    if (porcelain == null) {
      return null;
    }
    Cockroach.Builder builder = Cockroach.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    builder.setOverrideDatabase(porcelain.getOverrideDatabase());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Cockroach> repeatedCockroachToPorcelain(
      Collection<Cockroach> plumbings) {
    return plumbings.stream()
        .map(plumbing -> cockroachToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Cockroach> repeatedCockroachToPlumbing(
      Collection<com.strongdm.api.v1.Cockroach> porcelains) {
    return porcelains.stream()
        .map(porcelain -> cockroachToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Redshift redshiftToPorcelain(Redshift plumbing) {
    com.strongdm.api.v1.Redshift porcelain = new com.strongdm.api.v1.Redshift();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    porcelain.setOverrideDatabase(plumbing.getOverrideDatabase());
    return porcelain;
  }

  public static Redshift redshiftToPlumbing(com.strongdm.api.v1.Redshift porcelain) {
    if (porcelain == null) {
      return null;
    }
    Redshift.Builder builder = Redshift.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    builder.setOverrideDatabase(porcelain.getOverrideDatabase());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Redshift> repeatedRedshiftToPorcelain(
      Collection<Redshift> plumbings) {
    return plumbings.stream()
        .map(plumbing -> redshiftToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Redshift> repeatedRedshiftToPlumbing(
      Collection<com.strongdm.api.v1.Redshift> porcelains) {
    return porcelains.stream()
        .map(porcelain -> redshiftToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Presto prestoToPorcelain(Presto plumbing) {
    com.strongdm.api.v1.Presto porcelain = new com.strongdm.api.v1.Presto();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setTlsRequired(plumbing.getTlsRequired());
    return porcelain;
  }

  public static Presto prestoToPlumbing(com.strongdm.api.v1.Presto porcelain) {
    if (porcelain == null) {
      return null;
    }
    Presto.Builder builder = Presto.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    builder.setTlsRequired(porcelain.getTlsRequired());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Presto> repeatedPrestoToPorcelain(
      Collection<Presto> plumbings) {
    return plumbings.stream()
        .map(plumbing -> prestoToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Presto> repeatedPrestoToPlumbing(
      Collection<com.strongdm.api.v1.Presto> porcelains) {
    return porcelains.stream()
        .map(porcelain -> prestoToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.RDP rdpToPorcelain(RDP plumbing) {
    com.strongdm.api.v1.RDP porcelain = new com.strongdm.api.v1.RDP();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    return porcelain;
  }

  public static RDP rdpToPlumbing(com.strongdm.api.v1.RDP porcelain) {
    if (porcelain == null) {
      return null;
    }
    RDP.Builder builder = RDP.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.RDP> repeatedRDPToPorcelain(Collection<RDP> plumbings) {
    return plumbings.stream()
        .map(plumbing -> rdpToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<RDP> repeatedRDPToPlumbing(Collection<com.strongdm.api.v1.RDP> porcelains) {
    return porcelains.stream()
        .map(porcelain -> rdpToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Redis redisToPorcelain(Redis plumbing) {
    com.strongdm.api.v1.Redis porcelain = new com.strongdm.api.v1.Redis();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setPort(plumbing.getPort());
    return porcelain;
  }

  public static Redis redisToPlumbing(com.strongdm.api.v1.Redis porcelain) {
    if (porcelain == null) {
      return null;
    }
    Redis.Builder builder = Redis.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    builder.setPort(porcelain.getPort());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Redis> repeatedRedisToPorcelain(
      Collection<Redis> plumbings) {
    return plumbings.stream()
        .map(plumbing -> redisToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Redis> repeatedRedisToPlumbing(
      Collection<com.strongdm.api.v1.Redis> porcelains) {
    return porcelains.stream()
        .map(porcelain -> redisToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.ElasticacheRedis elasticacheRedisToPorcelain(
      ElasticacheRedis plumbing) {
    com.strongdm.api.v1.ElasticacheRedis porcelain = new com.strongdm.api.v1.ElasticacheRedis();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setPort(plumbing.getPort());
    porcelain.setTlsRequired(plumbing.getTlsRequired());
    return porcelain;
  }

  public static ElasticacheRedis elasticacheRedisToPlumbing(
      com.strongdm.api.v1.ElasticacheRedis porcelain) {
    if (porcelain == null) {
      return null;
    }
    ElasticacheRedis.Builder builder = ElasticacheRedis.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    builder.setPort(porcelain.getPort());
    builder.setTlsRequired(porcelain.getTlsRequired());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.ElasticacheRedis> repeatedElasticacheRedisToPorcelain(
      Collection<ElasticacheRedis> plumbings) {
    return plumbings.stream()
        .map(plumbing -> elasticacheRedisToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<ElasticacheRedis> repeatedElasticacheRedisToPlumbing(
      Collection<com.strongdm.api.v1.ElasticacheRedis> porcelains) {
    return porcelains.stream()
        .map(porcelain -> elasticacheRedisToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Snowflake snowflakeToPorcelain(Snowflake plumbing) {
    com.strongdm.api.v1.Snowflake porcelain = new com.strongdm.api.v1.Snowflake();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setSchema(plumbing.getSchema());
    porcelain.setPortOverride(plumbing.getPortOverride());
    return porcelain;
  }

  public static Snowflake snowflakeToPlumbing(com.strongdm.api.v1.Snowflake porcelain) {
    if (porcelain == null) {
      return null;
    }
    Snowflake.Builder builder = Snowflake.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    if (porcelain.getSchema() != null) {
      builder.setSchema(porcelain.getSchema());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Snowflake> repeatedSnowflakeToPorcelain(
      Collection<Snowflake> plumbings) {
    return plumbings.stream()
        .map(plumbing -> snowflakeToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Snowflake> repeatedSnowflakeToPlumbing(
      Collection<com.strongdm.api.v1.Snowflake> porcelains) {
    return porcelains.stream()
        .map(porcelain -> snowflakeToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.SQLServer sqlServerToPorcelain(SQLServer plumbing) {
    com.strongdm.api.v1.SQLServer porcelain = new com.strongdm.api.v1.SQLServer();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setDatabase(plumbing.getDatabase());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setSchema(plumbing.getSchema());
    porcelain.setPort(plumbing.getPort());
    porcelain.setOverrideDatabase(plumbing.getOverrideDatabase());
    return porcelain;
  }

  public static SQLServer sqlServerToPlumbing(com.strongdm.api.v1.SQLServer porcelain) {
    if (porcelain == null) {
      return null;
    }
    SQLServer.Builder builder = SQLServer.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    if (porcelain.getDatabase() != null) {
      builder.setDatabase(porcelain.getDatabase());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    if (porcelain.getSchema() != null) {
      builder.setSchema(porcelain.getSchema());
    }
    builder.setPort(porcelain.getPort());
    builder.setOverrideDatabase(porcelain.getOverrideDatabase());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.SQLServer> repeatedSQLServerToPorcelain(
      Collection<SQLServer> plumbings) {
    return plumbings.stream()
        .map(plumbing -> sqlServerToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<SQLServer> repeatedSQLServerToPlumbing(
      Collection<com.strongdm.api.v1.SQLServer> porcelains) {
    return porcelains.stream()
        .map(porcelain -> sqlServerToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.SSH sshToPorcelain(SSH plumbing) {
    com.strongdm.api.v1.SSH porcelain = new com.strongdm.api.v1.SSH();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPort(plumbing.getPort());
    porcelain.setPublicKey(plumbing.getPublicKey());
    return porcelain;
  }

  public static SSH sshToPlumbing(com.strongdm.api.v1.SSH porcelain) {
    if (porcelain == null) {
      return null;
    }
    SSH.Builder builder = SSH.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    builder.setPort(porcelain.getPort());
    if (porcelain.getPublicKey() != null) {
      builder.setPublicKey(porcelain.getPublicKey());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.SSH> repeatedSSHToPorcelain(Collection<SSH> plumbings) {
    return plumbings.stream()
        .map(plumbing -> sshToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<SSH> repeatedSSHToPlumbing(Collection<com.strongdm.api.v1.SSH> porcelains) {
    return porcelains.stream()
        .map(porcelain -> sshToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Sybase sybaseToPorcelain(Sybase plumbing) {
    com.strongdm.api.v1.Sybase porcelain = new com.strongdm.api.v1.Sybase();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    porcelain.setPassword(plumbing.getPassword());
    return porcelain;
  }

  public static Sybase sybaseToPlumbing(com.strongdm.api.v1.Sybase porcelain) {
    if (porcelain == null) {
      return null;
    }
    Sybase.Builder builder = Sybase.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Sybase> repeatedSybaseToPorcelain(
      Collection<Sybase> plumbings) {
    return plumbings.stream()
        .map(plumbing -> sybaseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Sybase> repeatedSybaseToPlumbing(
      Collection<com.strongdm.api.v1.Sybase> porcelains) {
    return porcelains.stream()
        .map(porcelain -> sybaseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Teradata teradataToPorcelain(Teradata plumbing) {
    com.strongdm.api.v1.Teradata porcelain = new com.strongdm.api.v1.Teradata();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setUsername(plumbing.getUsername());
    porcelain.setPassword(plumbing.getPassword());
    porcelain.setPortOverride(plumbing.getPortOverride());
    porcelain.setPort(plumbing.getPort());
    return porcelain;
  }

  public static Teradata teradataToPlumbing(com.strongdm.api.v1.Teradata porcelain) {
    if (porcelain == null) {
      return null;
    }
    Teradata.Builder builder = Teradata.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setHealthy(porcelain.getHealthy());
    if (porcelain.getHostname() != null) {
      builder.setHostname(porcelain.getHostname());
    }
    if (porcelain.getUsername() != null) {
      builder.setUsername(porcelain.getUsername());
    }
    if (porcelain.getPassword() != null) {
      builder.setPassword(porcelain.getPassword());
    }
    builder.setPortOverride(porcelain.getPortOverride());
    builder.setPort(porcelain.getPort());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Teradata> repeatedTeradataToPorcelain(
      Collection<Teradata> plumbings) {
    return plumbings.stream()
        .map(plumbing -> teradataToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Teradata> repeatedTeradataToPlumbing(
      Collection<com.strongdm.api.v1.Teradata> porcelains) {
    return porcelains.stream()
        .map(porcelain -> teradataToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.NodeCreateResponse nodeCreateResponseToPorcelain(
      NodeCreateResponse plumbing) {
    com.strongdm.api.v1.NodeCreateResponse porcelain = new com.strongdm.api.v1.NodeCreateResponse();
    porcelain.setMeta(Plumbing.createResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setNode(Plumbing.nodeToPorcelain(plumbing.getNode()));
    porcelain.setToken(plumbing.getToken());
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static NodeCreateResponse nodeCreateResponseToPlumbing(
      com.strongdm.api.v1.NodeCreateResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    NodeCreateResponse.Builder builder = NodeCreateResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.createResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getNode() != null) {
      builder.setNode(Plumbing.nodeToPlumbing(porcelain.getNode()));
    }
    if (porcelain.getToken() != null) {
      builder.setToken(porcelain.getToken());
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.NodeCreateResponse> repeatedNodeCreateResponseToPorcelain(
      Collection<NodeCreateResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> nodeCreateResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<NodeCreateResponse> repeatedNodeCreateResponseToPlumbing(
      Collection<com.strongdm.api.v1.NodeCreateResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> nodeCreateResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.NodeGetResponse nodeGetResponseToPorcelain(
      NodeGetResponse plumbing) {
    com.strongdm.api.v1.NodeGetResponse porcelain = new com.strongdm.api.v1.NodeGetResponse();
    porcelain.setMeta(Plumbing.getResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setNode(Plumbing.nodeToPorcelain(plumbing.getNode()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static NodeGetResponse nodeGetResponseToPlumbing(
      com.strongdm.api.v1.NodeGetResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    NodeGetResponse.Builder builder = NodeGetResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.getResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getNode() != null) {
      builder.setNode(Plumbing.nodeToPlumbing(porcelain.getNode()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.NodeGetResponse> repeatedNodeGetResponseToPorcelain(
      Collection<NodeGetResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> nodeGetResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<NodeGetResponse> repeatedNodeGetResponseToPlumbing(
      Collection<com.strongdm.api.v1.NodeGetResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> nodeGetResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.NodeUpdateResponse nodeUpdateResponseToPorcelain(
      NodeUpdateResponse plumbing) {
    com.strongdm.api.v1.NodeUpdateResponse porcelain = new com.strongdm.api.v1.NodeUpdateResponse();
    porcelain.setMeta(Plumbing.updateResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setNode(Plumbing.nodeToPorcelain(plumbing.getNode()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static NodeUpdateResponse nodeUpdateResponseToPlumbing(
      com.strongdm.api.v1.NodeUpdateResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    NodeUpdateResponse.Builder builder = NodeUpdateResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.updateResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getNode() != null) {
      builder.setNode(Plumbing.nodeToPlumbing(porcelain.getNode()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.NodeUpdateResponse> repeatedNodeUpdateResponseToPorcelain(
      Collection<NodeUpdateResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> nodeUpdateResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<NodeUpdateResponse> repeatedNodeUpdateResponseToPlumbing(
      Collection<com.strongdm.api.v1.NodeUpdateResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> nodeUpdateResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.NodeDeleteResponse nodeDeleteResponseToPorcelain(
      NodeDeleteResponse plumbing) {
    com.strongdm.api.v1.NodeDeleteResponse porcelain = new com.strongdm.api.v1.NodeDeleteResponse();
    porcelain.setMeta(Plumbing.deleteResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static NodeDeleteResponse nodeDeleteResponseToPlumbing(
      com.strongdm.api.v1.NodeDeleteResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    NodeDeleteResponse.Builder builder = NodeDeleteResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.deleteResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.NodeDeleteResponse> repeatedNodeDeleteResponseToPorcelain(
      Collection<NodeDeleteResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> nodeDeleteResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<NodeDeleteResponse> repeatedNodeDeleteResponseToPlumbing(
      Collection<com.strongdm.api.v1.NodeDeleteResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> nodeDeleteResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Node nodeToPorcelain(Node plumbing) {
    if (plumbing == null) {
      return null;
    }
    if (plumbing.hasRelay()) {
      return relayToPorcelain(plumbing.getRelay());
    }
    if (plumbing.hasGateway()) {
      return gatewayToPorcelain(plumbing.getGateway());
    }
    return null;
  }

  public static Node nodeToPlumbing(com.strongdm.api.v1.Node porcelain) {
    if (porcelain == null) {
      return null;
    }
    if (porcelain instanceof com.strongdm.api.v1.Relay) {
      Node.Builder builder = Node.newBuilder();
      builder.setRelay(relayToPlumbing((com.strongdm.api.v1.Relay) porcelain));
      return builder.build();
    }
    if (porcelain instanceof com.strongdm.api.v1.Gateway) {
      Node.Builder builder = Node.newBuilder();
      builder.setGateway(gatewayToPlumbing((com.strongdm.api.v1.Gateway) porcelain));
      return builder.build();
    }
    return null;
  }

  public static List<com.strongdm.api.v1.Node> repeatedNodeToPorcelain(Collection<Node> plumbings) {
    return plumbings.stream()
        .map(plumbing -> nodeToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Node> repeatedNodeToPlumbing(Collection<com.strongdm.api.v1.Node> porcelains) {
    return porcelains.stream()
        .map(porcelain -> nodeToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Relay relayToPorcelain(Relay plumbing) {
    com.strongdm.api.v1.Relay porcelain = new com.strongdm.api.v1.Relay();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setState(plumbing.getState());
    return porcelain;
  }

  public static Relay relayToPlumbing(com.strongdm.api.v1.Relay porcelain) {
    if (porcelain == null) {
      return null;
    }
    Relay.Builder builder = Relay.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    if (porcelain.getState() != null) {
      builder.setState(porcelain.getState());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Relay> repeatedRelayToPorcelain(
      Collection<Relay> plumbings) {
    return plumbings.stream()
        .map(plumbing -> relayToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Relay> repeatedRelayToPlumbing(
      Collection<com.strongdm.api.v1.Relay> porcelains) {
    return porcelains.stream()
        .map(porcelain -> relayToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Gateway gatewayToPorcelain(Gateway plumbing) {
    com.strongdm.api.v1.Gateway porcelain = new com.strongdm.api.v1.Gateway();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setState(plumbing.getState());
    porcelain.setListenAddress(plumbing.getListenAddress());
    porcelain.setBindAddress(plumbing.getBindAddress());
    return porcelain;
  }

  public static Gateway gatewayToPlumbing(com.strongdm.api.v1.Gateway porcelain) {
    if (porcelain == null) {
      return null;
    }
    Gateway.Builder builder = Gateway.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    if (porcelain.getState() != null) {
      builder.setState(porcelain.getState());
    }
    if (porcelain.getListenAddress() != null) {
      builder.setListenAddress(porcelain.getListenAddress());
    }
    if (porcelain.getBindAddress() != null) {
      builder.setBindAddress(porcelain.getBindAddress());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Gateway> repeatedGatewayToPorcelain(
      Collection<Gateway> plumbings) {
    return plumbings.stream()
        .map(plumbing -> gatewayToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Gateway> repeatedGatewayToPlumbing(
      Collection<com.strongdm.api.v1.Gateway> porcelains) {
    return porcelains.stream()
        .map(porcelain -> gatewayToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.ResourceCreateResponse resourceCreateResponseToPorcelain(
      ResourceCreateResponse plumbing) {
    com.strongdm.api.v1.ResourceCreateResponse porcelain =
        new com.strongdm.api.v1.ResourceCreateResponse();
    porcelain.setMeta(Plumbing.createResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setResource(Plumbing.resourceToPorcelain(plumbing.getResource()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static ResourceCreateResponse resourceCreateResponseToPlumbing(
      com.strongdm.api.v1.ResourceCreateResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    ResourceCreateResponse.Builder builder = ResourceCreateResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.createResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getResource() != null) {
      builder.setResource(Plumbing.resourceToPlumbing(porcelain.getResource()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.ResourceCreateResponse>
      repeatedResourceCreateResponseToPorcelain(Collection<ResourceCreateResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> resourceCreateResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<ResourceCreateResponse> repeatedResourceCreateResponseToPlumbing(
      Collection<com.strongdm.api.v1.ResourceCreateResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> resourceCreateResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.ResourceGetResponse resourceGetResponseToPorcelain(
      ResourceGetResponse plumbing) {
    com.strongdm.api.v1.ResourceGetResponse porcelain =
        new com.strongdm.api.v1.ResourceGetResponse();
    porcelain.setMeta(Plumbing.getResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setResource(Plumbing.resourceToPorcelain(plumbing.getResource()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static ResourceGetResponse resourceGetResponseToPlumbing(
      com.strongdm.api.v1.ResourceGetResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    ResourceGetResponse.Builder builder = ResourceGetResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.getResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getResource() != null) {
      builder.setResource(Plumbing.resourceToPlumbing(porcelain.getResource()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.ResourceGetResponse>
      repeatedResourceGetResponseToPorcelain(Collection<ResourceGetResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> resourceGetResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<ResourceGetResponse> repeatedResourceGetResponseToPlumbing(
      Collection<com.strongdm.api.v1.ResourceGetResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> resourceGetResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.ResourceUpdateResponse resourceUpdateResponseToPorcelain(
      ResourceUpdateResponse plumbing) {
    com.strongdm.api.v1.ResourceUpdateResponse porcelain =
        new com.strongdm.api.v1.ResourceUpdateResponse();
    porcelain.setMeta(Plumbing.updateResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setResource(Plumbing.resourceToPorcelain(plumbing.getResource()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static ResourceUpdateResponse resourceUpdateResponseToPlumbing(
      com.strongdm.api.v1.ResourceUpdateResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    ResourceUpdateResponse.Builder builder = ResourceUpdateResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.updateResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getResource() != null) {
      builder.setResource(Plumbing.resourceToPlumbing(porcelain.getResource()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.ResourceUpdateResponse>
      repeatedResourceUpdateResponseToPorcelain(Collection<ResourceUpdateResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> resourceUpdateResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<ResourceUpdateResponse> repeatedResourceUpdateResponseToPlumbing(
      Collection<com.strongdm.api.v1.ResourceUpdateResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> resourceUpdateResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.ResourceDeleteResponse resourceDeleteResponseToPorcelain(
      ResourceDeleteResponse plumbing) {
    com.strongdm.api.v1.ResourceDeleteResponse porcelain =
        new com.strongdm.api.v1.ResourceDeleteResponse();
    porcelain.setMeta(Plumbing.deleteResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static ResourceDeleteResponse resourceDeleteResponseToPlumbing(
      com.strongdm.api.v1.ResourceDeleteResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    ResourceDeleteResponse.Builder builder = ResourceDeleteResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.deleteResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.ResourceDeleteResponse>
      repeatedResourceDeleteResponseToPorcelain(Collection<ResourceDeleteResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> resourceDeleteResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<ResourceDeleteResponse> repeatedResourceDeleteResponseToPlumbing(
      Collection<com.strongdm.api.v1.ResourceDeleteResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> resourceDeleteResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.RoleAttachmentCreateResponse
      roleAttachmentCreateResponseToPorcelain(RoleAttachmentCreateResponse plumbing) {
    com.strongdm.api.v1.RoleAttachmentCreateResponse porcelain =
        new com.strongdm.api.v1.RoleAttachmentCreateResponse();
    porcelain.setMeta(Plumbing.createResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setRoleAttachment(Plumbing.roleAttachmentToPorcelain(plumbing.getRoleAttachment()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static RoleAttachmentCreateResponse roleAttachmentCreateResponseToPlumbing(
      com.strongdm.api.v1.RoleAttachmentCreateResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    RoleAttachmentCreateResponse.Builder builder = RoleAttachmentCreateResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.createResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getRoleAttachment() != null) {
      builder.setRoleAttachment(Plumbing.roleAttachmentToPlumbing(porcelain.getRoleAttachment()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.RoleAttachmentCreateResponse>
      repeatedRoleAttachmentCreateResponseToPorcelain(
          Collection<RoleAttachmentCreateResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> roleAttachmentCreateResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<RoleAttachmentCreateResponse> repeatedRoleAttachmentCreateResponseToPlumbing(
      Collection<com.strongdm.api.v1.RoleAttachmentCreateResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> roleAttachmentCreateResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.RoleAttachmentGetResponse roleAttachmentGetResponseToPorcelain(
      RoleAttachmentGetResponse plumbing) {
    com.strongdm.api.v1.RoleAttachmentGetResponse porcelain =
        new com.strongdm.api.v1.RoleAttachmentGetResponse();
    porcelain.setMeta(Plumbing.getResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setRoleAttachment(Plumbing.roleAttachmentToPorcelain(plumbing.getRoleAttachment()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static RoleAttachmentGetResponse roleAttachmentGetResponseToPlumbing(
      com.strongdm.api.v1.RoleAttachmentGetResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    RoleAttachmentGetResponse.Builder builder = RoleAttachmentGetResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.getResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getRoleAttachment() != null) {
      builder.setRoleAttachment(Plumbing.roleAttachmentToPlumbing(porcelain.getRoleAttachment()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.RoleAttachmentGetResponse>
      repeatedRoleAttachmentGetResponseToPorcelain(
          Collection<RoleAttachmentGetResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> roleAttachmentGetResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<RoleAttachmentGetResponse> repeatedRoleAttachmentGetResponseToPlumbing(
      Collection<com.strongdm.api.v1.RoleAttachmentGetResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> roleAttachmentGetResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.RoleAttachmentDeleteResponse
      roleAttachmentDeleteResponseToPorcelain(RoleAttachmentDeleteResponse plumbing) {
    com.strongdm.api.v1.RoleAttachmentDeleteResponse porcelain =
        new com.strongdm.api.v1.RoleAttachmentDeleteResponse();
    porcelain.setMeta(Plumbing.deleteResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static RoleAttachmentDeleteResponse roleAttachmentDeleteResponseToPlumbing(
      com.strongdm.api.v1.RoleAttachmentDeleteResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    RoleAttachmentDeleteResponse.Builder builder = RoleAttachmentDeleteResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.deleteResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.RoleAttachmentDeleteResponse>
      repeatedRoleAttachmentDeleteResponseToPorcelain(
          Collection<RoleAttachmentDeleteResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> roleAttachmentDeleteResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<RoleAttachmentDeleteResponse> repeatedRoleAttachmentDeleteResponseToPlumbing(
      Collection<com.strongdm.api.v1.RoleAttachmentDeleteResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> roleAttachmentDeleteResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.RoleAttachment roleAttachmentToPorcelain(
      RoleAttachment plumbing) {
    com.strongdm.api.v1.RoleAttachment porcelain = new com.strongdm.api.v1.RoleAttachment();
    porcelain.setId(plumbing.getId());
    porcelain.setCompositeRoleId(plumbing.getCompositeRoleId());
    porcelain.setAttachedRoleId(plumbing.getAttachedRoleId());
    return porcelain;
  }

  public static RoleAttachment roleAttachmentToPlumbing(
      com.strongdm.api.v1.RoleAttachment porcelain) {
    if (porcelain == null) {
      return null;
    }
    RoleAttachment.Builder builder = RoleAttachment.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getCompositeRoleId() != null) {
      builder.setCompositeRoleId(porcelain.getCompositeRoleId());
    }
    if (porcelain.getAttachedRoleId() != null) {
      builder.setAttachedRoleId(porcelain.getAttachedRoleId());
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.RoleAttachment> repeatedRoleAttachmentToPorcelain(
      Collection<RoleAttachment> plumbings) {
    return plumbings.stream()
        .map(plumbing -> roleAttachmentToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<RoleAttachment> repeatedRoleAttachmentToPlumbing(
      Collection<com.strongdm.api.v1.RoleAttachment> porcelains) {
    return porcelains.stream()
        .map(porcelain -> roleAttachmentToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.RoleCreateResponse roleCreateResponseToPorcelain(
      RoleCreateResponse plumbing) {
    com.strongdm.api.v1.RoleCreateResponse porcelain = new com.strongdm.api.v1.RoleCreateResponse();
    porcelain.setMeta(Plumbing.createResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setRole(Plumbing.roleToPorcelain(plumbing.getRole()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static RoleCreateResponse roleCreateResponseToPlumbing(
      com.strongdm.api.v1.RoleCreateResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    RoleCreateResponse.Builder builder = RoleCreateResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.createResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getRole() != null) {
      builder.setRole(Plumbing.roleToPlumbing(porcelain.getRole()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.RoleCreateResponse> repeatedRoleCreateResponseToPorcelain(
      Collection<RoleCreateResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> roleCreateResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<RoleCreateResponse> repeatedRoleCreateResponseToPlumbing(
      Collection<com.strongdm.api.v1.RoleCreateResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> roleCreateResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.RoleGetResponse roleGetResponseToPorcelain(
      RoleGetResponse plumbing) {
    com.strongdm.api.v1.RoleGetResponse porcelain = new com.strongdm.api.v1.RoleGetResponse();
    porcelain.setMeta(Plumbing.getResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setRole(Plumbing.roleToPorcelain(plumbing.getRole()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static RoleGetResponse roleGetResponseToPlumbing(
      com.strongdm.api.v1.RoleGetResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    RoleGetResponse.Builder builder = RoleGetResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.getResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getRole() != null) {
      builder.setRole(Plumbing.roleToPlumbing(porcelain.getRole()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.RoleGetResponse> repeatedRoleGetResponseToPorcelain(
      Collection<RoleGetResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> roleGetResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<RoleGetResponse> repeatedRoleGetResponseToPlumbing(
      Collection<com.strongdm.api.v1.RoleGetResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> roleGetResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.RoleUpdateResponse roleUpdateResponseToPorcelain(
      RoleUpdateResponse plumbing) {
    com.strongdm.api.v1.RoleUpdateResponse porcelain = new com.strongdm.api.v1.RoleUpdateResponse();
    porcelain.setMeta(Plumbing.updateResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setRole(Plumbing.roleToPorcelain(plumbing.getRole()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static RoleUpdateResponse roleUpdateResponseToPlumbing(
      com.strongdm.api.v1.RoleUpdateResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    RoleUpdateResponse.Builder builder = RoleUpdateResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.updateResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getRole() != null) {
      builder.setRole(Plumbing.roleToPlumbing(porcelain.getRole()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.RoleUpdateResponse> repeatedRoleUpdateResponseToPorcelain(
      Collection<RoleUpdateResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> roleUpdateResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<RoleUpdateResponse> repeatedRoleUpdateResponseToPlumbing(
      Collection<com.strongdm.api.v1.RoleUpdateResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> roleUpdateResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.RoleDeleteResponse roleDeleteResponseToPorcelain(
      RoleDeleteResponse plumbing) {
    com.strongdm.api.v1.RoleDeleteResponse porcelain = new com.strongdm.api.v1.RoleDeleteResponse();
    porcelain.setMeta(Plumbing.deleteResponseMetadataToPorcelain(plumbing.getMeta()));
    porcelain.setRateLimit(Plumbing.rateLimitMetadataToPorcelain(plumbing.getRateLimit()));
    return porcelain;
  }

  public static RoleDeleteResponse roleDeleteResponseToPlumbing(
      com.strongdm.api.v1.RoleDeleteResponse porcelain) {
    if (porcelain == null) {
      return null;
    }
    RoleDeleteResponse.Builder builder = RoleDeleteResponse.newBuilder();
    if (porcelain.getMeta() != null) {
      builder.setMeta(Plumbing.deleteResponseMetadataToPlumbing(porcelain.getMeta()));
    }
    if (porcelain.getRateLimit() != null) {
      builder.setRateLimit(Plumbing.rateLimitMetadataToPlumbing(porcelain.getRateLimit()));
    }
    return builder.build();
  }

  public static List<com.strongdm.api.v1.RoleDeleteResponse> repeatedRoleDeleteResponseToPorcelain(
      Collection<RoleDeleteResponse> plumbings) {
    return plumbings.stream()
        .map(plumbing -> roleDeleteResponseToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<RoleDeleteResponse> repeatedRoleDeleteResponseToPlumbing(
      Collection<com.strongdm.api.v1.RoleDeleteResponse> porcelains) {
    return porcelains.stream()
        .map(porcelain -> roleDeleteResponseToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.Role roleToPorcelain(Role plumbing) {
    com.strongdm.api.v1.Role porcelain = new com.strongdm.api.v1.Role();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setComposite(plumbing.getComposite());
    return porcelain;
  }

  public static Role roleToPlumbing(com.strongdm.api.v1.Role porcelain) {
    if (porcelain == null) {
      return null;
    }
    Role.Builder builder = Role.newBuilder();
    if (porcelain.getId() != null) {
      builder.setId(porcelain.getId());
    }
    if (porcelain.getName() != null) {
      builder.setName(porcelain.getName());
    }
    builder.setComposite(porcelain.getComposite());
    return builder.build();
  }

  public static List<com.strongdm.api.v1.Role> repeatedRoleToPorcelain(Collection<Role> plumbings) {
    return plumbings.stream()
        .map(plumbing -> roleToPorcelain(plumbing))
        .collect(Collectors.toList());
  }

  public static List<Role> repeatedRoleToPlumbing(Collection<com.strongdm.api.v1.Role> porcelains) {
    return porcelains.stream()
        .map(porcelain -> roleToPlumbing(porcelain))
        .collect(Collectors.toList());
  }

  public static com.strongdm.api.v1.RpcException exceptionToPorcelain(Exception e) {
    if (!(e instanceof io.grpc.StatusRuntimeException)) {
      return new com.strongdm.api.v1.RpcException(e.getMessage(), 2); // Unknown
    }

    com.google.rpc.Status status = io.grpc.protobuf.StatusProto.fromThrowable(e);

    switch (status.getCode()) {
      case Code.DEADLINE_EXCEEDED_VALUE:
        return new com.strongdm.api.v1.TimeoutException(e.getMessage());
      case Code.ALREADY_EXISTS_VALUE:
        return new com.strongdm.api.v1.AlreadyExistsException(e.getMessage());
      case Code.INVALID_ARGUMENT_VALUE:
        return new com.strongdm.api.v1.BadRequestException(e.getMessage());
      case Code.INTERNAL_VALUE:
        return new com.strongdm.api.v1.InternalException(e.getMessage());
      case Code.PERMISSION_DENIED_VALUE:
        return new com.strongdm.api.v1.PermissionException(e.getMessage());
      case Code.UNAUTHENTICATED_VALUE:
        return new com.strongdm.api.v1.AuthenticationException(e.getMessage());
      case Code.RESOURCE_EXHAUSTED_VALUE:
        try {
          for (com.google.protobuf.Any any : status.getDetailsList()) {
            if (any.is(com.strongdm.api.v1.plumbing.Spec.RateLimitMetadata.class)) {
              com.strongdm.api.v1.plumbing.Spec.RateLimitMetadata plumbing =
                  any.unpack(com.strongdm.api.v1.plumbing.Spec.RateLimitMetadata.class);
              return new com.strongdm.api.v1.RateLimitException(
                  e.getMessage(), Plumbing.rateLimitMetadataToPorcelain(plumbing));
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException ex) {
        }
        // this should never happen, but in case it does, fallback to an RpcException to avoid
        // returning a RateLimitException with a null metadata.
        break;
      case Code.NOT_FOUND_VALUE:
        return new com.strongdm.api.v1.NotFoundException(e.getMessage());
    }

    return new com.strongdm.api.v1.RpcException(e.getMessage(), status.getCode());
  }
}
