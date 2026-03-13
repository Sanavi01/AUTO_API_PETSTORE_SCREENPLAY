package com.miejemplo.tasks;

import com.miejemplo.model.Mascota;
import com.miejemplo.util.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;
import net.serenitybdd.annotations.Step;

import static io.restassured.http.ContentType.JSON;

public class ActualizarMascota implements Task {

    private final Mascota mascota;

    public ActualizarMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Step("{0} actualiza la mascota con id #mascota.id")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to(Constantes.ENDPOINT_PET)
                        .with(request -> request
                                .contentType(JSON)
                                .body(mascota))
        );
    }

    public static ActualizarMascota conDatos(Mascota mascota) {
        return Tasks.instrumented(ActualizarMascota.class, mascota);
    }
}