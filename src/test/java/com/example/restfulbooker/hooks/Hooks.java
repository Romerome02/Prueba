package com.example.restfulbooker.hooks;

import io.cucumber.java.*;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setup() {
        // Configuración inicial
    }

    @Before("@create-booking")
    public void setupCreateBooking() {
        // Configuración específica para CreateBooking
    }

    @Before("@get-booking")
    public void setupGetBooking() {
        // Configuración específica para GetBooking
    }

    @Before("@update-booking")
    public void setupUpdateBooking() {
        // Configuración específica para UpdateBooking
    }
}