package za.co.wethinkcode.snakesandladders;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StartGameTest {
    @Test
    void testIsWin() {
        assertFalse(StartGame.isWin(2));
        assertTrue(StartGame.isWin(100));
    }
}

