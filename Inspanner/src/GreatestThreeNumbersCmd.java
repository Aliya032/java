//check greatest among 3 numbers using simple if, read the numbers using cmd arguments
public class GreatestThreeNumbersCmd {
    public static void main(String input[]) {
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        int num3 = Integer.parseInt(input[2]);
        if (num1 > num2 || num1 > num3) {
            System.out.println("Num1: "+ num1 + " is greater.");
        }
        if (num2 > num1 || num2 > num3) {
            System.out.println("Num2: " + num2 + " is greater");
        }
        if (num3 > num1 || num3 > num2) {
            System.out.println("Num3: " + num3 + " is greater.");
        }
    }
}
