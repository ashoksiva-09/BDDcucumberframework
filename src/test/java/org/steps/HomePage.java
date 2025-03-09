package org.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.pages.HomepagePO;

public class HomePage{
    @Then("I add the single product into the cart from Home page")
    public void iAddTheSingleProductIntoTheCartFromHomePage() {
        HomepagePO.addtocartfromhomepage();
        System.out.println("Test");
    }

    @And("I check the button name changed to Remove")
    public void iCheckTheButtonNameChangedToRemove() {
        HomepagePO.removebuttondisplay();
        System.out.println("Test");
    }

    @And("I click on shopping cart on Home page")
    public void iClickOnShoppingCartOnHomePage() {
        HomepagePO.cartbutton();
    }
}
