package za.co.wethinkcode.snakesandladders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatePlayerValueTest {
    @Test
    void testCalculatePlayerValue() {
        CalculatePlayerValue calculatePlayerValue = new CalculatePlayerValue();

        assertEquals(44, calculatePlayerValue.calculatePlayerValue(2, 42));
        assertEquals(2, calculatePlayerValue.calculatePlayerValue(1, 1));
        assertEquals(100, calculatePlayerValue.calculatePlayerValue(100, 42));
        assertEquals(86, calculatePlayerValue.calculatePlayerValue(44, 42));
    }
}

