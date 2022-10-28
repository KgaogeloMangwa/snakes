package za.co.wethinkcode.snakesandladders;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void shouldReturnNumberFrom1to6() {
        Dice steps = new Dice();
        for (int i = 1; i < 101; i++) {
            assertTrue(steps.generateNumber() >= 1);
            assertTrue(steps.generateNumber() <= 6);
        }
    }
}

