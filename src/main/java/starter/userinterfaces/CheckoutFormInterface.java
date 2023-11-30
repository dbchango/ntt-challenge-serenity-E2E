package starter.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Checkbox;
import org.openqa.selenium.By;

public class CheckoutFormInterface {
        public static final Target CHECKOUT_FORMULARY = Target.the("Checkout formulary").located(By.id("checkout-checkout"));
        public static final Target CART_BUTTON = Target.the("Cart").located(By.xpath("//li[.//a[@title='Shopping Cart']]"));
        public static final Target CHECKOUT_OPTIONS = Target.the("Checkout options menu").located(By.xpath("//div[contains(@class, 'heading')][.//a[@aria-expanded='true']]"));
        public static final Target GUEST_CHECKOUT_RADIO_BUTTON = Target.the("Guest Checkout").located(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/label/input"));
        public static final Target ACCOUNT_BUTTON = Target.the("Customer option").located(By.id("button-account"));
        public static final Target FIRST_NAME = Target.the("First Name").located(By.id("input-payment-firstname"));
        public static final Target LAST_NAME = Target.the("Last Name").located(By.id("input-payment-lastname"));
        public static final Target EMAIL = Target.the("Email").located(By.id("input-payment-email"));
        public static final Target TELEPHONE = Target.the("Telephone").located(By.id("input-payment-telephone"));
        public static final Target ADDRESS_1 = Target.the("Address 1").located(By.id("input-payment-address-1"));
        public static final Target CITY = Target.the("City").located(By.id("input-payment-city"));
        public static final Target POST_CODE = Target.the("Post code").located(By.id("input-payment-postcode"));
        public static final Target COUNTRY = Target.the("Country").located(By.xpath("//option[@value='62']"));
        public static final Target COUNTRY_SELECT = Target.the("Country select").located(By.id("input-payment-country"));
        public static final Target REGION = Target.the("Region").located(By.xpath("//option[@value='999']"));
        public static final Target REGION_SELECT = Target.the("Region select").located(By.id("input-payment-zone"));
        public static final Target DELIVERY_AND_BILLING_ADDRESSES = Target.the("Billing agress").located(By.id("shipping_address"));
        public static final Target CONTINUE_FROM_BILLING_DETAILS = Target.the("Continue on delivery details").located(By.id("button-guest-shipping"));
        public static final Target CONTINUE_FROM_DELIVERY_DETAILS = Target.the("Continue on delivery details").located(By.id("button-guest-shipping"));
        public static final Target CONTINUE_FROM_DELIVERY_METHOD = Target.the("Continue on delivery method").located(By.xpath("//*[@id=\"button-guest\"]"));
        public static final Target BANK_TRANSFER_RADIO_BUTTON = Target.the("Bank transfer").located(By.xpath("//input[contains(@value, 'bank_transfer')]"));
        public static final Target CONTINUE_ON_PAYMENT_METHOD = Target.the("Continue on payment method").located(By.id("button-payment-method"));
        public static final Target TERMS_AND_CONDITIONS_PAYMENT_METHOD = Target.the("Terms and conditions").located(By.xpath("//input[contains(@name, 'agree')]"));
        public static final Target CONFIRM_ORDER_BUTTON = Target.the("Continue order").located(By.id("button-confirm"));
        public static final Target ORDER_PLACED_ALERT = Target.the("Checkout alert").located(By.xpath("/html/body/div[2]/div/div/h1"));
        public static final Target PLACED_CONTINUE_BUTTON = Target.the("Continue button").located(By.xpath("/html/body/div[2]/div/div/div/div/a"));

}
