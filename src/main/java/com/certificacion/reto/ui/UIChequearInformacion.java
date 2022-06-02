package com.certificacion.reto.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UIChequearInformacion {

    public static final Target TXT_NOMBRE =
            Target.the("Campor para ingresar el nombre")
                    .located(By.xpath("//android.widget.EditText[@content-desc='test-Nombre']"));
    public static final Target TXT_APELLIDO =
            Target.the("Campor para ingresar el apellido")
                    .located(By.xpath("//android.widget.EditText[@content-desc='test-Apellido']"));
    public static final Target TXT_CODIGOPOSTAL =
            Target.the("Campor para ingresar el codigo postal")
                    .located(By.xpath("//android.widget.EditText[@content-desc='test-Código postal']"));
    public static final Target BTN_CONTINUAR =
            Target.the("Boton para continuar con la compra")
                    .located(By.xpath("//android.view.ViewGroup[@content-desc='test-CONTINUAR']"));
}
