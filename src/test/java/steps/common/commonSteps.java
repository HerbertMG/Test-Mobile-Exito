package steps.common;

import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.NavigateTo;
import tasks.common.LoadDataTask;

import static models.UserInfoModel.userInformation;
import static steps.conf.Hooks.actor;
import static userinterface.OptionPage.SKIP_BUTTON;

public class commonSteps {

    @Dado("^que un usuario nuevo ingresa por primera vez a la aplicacion$")
    public void queUnUsuarioIngresaALaAplicacion() {
        actor.attemptsTo(
                new NavigateTo(),
                Ensure.that(SKIP_BUTTON).isEnabled()
        );

        actor.wasAbleTo(LoadDataTask.informationExito(userInformation()));

    }
}
