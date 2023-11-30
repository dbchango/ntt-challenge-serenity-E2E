package starter.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class CartPageInterface {
    public static final Target ORDER_DETAILS = Target.the("Cart details table").located(By.id("checkout-cart"));
    public static final Target CHECKOUT_BUTTON = Target.the("Checkout").located(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a"));
}
