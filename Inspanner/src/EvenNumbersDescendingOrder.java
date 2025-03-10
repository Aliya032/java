//even numbers descending order 20-1
public class EvenNumbersDescendingOrder {
    public static void main(String[] args) {
        int i = 21;
        while (i>=1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
