package com.certificacion.reto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class EsperarElemento implements Interaction {


    private final Target elementoAEsperar;

    public EsperarElemento(Target elementoAEsperar) {
        this.elementoAEsperar = elementoAEsperar;
    }

    public static EsperarElemento duranteTransicion(Target elementoAEsperar){
        return new EsperarElemento(elementoAEsperar);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        do {
            if(elementoAEsperar.resolveFor(actor).isVisible()){
                break;
            }
        }while (!elementoAEsperar.resolveFor(actor).isVisible());
    }

}
