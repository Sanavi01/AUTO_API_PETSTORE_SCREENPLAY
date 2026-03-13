package com.miejemplo.tasks;

import com.miejemplo.model.Mascota;
import com.miejemplo.util.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.annotations.Step;

import static io.restassured.http.ContentType.JSON;

public class RegistrarMascota implements Task {

    private final Mascota mascota;

    public RegistrarMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Step("{0} registra una nueva mascota")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(Constantes.ENDPOINT_PET)
                        .with(request -> request
                                .contentType(JSON)
                                .body(mascota))
        );
    }

    public static RegistrarMascota conDatos(Mascota mascota) {
        return Tasks.instrumented(RegistrarMascota.class, mascota);
    }
}
