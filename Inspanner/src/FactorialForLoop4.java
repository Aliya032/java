//factorial of a number using for loop
public class FactorialForLoop4 {
    public static void main(String[] args) {
        int num = 5;
        int product = 1;
        for (int a = 1; a <=num; a++ ) {
            product *= a;
        }
        System.out.println("Factorial of " + num + " is " + product);
    }
}
