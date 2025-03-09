package org.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webdriverconfig {
    protected static WebDriver driver;
    public static WebDriver driver() {
//        System.setProperty("webdriver.chrome.driver", "..//sampleAPI//target//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
