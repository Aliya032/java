/*
a = 1 3
    5 9
b = 1 2
    3 4
output: 2 5
        8 13
 */
import java.util.Scanner;

public class AddTwoMatricesTwoD {
    public static void main(String[] args) {
        int[][] twoDarray1 = new int[2][2];
        int[][] twoDarray2 = new int[2][2];
        Scanner myobj = new Scanner(System.in);
        for (int i=0; i< twoDarray1.length; i++) {
            for (int j = 0; j< twoDarray1.length; j++) {
                System.out.println("Enter the element: ");
                twoDarray1[i][j] = myobj.nextInt();
            }
        }
        System.out.println("Enter the second matrix elements: ");
        for (int i=0; i< twoDarray2.length; i++) {
            for (int j = 0; j< twoDarray2.length; j++) {
                System.out.println("Enter the element: ");
                twoDarray2[i][j] = myobj.nextInt();
            }
        }
        System.out.println("The sum of two matrices are: ");
        for (int i = 0; i<twoDarray2.length; i++) {
            for (int j = 0; j<twoDarray2.length; j++) {
                System.out.print((twoDarray1[i][j] + twoDarray2[i][j])+ " ");
            }
            System.out.println();
        }
    }
}
