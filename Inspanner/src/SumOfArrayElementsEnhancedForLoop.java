import java.util.Scanner;

/*
find sum of the array type int, size 5 elements using enhanced for loop
 */
public class SumOfArrayElementsEnhancedForLoop {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int sum = 0;
        int[] numArray = new int[5];
        for (int i = 0; i<numArray.length; i++) {
            System.out.println("Enter array element: ");
            numArray[i] = myobj.nextInt();
        }
        for (int element:numArray) {
            sum += element;
        }
        System.out.println("Sum of the array elements is: " + sum);
    }
}
