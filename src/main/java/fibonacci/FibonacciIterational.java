package fibonacci;

import java.math.BigDecimal;

public class FibonacciIterational implements Fibonacci {


    @Override
    public BigDecimal getN(int n) {
        BigDecimal prev = new BigDecimal(0);
        BigDecimal current = new BigDecimal(1);
        if (n == 0) {
            current = prev;
        } else {
            for (int i = 1; i < n; i++) {
                BigDecimal temp = current;
                current = current.add(prev);
                prev = temp;
            }
        }
        return current;
    }
}

