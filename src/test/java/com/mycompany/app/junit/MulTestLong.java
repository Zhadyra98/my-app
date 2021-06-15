package com.mycompany.app.junit;

import com.mycompany.app.BaseCalculatorTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MulTestLong extends BaseCalculatorTest {


    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, -3, -15},
                {0, -2, 0},
                {3, -4, -12}
        });
    }

    private long a ;
    private long b;
    private long expected;
    public MulTestLong(long a, long b, long expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }
    @Test
    public void testLongMul() {
        double mul = calculator.mult(a, b);
        assertEquals(mul,expected,DELTA);
    }

}
