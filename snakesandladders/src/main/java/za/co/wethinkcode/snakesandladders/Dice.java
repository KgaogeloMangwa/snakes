package za.co.wethinkcode.snakesandladders;

import java.util.Random;

public class Dice {
    private final Random random;

    public Dice(){
        this.random = new Random();
    }

    public Dice(Random random){
        this.random = random;
    }
    /**
     * Generates a random number "steps" from 1 to 6
     * using "this.random",
     * @return the number
     */
    public int generateNumber(){
        int steps = this.random.nextInt(5)+1;
        return steps;
    }
}
