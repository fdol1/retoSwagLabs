package com.certificacion.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.reto.ui.UICompraFinalizada.LBL_MENSAJE;

public class VerificarMensaje implements Question<Boolean> {

    private final String mensaje;

    public VerificarMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public  static  VerificarMensaje deCompraExitosa(String mensaje){
        return new VerificarMensaje(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_MENSAJE, WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds()
        );

        return mensaje.equals(Text.of(LBL_MENSAJE).viewedBy(actor).asString());
    }
}
