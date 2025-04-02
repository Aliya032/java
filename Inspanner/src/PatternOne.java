import java.util.Scanner;

/*
upward triangle.

 *1*
 *121*
 *12321*
 *1234321*
 *123454321*
 */
public class PatternOne {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter n");
        int n = myobj.nextInt();
        //printing the first row separately:
        System.out.println("*");
        for (int i = 1; i<= n; i++) {
            System.out.print("*"); //printing leading "*"

            //printing increasing numbers
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }

            //printing decreasing numbers
            for (int k = i-1; k>=1; k--) {
                System.out.print(k);
            }
            System.out.println("*"); //printing trailing "*"
        }

    }
}
