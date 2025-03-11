import java.util.Scanner;

//read 10 numbers from user and find sum of the even numbers and odd numbers.
public class SumEvenSumOdd {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int i = 10;
        int sumEven = 0;
        int sumOdd = 0;
        while (i>=1) {
            System.out.println("Enter the number: ");
            int num = myobj.nextInt();
            if (num%2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            i--;
        }
        System.out.println("Sum of even numbers: "+ sumEven);
        System.out.println("Sum of odd numbers: "+ sumOdd);
    }
}
