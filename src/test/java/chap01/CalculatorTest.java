package chap01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void plus(){
        int result = Calcluator.plus(1,2);
        assertEquals(3, result);
        assertEquals(5, Calcluator.plus(4,1));
    }
}
