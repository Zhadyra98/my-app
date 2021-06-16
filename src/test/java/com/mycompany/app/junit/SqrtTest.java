package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class SqrtTest extends BaseCalculatorTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {25, 5},
                {49, 7},
                {1,1}
        });
    }

    private double a;
    private double expected;

    public SqrtTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testSqrt() {
        double sqrtRes = calculator.sqrt(a);
        assertEquals(expected, sqrtRes, DELTA);
    }
}
