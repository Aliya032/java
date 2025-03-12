//java program to find factors of a number
public class FactorsForLoop2 {
    public static void main(String[] args) {
        int num = 6;
        for (int a = 1; a <= num; a++) {
            if (num%a == 0) {
                System.out.println(a);
            }
        }
    }
}
