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
 * Compliance
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-15T16:32:59.925Z[GMT]")
public class Compliance {
  @SerializedName("engine")
  private Boolean engine = null;

  @SerializedName("front_plate")
  private Boolean frontPlate = null;

  @SerializedName("rear_plate")
  private Boolean rearPlate = null;

  @SerializedName("vin")
  private Boolean vin = null;

  public Compliance engine(Boolean engine) {
    this.engine = engine;
    return this;
  }

   /**
   * Informa se o número do motor está dentro dos padrões.
   * @return engine
  **/
  @Schema(required = true, description = "Informa se o número do motor está dentro dos padrões.")
  public Boolean isEngine() {
    return engine;
  }

  public void setEngine(Boolean engine) {
    this.engine = engine;
  }

  public Compliance frontPlate(Boolean frontPlate) {
    this.frontPlate = frontPlate;
    return this;
  }

   /**
   * Informa se a placa dianteira está dentro dos padrões.
   * @return frontPlate
  **/
  @Schema(required = true, description = "Informa se a placa dianteira está dentro dos padrões.")
  public Boolean isFrontPlate() {
    return frontPlate;
  }

  public void setFrontPlate(Boolean frontPlate) {
    this.frontPlate = frontPlate;
  }

  public Compliance rearPlate(Boolean rearPlate) {
    this.rearPlate = rearPlate;
    return this;
  }

   /**
   * Informa se a placa traseira está dentro dos padrões.
   * @return rearPlate
  **/
  @Schema(required = true, description = "Informa se a placa traseira está dentro dos padrões.")
  public Boolean isRearPlate() {
    return rearPlate;
  }

  public void setRearPlate(Boolean rearPlate) {
    this.rearPlate = rearPlate;
  }

  public Compliance vin(Boolean vin) {
    this.vin = vin;
    return this;
  }

   /**
   * Informa se o número do chassi está dentro dos padrões.
   * @return vin
  **/
  @Schema(required = true, description = "Informa se o número do chassi está dentro dos padrões.")
  public Boolean isVin() {
    return vin;
  }

  public void setVin(Boolean vin) {
    this.vin = vin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Compliance compliance = (Compliance) o;
    return Objects.equals(this.engine, compliance.engine) &&
        Objects.equals(this.frontPlate, compliance.frontPlate) &&
        Objects.equals(this.rearPlate, compliance.rearPlate) &&
        Objects.equals(this.vin, compliance.vin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engine, frontPlate, rearPlate, vin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Compliance {\n");
    
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    frontPlate: ").append(toIndentedString(frontPlate)).append("\n");
    sb.append("    rearPlate: ").append(toIndentedString(rearPlate)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
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
