package co.co.reto.automatizacion.stepdefinitions;

import co.co.reto.automatizacion.tasks.IniciarSesion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.co.reto.automatizacion.utils.Datos.ACTOR;
import static co.co.reto.automatizacion.utils.Datos.URL;

public class AgregarProductos {

    @Given("El usuario ingresa a la pagina de Login")
    public void elUsuarioIngresaALaPaginaDeLogin() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }


    @Given("que el usuario ingresa su contraseña {string}")
    public void queElUsuarioIngresaSuContraseña(String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarSesion.onTheSite(clave)  // Pasamos el usuario y la contraseña
        );
        }


    @When("el usuario busca {string} en la barra de búsqueda")
    public void elUsuarioBuscaEnLaBarraDeBúsqueda(String string) {

    }
    @Then("selecciona un producto de los resultados")
    public void seleccionaUnProductoDeLosResultados() {

    }
    @Then("agrega el producto al carrito con cantidad {int}")
    public void agregaElProductoAlCarritoConCantidad(Integer int1) {

    }
    @Then("el producto debe estar en el carrito de compras")
    public void elProductoDebeEstarEnElCarritoDeCompras() {

    }

}
