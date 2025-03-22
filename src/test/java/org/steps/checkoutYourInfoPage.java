package org.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.pages.checkoutYourInfoPO;

import java.util.List;
import java.util.Map;

public class checkoutYourInfoPage {
    @And("I entered the values in first name,last name and zip code")
    public void iEnteredTheValuesInFirstNameLastNameAndZipCode(DataTable data) {
        List<Map<String,String>> dt = data.asMaps(String.class,String.class);
        String fname = dt.get(0).get("firstName");
        String lname = dt.get(0).get("lastName");
        String zipcode = dt.get(0).get("zipCode");
        checkoutYourInfoPO.infopageValue(fname,lname,zipcode);
//        checkoutYourInfoPO.infopageValue("test","tester","789000");
    }

    @And("I clicked on Continue button in checkout info page")
    public void iClickedOnContinueButtonInCheckoutInfoPage() {
        checkoutYourInfoPO.continues();
    }

}
