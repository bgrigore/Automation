package com.endava;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by bgrigore on 8/3/2015.
 */
public class GmailTest {

    static WebDriver driver;

    @BeforeClass
    public static void before(){
        driver= new FirefoxDriver();
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
        userNameField.sendKeys("antonia.im.jobs@gmail.com");

        WebElement nextButton = driver.findElement(By.id("next"));
        nextButton.click();
    }
}
