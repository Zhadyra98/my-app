package com.mycompany.app.junit;

import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.rules.TestName;

public class BaseCalculatorTest {

    protected Calculator calculator = new Calculator();
    protected static final double DELTA = 1e-15;
    @Rule
    public TestName testName = new TestName();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Class started");
    }

    @Before
    public void beforeMethod() {
        System.out.println("Method started: " + testName.getMethodName());
    }

    @After
    public void afterMethod() {
        System.out.println("Method finished: " + testName.getMethodName());
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Class finished");
    }

}
