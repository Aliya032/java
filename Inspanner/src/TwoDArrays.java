import java.util.Scanner;

/*
reading a 2d array and printing it as a matrix
 */
public class TwoDArrays {
    public static void main(String[] args) {
        int[][] twoDarray = new int[2][2];
        Scanner myobj = new Scanner(System.in);
        for (int i=0; i< twoDarray.length; i++) {
            for (int j = 0; j< twoDarray.length; j++) {
                System.out.println("Enter the element: ");
                twoDarray[i][j] = myobj.nextInt();
            }
        }
        System.out.println("The two dimensional array elements are: ");
        for (int i=0; i< twoDarray.length; i++) {
            for (int j = 0; j< twoDarray.length; j++) {
                System.out.print(twoDarray[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
