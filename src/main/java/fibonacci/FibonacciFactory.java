package fibonacci;

public class FibonacciFactory {

    public Fibonacci produce(FibonacciType type) {
        Fibonacci result = null;
        if (FibonacciType.RECURSIVE.equals(type)) {
            result = new FibonacciRecursive();
        }
        if (FibonacciType.ITERATIONAL.equals(type)) {
            result = new FibonacciIterational();
        }
        return result;
    }

}
