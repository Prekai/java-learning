public class secondChallenge {
    public static void main(String[] args) {
        int playersPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Arnot", playersPosition);
        playersPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Arnot", playersPosition);
        playersPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Arnot", playersPosition);
        playersPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Arnot", playersPosition);
        playersPosition = calculateHighScorePosition(25);
        displayHighScorePosition("Arnot", playersPosition);

    }
        public static void displayHighScorePosition (String playersName,int playersPosition){
            System.out.println(playersName + " managed to get into position " + playersPosition + " on the hihg score list");
        }

        public static int calculateHighScorePosition ( int score){
            int result = 0;
            if (score >= 1000) {
                result = 1;
            } else if (score >= 500 && score < 1000) {
                result = 2;
            } else if (score >= 100 && score < 500) {
                result = 3;
            } else {
                result = 4;
            }
            return result;
        }
}
