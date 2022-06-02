package com.certificacion.reto.task;

import com.certificacion.reto.interactions.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.logging.Logger;

public class AbreLaApp implements Task {

    public AbreLaApp(){}

    public static AbreLaApp deSwagLabs(){
        return Tasks.instrumented(AbreLaApp.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre app swagLabs");
        actor.attemptsTo(TakeScreenshot.asEvidence());
    }
}
