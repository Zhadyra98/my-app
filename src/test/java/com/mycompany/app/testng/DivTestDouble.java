package com.mycompany.app.testng;

import com.mycompany.app.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivTestDouble extends BaseCalculatorTest {
    @Test(groups = {"doubleNumber"})
    @Parameters({"a", "b", "expected"})
    public void testDoubleDiv(double a, double b, double expected) {
        double div = calculator.div(a, b);
        Assert.assertEquals(div, expected);
    }
}
