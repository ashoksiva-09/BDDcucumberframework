package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utils.Webdriverconfig;

public class LoginpagePO extends Webdriverconfig {

    protected static WebDriver driver;
    public LoginpagePO(){
        this.driver=Webdriverconfig.driver();
    }

    public static void enterUsername(String usernames) {
        WebElement username=driver.findElement(By.id("user-name"));
        username.sendKeys(usernames);
    }

    public static void enterPassword(String passwords) {
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(passwords);
    }

    public static void clickLoginButton() {
        WebElement submit=driver.findElement(By.id("login-button"));
        submit.click();
    }
}