package za.co.wethinkcode.snakesandladders;

public class CalculatePlayerValue implements Movement {

    {
        snake.put(99,54);
        snake.put(70,55);
        snake.put(52,42);
        snake.put(25,2);
        snake.put(95,72);

        ladder.put(6,25);
        ladder.put(11,40);
        ladder.put(60,85);
        ladder.put(46,90);
        ladder.put(17,69);
    }


    final static int winPosition = 100;
    public  int calculatePlayerValue(int player, int diceValue) {
        player = player + diceValue;

        if(player > winPosition)
        {
            player = player - diceValue;
            return player;
        }

        if(null!=snake.get(player))
        {
            System.out.println("swallowed by snake");
            player= snake.get(player);
        }

        if(null!=ladder.get(player))
        {
            System.out.println("climb up the ladder");
            player= ladder.get(player);
        }
        return player;
    }


}
