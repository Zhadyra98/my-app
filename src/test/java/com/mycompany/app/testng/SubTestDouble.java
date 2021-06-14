package com.mycompany.app.testng;

import com.mycompany.app.junit.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubTestDouble extends BaseCalculatorTest {
    @Test()
    @Parameters({"a", "b", "expected"})
    public void testSubDouble(double a, double b, double expected) {
        double sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected);
    }
}
