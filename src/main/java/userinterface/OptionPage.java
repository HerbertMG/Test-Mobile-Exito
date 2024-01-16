package userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class OptionPage {

    public static final Target LOGIN_BUTTON = Target.the("Button para ingresar credenciales")
            .located(AppiumBy.id("AppCompatButton_ingresar"));

    public static final Target SIGNIN_BUTTON = Target.the("Button para registrar nuevo usuario")
            .located(AppiumBy.id("AppCompatButton_registrarse"));

    public static final Target SKIP_BUTTON = Target.the("TextView para saltar el inicio de sesion")
            .located(AppiumBy.id("textView_loginlater"));
}
