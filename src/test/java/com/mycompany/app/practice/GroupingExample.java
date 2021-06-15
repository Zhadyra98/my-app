package com.mycompany.app.practice;

import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups = {"sanity"})
    void test1(){
        System.out.println("this is test1");
    }
    @Test(groups = {"regression"})
    void test2(){
        System.out.println("this is test2");
    }
    @Test(groups = {"regression"})
    void test3(){
        System.out.println("this is test3");
    }
    @Test(groups = {"sanity","regression"})
    void test4(){
        System.out.println("this is test4");
    }
}
