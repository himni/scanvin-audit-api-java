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

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InspectionGetInspection;
import io.swagger.client.model.InspectionSubmit;
import io.swagger.client.model.InspectionSubmitRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MiscApi
 */
@Ignore
public class MiscApiTest {

    private final MiscApi api = new MiscApi();

    /**
     * Inspection - Get Inspection
     *
     * Recupera as informações da vistoria e o resultado da auditoria, se estiver disponível.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inspectionGetInspectionTest() throws ApiException {
        String notificationId = null;
        InspectionGetInspection response = api.inspectionGetInspection(notificationId);

        // TODO: test validations
    }
    /**
     * Inspection - Picture Types
     *
     * Utilize este endpoint para obter a lista de códigos para os tipos de imagem que devem ser utilizados ao realizar chamadas ao endpoint &#x60;&#x60;&#x60;Inspection - Submit&#x60;&#x60;&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inspectionPictureTypesTest() throws ApiException {
        String response = api.inspectionPictureTypes();

        // TODO: test validations
    }
    /**
     * Inspection - Submit
     *
     * Utilize este endpoint para enviar uma vistoria para auditoria. As vistorias são colocadas em uma fila e distribuídas aleatoriamente entre os auditores, e são processadas na ordem de chegada. Para receber uma notificação assim que a auditoria for realizada, configure o webhook no [Painel do Cliente](https://auditoria.scanvin.com.br/client/webhook). Alternativamente, caso prefira especificar um webhook customizado para cada vistoria, informe o parâmetro &#x60;&#x60;&#x60;postback_url&#x60;&#x60;&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inspectionSubmitTest() throws ApiException {
        InspectionSubmitRequest body = null;
        InspectionSubmit response = api.inspectionSubmit(body);

        // TODO: test validations
    }
}
