package com.mycompany.app.testng;

import com.mycompany.app.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BaseCalculatorTest {

    @Test(description = "Check tg method", groups = "main", dataProvider = "TgDataProvider")
    public void testTg(double a, double expected) {
        double tg = calculator.tg(a);
        Assert.assertEquals(tg, expected);
        System.out.println(a);
    }

    @DataProvider(name = "TgDataProvider")
    public Object[][] tgDataProvider() {
        System.out.println(Math.PI);
        return new Object[][]{
                {Math.PI / 4, 1},
                {-Math.PI / 3, -Math.sqrt(3)},
                {Math.PI, 0}
        };
    }
}
