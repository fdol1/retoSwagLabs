package com.certificacion.reto.task;

import com.certificacion.reto.interactions.Tap;
import com.certificacion.reto.models.ProductosModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.reto.ui.UIProductos.*;

public class SeleccionarArticulos implements Task {


    public SeleccionarArticulos(){
    }

    public static SeleccionarArticulos enElCarritoDeCompras(){
        return Tasks.instrumented(SeleccionarArticulos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_PRODUCTO, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                Tap.on(BTN_AGREGAR_AL_CARRITO),
                Tap.on(IMG_CARRITO)
        );
    }
}
