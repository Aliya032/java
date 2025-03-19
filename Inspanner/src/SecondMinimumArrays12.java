import java.util.Arrays;
import java.util.Scanner;
//find second min in an array of type int and size 5
//[5, 34, 2, 9, 1]
public class SecondMinimumArrays12 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int[] intArray = new int[5];
        for (int i = 0; i<intArray.length;i++) {
            System.out.println("Enter the number: ");
            intArray[i] = myobj.nextInt();
        }
        int minElement = intArray[0];
        for (int j = 0; j<intArray.length; j++) {
            if (intArray[j] < minElement) {
                minElement = intArray[j];
            }
        }
        System.out.println("earlier array: "+ Arrays.toString(intArray));
        int temp = intArray[0];
        intArray[0] = intArray[intArray.length-1];
        intArray[intArray.length-1] = minElement;
        System.out.println("earlier array: "+Arrays.toString(intArray));
    }
}
