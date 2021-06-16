package com.mycompany.app.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DivTestDouble extends BaseCalculatorTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5.0, 1.0, 5.0},
                {5, 2.0, 2.5},
                {3, 3, 1}
        });
    }
    private double a ;
    private double b;
    private double expected;
    public DivTestDouble(double a, double b, double expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }
    @Test
    public void testDoubleDiv()  {
        double div = calculator.div(a, b);
        assertEquals(div,expected,DELTA);
    }

}
