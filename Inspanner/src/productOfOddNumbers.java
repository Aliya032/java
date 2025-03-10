//product of odd numbers from 1 to 15
public class productOfOddNumbers {
    public static void main(String[] args) {
        int i = 1;
        int product = 1;
        while (i <= 15) {
            if (i%2 != 0) {
                product *= i;
            }
            i++;
        }
        System.out.println("Product of odd numbers between 1-15: " + product);
    }
}
