
import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    @BeforeClass
    public static void start() {
        System.out.println("Started testing");

    }



    @Test
    public void squareroot() {
        calproject calctest = new calproject();
        double num = 25;
        double expected = 5;
        double result = calctest.Squareroot(num);
        Assert.assertEquals(expected,result,0.000000);
    }

    @Test
    public void factorial() {
        calproject calctest = new calproject();
        double num = 4;
        double expected = 24;
        double result = calctest.Factorial(num);
        Assert.assertEquals(expected,result,0.000000);
    }

    @Test
    public void logarithm() {
        calproject calctest = new calproject();
        double num = 32;
        double expected = Math.log(32);
        double result  =calctest.Logarithm(num);
        Assert.assertEquals(expected,result,0.000000);
    }

    @Test
    public void power() {
        calproject calctest = new calproject();
        double a = 4;
        double b= 3;
        double expected = 64;
        double result = calctest.Power(a,b);
        Assert.assertEquals(expected,result,0.000000);
    }

    @AfterClass
    public static void finish() {
       System.out.println("Finished testing");
    }
}