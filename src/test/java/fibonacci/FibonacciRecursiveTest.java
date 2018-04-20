package fibonacci;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class FibonacciRecursiveTest {

    @Test
    public void shouldReturn8WhenCallingFor6th() {
        //given
        BigDecimal expectedValue = new BigDecimal(8);
        Fibonacci fibonacciIterational = new FibonacciRecursive();

        //when
        BigDecimal result = fibonacciIterational.getN(6);

        //then
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void shouldReturn0WhenCallingFor0th() {
        //given
        BigDecimal expectedValue = new BigDecimal(0);
        Fibonacci fibonacciIterational = new FibonacciRecursive();

        //when
        BigDecimal result = fibonacciIterational.getN(0);

        //then
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void shouldReturn1WhenCallingFor1st() {
        //given
        BigDecimal expectedValue = new BigDecimal(1);
        Fibonacci fibonacciIterational = new FibonacciRecursive();

        //when
        BigDecimal result = fibonacciIterational.getN(1);

        //then
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void shouldReturn1WhenCallingFor2nd() {
        //given
        BigDecimal expectedValue = new BigDecimal(1);
        Fibonacci fibonacciIterational = new FibonacciRecursive();

        //when
        BigDecimal result = fibonacciIterational.getN(2);

        //then
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void shouldReturn34WhenCallingFor9th() {
        //given
        BigDecimal expectedValue = new BigDecimal(34);
        Fibonacci fibonacciIterational = new FibonacciRecursive();

        //when
        BigDecimal result = fibonacciIterational.getN(9);

        //then
        Assert.assertEquals(expectedValue, result);
    }
}