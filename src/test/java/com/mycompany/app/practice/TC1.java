package com.mycompany.app.practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.testng.annotations.*;

public class TC1 {
    @BeforeClass
    void beforeClass(){
        System.out.println("this before class");
    }
    @AfterClass
    void afterClass(){
        System.out.println("this is after class");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("this is berfore");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("this is after");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("Before TEST");
    }
    @AfterTest
    void afterTest(){
        System.out.println("After TEST");
    }

    @Test
    void test1(){
        System.out.println("this is test1");
    }
    @Test
    void test2(){
        System.out.println("this is test2");
    }
}
