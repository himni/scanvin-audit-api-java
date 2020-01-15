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
import io.swagger.client.model.Picture1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Protocol
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-15T16:32:59.925Z[GMT]")
public class Protocol {
  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("car_engine")
  private String carEngine = null;

  @SerializedName("car_plate")
  private String carPlate = null;

  @SerializedName("car_state")
  private String carState = null;

  @SerializedName("car_vin")
  private String carVin = null;

  @SerializedName("car_renavam")
  private String carRenavam = null;

  @SerializedName("engine_accepted")
  private Boolean engineAccepted = null;

  @SerializedName("vin_accepted")
  private Boolean vinAccepted = null;

  @SerializedName("surveyor_email")
  private String surveyorEmail = null;

  @SerializedName("pictures")
  private List<Picture1> pictures = new ArrayList<Picture1>();

  public Protocol clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Número ou ID do protocolo fornecidos pelo cliente.
   * @return clientId
  **/
  @Schema(required = true, description = "Número ou ID do protocolo fornecidos pelo cliente.")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Protocol carEngine(String carEngine) {
    this.carEngine = carEngine;
    return this;
  }

   /**
   * Número do motor.
   * @return carEngine
  **/
  @Schema(description = "Número do motor.")
  public String getCarEngine() {
    return carEngine;
  }

  public void setCarEngine(String carEngine) {
    this.carEngine = carEngine;
  }

  public Protocol carPlate(String carPlate) {
    this.carPlate = carPlate;
    return this;
  }

   /**
   * Número da placa de identificação veicular.
   * @return carPlate
  **/
  @Schema(required = true, description = "Número da placa de identificação veicular.")
  public String getCarPlate() {
    return carPlate;
  }

  public void setCarPlate(String carPlate) {
    this.carPlate = carPlate;
  }

  public Protocol carState(String carState) {
    this.carState = carState;
    return this;
  }

   /**
   * UF da placa de identificação veicular.
   * @return carState
  **/
  @Schema(required = true, description = "UF da placa de identificação veicular.")
  public String getCarState() {
    return carState;
  }

  public void setCarState(String carState) {
    this.carState = carState;
  }

  public Protocol carVin(String carVin) {
    this.carVin = carVin;
    return this;
  }

   /**
   * Número de chassi.
   * @return carVin
  **/
  @Schema(required = true, description = "Número de chassi.")
  public String getCarVin() {
    return carVin;
  }

  public void setCarVin(String carVin) {
    this.carVin = carVin;
  }

  public Protocol carRenavam(String carRenavam) {
    this.carRenavam = carRenavam;
    return this;
  }

   /**
   * Número do RENAVAM.
   * @return carRenavam
  **/
  @Schema(required = true, description = "Número do RENAVAM.")
  public String getCarRenavam() {
    return carRenavam;
  }

  public void setCarRenavam(String carRenavam) {
    this.carRenavam = carRenavam;
  }

  public Protocol engineAccepted(Boolean engineAccepted) {
    this.engineAccepted = engineAccepted;
    return this;
  }

   /**
   * Informa se o vistoriador aprovou ou reprovou a numeração do motor.
   * @return engineAccepted
  **/
  @Schema(required = true, description = "Informa se o vistoriador aprovou ou reprovou a numeração do motor.")
  public Boolean isEngineAccepted() {
    return engineAccepted;
  }

  public void setEngineAccepted(Boolean engineAccepted) {
    this.engineAccepted = engineAccepted;
  }

  public Protocol vinAccepted(Boolean vinAccepted) {
    this.vinAccepted = vinAccepted;
    return this;
  }

   /**
   * Informa se o vistoriador aprovou ou reprovação a numeração do chassi.
   * @return vinAccepted
  **/
  @Schema(required = true, description = "Informa se o vistoriador aprovou ou reprovação a numeração do chassi.")
  public Boolean isVinAccepted() {
    return vinAccepted;
  }

  public void setVinAccepted(Boolean vinAccepted) {
    this.vinAccepted = vinAccepted;
  }

  public Protocol surveyorEmail(String surveyorEmail) {
    this.surveyorEmail = surveyorEmail;
    return this;
  }

   /**
   * E-mail do vistoriador.
   * @return surveyorEmail
  **/
  @Schema(required = true, description = "E-mail do vistoriador.")
  public String getSurveyorEmail() {
    return surveyorEmail;
  }

  public void setSurveyorEmail(String surveyorEmail) {
    this.surveyorEmail = surveyorEmail;
  }

  public Protocol pictures(List<Picture1> pictures) {
    this.pictures = pictures;
    return this;
  }

  public Protocol addPicturesItem(Picture1 picturesItem) {
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * Imagens do veículo.
   * @return pictures
  **/
  @Schema(required = true, description = "Imagens do veículo.")
  public List<Picture1> getPictures() {
    return pictures;
  }

  public void setPictures(List<Picture1> pictures) {
    this.pictures = pictures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Protocol protocol = (Protocol) o;
    return Objects.equals(this.clientId, protocol.clientId) &&
        Objects.equals(this.carEngine, protocol.carEngine) &&
        Objects.equals(this.carPlate, protocol.carPlate) &&
        Objects.equals(this.carState, protocol.carState) &&
        Objects.equals(this.carVin, protocol.carVin) &&
        Objects.equals(this.carRenavam, protocol.carRenavam) &&
        Objects.equals(this.engineAccepted, protocol.engineAccepted) &&
        Objects.equals(this.vinAccepted, protocol.vinAccepted) &&
        Objects.equals(this.surveyorEmail, protocol.surveyorEmail) &&
        Objects.equals(this.pictures, protocol.pictures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, carEngine, carPlate, carState, carVin, carRenavam, engineAccepted, vinAccepted, surveyorEmail, pictures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Protocol {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    carEngine: ").append(toIndentedString(carEngine)).append("\n");
    sb.append("    carPlate: ").append(toIndentedString(carPlate)).append("\n");
    sb.append("    carState: ").append(toIndentedString(carState)).append("\n");
    sb.append("    carVin: ").append(toIndentedString(carVin)).append("\n");
    sb.append("    carRenavam: ").append(toIndentedString(carRenavam)).append("\n");
    sb.append("    engineAccepted: ").append(toIndentedString(engineAccepted)).append("\n");
    sb.append("    vinAccepted: ").append(toIndentedString(vinAccepted)).append("\n");
    sb.append("    surveyorEmail: ").append(toIndentedString(surveyorEmail)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
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