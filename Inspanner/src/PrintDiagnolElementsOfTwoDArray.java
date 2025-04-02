import java.util.Scanner;

/*
print diagonal elements of a 2d array
 */
public class PrintDiagnolElementsOfTwoDArray {
    public static void main(String[] args) {
        int[][] twoDarray = new int[2][2];
        Scanner myobj = new Scanner(System.in);
        for (int i=0; i< twoDarray.length; i++) {
            for (int j = 0; j< twoDarray.length; j++) {
                System.out.println("Enter the element: ");
                twoDarray[i][j] = myobj.nextInt();
            }
        }
        System.out.println("The diagonal elements of a two dimensional array are: ");
        for (int i=0; i< twoDarray.length; i++) {
            for (int j = 0; j< twoDarray.length; j++) {
                if (i==j) {
                    System.out.print(twoDarray[i][j]);
                }
            }
            System.out.println();
        }
    }
}
