import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] twoDarray = new int[2][2];
        Scanner myobj = new Scanner(System.in);
        for (int i=0; i< twoDarray.length; i++) {
            for (int j = 0; j< twoDarray.length; j++) {
                System.out.println("Enter the element: ");
                twoDarray[i][j] = myobj.nextInt();
            }
        }
        System.out.println("The transpose of the matrix is: ");
        for (int i=0; i< twoDarray.length; i++) {
            for (int j = 0; j< twoDarray.length; j++) {
                System.out.print(twoDarray[j][i] + " ");
            }
            System.out.println();
        }
    }
}
