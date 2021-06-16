package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CosTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Math.PI / 4, 1},
                {Math.PI, -1},
                {Math.PI / 3, 0.5}
        });
    }

    private double a;
    private double expected;

    public CosTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testCos() {
        double cos = calculator.cos(a);
        assertEquals( expected, cos, DELTA);
    }
}
