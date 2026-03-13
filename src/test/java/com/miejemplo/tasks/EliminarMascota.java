package com.miejemplo.tasks;

import com.miejemplo.util.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.annotations.Step;

public class EliminarMascota implements Task {

    private final String id;

    public EliminarMascota(String id) {
        this.id = id;
    }

    @Step("{0} elimina la mascota con id #id")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from(Constantes.ENDPOINT_PET + "/" + id)
        );
    }

    public static EliminarMascota conId(String id) {
        return Tasks.instrumented(EliminarMascota.class, id);
    }
}