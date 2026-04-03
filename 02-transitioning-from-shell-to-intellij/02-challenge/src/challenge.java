class challenge {
    public static void main(String[] args) {
        double firstDouble = 20.00;
        double secondDouble = 80.00;

        double sum = (firstDouble + secondDouble) * 100;
        System.out.println(sum);

        double remainderDouble = sum % 40.00;
        System.out.println(remainderDouble);

        boolean remainderBoolean = remainderDouble == 0.00;
        System.out.println(remainderBoolean);

        if (!remainderBoolean) {
            System.out.println("got some remainder");
        }
    }
}
