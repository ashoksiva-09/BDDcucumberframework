package org.steps;

import io.cucumber.java.en.And;
import org.pages.OverviewPO;

public class overviewPage {
    @And("I navigated to overview page and validate the products and price")
    public void iNavigatedToOverviewPageAndValidateTheProductsAndPrice() {
        OverviewPO.validateFields();
    }

    @And("I clicked on Finish button")
    public void iClickedOnFinishButton() {
        OverviewPO.finish();
    }
}
