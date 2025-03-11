import java.util.Scanner;

//program to read 10 numbers from user and find the sum of the numbers.
public class ReadTenNumbersFromUser {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int i = 10;
        int sum = 0;
        while (i>=1) {
            System.out.println("Enter the number: ");
            int num = myobj.nextInt();
            sum += num;
            i--;
        }
        System.out.println("Sum: "+sum);
    }
}
