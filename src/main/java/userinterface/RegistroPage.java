package userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroPage {

    public static final Target INPUT_NAME = Target.the("Input para ingresar nombre")
            .locatedBy("(//android.widget.EditText[@text='Nombres'])");
    public static final Target INPUT_LASTNAME = Target.the("Input para ingresar apellido")
            .locatedBy("(//android.widget.EditText[@text='Apellidos'])");
    public static final Target INPUT_DOCUMENT = Target.the("Input para ingresar docNumber")
            .locatedBy("(//android.widget.EditText[@text='Número de documento'])");
    public static final Target SELECT_ANIO = Target.the("Combo para seleccionar año")
            .located(AppiumBy.id("filled_exposed_dropdown_anio_registro"));
    public static final Target SELECT_MONTH = Target.the("Combo para seleccionar mes")
            .located(AppiumBy.id("filled_exposed_dropdown_mes_registro"));
    public static final Target SELECT_DAY = Target.the("Combo para seleccionar dia")
            .located(AppiumBy.id("filled_exposed_dropdown_dia_registro"));
    public static final Target INPUT_PHONE = Target.the("Input para ingresar celular")
            .located(AppiumBy.id("TextInputEditText_tel"));
    public static final Target INPUT_EMAIL_SIGNIN = Target.the("Input para ingresar email")
            .locatedBy("(//android.widget.EditText[@text='Correo electrónico'])");
    public static final Target AGREE_TERMS = Target.the("Checkbox para aceptar terminos")
            .located(AppiumBy.id("AppCompatTextView_terminos_y_condiciones"));
    public static final Target AGREE_PRIVACY = Target.the("Checkbox para aceptar politicas de privacidad")
            .located(AppiumBy.id("AppCompatTextView_politicas_tratamiento"));
    public static final Target CONFIRM_BUTTON = Target.the("Button para confirmar registro")
            .located(AppiumBy.id("AppCompatButton_registrar"));
    public static final Target CODE_TEXT = Target.the("Texto que indica la finalizacion del formulario de registro")
            .located(AppiumBy.id("AppCompatTextView_bienvenido"));




}
