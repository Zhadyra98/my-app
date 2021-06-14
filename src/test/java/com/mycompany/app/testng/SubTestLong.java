package com.mycompany.app.testng;

import com.mycompany.app.junit.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubTestLong extends BaseCalculatorTest {
    @Test()
    @Parameters({"a", "b", "expected"})
    public void testLongSub(long a, long b, long expected) {
        long sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected);
    }
}
