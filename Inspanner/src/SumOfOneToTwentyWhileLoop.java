//sum of 1-10 using while loop
public class SumOfOneToTwentyWhileLoop {
    public static void main(String[] args) {
        int i  = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.printf("Sum of numbers 1-10: " + sum);
    }
}
