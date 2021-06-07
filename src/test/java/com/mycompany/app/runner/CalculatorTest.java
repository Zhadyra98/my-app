package com.mycompany.app.runner;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.*;

public class CalculatorTest {
    private long a;
    private long b;
    private long expected;
    private Calculator calculator;
    @Factory(dataProvider = "sumDataProvider")
    public CalculatorTest(long a, long b, long expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }
    @BeforeTest
    public void setUp(){
        calculator = new Calculator();
    }
    @Test(dataProvider = "sumDataProvider")
    public void testSum(long a, long b, long expected){
        Calculator calculator = new Calculator();
        long sum =calculator.sum(a,b);
        Assert.assertEquals(sum, expected);
    }
    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivByZero(){
        Calculator calculator = new Calculator() ;
        long result= calculator.div(1,0);
    }
    @DataProvider(name="sumDataProvider")
    public static Object [][] sumDataProvider(){
        return new Object[][] {
                {1,1,2},
                {0,0,0}
        };
    }
}
