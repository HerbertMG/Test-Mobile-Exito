package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterface.OptionPage.*;

public class NavigateTo implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SKIP_BUTTON, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds()
        );
    }
}