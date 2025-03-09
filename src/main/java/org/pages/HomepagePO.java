package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomepagePO {
    private static WebDriver driver = LoginpagePO.getDriver();

    public static void addtocartfromhomepage(){
        WebElement addtocart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addtocart.click();
    }

    public static void removebuttondisplay(){
        WebElement removebutton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        String display = removebutton.getText();
        Assert.assertEquals(display,"Remove");
    }

    public static void cartbutton(){
        WebElement cartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartButton.click();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
