package com.java.automation.api.deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializeExample {
    public static void main(String[] args) {
        String jsonResponse = "{ \"name\": \"Jane Doe\", \"email\": \"janedoe@example.com\", \"age\": 25 }";

        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Convert JSON string to POJO
            User user = objectMapper.readValue(jsonResponse, User.class);

            // Print the User object
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

