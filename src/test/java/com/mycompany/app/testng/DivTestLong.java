package com.mycompany.app.testng;

import com.mycompany.app.junit.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivTestLong extends BaseCalculatorTest {
    @Test()
    @Parameters({"a", "b", "expected"})
    public void testLongDiv(long a, long b, long expected) {
        long div = calculator.div(a, b);
        Assert.assertEquals(div, expected);
    }
}
