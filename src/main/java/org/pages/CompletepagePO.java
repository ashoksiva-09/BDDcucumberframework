package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletepagePO {
    private static WebDriver driver = OverviewPO.getDriver();

    public static String confirmMessage(){
        WebElement message = driver.findElement(By.className("complete-header"));
        String actual = message.getText();
        return actual;
    }
}
