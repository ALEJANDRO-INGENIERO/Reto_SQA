package co.co.reto.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesion {
    public static final Target BTN_REG = Target.the("")
            .located(By.xpath("//span[contains(text(),'Identifícate / Regístrate')]"));
    public static final Target BTN_LOGIN = Target.the("")
            .located(By.xpath("//button[contains(text(),'Identifícate')]"));
    public static final Target CLAVE = Target.the("")
            .located(By.cssSelector("#fm-history-login-password"));
    public static final Target BTN_INI = Target.the("")
            .located(By.xpath("//input[@id='fm-history-login-password']"));
}
