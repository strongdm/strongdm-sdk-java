package com.strongdm.api.v1.plumbing;

import com.google.protobuf.Timestamp;
import com.google.rpc.Code;
import com.strongdm.api.v1.plumbing.NodesPlumbing.*;
import com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing.*;
import com.strongdm.api.v1.plumbing.RolesPlumbing.*;
import com.strongdm.api.v1.plumbing.Spec.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Plumbing {

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
    if (plumbing.getRelay() != null) {
      return relayToPorcelain(plumbing.getRelay());
    }
    if (plumbing.getGateway() != null) {
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
