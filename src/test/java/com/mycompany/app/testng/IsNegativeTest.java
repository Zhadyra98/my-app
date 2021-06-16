package com.mycompany.app.testng;

import com.mycompany.app.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseCalculatorTest {
    @Test(description = "Check isNegative method", dataProvider = "IsNegativeDataProvider")
    public void testIsNegative(long a, boolean expected) {
        boolean isNegative = calculator.isNegative(a);
        Assert.assertEquals(isNegative, expected, "Method 'isNegative' returned not expected value: ");
    }

    @DataProvider(name = "IsNegativeDataProvider")
    public Object[][] isNegativeDataProvider() {
        return new Object[][]{
                {7, false},
                {0, false},
                {-7, true}
        };
    }
}
