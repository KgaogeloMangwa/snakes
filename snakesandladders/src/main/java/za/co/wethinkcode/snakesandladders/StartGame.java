package za.co.wethinkcode.snakesandladders;

import java.util.Scanner;

public class StartGame {

    final static int winPosition = 100;

    public static boolean isWin(int player)
    {
        return winPosition == player;
    }

    public  void startGame()
    {
        int player1 =0, player2=0;
        int currentPlayer=-1;
        Scanner s = new Scanner(System.in);
        String str;
        int diceValue =0;
        do
        {
            System.out.println(currentPlayer==-1?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
            System.out.println("Press r to roll Dice");
            str = s.next();
            Dice dice = new Dice();
            diceValue = dice.generateNumber();


            if(currentPlayer == -1)
            {
                CalculatePlayerValue calculatePlayerValue = new CalculatePlayerValue();
                player1 = calculatePlayerValue.calculatePlayerValue(player1,diceValue);
                System.out.println("First Player :: " + player1);
                System.out.println("Second Player :: " + player2);
                System.out.println("------------------");

                if(isWin(player1))
                {
                    System.out.println("First player wins");
                    return;
                }
            }
            else
            {
                CalculatePlayerValue calculatePlayerValue = new CalculatePlayerValue();
                player2 = calculatePlayerValue.calculatePlayerValue(player2,diceValue);
                System.out.println("First Player :: " + player1);
                System.out.println("Second Player :: " + player2);
                System.out.println("------------------");
                if(isWin(player2))
                {
                    System.out.println("Second player wins");
                    return;
                }
            }

            currentPlayer= -currentPlayer;

        }while("r".equals(str));
    }
}
