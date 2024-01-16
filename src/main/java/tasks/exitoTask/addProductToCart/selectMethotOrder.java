package tasks.exitoTask.addProductToCart;

import interactions.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.EcommercePage.*;

public class selectMethotOrder implements Task {


    @Override
    @Step("{0} selecciona metodo de pedido")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SEARCH_BOX, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Pause.withDuration(1),
                Click.on(SEARCH_BOX),
                WaitUntil.the(BUY_AND_COLLECT, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BUY_AND_COLLECT)
        );

    }

    public static selectMethotOrder conOrder() {
        return instrumented(selectMethotOrder.class);
    }
}