package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsNegativeTest extends BaseCalculatorTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {7, false},
                {1, false},
                {-1, true}
        });
    }

    private long a;
    private boolean expected;

    public IsNegativeTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testIsNegative() {
        boolean isPositive = calculator.isNegative(a);
        assertEquals(expected, isPositive);
    }
}
