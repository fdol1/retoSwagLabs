package com.certificacion.reto.interactions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

public class DragAndDrop implements Interaction {

    private Target elementoInicio,elementoFin;

    public DragAndDrop(Target inicio,Target fin){
        this.elementoFin=fin;
        this.elementoInicio=inicio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new TouchAction((PerformsTouchActions) GetDriver.as(actor).appiumDriver())
                .longPress(ElementOption.element((WebElement) elementoInicio))
                .moveTo(ElementOption.element((WebElement) elementoFin))
                .release()
                .perform();
    }
}