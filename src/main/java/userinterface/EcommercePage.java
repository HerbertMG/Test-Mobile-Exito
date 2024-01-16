package userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class EcommercePage {

    public static final Target DENY_BUTTON = Target.the("Button para rechazar permisos")
            .located(AppiumBy.id("permission_deny_button"));
    public static final Target SEARCH_BOX = Target.the("Text box para buscar producto")
            .located(AppiumBy.id("appCompatEditText_search_bar"));
    public static final Target BUY_AND_COLLECT = Target.the("Seleccion de recojo en tienda")
            .located(AppiumBy.id("constraitLayout_buy_and_collect"));
    public static final Target DROP_CITY = Target.the("Muestra lista de ciudades")
            .located(AppiumBy.id("filled_exposed_dropdown_city"));
    public static final Target DROP_STORE = Target.the("Muestra lista de almacenes")
            .located(AppiumBy.id("filled_exposed_dropdown_store"));
    public static final Target NEXT_BUTTON = Target.the("Button para continuar")
            .located(AppiumBy.id("appCompatButton_continue"));
    public static final Target SEARCH_DATA = Target.the("Text box para editar producto a buscar")
            .located(AppiumBy.id("appCompatEditText_search_data_edit"));
    public static final Target START_SEARCH = Target.the("Inicio de busqueda")
            .located(AppiumBy.id("text_input_start_icon"));
    public static final Target SELECT_PRODUCT = Target.the("Producto a seleccionar")
            .locatedBy("(//android.view.ViewGroup[@resource-id='com.exito.appcompania:id/constraintLayout_plp_item'])[{0}]");
    public static final Target ADD_TO_CART = Target.the("Button para agregar producto al carrito")
            .located(AppiumBy.id("add_to_cart_food_button"));
    public static final Target PRODUCT_TITLE = Target.the("Nombre del producto")
            .located(AppiumBy.id("appCompatTextView_product_title"));
    public static final Target VIEW_SHOPING_CART = Target.the("Button para ver carrito")
            .located(AppiumBy.id("appCompatImageView_shopping_cart"));
    public static final Target CART_PRODUCT_TITLE_VALIDATE = Target.the("Nombre del producto en el carrito")
            .locatedBy("(//android.view.View[@text='{0}'])");



/*
    public static final Target INPUT_NAME = Target.the("Input para ingresar nombre")
            .locatedBy("(//android.view.View[@text=\"Laptop Hp 15 Ef2500la, Amd Ryzen 7, 16 Gb, 512 Gb Ssd, 15.6, Hd, Windows 11 Home\"])");

    public static final Target SELECT_ANIO = Target.the("Combo para seleccionar año")
            .located(AppiumBy.id("filled_exposed_dropdown_anio_registro"));

 */
}
