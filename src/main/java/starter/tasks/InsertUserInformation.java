package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.ui.Checkbox;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.userinterfaces.CheckoutFormInterface;

public class InsertUserInformation implements Task {
    public static Performable insertUserInformation (){
     return Tasks.instrumented(InsertUserInformation.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(CheckoutFormInterface.FIRST_NAME),
                WaitUntil.the(CheckoutFormInterface.FIRST_NAME, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue("David").into(CheckoutFormInterface.FIRST_NAME),

                Scroll.to(CheckoutFormInterface.LAST_NAME),
                WaitUntil.the(CheckoutFormInterface.LAST_NAME, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue("Chango").into(CheckoutFormInterface.LAST_NAME),

                Scroll.to(CheckoutFormInterface.EMAIL),
                WaitUntil.the(CheckoutFormInterface.EMAIL, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue("dbchango9@gmail.com").into(CheckoutFormInterface.EMAIL),

                Scroll.to(CheckoutFormInterface.TELEPHONE),
                WaitUntil.the(CheckoutFormInterface.TELEPHONE, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue("0984593359").into(CheckoutFormInterface.TELEPHONE),

                Scroll.to(CheckoutFormInterface.ADDRESS_1),
                WaitUntil.the(CheckoutFormInterface.ADDRESS_1, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue("Bolivar y Castillo").into(CheckoutFormInterface.ADDRESS_1),

                Scroll.to(CheckoutFormInterface.CITY),
                WaitUntil.the(CheckoutFormInterface.CITY, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue("Quito").into(CheckoutFormInterface.CITY),

                Scroll.to(CheckoutFormInterface.POST_CODE),
                WaitUntil.the(CheckoutFormInterface.POST_CODE, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue("180103").into(CheckoutFormInterface.POST_CODE),

                Scroll.to(CheckoutFormInterface.COUNTRY),
                WaitUntil.the(CheckoutFormInterface.COUNTRY, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CheckoutFormInterface.COUNTRY_SELECT),
                Click.on(CheckoutFormInterface.COUNTRY),

                Scroll.to(CheckoutFormInterface.REGION),
                WaitUntil.the(CheckoutFormInterface.REGION, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CheckoutFormInterface.REGION_SELECT),
                Click.on(CheckoutFormInterface.REGION)
        );
    }
}
