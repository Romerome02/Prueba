package com.example.restfulbooker.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 */
public class GetBooking {

    private static final String BASE_URL = "https://restful-booker.herokuapp.com";
    private static final String GET_BOOKING_ENDPOINT = "/booking/{id}";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testGetBooking() {
        Response response = given()
                .pathParam("id", 1)
                .get(GET_BOOKING_ENDPOINT);

        assertEquals(200, response.getStatusCode());
    }
}