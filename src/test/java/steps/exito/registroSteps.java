package steps.exito;

import interactions.Pause;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import questions.ObtenerTexto;
import steps.conf.SharedComponents;
import tasks.exitoTask.registroFill;
import utils.ExitoData;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;
import static steps.conf.Hooks.actor;
import static userinterface.RegistroPage.CODE_TEXT;
import static utils.Constants.*;


public class registroSteps {

    @Steps(shared = true)
    SharedComponents sharedComponents;

    @Cuando("complete el formulario de registro con informacion personal")
    public void completeElFormularioDeRegistroConInformacionPersonal() {
        actor.wasAbleTo(
                registroFill.conDatos(
                        ExitoData.getData().get(FIRST_NAME).toString(),
                        ExitoData.getData().get(LAST_NAME).toString(),
                        ExitoData.getData().get(DOCUMENT_NUMBER).toString(),
                        ExitoData.getData().get(BORN_DATE).toString(),
                        ExitoData.getData().get(PHONE).toString(),
                        ExitoData.getData().get(EMAIL).toString()
                )
        );
        //String codigoFuente = sharedComponents.getDriver().getPageSource();
        // System.out.println("Código fuente de la página: " + codigoFuente);
    }

    @Entonces("^visualiza en la app: \"(.*)\"$")
    public void visualizaEnLaApp(String textCode) {
        actor.should(seeThat(ObtenerTexto.element(CODE_TEXT), containsString(textCode)));

        actor.attemptsTo(
                Pause.withDuration(10)
        );
    }
}
