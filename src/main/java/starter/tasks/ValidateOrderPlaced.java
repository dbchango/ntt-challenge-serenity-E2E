package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.userinterfaces.CatalogPageInterface;
import starter.userinterfaces.CheckoutFormInterface;

public class ValidateOrderPlaced implements Task {
    public static Task validateOrderPlaced(){
        return Tasks.instrumented(ValidateOrderPlaced.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckoutFormInterface.PLACED_CONTINUE_BUTTON, WebElementStateMatchers.isEnabled()).forNoMoreThan(15).seconds(),
                Ensure.that(CheckoutFormInterface.ORDER_PLACED_ALERT).text().contains("Your order has been placed!")
        );
    }
}
