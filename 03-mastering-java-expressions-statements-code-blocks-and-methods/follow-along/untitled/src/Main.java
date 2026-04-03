public class Main {
    public static void main(String[] args) {
            double kilometers = (100 * 1.609344);

            int highScore = 50;

            if (highScore > 25) {
                highScore = 1000 + highScore; //add bonus points
            }

            int healht = 100;
            if ((healht < 25) && (highScore > 1000)) {
                highScore = highScore - 1000;
            }

            int myVariable = 50;

            myVariable--;
            myVariable++;

            System.out.println("This is a test");

            System.out.println("This is" +
                    " another" +
                    " still more");

            int anorherVariable=50;myVariable--; System.out.println("myVariable =" +myVariable);

            if (myVariable == 0) {
                System.out.println("It's now zero");
            }

            boolean gameOver = true;
            int score = 4000;
            int completed = 5;
            int bonus = 100;

            /*if (score == 5000) {
                System.out.println("Your score was 5000");
            }*/

            if (score < 5000) {
                System.out.println("Your score is less than 5000");
                } else {
                System.out.println("Got here");
            }

            if (score < 5000 && score > 1000) {
                System.out.println("Your score was less than 5000 but grater than 1000");
            } else if (score < 1000) {
                System.out.println("Your score was less than 1000");
            } else {
                System.out.println("Got here");
        }






    }
}
