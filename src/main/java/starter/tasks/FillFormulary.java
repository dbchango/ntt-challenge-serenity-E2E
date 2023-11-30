package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.userinterfaces.CheckoutFormInterface;

public class FillFormulary implements Task {
    public static Task fillsFormulary(){
        return Tasks.instrumented(FillFormulary.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CheckoutFormInterface.CONTINUE_FROM_DELIVERY_METHOD),
                WaitUntil.the(CheckoutFormInterface.CONTINUE_FROM_DELIVERY_METHOD, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CheckoutFormInterface.CONTINUE_FROM_DELIVERY_METHOD),

                WaitUntil.the(CheckoutFormInterface.CONTINUE_ON_PAYMENT_METHOD, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CheckoutFormInterface.TERMS_AND_CONDITIONS_PAYMENT_METHOD),
                Click.on(CheckoutFormInterface.CONTINUE_ON_PAYMENT_METHOD),

                WaitUntil.the(CheckoutFormInterface.CONFIRM_ORDER_BUTTON, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CheckoutFormInterface.CONFIRM_ORDER_BUTTON)
        );
    }
}
