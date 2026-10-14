import org.junit.Test;
import static org.junit.Assert.assertEquals;
 
public class FibonacciTest {
    @Test
    public void testSeries() {
        Fibonacci obj = new Fibonacci();
        assertEquals("0 1 1 2 3 5 8", obj.series(7));
    }
}
