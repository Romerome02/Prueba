Feature: Update Booking

  Scenario: Update a booking
    Given se actualiza una reserva existente
    When se envía la solicitud de actualización
    Then se recibe una respuesta exitosa