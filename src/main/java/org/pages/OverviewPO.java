package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPO {
    private static WebDriver driver = checkoutYourInfoPO.getDriver();

    public static void validateFields(){
        WebElement productname = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        WebElement productprice = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
        WebElement total = driver.findElement(By.xpath("//div[@class='summary_total_label']"));
        String pname =  productname.getText();
        String pprice =  productname.getText();
        String totals =  productname.getText();
        System.out.println("Product name: "+pname);
        System.out.println("Product price: "+pprice);
        System.out.println("Total: "+totals);
    }

    public static void finish(){
        WebElement finishButton = driver.findElement(By.xpath("//button[@id='finish']"));
        finishButton.click();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
