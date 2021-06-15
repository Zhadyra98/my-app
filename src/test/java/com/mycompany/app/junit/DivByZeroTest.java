package com.mycompany.app.junit;


import com.mycompany.app.BaseCalculatorTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivByZeroTest extends BaseCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 0},
                {-1, 0},
                {8, 0}
        });
    }

    private long a;
    private long b;

    public DivByZeroTest(long a, long b) {
        this.a = a;
        this.b = b;
    }

    @Test(expected = NumberFormatException.class)
    public void testDivByZero() {
        double divByZero = calculator.div(a, b);
    }
}
