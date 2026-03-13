Feature: Gestión completa del ciclo de vida de una mascota en PetStore

  Scenario Outline: El sistema permite registrar, consultar, actualizar y eliminar una mascota exitosamente
    Given el cliente tiene acceso a la API de PetStore
    When registra una mascota con id "<id>", nombre "<nombre>" y estado "<estado>"
    And consulta la mascota registrada con id "<id>"
    And actualiza la mascota con id "<id>", nombre "<nombre_actualizado>" y estado "<estado_actualizado>"
    And elimina la mascota con id "<id>"
    Then el sistema confirma que todas las operaciones fueron exitosas

    Examples:
      | id    | nombre   | estado    | nombre_actualizado | estado_actualizado |
      | 12345 | Firulais | available | Rex                | sold               |
      | 67890 | Luna     | pending   | Estrella           | available          |