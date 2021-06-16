package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SubTestDouble extends BaseCalculatorTest {


    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5.0, -3.8, 8.8},
                {5, -2, 7},
                {3, -4, 7}
        });
    }

    private double a ;
    private double b;
    private double expected;
    public SubTestDouble(double a, double b, double expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }
    @Test
    public void testLongSub()  {
        double sub = calculator.sub(a, b);
        assertEquals(sub,expected,DELTA);
    }

}
