package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import starter.userinterfaces.CatalogPageInterface;

import java.util.concurrent.Callable;

public class AddProductsCart implements Task{

    public static Task addProducts(){
        return Tasks.instrumented(AddProductsCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CatalogPageInterface.MACBOOK_ADD_TO_CART),
                WaitUntil.the(CatalogPageInterface.MACBOOK_ADD_TO_CART, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CatalogPageInterface.MACBOOK_ADD_TO_CART),
                WaitUntil.the(CatalogPageInterface.CART_DETAILS_BUTTON, WebElementStateMatchers.containsText("1 item")).forNoMoreThan(15).seconds(),
                Scroll.to(CatalogPageInterface.IPHONE_ADD_TO_CART),
                WaitUntil.the(CatalogPageInterface.IPHONE_ADD_TO_CART, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CatalogPageInterface.IPHONE_ADD_TO_CART),
                WaitUntil.the(CatalogPageInterface.CART_DETAILS_BUTTON, WebElementStateMatchers.containsText("2 item")).forNoMoreThan(15).seconds(),
                WaitUntil.the(CatalogPageInterface.CART_DETAILS_BUTTON, WebElementStateMatchers.isVisible()).forNoMoreThan(4).seconds()
        );
    }
}
