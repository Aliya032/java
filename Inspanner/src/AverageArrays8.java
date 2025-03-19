import java.util.Scanner;

public class AverageArrays8 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int myArray[] = new int[5];
        int sum = 0;
        for (int i=0; i< myArray.length; i++) {
            System.out.println("Enter the value: ");
            myArray[i] = myobj.nextInt();
            sum += myArray[i];
        }
        System.out.println("Average of the elements is: " + sum/myArray.length);
    }
}
