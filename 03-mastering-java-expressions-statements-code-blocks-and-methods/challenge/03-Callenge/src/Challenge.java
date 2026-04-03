public class Challenge {
    public static void main(String[] args) {

            boolean newGameOver = true;
            int newScore = 10000;
            int newLevelCompleted = 8;
            int newBonus = 200;

            int newFinalScore = newScore;

            if (newGameOver) {
                newFinalScore += (newLevelCompleted * newBonus);
                System.out.println("Your final score was " + newFinalScore);
            }
        }
    }
