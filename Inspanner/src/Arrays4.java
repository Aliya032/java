import java.util.Scanner;

//print all elements present at even index, array type int and size 10
public class Arrays4 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int myArray[] = new int[10];
        for (int i=0; i< myArray.length; i++) {
            System.out.println("Enter the value: ");
            myArray[i] = myobj.nextInt();
        }
        System.out.println("Elements at even position: ");
        for (int j = 0; j< myArray.length; j+=2) {

                System.out.println(myArray[j]);

        }
    }
}
