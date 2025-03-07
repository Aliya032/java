//java programt o check first and last digit of a 3 digit number is same or not read using scanner class
import java.util.Scanner;
public class FirstLastDigitSameScannerClass {
    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = newObj.nextInt();
        int units = num%10;
        int vague = num / 10;
        int hundreds = vague/10; //or num/100
//        System.out.println(units);
//        System.out.println(hundreds);
        if (units == hundreds) {
            System.out.println("They are same");
        } else {
            System.out.println("they are not");
        }
    }
}
