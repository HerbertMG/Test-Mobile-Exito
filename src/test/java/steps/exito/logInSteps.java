package steps.exito;

import interactions.Pause;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import tasks.exitoTask.loginFill;
import utils.ExitoData;

import static steps.conf.Hooks.actor;
import static utils.Constants.*;

public class logInSteps {

    @Cuando("inicie sesion con las credenciales de un ususario existente")
    public void inicieSesionConLasCredencialesDeUnUsuarioExistente() {
        actor.wasAbleTo(
                loginFill.conCredenciales(
                        ExitoData.getData().get(EMAIL).toString(),
                        ExitoData.getData().get(PASSWORD).toString()
                )
        );
    }

    @Entonces("podra ingresar al home de la aplicacion")
    public void podraIngresarAlHomeDeLaAplicacion() {
        actor.attemptsTo(
                Pause.withDuration(10)
        );
    }
}
