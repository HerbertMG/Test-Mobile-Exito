package tasks.exitoTask;

import interactions.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static interactions.HideKeyboard.theActorHidesKeyboard;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.OptionPage.LOGIN_BUTTON;
import static userinterface.LoginPage.*;

public class loginFill implements Task {

    private String email;
    private String password;

    public loginFill(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    @Step("{0} completa campos para inicio de sesion")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BUTTON),
                WaitUntil.the(INPUT_EMAIL, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(INPUT_EMAIL),
                Enter.theValue(email).into(INPUT_EMAIL),
                theActorHidesKeyboard(),
                Click.on(INPUT_PASS),
                Enter.theValue(password).into(INPUT_PASS),
                theActorHidesKeyboard(),
                Pause.withDuration(1),
                Click.on(INGRESAR_BUTTON)
        );

    }

    public static loginFill conCredenciales(String email, String password) {
        return instrumented(loginFill.class, email, password);
    }
}
