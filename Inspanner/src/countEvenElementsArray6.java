import java.util.Scanner;

//count number of even and odd elements in the array of size 10 & type int
public class countEvenElementsArray6 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int myArray[] = new int[10];
        int evenCount = 0;
        int oddCount = 0;
        for (int i=0; i< myArray.length; i++) {
            System.out.println("Enter the value: ");
            myArray[i] = myobj.nextInt();
        }
        for (int j = 0; j<myArray.length; j++) {
            if (myArray[j] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even number of elements in the array: " + evenCount);
        System.out.println("Odd number of elements in the array: "+ oddCount);
    }
}
