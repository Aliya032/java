//lcm of two numbers
public class lcmOfTwoNumbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int lcm = (a>b) ? a:b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0){
                break;
            }
            lcm++;
        }
        System.out.println("LCM is: "+ lcm);
    }
}
