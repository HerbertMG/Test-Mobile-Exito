package tasks.common;

import exceptions.NotFoundUserAbility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.InvalidSelectorException;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickEn implements Task {

    public ClickEn() {
        // Nothing
    }

    private int x;
    private int y;

    public ClickEn(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    @Step("{0} tap the screen")
    public <T extends Actor> void performAs(T actor) {
        try {
            AndroidDriver driver = (AndroidDriver) BrowseTheWeb.as(actor).getDriver();
            new AndroidTouchAction(driver)
                    .press(PointOption.point(x, y))
                    .release()
                    .perform();

        } catch (InvalidSelectorException e) {
            throw new NotFoundUserAbility();
        }
    }

    public static ClickEn onPossition(int x, int y) {
        return instrumented(ClickEn.class,x,y);
    }



}
