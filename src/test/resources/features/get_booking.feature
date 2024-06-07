Feature: Get Booking

  Scenario: Get a booking
    Given se obtiene una reserva existente
    When se envía la solicitud de obtención
    Then se recibe una respuesta exitosa