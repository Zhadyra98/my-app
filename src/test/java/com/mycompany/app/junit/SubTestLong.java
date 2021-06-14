package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SubTestLong extends BaseCalculatorTest {


    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, -3, 8},
                {5, -2, 7},
                {3, -4, 7}
        });
    }

    private long a ;
    private long b;
    private long expected;
    public SubTestLong(long a, long b, long expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }
    @Test
    public void testLongSub() {
        double sub = calculator.sub(a, b);
        assertEquals(sub,expected,DELTA);
    }

}
