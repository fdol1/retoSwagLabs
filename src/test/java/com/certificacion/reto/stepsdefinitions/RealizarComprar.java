package com.certificacion.reto.stepsdefinitions;

import com.certificacion.reto.models.InicioSesionModel;
import com.certificacion.reto.task.AbreLaApp;
import com.certificacion.reto.task.IniciarSesion;
import cucumber.api.java.en.Given;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RealizarComprar {

    @Given("^(.*) abre la app de SwagLabs$")
    public void juanAbreLaAppDeSwagLabs(String nombre) {
        theActorCalled(nombre).wasAbleTo(AbreLaApp.deSwagLabs());
    }

    @Given("^Inicia quiere iniciar sesion con sus dats$")
    public void iniciaQuiereIniciarSesionConSusDats(List<InicioSesionModel> inicioSesionModelList) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.conLasCredencialesDeUsuario(inicioSesionModelList.get(0)));
    }


}
