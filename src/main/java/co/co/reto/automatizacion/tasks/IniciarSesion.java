package co.co.reto.automatizacion.tasks;

import co.co.reto.automatizacion.userinterfaces.InicioSesion;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class IniciarSesion {

    public static Performable onTheSite(String clave) {
        return Task.where("{0} ingresa sus credenciales",
                Click.on(InicioSesion.BTN_REG),
                Click.on(InicioSesion.BTN_LOGIN),
                Enter.theValue(clave).into(InicioSesion.CLAVE),
                Click.on(InicioSesion.BTN_INI)
        );
    }
}
