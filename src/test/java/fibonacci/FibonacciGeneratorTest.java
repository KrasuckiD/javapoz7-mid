package fibonacci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class FibonacciGeneratorTest {

    private FibonacciGenerator fibonacciGenerator;

    @Before
    public void setUp() {
        fibonacciGenerator = new FibonacciGenerator();
    }

    @Test
    public void shouldReturn8WhenCallingFor6thRecursively() {
        //given
        BigDecimal expectedValue = new BigDecimal(8);

        //when
        BigDecimal result = fibonacciGenerator.generate(FibonacciType.RECURSIVE, 6);

        //then
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void shouldReturn0WhenCallingFor0thIterationally() {
        //given
        BigDecimal expectedValue = new BigDecimal(0);

        //when
        BigDecimal result = fibonacciGenerator.generate(FibonacciType.ITERATIONAL, 0);

        //then
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void shouldReturn1WhenCallingFor1stIterationally() {
        //given
        BigDecimal expectedValue = new BigDecimal(1);

        //when
        BigDecimal result = fibonacciGenerator.generate(FibonacciType.ITERATIONAL, 1);

        //then
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void shouldReturn1WhenCallingFor2ndRecursively() {
        //given
        BigDecimal expectedValue = new BigDecimal(1);

        //when
        BigDecimal result = fibonacciGenerator.generate(FibonacciType.RECURSIVE, 2);

        //then
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void shouldReturn34WhenCallingFor9thRecursively() {
        //given
        BigDecimal expectedValue = new BigDecimal(34);

        //when
        BigDecimal result = fibonacciGenerator.generate(FibonacciType.RECURSIVE, 9);

        //then
        Assert.assertEquals(expectedValue, result);
    }
}
