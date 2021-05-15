package chap01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    public CalculatorTest() {
    }

    @Test
    static void plus(){
        int result = Calcluator.plus(1,2);
        assertEquals(3, result);
    }
}
