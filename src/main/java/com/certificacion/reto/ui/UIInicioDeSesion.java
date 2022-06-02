package com.certificacion.reto.ui;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UIInicioDeSesion {

    public static final Target TXT_USUARIO = Target.the("Campo para el usuario").located(By.xpath("//*[@class='android.widget.EditText' and @text='Usuario']"));
    public static final Target TXT_CLAVE = Target.the("Campo para la clave").located(By.xpath("//*[@class='android.widget.EditText' and @text='Contraseña']"));
    public static final Target BTN_INICIAR_SESION = Target.the("Boton para iniciar sesion").located(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"));
}





