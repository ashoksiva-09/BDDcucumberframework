package org.steps;

import io.cucumber.java.en.And;
import org.pages.CompletepagePO;
import org.testng.Assert;

public class CompletePage {
    @And("I navigated to see the {string} message in Complete page")
    public void iNavigatedToSeeTheMessageInCompletePage(String arg0) {
        String actual = CompletepagePO.confirmMessage();
        Assert.assertEquals(actual,arg0);
    }
}
