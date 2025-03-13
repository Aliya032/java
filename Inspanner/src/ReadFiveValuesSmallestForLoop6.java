import java.util.Scanner;

//read 5 values from the user and find smallest among them
public class ReadFiveValuesSmallestForLoop6 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int smallest = myobj.nextInt();
        for (int i = 1; i<=4; i++) {
            System.out.println("Enter the next number: ");
            int num = myobj.nextInt();
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("The smallest number among give number is: " + smallest);
    }
}
