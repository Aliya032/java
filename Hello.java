public class Hello {
    public static void main(String[] args) {
        System.out.println("hello, tim");
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien!");
            System.out.println("And i am scared of aliens.");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("you got high score!");
        }
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }
        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "over eighteen" : "still a kid";
        System.out.println("our client is " + ageText);

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
    }
}
