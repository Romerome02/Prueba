package com.example.restfulbooker.stepdefinitions;

import com.example.restfulbooker.api.GetBooking;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetBookingSteps {

    private GetBooking getBooking;

    @Given("se obtiene una reserva existente")
    public void seObtieneUnaReservaExistente() {
        getBooking = new GetBooking();
    }

    @When("se envía la solicitud de obtención")
    public void seEnviaLaSolicitudDeObtención() {
        getBooking.testGetBooking();
    }

    @Then("se recibe una respuesta exitosa")
    public void seRecibeUnaRespuestaExitosa() {
        // Validación de respuesta exitosa
    }
}