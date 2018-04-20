package fibonacci;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        FibonacciType type = null;
        Integer n = 10;
        if (args != null && args.length >= 1) {
            n = Integer.parseInt(args[0]);
            type = FibonacciType.valueOf(args[1]);

            FibonacciGenerator generator = new FibonacciGenerator();
            BigDecimal result = generator.generate(type, n);
            System.out.println("WYRAZ NR " + n + " CIĄGU FIBONACCIEGO TO " + result);
        } else {
            System.out.println("NIEPRAWIDŁOWE PARAMETRY WEJŚCIOWE");
        }
    }
}
