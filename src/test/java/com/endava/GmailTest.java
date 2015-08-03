package com.endava;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by bgrigore on 8/3/2015.
 */
public class GmailTest {

    static WebDriver driver;

    @BeforeClass
    public static void before(){
        driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void after(){
        driver.close();
    }

    @Before
    public void goToPage() {
        driver.get("http://mail.google.com");
    }

    @Test
    public void testGmail(){
        WebElement userNameField = driver.findElement(By.id("Email"));
        userNameField.sendKeys("tt88252@gmail.com");

        WebElement nextButton = driver.findElement(By.id("next"));
        nextButton.click();

        WebElement passwordNameField = driver.findElement(By.id("Passwd"));
        passwordNameField.sendKeys("1234qazws");

        WebElement signInButton = driver.findElement(By.id("signIn"));
        signInButton.click();

        WebElement composeButton = driver.findElement(By.xpath(".//*[@id=':4i']/div/div"));
        composeButton.click();

        driver.findElement(By.className("vO")).sendKeys("tt88252@gmail.com");
        driver.findElement(By.className("aoT")).sendKeys("Test1");
        driver.findElement(By.className("Am")).sendKeys("Tessst1");
        driver.findElement(By.xpath("//div[text()='Send']")).click();


    }
}
