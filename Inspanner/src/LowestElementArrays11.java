import java.util.Arrays;
import java.util.Scanner;

//find minimum element in an array of type int and size 5
public class LowestElementArrays11 {
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
        System.out.println("Minimum element in the array: "+ Arrays.toString(intArray)  + " is " + minElement);
    }
}

