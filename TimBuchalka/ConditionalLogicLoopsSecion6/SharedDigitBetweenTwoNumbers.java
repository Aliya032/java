/*
works cause we're resetting num2 after second while loop.
 */
public class SharedDigitBetweenTwoNumbers {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 43));
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1>= 10 && num1 <= 99) && (num2>= 10 && num2 <= 99)) {
            int originalNum2 = num2;

            while(num1 !=0) {
                int unitNum1 = num1 % 10;
                num2 = originalNum2;

                while(num2 != 0) {
                    int unitNum2 = num2 % 10;
                    if (unitNum1 == unitNum2) {
                        return true;
                    }
                    num2 /= 10;
                }
                num1 /= 10;
            }
            }
            return false;
    }
}
