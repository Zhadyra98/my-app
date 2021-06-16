package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SumTestLong extends BaseCalculatorTest {


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, -3, 2},
                {5, -2, 3},
                {3, -4, -1}
        });
    }

    private long a ;
    private long b;
    private long expected;
    public SumTestLong(long a, long b, long expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }
    @Test
    public void testLongSum() {
        double sum = calculator.sum(a, b);
        assertEquals(sum,expected,DELTA);
    }

}
