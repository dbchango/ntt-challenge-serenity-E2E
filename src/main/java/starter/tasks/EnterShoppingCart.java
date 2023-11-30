package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.userinterfaces.CartPageInterface;
import starter.userinterfaces.CatalogPageInterface;
import starter.userinterfaces.CheckoutFormInterface;

public class EnterShoppingCart implements Task {
    public static Task enterShoppingCart(){
        return Tasks.instrumented(EnterShoppingCart.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CatalogPageInterface.SHOPPING_CART_BUTTON),
                WaitUntil.the(CatalogPageInterface.SHOPPING_CART_BUTTON, WebElementStateMatchers.isVisible()).forNoMoreThan(3).seconds(),
                Click.on(CatalogPageInterface.SHOPPING_CART_BUTTON)
        );
    }
}
