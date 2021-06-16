package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DivTestLong extends BaseCalculatorTest {


    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, 1, 5},
                {0, 2, 0},
                {3, 1, 3}
        });
    }

    private long a ;
    private long b;
    private long expected;
    public DivTestLong(long a, long b, long expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }
    @Test
    public void testLongDiv() {
        double div = calculator.div(a, b);
        assertEquals(div,expected,DELTA);
    }

}
