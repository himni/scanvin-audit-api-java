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
 * Problems
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-15T16:32:59.925Z[GMT]")
public class Problems {
  @SerializedName("extinguisher")
  private Boolean extinguisher = null;

  @SerializedName("hodometer")
  private Boolean hodometer = null;

  @SerializedName("seal")
  private Boolean seal = null;

  @SerializedName("fl_alert")
  private Boolean flAlert = null;

  @SerializedName("fr_alert")
  private Boolean frAlert = null;

  @SerializedName("rl_alert")
  private Boolean rlAlert = null;

  @SerializedName("rr_alert")
  private Boolean rrAlert = null;

  @SerializedName("fl_headlight")
  private Boolean flHeadlight = null;

  @SerializedName("fr_headlight")
  private Boolean frHeadlight = null;

  @SerializedName("rl_headlight")
  private Boolean rlHeadlight = null;

  @SerializedName("rr_headlight")
  private Boolean rrHeadlight = null;

  public Problems extinguisher(Boolean extinguisher) {
    this.extinguisher = extinguisher;
    return this;
  }

   /**
   * Informa se o extintor está com problemas.
   * @return extinguisher
  **/
  @Schema(required = true, description = "Informa se o extintor está com problemas.")
  public Boolean isExtinguisher() {
    return extinguisher;
  }

  public void setExtinguisher(Boolean extinguisher) {
    this.extinguisher = extinguisher;
  }

  public Problems hodometer(Boolean hodometer) {
    this.hodometer = hodometer;
    return this;
  }

   /**
   * Informa se o hodômetro está com problemas.
   * @return hodometer
  **/
  @Schema(required = true, description = "Informa se o hodômetro está com problemas.")
  public Boolean isHodometer() {
    return hodometer;
  }

  public void setHodometer(Boolean hodometer) {
    this.hodometer = hodometer;
  }

  public Problems seal(Boolean seal) {
    this.seal = seal;
    return this;
  }

   /**
   * Informa se o lacre está com problemas.
   * @return seal
  **/
  @Schema(required = true, description = "Informa se o lacre está com problemas.")
  public Boolean isSeal() {
    return seal;
  }

  public void setSeal(Boolean seal) {
    this.seal = seal;
  }

  public Problems flAlert(Boolean flAlert) {
    this.flAlert = flAlert;
    return this;
  }

   /**
   * Informa se o alerta frontal esquerdo está com problemas.
   * @return flAlert
  **/
  @Schema(required = true, description = "Informa se o alerta frontal esquerdo está com problemas.")
  public Boolean isFlAlert() {
    return flAlert;
  }

  public void setFlAlert(Boolean flAlert) {
    this.flAlert = flAlert;
  }

  public Problems frAlert(Boolean frAlert) {
    this.frAlert = frAlert;
    return this;
  }

   /**
   * Informa se o alerta frontal direito está com problemas.
   * @return frAlert
  **/
  @Schema(required = true, description = "Informa se o alerta frontal direito está com problemas.")
  public Boolean isFrAlert() {
    return frAlert;
  }

  public void setFrAlert(Boolean frAlert) {
    this.frAlert = frAlert;
  }

  public Problems rlAlert(Boolean rlAlert) {
    this.rlAlert = rlAlert;
    return this;
  }

   /**
   * Informa se o alerta traseiro esquerdo está com problemas.
   * @return rlAlert
  **/
  @Schema(required = true, description = "Informa se o alerta traseiro esquerdo está com problemas.")
  public Boolean isRlAlert() {
    return rlAlert;
  }

  public void setRlAlert(Boolean rlAlert) {
    this.rlAlert = rlAlert;
  }

  public Problems rrAlert(Boolean rrAlert) {
    this.rrAlert = rrAlert;
    return this;
  }

   /**
   * Informa se o alerta traseiro direito está com problemas.
   * @return rrAlert
  **/
  @Schema(required = true, description = "Informa se o alerta traseiro direito está com problemas.")
  public Boolean isRrAlert() {
    return rrAlert;
  }

  public void setRrAlert(Boolean rrAlert) {
    this.rrAlert = rrAlert;
  }

