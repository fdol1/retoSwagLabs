package com.certificacion.reto.task;

import com.certificacion.reto.interactions.Tap;
import com.certificacion.reto.models.InicioSesionModel;
import jdk.internal.org.jline.utils.ShutdownHooks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.reto.ui.UIInicioDeSesion.*;

public class IniciarSesion implements Task {

    private InicioSesionModel inicioSesionModelData;

    public IniciarSesion(InicioSesionModel inicioSesionModelData){
        this.inicioSesionModelData = inicioSesionModelData;
    }

    public static IniciarSesion conLasCredencialesDeUsuario(InicioSesionModel inicioSesionModelData){
        return Tasks.instrumented(IniciarSesion.class, inicioSesionModelData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(TXT_USUARIO, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                Enter.theValue(inicioSesionModelData.getUsuario()).into(TXT_USUARIO),
                Enter.theValue(inicioSesionModelData.getClave()).into(TXT_CLAVE),
                Tap.on(BTN_INICIAR_SESION)
        );

    }
}
