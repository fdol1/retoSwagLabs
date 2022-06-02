package com.certificacion.reto.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/resources/features/ComprarProducto.feature"},
        tags = {"@RealizarCompraExitosa"},
        glue = {"com.certificacion.reto.stepsdefinitions"},
        snippets = SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)

public class RunnerComprarProducto {

}
