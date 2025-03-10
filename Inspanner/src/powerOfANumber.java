//power of a number
//base 2 power 3
public class powerOfANumber {
    public static void main(String[] args) {
        int base = 2;
        int power = 5;
        int exp = 1;
        int product = 1;
        while (exp <= power) {
            product *= base;
            exp++;
        }
        System.out.println(product);
    }
}
