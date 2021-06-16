package com.mycompany.app.for_just_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssertionExamples {
    WebDriver webDriver ;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser, String app){
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C://webdriver/chromedriver.exe");
            webDriver=new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.chrome.driver","C://webdriver/chromedriver.exe");
            webDriver=new ChromeDriver();
        }
        webDriver.get(app);
    }
    @Test
    void logoTest(){
        WebElement logo=webDriver.findElement(By.xpath("//*[@id='divLogo']/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo is not displyed");
    }
    @Test
    void homePageTitle(){
        String string=webDriver.getTitle();
        Assert.assertEquals("OrangeHRM",string,"Title is not the same");

    }
    @AfterClass
    void finish(){
        webDriver.quit();
    }
}
