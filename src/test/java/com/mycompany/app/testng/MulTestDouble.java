package com.mycompany.app.testng;

import com.mycompany.app.junit.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MulTestDouble extends BaseCalculatorTest {
    @Test(groups = {"doubleNumber"})
    @Parameters({"a", "b", "expected"})
    public void testLongMul(double a, double b, double expected) {
        double mul = calculator.mult(a, b);
        Assert.assertEquals(mul, expected);
    }
}
