package com.mycompany.app.testng;

import com.mycompany.app.junit.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumTestDouble extends BaseCalculatorTest {
    @Test(groups = {"doubleNumber"})
    @Parameters({"a", "b", "expected"})
    public void testLongSum(double a, double b, double expected) {
        double sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected);
    }
}
