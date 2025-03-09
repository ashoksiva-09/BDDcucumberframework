package org.steps;

import io.cucumber.java.en.And;
import org.pages.checkoutYourInfoPO;

public class checkoutYourInfoPage {
    @And("I entered the values in first name,last name and zip code")
    public void iEnteredTheValuesInFirstNameLastNameAndZipCode() {
        checkoutYourInfoPO.infopageValue("test","tester","789000");
    }

    @And("I clicked on Continue button in checkout info page")
    public void iClickedOnContinueButtonInCheckoutInfoPage() {
        checkoutYourInfoPO.continues();
    }
}
