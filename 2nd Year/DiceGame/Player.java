package DiceGame;

public class Player {

     int playerOneNumber, playerTwoNumber;

    Player() {
        this.playerOneNumber = 0;
        this.playerTwoNumber = 0;
    }

    void setPlayerOneNumber(int playerOneNumber){
        this.playerOneNumber = playerOneNumber;
    }

   public int getPlayerOneNumber(){
        return playerOneNumber;
    }

    void setPlayerTwoNumber(int playerTwoNumber){
        this.playerTwoNumber = playerTwoNumber;
    }

    public int getPlayerTwoNumber(){
        return playerTwoNumber;
    }

    public String winner(int playerOneNumber, int playerTwoNumber) {
        if (playerOneNumber > playerTwoNumber) {
            return "Player One is the Winner!";
        } else if (playerOneNumber < playerTwoNumber) {
            return "Player Two is the Winner!";
        } else {
            return "It's a Tie!";
        }
    }
}