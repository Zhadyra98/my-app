package com.mycompany.app.for_just_practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {
    WebDriver webDriver;
    @Test
    public void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://webdriver/chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement logo=webDriver.findElement(By.xpath("//*[@id='divLogo']/img"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);
    }
    @Test
    public void homePageTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://webdriver/chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://opensource-demo.orangehrmlive.com/");
        String title=webDriver.getTitle();
        Assert.assertEquals(title,"OrangeHRM");
        Thread.sleep(5000);
    }
    @AfterMethod
    public void tearDown(){
        webDriver.quit();
    }
}
