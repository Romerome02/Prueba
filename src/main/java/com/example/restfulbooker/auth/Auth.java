package com.example.restfulbooker.auth;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Auth {

    private static final String BASE_URL = "https://restful-booker.herokuapp.com";
    private static final String CREATE_TOKEN_ENDPOINT = "/auth";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testCreateToken() {
        Response response = given()
                .post(CREATE_TOKEN_ENDPOINT);

        assertEquals(200, response.getStatusCode());
    }
}