package userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target INPUT_EMAIL = Target.the("Input para ingresar email")
            .located(AppiumBy.id("TextInputEditText_email"));
    public static final Target INPUT_PASS = Target.the("Input para ingresar clave")
            .locatedBy("(//android.widget.EditText[@text='Contraseña'])");
    public static final Target INGRESAR_BUTTON = Target.the("Button para validar credenciales")
            .located(AppiumBy.id("AppCompatButton_ingresar"));

}
