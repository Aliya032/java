//java program to check a number is even or not, read the number using cmd arguments
public class EvenOddCmdArguments {
    public static void main(String a[]) {
        int num = Integer.parseInt(a[0]);
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
