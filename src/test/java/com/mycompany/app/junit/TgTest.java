package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class TgTest extends BaseCalculatorTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Math.PI / 4, 1},
                {Math.sqrt(2)*Math.PI/2, 1},
                {Math.PI, 0}
        });
    }
    private double a;
    private double expected;

    public TgTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testTg() {
        double tg = calculator.tg(a);
        assertEquals(expected, tg, DELTA);
    }
}
