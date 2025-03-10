//gcd of two numbers
//a = 72, b = 120
//a = 98, b = 56
public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        int a = 98;
        int b = 56;
        int gcd = (a<b)? a : b;
        while (gcd >0) {
            if ( a%gcd == 0 && b%gcd == 0) {
                break;
            }
            gcd--;
        }
        System.out.println("GCD: "+ gcd);
    }
}
