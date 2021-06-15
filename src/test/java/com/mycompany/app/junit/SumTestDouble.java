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
public class SumTestDouble extends BaseCalculatorTest {


    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5.0, -3.8, 2},
                {5, -2, 3},
                {3, -4, -1}
        });
    }

    private double a ;
    private double b;
    private double expected;
    public SumTestDouble(double a, double b, double expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }
    @Test
    public void testLongSum()  {
        double sum = calculator.sum(a, b);
        assertEquals(sum,expected,DELTA);
    }

}
