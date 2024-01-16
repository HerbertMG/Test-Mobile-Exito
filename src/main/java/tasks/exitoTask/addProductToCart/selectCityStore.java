package tasks.exitoTask.addProductToCart;

import interactions.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import tasks.common.ClickEn;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.EcommercePage.*;

public class selectCityStore implements Task {


    @Override
    @Step("{0} selecciona ciudad y almacen")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DROP_CITY, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(DROP_CITY),
                Pause.withDuration(2),
                ClickEn.onPossition(103,526),
                Pause.withDuration(1),
                Click.on(DROP_STORE),
                Pause.withDuration(2),
                ClickEn.onPossition(103,1344),
                Pause.withDuration(2),
                Click.on(NEXT_BUTTON)
        );

    }

    public static selectCityStore conCity() {
        return instrumented(selectCityStore.class);
    }
}