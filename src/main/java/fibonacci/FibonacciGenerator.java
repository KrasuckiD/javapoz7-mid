package fibonacci;

import java.math.BigDecimal;

public class FibonacciGenerator {
    public BigDecimal generate(FibonacciType type, int n) {
        FibonacciFactory factory = new FibonacciFactory();
        Fibonacci fibonacci = factory.produce(type);
        return fibonacci.getN(n);
    }
}
