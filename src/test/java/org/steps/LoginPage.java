package org.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.pages.LoginpagePO;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class LoginPage extends LoginpagePO {
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        driver.get("https://www.saucedemo.com/");
        String URL =  driver.getTitle();
        System.out.println("In Login Page");
        System.out.println(URL);
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        System.out.println("Credentials");
        LoginpagePO.enterUsername("standard_user");
        LoginpagePO.enterPassword("secret_sauce");
        LoginpagePO.clickLoginButton();
    }

    @Then("I should be redirected to the homepage and check Logo text")
    public void iShouldBeRedirectedToTheHomepageAndCheckLogoText() {
        System.out.println("Login and Navigated to Home page");
        String gettext = driver.findElement(By.className("app_logo")).getText();
            Assert.assertEquals(gettext,"Swag Labs");
    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) throws InterruptedException {
        LoginpagePO.enterUsername(username);
        LoginpagePO.enterPassword(password);
        LoginpagePO.clickLoginButton();

        try{
            System.out.println("Valid Login");
            driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
            driver.quit();
        }
        catch(NoSuchElementException E){
            String error_msg = driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
            String expected_error_msg1 = "Epic sadface: Username and password do not match any user in this service";
            String expected_error_msg2 = "Epic sadface: Sorry, this user has been locked out.";
            if (error_msg.equals(expected_error_msg1)){
                Assert.assertEquals(error_msg,expected_error_msg1);
            }
            if(error_msg.equals(expected_error_msg2)) {
                Assert.assertEquals(error_msg, expected_error_msg2);
            }
            driver.quit();
        }
    }

    @When("I enter credentials using excel data")
    public void iEnterCredentialsUsingExcelData() throws IOException {
        File file = new File("src/test/resources/Testdata/Login.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = wb.getSheet("dataset");

        for (int i=1;i<=sheet.getLastRowNum();i++) {
                String username = sheet.getRow(i).getCell(0).getStringCellValue();
                String password = sheet.getRow(i).getCell(1).getStringCellValue();
                System.out.println(username);
                System.out.println(password);
                LoginpagePO.enterUsername(username);
                LoginpagePO.enterPassword(password);
                LoginpagePO.clickLoginButton();

                try {
                    System.out.println("Valid Login");
                    driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
                    Thread.sleep(2000);
                    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
//                    driver.quit();
                    sheet.getRow(i).createCell(2).setCellValue("Login Sucessfully");
                    sheet.getRow(i).createCell(3).setCellValue("Nil");
                } catch (NoSuchElementException | InterruptedException E) {
                    String error_msg = driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
                    String expected_error_msg1 = "Epic sadface: Username and password do not match any user in this service";
                    String expected_error_msg2 = "Epic sadface: Sorry, this user has been locked out.";
                    if (error_msg.equals(expected_error_msg1)) {
                        Assert.assertEquals(error_msg, expected_error_msg1);
                    }
                    if (error_msg.equals(expected_error_msg2)) {
                        Assert.assertEquals(error_msg, expected_error_msg2);
                    }
//                    driver.quit();
                    sheet.getRow(0).createCell(2).setCellValue("Results");
                    sheet.getRow(0).createCell(3).setCellValue("Error Message");
                    sheet.getRow(i).createCell(2).setCellValue("Login failed");
                    sheet.getRow(i).createCell(3).setCellValue(error_msg);
                }
        }
        FileOutputStream outputStream = new FileOutputStream("target/Testdata/ResultLogin.xlsx");
        wb.write(outputStream);
        driver.quit();
    }
}
