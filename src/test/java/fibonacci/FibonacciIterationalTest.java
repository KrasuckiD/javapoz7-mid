package fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciIterationalTest {
    @Test
    public void testFactoryForRecursive() {
        //given
        FibonacciFactory factory = new FibonacciFactory();

        //when
        Fibonacci result = factory.produce(FibonacciType.RECURSIVE);

        //then
        Assert.assertTrue(result instanceof Fibonacci);
        Assert.assertTrue(result instanceof FibonacciRecursive);
        Assert.assertFalse(result instanceof FibonacciIterational);
    }

    @Test
    public void testFactoryForIterational() {
        //given
        FibonacciFactory factory = new FibonacciFactory();

        //when
        Fibonacci result = factory.produce(FibonacciType.ITERATIONAL);

        //then
        Assert.assertTrue(result instanceof Fibonacci);
        Assert.assertTrue(result instanceof FibonacciIterational);
        Assert.assertFalse(result instanceof FibonacciRecursive);
    }
}
