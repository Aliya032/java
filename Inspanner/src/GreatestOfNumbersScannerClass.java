/*java program to check greatest among two numbers read the numbers using Scanner class*/
import java.util.Scanner;
public class GreatestOfNumbersScannerClass {
    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = newObj.nextInt();
        System.out.println("Enter the second number");
        int num2 = newObj.nextInt();
        if (num1 > num2) {
            System.out.println("First number: " + num1 + " is greater");
        } else {
            System.out.println("Second number: " + num2 + " is greater");
        }

    }
}
