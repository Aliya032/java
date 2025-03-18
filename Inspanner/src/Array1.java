import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int array1[] = new int[5];
        for (int i = 0; i<=4; i++) {
            System.out.println("Enter the value: ");
            array1[i] = myobj.nextInt();
        }
        System.out.println("The array is: ");
        for (int j = 0; j<=4; j++) {
            System.out.println(array1[j]);
        }
    }
}
