# swagger-java-client

AUDITORIA
- API version: 1.0
  - Build date: 2020-01-15T16:32:59.925Z[GMT]

# Introducão  Seja bem-vindo a documentação da API do [SCANVIN](https://scanvin.com.br) para auditorias    Nossa API foi criada utilizando o padrão [REST](https://restfulapi.net/) e [HATEOAS](https://restfulapi.net/hateoas/), possibilitando a integração de seu sistema ao nosso, e está documentada abaixo.  # Como usar a API?  Logo a seguir você encontrará todos os recursos e métodos suportados pela API, sendo que essa página possibilita que você teste os recursos e métodos diretamente através dela.  # Autenticação  Você precisa de uma [API KEY](https://en.wikipedia.org/wiki/Application_programming_interface_key#HTTP_APIs) para identificar a conta que está realizando solicitações para a API. Você pode obter seu token de autenticação no seu [Painel do Cliente](https://auditoria.scanvin.com.br/client/).  Insira seu token no campo que se encontra topo desta página para testar os métodos da API.  # Webhook  Você também deve configurar seu [Webhook](https://en.wikipedia.org/wiki/Webhook) no [Painel do Cliente](https://auditoria.scanvin.com.br/client/webhook). Quando os resultados da auditoria estiverem disponíveis, uma notificação será enviada para a URL informada, via [HTTP POST](https://en.wikipedia.org/wiki/POST_(HTTP)). A notificação possui ```Content-type``` do tipo ```application/json```. O [JSON](https://en.wikipedia.org/wiki/JSON) postado contém um único campo, ```notification_id```, que contém o identificador único do evento que gerou a notificação. Deve-se então chamar o endpoint ```Inspection - Get Inspection```, informando esse mesmo identificador único, para recuperar os dados da vistoria, e da auditoria realizada.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.MiscApi;

import java.io.File;
import java.util.*;

public class MiscApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: Api-Key
        ApiKeyAuth Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api-Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        MiscApi apiInstance = new MiscApi();
        String notificationId = "notificationId_example"; // String | O código da notificação, recebido pelo seu webhook via HTTP POST
        try {
            InspectionGetInspection result = apiInstance.inspectionGetInspection(notificationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MiscApi#inspectionGetInspection");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.MiscApi;

import java.io.File;
import java.util.*;

public class MiscApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: Api-Key
        ApiKeyAuth Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api-Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        MiscApi apiInstance = new MiscApi();
        try {
            String result = apiInstance.inspectionPictureTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MiscApi#inspectionPictureTypes");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.MiscApi;

import java.io.File;
import java.util.*;

public class MiscApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: Api-Key
        ApiKeyAuth Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api-Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        MiscApi apiInstance = new MiscApi();
        InspectionSubmitRequest body = new InspectionSubmitRequest(); // InspectionSubmitRequest | 
        try {
            InspectionSubmit result = apiInstance.inspectionSubmit(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MiscApi#inspectionSubmit");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://auditoria.scanvin.com.br/api/inspection*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MiscApi* | [**inspectionGetInspection**](docs/MiscApi.md#inspectionGetInspection) | **GET** /{notification_id} | Inspection - Get Inspection
*MiscApi* | [**inspectionPictureTypes**](docs/MiscApi.md#inspectionPictureTypes) | **GET** /picture-types | Inspection - Picture Types
*MiscApi* | [**inspectionSubmit**](docs/MiscApi.md#inspectionSubmit) | **POST** /submit | Inspection - Submit

## Documentation for Models

 - [Audit](docs/Audit.md)
 - [Compliance](docs/Compliance.md)
 - [Details](docs/Details.md)
 - [InspectionGetInspection](docs/InspectionGetInspection.md)
 - [InspectionSubmit](docs/InspectionSubmit.md)
 - [InspectionSubmitRequest](docs/InspectionSubmitRequest.md)
 - [Picture](docs/Picture.md)
 - [Picture1](docs/Picture1.md)
 - [Problems](docs/Problems.md)
 - [Protocol](docs/Protocol.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### Api-Key

- **Type**: API key
- **API key parameter name**: X-Api-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


