import java.util.Scanner;

//java program to read 10 numbers and find the sum of even numbers only using for loop
public class TenNumbersSumEvenForLoop8 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i<= 10; i++) {
            System.out.println("Enter the number: ");
            int num = myobj.nextInt();
            if (num%2 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum of even numbers among the numbers given is: "+ sum);
    }
}
