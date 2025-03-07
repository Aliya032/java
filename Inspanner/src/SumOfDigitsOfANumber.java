public class SumOfDigitsOfANumber {
    public static void main(String args[]) {
        int a = 123;
        int b = a%10;;
        int c = ((a/10)%10);
        int d = a/100;
        int sum = b + c + d;
        System.out.println((sum));
    }
}
