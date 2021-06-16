package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MulTestDouble extends BaseCalculatorTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5.0, -3.0, -15},
                {5, -2, -10},
                {3, -4, -12}
        });
    }

    private double a ;
    private double b;
    private double expected;
    public MulTestDouble(double a, double b, double expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }
    @Test
    public void testLongMul()  {
        double mul = calculator.mult(a, b);
        assertEquals(mul,expected,DELTA);
    }

}
