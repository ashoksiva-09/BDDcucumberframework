package org.steps;

import io.cucumber.java.en.And;
import org.pages.CartpagePO;

public class CartPage {
    @And("I navigated to cart page and click checkout")
    public void iNavigatedToCartPageAndClickCheckout() {
        CartpagePO.checkout();
    }
}
