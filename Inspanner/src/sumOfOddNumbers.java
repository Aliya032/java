//sum of odd numbers from 3-20
public class sumOfOddNumbers {
    public static void main(String[] args) {
        int i = 3;
        int sum = 0;
        while (i <= 20) {
            if (i%2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of odd numbers between 3-20 is: " + sum);
    }
}
