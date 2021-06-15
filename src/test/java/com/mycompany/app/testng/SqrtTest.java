package com.mycompany.app.testng;

import com.mycompany.app.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends BaseCalculatorTest {
    @Test(description = "Check sqrt method", dataProvider = "SqrtDataProvider")
    public void testSqrt(double a, double expected) {
        double sqrt = calculator.sqrt(a);
        Assert.assertEquals(sqrt, expected);
    }

    @DataProvider(name = "SqrtDataProvider")
    public Object[][] sqrtDataProvider() {
        return new Object[][]{
                {1, 1},
                {49, 7}
        };
    }
}
