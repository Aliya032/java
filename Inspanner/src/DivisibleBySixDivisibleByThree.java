import java.util.Scanner;

//check number is even -> check if its divisible by 6
//number is odd -> check if its divisible by 3
public class DivisibleBySixDivisibleByThree {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = myobj.nextInt();
        if (num % 2 == 0) {
            if ( num % 6 == 0) {
                System.out.println("Number is even and is divisible by 6");
            } else {
                System.out.println("Number is even but isn't divisible by 6");
            }
        } else {
            if (num % 3 == 0) {
                System.out.println("Number is odd and is divisible by 3");
            } else {
                System.out.println("number is odd but isn't divisible by 3");
            }
        }
    }
}
