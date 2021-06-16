package com.mycompany.app.testng;

import com.mycompany.app.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CotTest extends BaseCalculatorTest {
    @Test(description = "Check ctg method", dataProvider = "CtgDataProvider")
    public void testCtg(double a, double expected) {
        double ctg = calculator.ctg(a);
        Assert.assertEquals(ctg, expected, "Method 'ctg' returned not expected value: ");
    }

    @DataProvider(name = "CtgDataProvider")
    public Object[][] ctgDataProvider() {
        return new Object[][]{
                {Math.PI / 4, 1},
                {Math.PI / 2, 0},
                {-Math.PI / 6, -Math.sqrt(3)}
        };
    }
}
