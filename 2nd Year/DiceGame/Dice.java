package DiceGame;

public class Dice {

    public int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }
}
