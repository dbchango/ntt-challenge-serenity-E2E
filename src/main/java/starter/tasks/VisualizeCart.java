package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import starter.userinterfaces.CatalogPageInterface;

public class VisualizeCart implements Task {

    public static Task showCart(){
        return Tasks.instrumented(VisualizeCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CatalogPageInterface.CART_DETAILS_BUTTON),
                Click.on(CatalogPageInterface.CART_DETAILS_BUTTON)
        );
    }
}
