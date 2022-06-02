package com.certificacion.reto.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UIProductos {

    public static final Target LBL_PRODUCTO =
            Target.the("Producto del listado")
                    .located(By.xpath("//*[@class='android.widget.TextView' and @text='Camisa Sauce Labs Bolt']"));
    public static final Target BTN_AGREGAR_AL_CARRITO =
            Target.the("Boton para agregar producto al carrito")
                    .located(By.xpath("(//android.view.ViewGroup[@content-desc='test-AÑADIR A CARRITO'])[1]"));
    public static final Target IMG_CARRITO =
            Target.the("Boton para agregar producto al carrito")
                    .located(By.xpath("//android.view.ViewGroup[@content-desc='test-Carrito']/android.view.ViewGroup/android.widget.ImageView"));
}