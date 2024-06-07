package com.example.restfulbooker.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateBooking {

    private static final String BASE_URL = "https://restful-booker.herokuapp.com";
    private static final String CREATE_BOOKING_ENDPOINT = "/booking";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testCreateBooking() {
        String requestBody = "{\n" +
                "    \"firstname\": \"John\",\n" +
                "    \"lastname\": \"Doe\",\n" +
                "    \"totalprice\": 100,\n" +
                "    \"depositpaid\": true\n" +
                "}";

        Response response = given()
                .body(requestBody)
                .post(CREATE_BOOKING_ENDPOINT);

        assertEquals(201, response.getStatusCode());
    }
}