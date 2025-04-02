import java.util.Scanner;

/*
downward triangle with this:

 *123454321*
 *1234321*
 *12321*
 *121*
 *1*

 */
public class PatternOnePartTwo {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter n");
        int n = myobj.nextInt();
        for (int i = n; i>= 1; i--) {
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
        //printing last row separately
        System.out.println("*");
    }
}
