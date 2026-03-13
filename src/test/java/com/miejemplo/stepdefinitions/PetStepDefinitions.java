package com.miejemplo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PetStepDefinitions {

    @Given("el cliente tiene acceso a la API de PetStore")
    public void clienteTieneAccesoALaApi() {
        // TODO
    }

    @When("registra una mascota con id {string}, nombre {string} y estado {string}")
    public void registraMascota(String id, String nombre, String estado) {
        // TODO
    }

    @And("consulta la mascota registrada con id {string}")
    public void consultaMascota(String id) {
        // TODO
    }

    @And("actualiza la mascota con id {string}, nombre {string} y estado {string}")
    public void actualizaMascota(String id, String nombre, String estado) {
        // TODO
    }

    @And("elimina la mascota con id {string}")
    public void eliminaMascota(String id) {
        // TODO
    }

    @Then("el sistema confirma que todas las operaciones fueron exitosas")
    public void sistemaConfirmaOperacionesExitosas() {
        // TODO
    }
}