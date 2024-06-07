package com.example.restfulbooker.stepdefinitions;

import com.example.restfulbooker.api.CreateBooking;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateBookingSteps {

    private CreateBooking createBooking;

    @Given("que se crea una reserva")
    public void seCreaUnaReserva() {
        createBooking = new CreateBooking();
    }

    @When("se envía la solicitud de creación")
    public void seEnviaLaSolicitudDeCreación() {
        createBooking.testCreateBooking();
    }

    @Then("se recibe una respuesta exitosa")
    public void seRecibeUnaRespuestaExitosa() {
        // Validación de respuesta exitosa
    }
}