//factorial using do while
public class FactorialDoWhile2 {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        do {
            fact *= num;
            num--;
        } while (num>=1);
        System.out.println("Factorial "+ fact);
    }
}
