import demo.parallel.Complex;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComplexTest {

    @Test
    public void testMinus() {
        Complex a = new Complex(4, 5);
        Complex b = new Complex(2, 3);
        Complex result = a.minus(b);

        assertEquals(2, result.getRe(), 0.0001);
        assertEquals(2, result.getIm(), 0.0001);
    }

    @Test
    public void testDivision() {
        Complex a = new Complex(5, 4);
        Complex b = new Complex(3, 2);
        Complex result = a.division(b);

        // Ожидаемый результат для деления (5 + 4i) на (3 + 2i)
        assertEquals(1.7692, result.getRe(), 0.0001); // округлено до 4 знаков
        assertEquals(0.1538, result.getIm(), 0.0001); // округлено до 4 знаков
    }
}
