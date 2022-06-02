package com.certificacion.reto.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IUTuCarrito {

    public static final Target BTN_CHECKOUT =
            Target.the("Boton para continuar con la compra")
                    .located(By.xpath("//android.view.ViewGroup[@content-desc='test-CHECKOUT']"));
}