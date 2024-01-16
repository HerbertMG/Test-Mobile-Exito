package tasks.exitoTask;

import interactions.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import tasks.common.ClickEn;
import tasks.common.scroll.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.OptionPage.SIGNIN_BUTTON;
import static userinterface.RegistroPage.*;


public class registroFill implements Task {

    private String firstName;
    private String lastName;
    private String docNumber;
    private String bornDate;
    private String phone;
    private String email;

    public registroFill(String firstName, String lastName, String docNumber, String bornDate, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.docNumber = docNumber;
        this.bornDate = bornDate;
        this.phone = phone;
        this.email = email;
    }

    private static String separateDate(String date, int value){
        String[] temp = date.split("/");
        String divDate = temp[value];

        return divDate;
    }


    @Override
    @Step("{0} completa campos para registro de usuario")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SIGNIN_BUTTON),
                WaitUntil.the(INPUT_NAME, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(firstName).into(INPUT_NAME),
                Enter.theValue(lastName).into(INPUT_LASTNAME),
                Enter.theValue(docNumber).into(INPUT_DOCUMENT),
                Scroll.toElement(),
                Click.on(SELECT_ANIO),
                Pause.withDuration(1),
                ClickEn.onPossition(65,1515),
                Click.on(SELECT_MONTH),
                Pause.withDuration(1),
                ClickEn.onPossition(390,820),

                Click.on(SELECT_DAY),
                Pause.withDuration(1),
                ClickEn.onPossition(1010,860),

                Enter.theValue(phone).into(INPUT_PHONE),
                Enter.theValue(email).into(INPUT_EMAIL_SIGNIN),
                ClickEn.onPossition(86,1215),
                ClickEn.onPossition(86,1342),
                Pause.withDuration(1),
                Click.on(CONFIRM_BUTTON),
                WaitUntil.the(CODE_TEXT, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
        );

    }

    public static registroFill conDatos(String firstName, String lastName, String docNumber, String bornDate, String phone, String email) {
        return instrumented(registroFill.class, firstName, lastName, docNumber, bornDate, phone, email);
    }
}