package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutYourInfoPO {
    private static WebDriver driver = CartpagePO.getDriver();

    public static void infopageValue(String firstname, String lastname, String zipcode){
        WebElement fname = driver.findElement(By.xpath("//input[@id='first-name']"));
        WebElement lname = driver.findElement(By.xpath("//input[@id='last-name']"));
        WebElement zipcodes = driver.findElement(By.xpath("//input[@id='postal-code']"));
        fname.sendKeys(firstname);
        lname.sendKeys(lastname);
        zipcodes.sendKeys(zipcode);
    }

    public static void continues(){
        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
