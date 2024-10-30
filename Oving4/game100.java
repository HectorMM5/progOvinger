public class game100 {
    public class player {
        public int points;
        public int playerNumber;
        public int diceThrown;

        java.util.Random dice = new java.util.Random();

        public player(int points) {
            this.points = points;
        }

        public void throwDice() {
            diceThrown = dice.nextInt(0,5) + 1;

            if (points < 100) {
                if (diceThrown == 1) {
                    points = 0;
                }
                points += diceThrown;
            }

            else if (points > 100) {
                points -= diceThrown;
            }

            System.out.println(points);
        }
    }

    public static void main(String[] args) {
        game100 game = new game100();

        player Player1 = game.new player(0);
        player Player2 = game.new player(0);

        int currentRound = 0;
        
        while ((Player1.points != 100) && (Player2.points != 100)) {
            currentRound += 1;
            Player1.throwDice();
            Player2.throwDice();
            System.err.println("Current round: " + currentRound);
        }

        if (Player1.points == 100) {
            System.out.println("Player 1 has won.");
        }

        else {
            System.out.println("Player 2 has won.");
        }
    }
}
