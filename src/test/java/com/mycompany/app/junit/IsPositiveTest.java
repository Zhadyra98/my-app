package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsPositiveTest extends BaseCalculatorTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {7, true},
                {-71, false},
                {-1, false}
        });
    }

    private long a;
    private boolean expected;

    public IsPositiveTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testIsPositive() {
        boolean isPositive = calculator.isPositive(a);
        assertEquals(expected, isPositive);
    }
}
