package com.mycompany.app.testng;

import com.mycompany.app.BaseCalculatorTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivByZeroTest extends BaseCalculatorTest {
    @Test(dataProvider = "DivByZeroDataProvider",
            expectedExceptions = NumberFormatException.class)
    public void testDivByZero(long a, long b) {
        long divByZero = calculator.div(a, b);
    }

    @DataProvider(name = "DivByZeroDataProvider")
    public Object[][] divByZeroDataProvider() {
        return new Object[][]{
                {1, 0},
                {-1, 0},
                {8, 0}
        };
    }
}
