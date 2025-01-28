package com.java.automation.api.serialization;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostRequestExample {
    public static void main(String[] args) {
        // Base URI
        RestAssured.baseURI = "https://api.example.com";

        // Create a POJO instance
        User user = new User("John Doe", "johndoe@example.com", 30);

        //To cross verify what you are sending then make use of the below to print and see the response:
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        System.out.println("Serialized JSON: " + json);

        // POST request with POJO as payload
        Response response = given()
                .header("Content-Type", "application/json")
                .body(user) // Serialize POJO to JSON
                .when()
                .post("/users")
                .then()
                .statusCode(201) // Assert status code
                .extract()
                .response();

        // Print response body
        System.out.println("Response: " + response.getBody().asString());
    }
}
/*
*Add Jackson Dependency :
* <dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.15.2</version>
</dependency>
Note: Rest Assured already has Jackson as a transitive dependency in most versions. However, it's good to include it explicitly if you're using a standalone library.
*
* What Happens Internally:
Rest Assured automatically uses the Jackson library (or Gson, if configured) to convert the User POJO into a JSON string.
For example, if user has name = "John Doe", email = "johndoe@example.com", and age = 30, the JSON payload will look like this:
* {
    "name": "John Doe",
    "email": "johndoe@example.com",
    "age": 30
}
* */

//**If you want to manually verify the JSON serialization, you can use the ObjectMapper class from Jackson:
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class JsonSerializationExample {
//    public static void main(String[] args) throws Exception {
//        User user = new User("John Doe", "johndoe@example.com", 30);
//
//        // Create an ObjectMapper instance
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        // Serialize POJO to JSON
//        String json = objectMapper.writeValueAsString(user);
//
//        // Print the JSON string
//        System.out.println("Serialized JSON: " + json);
//    }
//}
// Pojo method is - 	Type-safe, maintainable, readable, Most common and scalable use case

//Why Type-Safe Payloads Are Preferred
//1.Compile-Time Validation:
//With POJOs, the compiler verifies that the fields in the payload match their expected types.
//Errors are caught early during development rather than at runtime.
//2.Reduced Runtime Errors:
//Type mismatches (e.g., passing a string where an integer is expected) are avoided.
//APIs expecting specific data types won't fail because of invalid payloads.
//3.Improved Code Readability:
//POJOs make it clear what fields are required and their types.
//This improves understanding and reduces potential mistakes in the payload structure.
//4.Easier Maintenance:
//If the API schema changes, you can modify the POJO and instantly see where changes need to propagate in your code.
//With JSON strings or maps, finding and fixing issues requires manual debugging.