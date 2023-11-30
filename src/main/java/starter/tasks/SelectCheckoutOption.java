package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.userinterfaces.CartPageInterface;
import starter.userinterfaces.CheckoutFormInterface;

import java.util.Scanner;

public class SelectCheckoutOption implements Task {
    public static Task selectCheckoutOption(){
        return Tasks.instrumented(SelectCheckoutOption.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CartPageInterface.ORDER_DETAILS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Scroll.to(CartPageInterface.ORDER_DETAILS),
                WaitUntil.the(CartPageInterface.ORDER_DETAILS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Scroll.to(CartPageInterface.CHECKOUT_BUTTON),
                WaitUntil.the(CartPageInterface.CHECKOUT_BUTTON, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CartPageInterface.CHECKOUT_BUTTON)
        );
    }
}
