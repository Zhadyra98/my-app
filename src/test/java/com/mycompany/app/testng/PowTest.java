package com.mycompany.app.testng;

import com.mycompany.app.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PowTest extends BaseCalculatorTest {
    @Test(dataProvider = "PowDataProvider")
    @Parameters({"a","b","expected"})
    public void powTest(double a, double b, double expected){
        double powRes=calculator.pow(a,b);
        Assert.assertEquals(powRes, expected);
    }
    @DataProvider(name = "PowDataProvider")
    public Object[][] powDataProvider() {
        return new Object[][]{
                {1, 1, 1},
                {1, 2, 1},
                {0, 5, 0}
        };
    }
}
