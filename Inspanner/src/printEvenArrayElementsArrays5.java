import java.util.Scanner;

//print even elements in the array
public class printEvenArrayElementsArrays5 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int myArray[] = new int[10];
        for (int i=0; i< myArray.length; i++) {
            System.out.println("Enter the value: ");
            myArray[i] = myobj.nextInt();
        }
        System.out.println("Even elements of the array are: ");
        for (int j = 0; j< myArray.length; j++) {
            if (myArray[j] %2 == 0) {
                System.out.println(myArray[j]);
            }
        }
    }
}
