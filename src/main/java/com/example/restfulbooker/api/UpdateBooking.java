package com.example.restfulbooker.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateBooking {
    private static final String BASE_URL = "https://restful-booker.herokuapp.com";
    private static final String UPDATE_BOOKING_ENDPOINT = "/booking/{id}";
    private static final String AUTH_ENDPOINT = "/auth";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testUpdateBooking() {
        String requestBody = "{\n" +
                "    \"firstname\": \"Jane\",\n" +
                "    \"lastname\": \"Doe\",\n" +
                "    \"totalprice\": 120,\n" +
                "    \"depositpaid\": true\n" +
                "}";

        String token = given()
                .body(requestBody)
                .post(AUTH_ENDPOINT)
                .then()
                .extract()
                .path("token");

        Response response = given()
                .header("Cookie", "token=" + token)
                .body(requestBody)
                .put(UPDATE_BOOKING_ENDPOINT);

        assertEquals(200, response.getStatusCode());
    }
}