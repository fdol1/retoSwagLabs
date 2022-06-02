package com.certificacion.reto.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UIConfirmarCompra {

    public static final Target BTN_CONFIRMAR_COMPRA =
            Target.the("Boton para confirmar la compra")
                    .located(By.xpath("//android.view.ViewGroup[@content-desc='test-TERMINAR']"));
}


