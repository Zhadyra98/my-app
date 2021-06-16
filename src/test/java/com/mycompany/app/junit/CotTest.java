package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CotTest extends BaseCalculatorTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Math.sqrt(2)*Math.PI / 2, 1},
                {Math.PI / 4, 1},
                {-Math.PI / 6, -Math.sqrt(3)}
        });
    }

    private double a;
    private double expected;

    public CotTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testCtg() {
        double ctg = calculator.ctg(a);
        assertEquals(expected, ctg, DELTA);
    }
}
