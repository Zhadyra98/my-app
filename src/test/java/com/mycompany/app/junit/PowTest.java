package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class PowTest extends BaseCalculatorTest {
    private double a;
    private double b;
    private double expected;

    public PowTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Test
    public void testPow() {
        double pow = calculator.pow(a, b);
        assertEquals( expected, pow, DELTA);
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {1, 2, 1},
                {0, 8, 0}
        });
    }
}
