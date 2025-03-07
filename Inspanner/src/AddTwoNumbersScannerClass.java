//java program to add numbers, read two numbers using Scanner class
import java.util.Scanner;
public class AddTwoNumbersScannerClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = myObj.nextInt();
        System.out.println("Enter second number");
        int num2 = myObj.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: "+sum);
    }
}
