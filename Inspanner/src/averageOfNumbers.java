import java.util.Scanner;

//program to read 10 numbers from user and find the avg of the numbers.
public class averageOfNumbers {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        double i = 10;
        double sum = 0;
        while (i>=1) {
            System.out.println("Enter the number: ");
            double num = myobj.nextInt();
            sum += num;
            i--;
        }
        double avg = sum/2;
        System.out.println("Average: "+avg);
    }
}
