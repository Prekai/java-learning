public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Hello, Arnot");
        System.out.print("Hello, World");

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        /*boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.print("And I am scared of aliens");
            }*/

        /*int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got high score!");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You got high score!");
        }

        int topScore = 100;
        if (topScore > 100) {
            System.out.println("You got high score!");
        }

        int topScore = 100;
        if (topScore <= 100) {
            System.out.println("You got high score!");
        }*/

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Grater than second top score and less than 100");
        }

        if (topScore > 90 || (secondTopScore <90)) {
            System.out.println("Either or both of the conditions are true");
        }

        /*int newValue = 50;
        if (newValue = 50) {
            System.out.println("This is true"); //compler error because of the assignment operator
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen"); //successful code execution but it is a bug

        //abbrevation is best practice
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }*/

        boolean isCar = false;
        if (!isCar) //returns true {
            System.out.println("This is not supposed to happen");

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
        }

    }