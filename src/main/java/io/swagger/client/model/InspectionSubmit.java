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
import io.swagger.client.model.Protocol;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InspectionSubmit
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-15T16:32:59.925Z[GMT]")
public class InspectionSubmit {
  @SerializedName("status")
  private Boolean status = null;

  @SerializedName("protocol")
  private Protocol protocol = null;

  public InspectionSubmit status(Boolean status) {
    this.status = status;
    return this;
  }

   /**
   * Informa se a requisição foi concluída com sucesso.
   * @return status
  **/
  @Schema(required = true, description = "Informa se a requisição foi concluída com sucesso.")
  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public InspectionSubmit protocol(Protocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(required = true, description = "")
  public Protocol getProtocol() {
    return protocol;
  }

  public void setProtocol(Protocol protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectionSubmit inspectionSubmit = (InspectionSubmit) o;
    return Objects.equals(this.status, inspectionSubmit.status) &&
        Objects.equals(this.protocol, inspectionSubmit.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectionSubmit {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
