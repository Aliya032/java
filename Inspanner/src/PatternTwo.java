import java.util.Scanner;

/*
55555
44444
33333
22222
11111
 */
public class PatternTwo {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = myobj.nextInt();
        for (int i = num; i > 0; i--){
            for (int j = num; j >0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
