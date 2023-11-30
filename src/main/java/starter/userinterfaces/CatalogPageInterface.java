package starter.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;

public class CatalogPageInterface {
    public static final Target CART_DETAILS_BUTTON = PageElement.located(By.id("cart"));
    public static final Target MACBOOK_ADD_TO_CART = Target.the("ADD TO CART").located(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]"));
    public static final Target IPHONE_ADD_TO_CART = Target.the("Add iphone").located(By.xpath("//button[@onclick=\"cart.add('43');\"]"));
    public static final Target APPLE_CINEMA_ADD_TO_CART = Target.the("Add aple cinema").located(By.xpath("//button[@onclick=\"cart.add('40');\"]"));
    public static final Target SHOPPING_CART_BUTTON = Target.the("Shopping cart button").located(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a"));

}
