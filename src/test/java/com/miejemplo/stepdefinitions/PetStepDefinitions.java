package com.miejemplo.stepdefinitions;

import com.miejemplo.hooks.ConfigurarApi;
import com.miejemplo.model.Mascota;
import com.miejemplo.questions.CodigoRespuesta;
import com.miejemplo.tasks.*;
import com.miejemplo.util.Constantes;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class PetStepDefinitions {

    private Actor actor;

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        actor = OnStage.theActorCalled(Constantes.ACTOR);
    }

    @Given("el cliente tiene acceso a la API de PetStore")
    public void clienteTieneAccesoALaApi() {
        actor.attemptsTo(
                ConfigurarApi.conUrl(Constantes.BASE_URL)
        );
    }

    @When("registra una mascota con id {string}, nombre {string} y estado {string}")
    public void registraMascota(String id, String nombre, String estado) {
        actor.attemptsTo(
                RegistrarMascota.conDatos(new Mascota(Long.parseLong(id), nombre, estado))
        );
    }

    @When("consulta la mascota registrada con id {string}")
    public void consultaMascota(String id) {
        actor.attemptsTo(
                ConsultarMascota.conId(id)
        );
    }

    @When("actualiza la mascota con id {string}, nombre {string} y estado {string}")
    public void actualizaMascota(String id, String nombre, String estado) {
        actor.attemptsTo(
                ActualizarMascota.conDatos(new Mascota(Long.parseLong(id), nombre, estado))
        );
    }

    @When("elimina la mascota con id {string}")
    public void eliminaMascota(String id) {
        actor.attemptsTo(
                EliminarMascota.conId(id)
        );
    }

    @Then("el código de respuesta es {string}")
    public void elCodigoDeRespuestaEs(String codigoEsperado) {
        actor.should(
                seeThat(CodigoRespuesta.obtenido(), equalTo(Integer.parseInt(codigoEsperado)))
        );
    }
}