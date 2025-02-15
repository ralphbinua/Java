package DiceGame;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Player p1 = new Player();
        Player p2 = new Player();
        Dice dice = new Dice();
        int playerOneNumber, playerTwoNumber;

        System.out.println("\nWelcome to the Dice Game");
        System.out.print("Player 1, press Enter to roll the dice...");
        input.nextLine();
        System.out.println("Player 1 is rolling the dice...\n");
        playerOneNumber = dice.rollDice();
        p1.setPlayerOneNumber(playerOneNumber);

        System.out.print("Player 2, press Enter to roll the dice...");
        input.nextLine();
        System.out.println("Player 2 is rolling the dice...\n");
        playerTwoNumber = dice.rollDice();
        p2.setPlayerTwoNumber(playerTwoNumber);


        System.out.println("Both players have rolled...\n");

        System.out.println("Player 1 rolled: " + p1.getPlayerOneNumber());
        System.out.println("Player 2 rolled: " + p2.getPlayerTwoNumber());

        String result = p1.winner(p1.getPlayerOneNumber(), p2.getPlayerTwoNumber());
        System.out.println(result);
    }
}