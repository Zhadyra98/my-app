package com.mycompany.app.testng;

import com.mycompany.app.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MulTestLong extends BaseCalculatorTest {
    @Test()
    @Parameters({"a", "b", "expected"})
    public void testLongMul(long a, long b, long expected) {
        long mul = calculator.mult(a, b);
        Assert.assertEquals(mul, expected);
    }
}
