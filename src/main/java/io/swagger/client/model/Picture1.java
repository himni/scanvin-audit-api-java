/*
 * AUDITORIA
 * # Introducão  Seja bem-vindo a documentação da API do [SCANVIN](https://scanvin.com.br) para auditorias    Nossa API foi criada utilizando o padrão [REST](https://restfulapi.net/) e [HATEOAS](https://restfulapi.net/hateoas/), possibilitando a integração de seu sistema ao nosso, e está documentada abaixo.  # Como usar a API?  Logo a seguir você encontrará todos os recursos e métodos suportados pela API, sendo que essa página possibilita que você teste os recursos e métodos diretamente através dela.  # Autenticação  Você precisa de uma [API KEY](https://en.wikipedia.org/wiki/Application_programming_interface_key#HTTP_APIs) para identificar a conta que está realizando solicitações para a API. Você pode obter seu token de autenticação no seu [Painel do Cliente](https://auditoria.scanvin.com.br/client/).  Insira seu token no campo que se encontra topo desta página para testar os métodos da API.  # Webhook  Você também deve configurar seu [Webhook](https://en.wikipedia.org/wiki/Webhook) no [Painel do Cliente](https://auditoria.scanvin.com.br/client/webhook). Quando os resultados da auditoria estiverem disponíveis, uma notificação será enviada para a URL informada, via [HTTP POST](https://en.wikipedia.org/wiki/POST_(HTTP)). A notificação possui ```Content-type``` do tipo ```application/json```. O [JSON](https://en.wikipedia.org/wiki/JSON) postado contém um único campo, ```notification_id```, que contém o identificador único do evento que gerou a notificação. Deve-se então chamar o endpoint ```Inspection - Get Inspection```, informando esse mesmo identificador único, para recuperar os dados da vistoria, e da auditoria realizada.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Picture1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-15T16:32:59.925Z[GMT]")
public class Picture1 {
  @SerializedName("type")
  private Integer type = null;

  @SerializedName("hash")
  private String hash = null;

  @SerializedName("path_original")
  private String pathOriginal = null;

  @SerializedName("path_updated")
  private String pathUpdated = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("bytes")
  private Integer bytes = null;

  @SerializedName("lat")
  private String lat = null;

  @SerializedName("lng")
  private String lng = null;

  public Picture1 type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Tipo da imagem. Os tipos disponíveis podem ser obtidos acessando o endpoint &#x60;&#x60;&#x60;Inspection - Get Types&#x60;&#x60;&#x60;.
   * @return type
  **/
  @Schema(required = true, description = "Tipo da imagem. Os tipos disponíveis podem ser obtidos acessando o endpoint ```Inspection - Get Types```.")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Picture1 hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Hash do arquivo da imagem.
   * @return hash
  **/
  @Schema(required = true, description = "Hash do arquivo da imagem.")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Picture1 pathOriginal(String pathOriginal) {
    this.pathOriginal = pathOriginal;
    return this;
  }

   /**
   * URL original da imagem, fornecida pelo cliente.
   * @return pathOriginal
  **/
  @Schema(required = true, description = "URL original da imagem, fornecida pelo cliente.")
  public String getPathOriginal() {
    return pathOriginal;
  }

  public void setPathOriginal(String pathOriginal) {
    this.pathOriginal = pathOriginal;
  }

  public Picture1 pathUpdated(String pathUpdated) {
    this.pathUpdated = pathUpdated;
    return this;
  }

   /**
   * URL da imagem editada, caso o auditor tenha decido realizar algum tipo de edição.
   * @return pathUpdated
  **/
  @Schema(required = true, description = "URL da imagem editada, caso o auditor tenha decido realizar algum tipo de edição.")
  public String getPathUpdated() {
    return pathUpdated;
  }

  public void setPathUpdated(String pathUpdated) {
    this.pathUpdated = pathUpdated;
  }

  public Picture1 notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Observações referentes à imagem, adicionadas pelo auditor.
   * @return notes
  **/
  @Schema(required = true, description = "Observações referentes à imagem, adicionadas pelo auditor.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Picture1 bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

   /**
   * Tamanho em bytes do arquivo da imagem.
   * @return bytes
  **/
  @Schema(required = true, description = "Tamanho em bytes do arquivo da imagem.")
  public Integer getBytes() {
    return bytes;
  }

  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  public Picture1 lat(String lat) {
    this.lat = lat;
    return this;
  }

   /**
   * Latitude em que a imagem foi fotografada.
   * @return lat
  **/
  @Schema(required = true, description = "Latitude em que a imagem foi fotografada.")
  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public Picture1 lng(String lng) {
    this.lng = lng;
    return this;
  }

   /**
   * Longitude em que a imagem foi fotografada.
   * @return lng
  **/
  @Schema(required = true, description = "Longitude em que a imagem foi fotografada.")
  public String getLng() {
    return lng;
  }

  public void setLng(String lng) {
    this.lng = lng;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Picture1 picture1 = (Picture1) o;
    return Objects.equals(this.type, picture1.type) &&
        Objects.equals(this.hash, picture1.hash) &&
        Objects.equals(this.pathOriginal, picture1.pathOriginal) &&
        Objects.equals(this.pathUpdated, picture1.pathUpdated) &&
        Objects.equals(this.notes, picture1.notes) &&
        Objects.equals(this.bytes, picture1.bytes) &&
        Objects.equals(this.lat, picture1.lat) &&
        Objects.equals(this.lng, picture1.lng);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, hash, pathOriginal, pathUpdated, notes, bytes, lat, lng);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Picture1 {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    pathOriginal: ").append(toIndentedString(pathOriginal)).append("\n");
    sb.append("    pathUpdated: ").append(toIndentedString(pathUpdated)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