  public Problems flHeadlight(Boolean flHeadlight) {
    this.flHeadlight = flHeadlight;
    return this;
  }

   /**
   * Informa se o farol frontal esquerdo está com problemas.
   * @return flHeadlight
  **/
  @Schema(required = true, description = "Informa se o farol frontal esquerdo está com problemas.")
  public Boolean isFlHeadlight() {
    return flHeadlight;
  }

  public void setFlHeadlight(Boolean flHeadlight) {
    this.flHeadlight = flHeadlight;
  }

  public Problems frHeadlight(Boolean frHeadlight) {
    this.frHeadlight = frHeadlight;
    return this;
  }

   /**
   * Informa se o farol frontal direito está com problemas.
   * @return frHeadlight
  **/
  @Schema(required = true, description = "Informa se o farol frontal direito está com problemas.")
  public Boolean isFrHeadlight() {
    return frHeadlight;
  }

  public void setFrHeadlight(Boolean frHeadlight) {
    this.frHeadlight = frHeadlight;
  }

  public Problems rlHeadlight(Boolean rlHeadlight) {
    this.rlHeadlight = rlHeadlight;
    return this;
  }

   /**
   * Informa se o farol traseiro esquerdo está com problemas.
   * @return rlHeadlight
  **/
  @Schema(required = true, description = "Informa se o farol traseiro esquerdo está com problemas.")
  public Boolean isRlHeadlight() {
    return rlHeadlight;
  }

  public void setRlHeadlight(Boolean rlHeadlight) {
    this.rlHeadlight = rlHeadlight;
  }

  public Problems rrHeadlight(Boolean rrHeadlight) {
    this.rrHeadlight = rrHeadlight;
    return this;
  }

   /**
   * Informa se o farol traseiro direito está com problemas.
   * @return rrHeadlight
  **/
  @Schema(required = true, description = "Informa se o farol traseiro direito está com problemas.")
  public Boolean isRrHeadlight() {
    return rrHeadlight;
  }

  public void setRrHeadlight(Boolean rrHeadlight) {
    this.rrHeadlight = rrHeadlight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Problems problems = (Problems) o;
    return Objects.equals(this.extinguisher, problems.extinguisher) &&
        Objects.equals(this.hodometer, problems.hodometer) &&
        Objects.equals(this.seal, problems.seal) &&
        Objects.equals(this.flAlert, problems.flAlert) &&
        Objects.equals(this.frAlert, problems.frAlert) &&
        Objects.equals(this.rlAlert, problems.rlAlert) &&
        Objects.equals(this.rrAlert, problems.rrAlert) &&
        Objects.equals(this.flHeadlight, problems.flHeadlight) &&
        Objects.equals(this.frHeadlight, problems.frHeadlight) &&
        Objects.equals(this.rlHeadlight, problems.rlHeadlight) &&
        Objects.equals(this.rrHeadlight, problems.rrHeadlight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extinguisher, hodometer, seal, flAlert, frAlert, rlAlert, rrAlert, flHeadlight, frHeadlight, rlHeadlight, rrHeadlight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problems {\n");
    
    sb.append("    extinguisher: ").append(toIndentedString(extinguisher)).append("\n");
    sb.append("    hodometer: ").append(toIndentedString(hodometer)).append("\n");
    sb.append("    seal: ").append(toIndentedString(seal)).append("\n");
    sb.append("    flAlert: ").append(toIndentedString(flAlert)).append("\n");
    sb.append("    frAlert: ").append(toIndentedString(frAlert)).append("\n");
    sb.append("    rlAlert: ").append(toIndentedString(rlAlert)).append("\n");
    sb.append("    rrAlert: ").append(toIndentedString(rrAlert)).append("\n");
    sb.append("    flHeadlight: ").append(toIndentedString(flHeadlight)).append("\n");
    sb.append("    frHeadlight: ").append(toIndentedString(frHeadlight)).append("\n");
    sb.append("    rlHeadlight: ").append(toIndentedString(rlHeadlight)).append("\n");
    sb.append("    rrHeadlight: ").append(toIndentedString(rrHeadlight)).append("\n");
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
