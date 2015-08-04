package com.endava;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by bgrigore on 8/4/2015.
 */
public class PageObjectTest {

    LoginPage page;
    WebDriver driver;

    @Before
    public void before(){
        driver = new FirefoxDriver();
        page = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void test(){

        String subject = "test";
        InboxPage inbox = page.login("endavaselenium@gmail.com","endavaqa");
        inbox.composeMessage("endavaselenium@gmail.com",subject,"testare");
        inbox.checkLastEmail(subject);
    }

    @After
    public void after (){
        driver.close();
    }
}
