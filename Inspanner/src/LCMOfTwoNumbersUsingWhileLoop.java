//java program to find lcm of two numbers
//a = 3, b= 4
//not working

public class LCMOfTwoNumbersUsingWhileLoop {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int x = a;
        int y = b;
        while (a!=b) {
            if (x<y) {
                a += x;
            } else {
                b += y;
            }
        }
        System.out.println("LCM is: " + a);
    }
}
