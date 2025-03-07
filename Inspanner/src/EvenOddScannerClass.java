//java program to check a number is even or not, read the number using scanner class
import java.util.Scanner;
public class EvenOddScannerClass {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = myobj.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
