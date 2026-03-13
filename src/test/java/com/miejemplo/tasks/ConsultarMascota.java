package com.miejemplo.tasks;

import com.miejemplo.util.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.annotations.Step;

public class ConsultarMascota implements Task {

    private final String id;

    public ConsultarMascota(String id) {
        this.id = id;
    }

    @Step("{0} consulta la mascota con id #id")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(Constantes.ENDPOINT_PET + "/" + id)
        );
    }

    public static ActualizarMascota conId(String id) {
        return Tasks.instrumented(ActualizarMascota.class, id);
    }
}