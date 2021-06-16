package com.mycompany.app.testng;

import com.mycompany.app.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseCalculatorTest {
    @Test(description = "Check isPositive method", dataProvider = "IsPositiveDataProvider")
    public void testCos(long a, boolean expected) {
        boolean isPositive = calculator.isPositive(a);
        Assert.assertEquals(isPositive, expected, "Method 'isPositive' returned not expected value: ");
    }

    @DataProvider(name = "IsPositiveDataProvider")
    public Object[][] isPositiveDataProvider() {
        return new Object[][]{
                {7, true},
                {-7, false},
                {-1, false}
        };
    }
}
