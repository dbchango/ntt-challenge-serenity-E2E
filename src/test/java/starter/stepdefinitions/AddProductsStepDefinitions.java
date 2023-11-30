package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.navigation.NavigateTo;;
import starter.tasks.*;

public class AddProductsStepDefinitions {
    @Given("{actor} enter in the online store")
    public void accessShop(Actor actor) {
        actor.attemptsTo(
                NavigateTo.theStoreHomePage()
        );
    }

    @When("{actor} adds two products in the cart")
    public void addProducts(Actor actor){
        actor.attemptsTo(
                AddProductsCart.addProducts()
        );
    }

    @Then("{actor} sees the cart counter and the total cost updated")
    public void validateCartCounter(Actor actor) {
        actor.attemptsTo(
                ValidateAddedProducts.validateCart()
        );
    }

    @And("{actor} can visualize the selected items selecting the Shopping Cart")
    public void visualizeCart(Actor actor){
        actor.attemptsTo(
                VisualizeCart.showCart());
    }

    @When("{actor} select the Shopping Cart option")
    public void enterShoppingCartOption(Actor actor){
        actor.attemptsTo(
                EnterShoppingCart.enterShoppingCart());
    }

    @And("{actor} clicks the Checkout button")
    public void checkoutInit(Actor actor){
        actor.attemptsTo(
                SelectCheckoutOption.selectCheckoutOption());
    }

    @And("{actor} selects Guest Checkout as Checkout Option selection")
    public void guestCheckout(Actor actor){
        actor.attemptsTo(
                SelectGuestUserCheckout.selectGuestUserCheckout());
    }

    @And("{actor} insert the informative data")
    public void insertData(Actor actor) {
        actor.attemptsTo(
                InsertUserInformation.insertUserInformation()
        );
    }

    @And("{actor} fills the rest of the formulary")
    public void fillsAllFormulary(Actor actor) {
        actor.attemptsTo(
                FillFormulary.fillsFormulary());
    }

    @Then("{actor} sees the order validation message")
    public void seeOrderValidationMessage(Actor actor) {
        actor.attemptsTo(
                ValidateOrderPlaced.validateOrderPlaced()
        );
    }


}
