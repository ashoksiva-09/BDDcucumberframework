package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartpagePO {
    private static WebDriver driver = HomepagePO.getDriver();

    public static void checkout(){
        WebElement checkoutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkoutButton.click();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
