package steps.exito;

import interactions.Pause;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Steps;
import questions.ObtenerTexto;
import steps.conf.SharedComponents;
import tasks.common.ClickEn;
import tasks.common.scroll.Scroll;
import tasks.exitoTask.addProductToCart.searchProduct;
import tasks.exitoTask.addProductToCart.selectCityStore;
import tasks.exitoTask.addProductToCart.selectMethotOrder;


import static steps.conf.Hooks.actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static userinterface.EcommercePage.*;
import static userinterface.OptionPage.SKIP_BUTTON;
import static utils.Constants.CONS_PRODUCT_TITLE;


public class addToCarSteps {

    @Steps(shared = true)
    SharedComponents sharedComponents;

    @Dado("que un usuario se encuentra en el home de la aplicacion")
    public void queUnUsuarioSeEncuentraEnElHome() {
        actor.attemptsTo(
                WaitUntil.the(SKIP_BUTTON, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Ensure.that(SKIP_BUTTON).isEnabled(),
                Click.on(SKIP_BUTTON)
        );
    }

    @Cuando("necesite comprar un producto para recoger en tienda")
    public void necesiteComprarUnProductoParaRecogerEnTienda() {
        actor.wasAbleTo(
                Pause.withDuration(3),
                ClickEn.onPossition(170,1190),
                Pause.withDuration(1),
                selectMethotOrder.conOrder()
        );
    }

    @Cuando("seleccione ciudad y almacen")
    public void seleccioneCiudadYAlmacen() {
        actor.wasAbleTo(
                selectCityStore.conCity()
        );

    }
    @Cuando("^seleccione el resultado numero (.*) de buscar (.*)$")
    public void realiceLaBusquedaDelProducto(String pos, String producto) {
        actor.wasAbleTo(
                searchProduct.conArticulo(pos,producto)
        );
    }

    @Cuando("agregue el producto al carrito")
    public void agregueElProductoAlCarrito() {
        actor.wasAbleTo(
                Pause.withDuration(2),
                Scroll.toElement(),
                WaitUntil.the(ADD_TO_CART, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(ADD_TO_CART),
                Pause.withDuration(3),
                Click.on(VIEW_SHOPING_CART),
                Pause.withDuration(5)
        );
    }

    @Entonces("el producto se visualiza en el carrito de compras")
    public void elProductoSeVisualizaEnElCarritoDeCompras() {
        String title = actor.recall(CONS_PRODUCT_TITLE);
        actor.should(seeThat(ObtenerTexto.element(CART_PRODUCT_TITLE_VALIDATE.of(title)), containsString(actor.recall(CONS_PRODUCT_TITLE))));

        actor.attemptsTo(
                Pause.withDuration(5)
        );
    }
}
