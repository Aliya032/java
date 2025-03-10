//factorial of 7
public class FactorialOfSeven {
    public static void main(String[] args) {
        int i = 7;
        int factorial = 1;
        while (i>=1) {
            factorial *= i;
            i--;
        }
        System.out.println("7! = "+ factorial);
    }
}
