package com.example.restfulbooker.utils;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RestAssuredUtils {

    public static RequestSpecification getRestAssuredConfig() {
        LogConfig logConfig = LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssuredConfig restAssuredConfig = RestAssuredConfig.config().logConfig(logConfig);
        RestAssured.config = restAssuredConfig;
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .baseUri("https://restful-booker.herokuapp.com");
    }
}