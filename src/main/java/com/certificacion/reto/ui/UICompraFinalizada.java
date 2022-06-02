package com.certificacion.reto.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UICompraFinalizada {

    public static final Target LBL_MENSAJE =
            Target.the("Campo donde se muestra mensaje de compra exitosa")
                    .located(By.xpath("//android.widget.ScrollView[@content-desc='test-CHECKOUT: COMPLETADO!']/android.view.ViewGroup/android.widget.TextView[1]"));

}
