package tasks.exitoTask.addProductToCart;

import interactions.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.EcommercePage.*;
import static utils.Constants.CONS_PRODUCT_TITLE;

public class searchProduct implements Task {

    private String product;
    private String position;

    public searchProduct(String position,String product) {
        this.product = product;
        this.position = position;
    }

    @Override
    @Step("{0} busca y seleciona producto")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SEARCH_DATA, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(SEARCH_DATA),
                Enter.theValue(product).into(SEARCH_DATA),
                Click.on(START_SEARCH),
                WaitUntil.the(SELECT_PRODUCT.of(position), WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Pause.withDuration(5),
                Click.on(SELECT_PRODUCT.of(position)),
                WaitUntil.the(PRODUCT_TITLE, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Pause.withDuration(1)

        );
        String productTitle = PRODUCT_TITLE.resolveFor(actor).getText();
        actor.remember(CONS_PRODUCT_TITLE,productTitle);
    }

    public static searchProduct conArticulo(String position,String product) {
        return instrumented(searchProduct.class, position, product);
    }
}
