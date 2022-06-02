package com.certificacion.reto.stepsdefinitions;

import com.certificacion.reto.models.InformacionDeCompraModel;
import com.certificacion.reto.models.ProductosModel;
import com.certificacion.reto.models.InicioSesionModel;
import com.certificacion.reto.questions.VerificarMensaje;
import com.certificacion.reto.task.AbreLaApp;
import com.certificacion.reto.task.ChequearInformacion;
import com.certificacion.reto.task.IniciarSesion;
import com.certificacion.reto.task.SeleccionarArticulos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RealizarComprar {

    @Given("^(.*) abre la app de SwagLabs$")
    public void juanAbreLaAppDeSwagLabs(String nombre) {
        theActorCalled(nombre).wasAbleTo(AbreLaApp.deSwagLabs());
    }

    @Given("^Inicia quiere iniciar sesion con sus dats$")
    public void iniciaQuiereIniciarSesionConSusDats(List<InicioSesionModel> inicioSesionModelList) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.conLasCredencialesDeUsuario(inicioSesionModelList.get(0)));
    }

    @When("^Selecciona los productos y los agrega al carrito$")
    public void seleccionaLosProductosYLosAgregaAlCarrito() {
        theActorInTheSpotlight().attemptsTo(SeleccionarArticulos.enElCarritoDeCompras());
    }

    @When("^Chequea la compra he ingresa sus datos para finalizar el pedido$")
    public void chequeaLaCompraHeIngresaSusDatosParaElPedido(List<InformacionDeCompraModel> informacionDeCompraModelLis) {
        theActorInTheSpotlight().attemptsTo(ChequearInformacion.conDatosDeUsuarioParaComprar(informacionDeCompraModelLis.get(0)));
    }

    @Then("^Verifica el mensaje de compra exitosa: (.*)$")
    public void verificaElMensaDeCompraExitosa(String mensaje) {
        theActorInTheSpotlight().should(seeThat(VerificarMensaje.deCompraExitosa(mensaje)));


    }


}
