package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.userinterfaces.CheckoutFormInterface;

public class SelectGuestUserCheckout implements Task {
    public static Task selectGuestUserCheckout(){
        return Tasks.instrumented(SelectGuestUserCheckout.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckoutFormInterface.GUEST_CHECKOUT_RADIO_BUTTON, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CheckoutFormInterface.GUEST_CHECKOUT_RADIO_BUTTON),
                Scroll.to(CheckoutFormInterface.ACCOUNT_BUTTON),
                Click.on(CheckoutFormInterface.ACCOUNT_BUTTON),
                WaitUntil.the(CheckoutFormInterface.FIRST_NAME, WebElementStateMatchers.isVisible())
        );
    }
}
