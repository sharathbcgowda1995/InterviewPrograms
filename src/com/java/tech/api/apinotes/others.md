### How the framework should be ?
```
src
 └── test
     ├── java
     │    ├── base
     │    │     └── BaseTest.java
     │    ├── model
     │    │     └── StatusResponse.java
     │    ├── tests
     │    │     └── StatusApiTest.java
     │    └── utils
     │          └── AuthUtil.java
     └── resources
           └── config.properties
```
```
package base;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://plivo.com";
    }
}


package utils;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class AuthUtil {

    // Basic Auth
    public static RequestSpecification withBasicAuth(String user, String pass) {
        return given().auth().preemptive().basic(user, pass);
    }

    // Bearer Token Auth
    public static RequestSpecification withBearerToken(String token) {
        return given().auth().oauth2(token);
    }

    // No Auth
    public static RequestSpecification withoutAuth() {
        return given();
    }
}


package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusResponse {

    @JsonProperty("company")
    private String company;

    @JsonProperty("old")
    private int old;

    @JsonProperty("Stable")
    private String stable;

    // Getters and Setters
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public int getOld() {
        return old;
    }
    public void setOld(int old) {
        this.old = old;
    }

    public String getStable() {
        return stable;
    }
    public void setStable(String stable) {
        this.stable = stable;
    }
}


package tests;
import base.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.StatusResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.AuthUtil;
import static io.restassured.RestAssured.given;

public class StatusApiTest extends BaseTest {

    @Test
    public void testStatusApi() {
        Response response =
            AuthUtil.withoutAuth()
                .pathParam("product", 2)
                .pathParam("profit", "yes")
                .queryParam("flag", true)
                .queryParam("join", "no")
                .header("Content-Type", "application/json")
                .when()
                .get("/Status/{product}/{profit}")
                .then()
                .log().all()
                .extract()
                .response();

        // ✅ Validate Status Code
        Assert.assertEquals(response.getStatusCode(), 200, "Status code mismatch");

        // ✅ Deserialize Response to POJO
        StatusResponse statusResponse = response.as(StatusResponse.class);
        Assert.assertEquals(statusResponse.getCompany(), "plivo");
        Assert.assertEquals(statusResponse.getOld(), 10);
        Assert.assertEquals(statusResponse.getStable(), "no");

        // ✅ Validate Response Header
        Assert.assertEquals(response.getHeader("Content-Type"), "application/json");

        // ✅ Validate Response Time (less than 2s for example)
        Assert.assertTrue(response.getTime() < 2000, "Response took too long!");
    }
}


baseUrl=https://plivo.com
token=your_token_here


-------------------------

src
 └── test
     ├── java
     │    ├── base
     │    │     └── BaseTest.java
     │    ├── model
     │    │     └── StatusResponse.java
     │    ├── tests
     │    │     └── StatusApiTest.java
     │    ├── utils
     │    │     ├── AuthUtil.java
     │    │     ├── AwsUtil.java
     │    │     ├── MongoUtil.java
     │    │     └── KafkaUtil.java
     │    └── service
     │          └── StatusService.java
     └── resources
           └── config.properties


 package utils;

 import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
 import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
 import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
 import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;

 public class AwsUtil {

     private static final SecretsManagerClient client =
             SecretsManagerClient.builder()
                     .credentialsProvider(DefaultCredentialsProvider.create())
                     .build();

     public static String getSecret(String secretName) {
         GetSecretValueResponse value = client.getSecretValue(
                 GetSecretValueRequest.builder().secretId(secretName).build()
         );
         return value.secretString();
     }
 }


package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoUtil {

    private static final String uri = "mongodb://localhost:27017";

    public static MongoDatabase getDatabase(String dbName) {
        MongoClient client = MongoClients.create(uri);
        return client.getDatabase(dbName);
    }

    public static Document findOne(String dbName, String collection, String key, Object value) {
        return getDatabase(dbName)
                .getCollection(collection)
                .find(new Document(key, value))
                .first();
    }
}


 package utils;

 import org.apache.kafka.clients.consumer.ConsumerRecord;
 import org.apache.kafka.clients.consumer.KafkaConsumer;
 import org.apache.kafka.clients.producer.KafkaProducer;
 import org.apache.kafka.clients.producer.ProducerRecord;

 import java.time.Duration;
 import java.util.Collections;
 import java.util.Properties;

 public class KafkaUtil {

     public static void publish(String topic, String key, String message) {
         Properties props = new Properties();
         props.put("bootstrap.servers", "localhost:9092");
         props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
         props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

         KafkaProducer<String, String> producer = new KafkaProducer<>(props);
         producer.send(new ProducerRecord<>(topic, key, message));
         producer.close();
     }

     public static ConsumerRecord<String, String> consume(String topic) {
         Properties props = new Properties();
         props.put("bootstrap.servers", "localhost:9092");
         props.put("group.id", "test-group");
         props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
         props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

         KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
         consumer.subscribe(Collections.singletonList(topic));
         return consumer.poll(Duration.ofSeconds(5)).iterator().next();
     }
 }



 @Test
 public void testStatusApiWithAwsMongoKafka() {
     // Fetch token from AWS Secrets Manager
     String token = AwsUtil.getSecret("plivo-api-token");

     Response response =
         AuthUtil.withBearerToken(token)
             .pathParam("product", 2)
             .pathParam("profit", "yes")
             .queryParam("flag", true)
             .queryParam("join", "no")
             .header("Content-Type", "application/json")
             .when()
             .get("/Status/{product}/{profit}")
             .then()
             .extract()
             .response();

     // Validate API response
     Assert.assertEquals(response.getStatusCode(), 200);

     // Cross-check Mongo entry
     Document doc = MongoUtil.findOne("plivoDB", "statusCollection", "company", "plivo");
     Assert.assertNotNull(doc);

     // Publish Kafka event after success
     KafkaUtil.publish("status-events", "company", "Plivo API Success");
 }


```