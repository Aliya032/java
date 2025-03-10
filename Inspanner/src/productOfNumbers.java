//product of numbers 1-5
public class productOfNumbers {
    public static void main(String[] args) {
        int i = 1;
        int product = 1;
        while (i<=5) {
            product *= i;
            i++;
        }
        System.out.println("Product: " + product);
    }
}
