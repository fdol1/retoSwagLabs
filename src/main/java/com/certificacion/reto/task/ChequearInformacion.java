package com.certificacion.reto.task;

import com.certificacion.reto.interactions.Swipe;
import com.certificacion.reto.interactions.Tap;
import com.certificacion.reto.models.InformacionDeCompraModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.certificacion.reto.ui.IUTuCarrito.BTN_CHECKOUT;
import static com.certificacion.reto.ui.UIChequearInformacion.*;
import static com.certificacion.reto.ui.UIConfirmarCompra.BTN_CONFIRMAR_COMPRA;

public class ChequearInformacion implements Task {

    private InformacionDeCompraModel informacionDeCompraModel;

    public ChequearInformacion(InformacionDeCompraModel informacionDeCompraModel){
        this.informacionDeCompraModel = informacionDeCompraModel;
    }

    public static ChequearInformacion conDatosDeUsuarioParaComprar(InformacionDeCompraModel informacionDeCompraModel){
        return Tasks.instrumented(ChequearInformacion.class,informacionDeCompraModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CHECKOUT, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                Tap.on(BTN_CHECKOUT),
                WaitUntil.the(TXT_NOMBRE, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                Enter.theValue(informacionDeCompraModel.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(informacionDeCompraModel.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(informacionDeCompraModel.getCodigoPostal()).into(TXT_CODIGOPOSTAL),
                Tap.on(BTN_CONTINUAR),
                Swipe.as(actor).fromBottom().to(339,347),
                Tap.on(BTN_CONFIRMAR_COMPRA)
                );
    }
}