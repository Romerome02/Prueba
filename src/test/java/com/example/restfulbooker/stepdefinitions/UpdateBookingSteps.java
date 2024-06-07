package com.example.restfulbooker.stepdefinitions;

import com.example.restfulbooker.api.UpdateBooking;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateBookingSteps {

    private UpdateBooking updateBooking;

    @Given("se actualiza una reserva existente")
    public void seActualizaUnaReservaExistente() {
        updateBooking = new UpdateBooking();
    }

    @When("se envía la solicitud de actualización")
    public void seEnviaLaSolicitudDeActualización() {
        updateBooking.testUpdateBooking();
    }

    @Then("se recibe una respuesta exitosa")
    public void seRecibeUnaRespuestaExitosa() {
        // Validación de respuesta exitosa
    }
}