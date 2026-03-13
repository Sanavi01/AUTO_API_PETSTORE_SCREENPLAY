Feature: Consulta de mascotas en la Petstore

  Scenario: Consultar una mascota existente por ID
    Given que la API de Petstore está disponible
    When el usuario consulta la mascota con ID 1
    Then la respuesta debe contener los datos de la mascota
