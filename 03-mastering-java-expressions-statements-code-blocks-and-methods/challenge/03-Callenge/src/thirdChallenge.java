public class thirdChallenge {
    static void main(String[] args) {
    convertToCentimeters((int)convertToCentimeters(5,8));
    }

   public static double convertToCentimeters (int heightInInch) {

      double inchesInCentimeter = (double) heightInInch * 2.54;
      System.out.println(inchesInCentimeter);
      return inchesInCentimeter;
   }

    public static double convertToCentimeters (int heightInFeet, int remainderInInch) {

    double feetPlusInch = heightInFeet * 12 + remainderInInch;
        System.out.println(feetPlusInch);
    return feetPlusInch;
    }
}