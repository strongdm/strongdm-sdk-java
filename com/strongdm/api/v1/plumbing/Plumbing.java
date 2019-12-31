package com.strongdm.api.v1.plumbing;

import com.google.protobuf.Timestamp;
import com.google.rpc.Code;
import com.strongdm.api.v1.BadRequestException;
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

  public static com.strongdm.api.v1.Resource resourceToPorcelain(Resource plumbing) {
    if (plumbing == null) {
      return null;
    }
    if (plumbing.getRedis() != null) {
      return redisToPorcelain(plumbing.getRedis());
    }
    if (plumbing.getElasticacheRedis() != null) {
      return elasticacheRedisToPorcelain(plumbing.getElasticacheRedis());
    }
    if (plumbing.getKubernetes() != null) {
      return kubernetesToPorcelain(plumbing.getKubernetes());
    }
    if (plumbing.getKubernetesBasicAuth() != null) {
      return kubernetesBasicAuthToPorcelain(plumbing.getKubernetesBasicAuth());
    }
    if (plumbing.getAmazonEks() != null) {
      return amazonEksToPorcelain(plumbing.getAmazonEks());
    }
    if (plumbing.getGoogleGke() != null) {
      return googleGkeToPorcelain(plumbing.getGoogleGke());
    }
    if (plumbing.getSsh() != null) {
      return sshToPorcelain(plumbing.getSsh());
    }
    if (plumbing.getHttpBasicAuth() != null) {
      return httpBasicAuthToPorcelain(plumbing.getHttpBasicAuth());
    }
    if (plumbing.getHttpNoAuth() != null) {
      return httpNoAuthToPorcelain(plumbing.getHttpNoAuth());
    }
    if (plumbing.getHttpAuth() != null) {
      return httpAuthToPorcelain(plumbing.getHttpAuth());
    }
    if (plumbing.getMysql() != null) {
      return mysqlToPorcelain(plumbing.getMysql());
    }
    if (plumbing.getAuroraMysql() != null) {
      return auroraMysqlToPorcelain(plumbing.getAuroraMysql());
    }
    if (plumbing.getClustrix() != null) {
      return clustrixToPorcelain(plumbing.getClustrix());
    }
    if (plumbing.getMaria() != null) {
      return mariaToPorcelain(plumbing.getMaria());
    }
    if (plumbing.getMemsql() != null) {
      return memsqlToPorcelain(plumbing.getMemsql());
    }
    if (plumbing.getAthena() != null) {
      return athenaToPorcelain(plumbing.getAthena());
    }
    return null;
  }

  public static Resource resourceToPlumbing(com.strongdm.api.v1.Resource porcelain) {
    if (porcelain == null) {
      return null;
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
    if (porcelain instanceof com.strongdm.api.v1.SSH) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setSsh(sshToPlumbing((com.strongdm.api.v1.SSH) porcelain));
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
    if (porcelain instanceof com.strongdm.api.v1.Athena) {
      Resource.Builder builder = Resource.newBuilder();
      builder.setAthena(athenaToPlumbing((com.strongdm.api.v1.Athena) porcelain));
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

  public static com.strongdm.api.v1.Kubernetes kubernetesToPorcelain(Kubernetes plumbing) {
    com.strongdm.api.v1.Kubernetes porcelain = new com.strongdm.api.v1.Kubernetes();
    porcelain.setId(plumbing.getId());
    porcelain.setName(plumbing.getName());
    porcelain.setHealthy(plumbing.getHealthy());
    porcelain.setHostname(plumbing.getHostname());
    porcelain.setPort(plumbing.getPort());
    porcelain.setCertificateAuthority(plumbing.getCertificateAuthority());
    porcelain.setClientCertificate(plumbing.getClientCertificate());
    porcelain.setClientKey(plumbing.getClientKey());
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
    if (porcelain.getClientCertificate() != null) {
      builder.setClientCertificate(porcelain.getClientCertificate());
    }
    if (porcelain.getClientKey() != null) {
      builder.setClientKey(porcelain.getClientKey());
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
    porcelain.setCertificateAuthority(plumbing.getCertificateAuthority());
    porcelain.setClientCertificate(plumbing.getClientCertificate());
    porcelain.setClientKey(plumbing.getClientKey());
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
    if (porcelain.getCertificateAuthority() != null) {
      builder.setCertificateAuthority(porcelain.getCertificateAuthority());
    }
    if (porcelain.getClientCertificate() != null) {
      builder.setClientCertificate(porcelain.getClientCertificate());
    }
    if (porcelain.getClientKey() != null) {
      builder.setClientKey(porcelain.getClientKey());
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
    porcelain.setServiceAccountKey(plumbing.getServiceAccountKey());
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
    if (porcelain.getServiceAccountKey() != null) {
      builder.setServiceAccountKey(porcelain.getServiceAccountKey());
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
