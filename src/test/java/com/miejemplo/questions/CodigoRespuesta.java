package com.miejemplo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.rest.SerenityRest;

public class CodigoRespuesta implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        return SerenityRest.lastResponse().statusCode();
    }

    public static CodigoRespuesta obtenido() {
        return new CodigoRespuesta();
    }
}