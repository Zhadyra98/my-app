package com.mycompany.app.testng;

import com.mycompany.app.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTest extends BaseCalculatorTest {
    @Test(description = "Check cos method", groups = "main", dataProvider = "CosDataProvider")
    public void testCos(double a, double expected) {
        double cos = calculator.cos(a);
        Assert.assertEquals(cos, expected);
    }

    @DataProvider(name = "CosDataProvider")
    public Object[][] cosDataProvider() {
        return new Object[][]{
                {Math.PI / 4, 1},
                {-Math.PI / 3, -0.5},
                {Math.PI, -1}
        };
    }
}
