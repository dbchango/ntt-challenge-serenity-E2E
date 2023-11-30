package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.userinterfaces.CatalogPageInterface;


public class ValidateAddedProducts implements Task {
    public static Task validateCart(){ return Tasks.instrumented(ValidateAddedProducts.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CatalogPageInterface.CART_DETAILS_BUTTON),
                WaitUntil.the(CatalogPageInterface.CART_DETAILS_BUTTON,  WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Ensure.that(CatalogPageInterface.CART_DETAILS_BUTTON).text().contains("2 item")
        );
    }
}
