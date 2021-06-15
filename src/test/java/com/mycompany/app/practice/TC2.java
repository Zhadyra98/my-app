package com.mycompany.app.practice;

import org.testng.annotations.*;

public class TC2 {
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
    @Test
    void test3(){
        System.out.println("this is test3");
    }
    @Test
    void test4(){
        System.out.println("this is test4");
    }
}
