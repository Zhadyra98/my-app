package com.mycompany.app.testng;

import com.mycompany.app.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumTestLong extends BaseCalculatorTest {
    @Test()
    @Parameters({"a", "b", "expected"})
    public void testLongSum(long a, long b, long expected) {
        long sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected);
    }
}
