Feature: Gestión completa del ciclo de vida de una mascota en PetStore

  Scenario Outline: El sistema permite registrar, consultar, actualizar y eliminar una mascota exitosamente
    Given el cliente tiene acceso a la API de PetStore
    When registra una mascota con id "<id>", nombre "<nombre>" y estado "<estado>"
    Then el código de respuesta es "<status_post>"
    When consulta la mascota registrada con id "<id>"
    Then el código de respuesta es "<status_get>"
    When actualiza la mascota con id "<id>", nombre "<nombre_actualizado>" y estado "<estado_actualizado>"
    Then el código de respuesta es "<status_put>"
    When elimina la mascota con id "<id>"
    Then el código de respuesta es "<status_delete>"

    Examples:
      | id    | nombre   | estado    | nombre_actualizado | estado_actualizado | status_post | status_get | status_put | status_delete |
      | 12345 | Firulais | available | Rex                | sold               | 200         | 200        | 200        | 200           |
      | 67890 | Luna     | pending   | Estrella           | available          | 200         | 200        | 200        | 200           |