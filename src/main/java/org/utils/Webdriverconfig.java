package org.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Webdriverconfig {
    protected static WebDriver driver;
    public static WebDriver driver() {
//        System.setProperty("webdriver.chrome.driver", "..//sampleAPI//target//chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
