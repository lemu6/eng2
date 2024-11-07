import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        // Testa os primeiros valores da sequência de Fibonacci
        assertEquals(0, Fibonacci.fib(0));
        assertEquals(1, Fibonacci.fib(1));
        assertEquals(1, Fibonacci.fib(2));
        assertEquals(2, Fibonacci.fib(3));
        assertEquals(3, Fibonacci.fib(4));
        assertEquals(5, Fibonacci.fib(5));
        assertEquals(55, Fibonacci.fib(10));
    }
}
