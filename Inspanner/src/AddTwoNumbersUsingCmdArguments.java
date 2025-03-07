import java.lang.*;
class AddTwoNumbersUsingCmdArguments {
    public static void main(String a[]) {
        int num1 = Integer.parseInt(a[0]);
        int num2 = Integer.parseInt(a[1]);
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
