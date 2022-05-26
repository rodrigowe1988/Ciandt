import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CalculatorTest {

    @Test
    public void deveriaSomarDoisNumerosPositivos() {
        Calculator calc = new Calculator();
        int sum = calc.sum(1, 2);

        Assertions.assertEquals(4, sum);
    }
}
