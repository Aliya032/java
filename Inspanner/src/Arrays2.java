import java.util.Scanner;

//java program to print array elements in reverse order, array type is int and array size is 5
public class Arrays2 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int myArray[] = new int[5];
        for (int i=0; i< myArray.length; i++) {
            System.out.println("Enter the value: ");
            myArray[i] = myobj.nextInt();
        }
        System.out.println("Reverse of the array elements: ");
        for (int j = myArray.length - 1; j>=0; j--) {
            System.out.println(myArray[j]);
        }
    }
}
