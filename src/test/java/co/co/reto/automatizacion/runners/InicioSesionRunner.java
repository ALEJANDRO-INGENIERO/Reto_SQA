package co.co.reto.automatizacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/AgregarProducto.feature",
        tags = "@registro",
        glue = "co.co.reto.automatizacion.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class InicioSesionRunner {
}
