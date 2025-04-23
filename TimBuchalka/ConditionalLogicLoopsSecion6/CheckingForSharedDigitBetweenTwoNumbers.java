/*
doesn't work here!
 */
public class CheckingForSharedDigitBetweenTwoNumbers {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,43));
        System.out.println(hasSharedDigit(12,13));
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1>= 10 && num1 <= 99) && (num2>= 10 && num2 <= 99)) {
//            while (num1 !=0) {
//                while(num2!=0) {
//                    int unitsNum1 = num1%10;
//                    int unitsNum2 = num2%10;
//                    if (unitsNum2 == unitsNum1) {
//                        return true;
//                    }
//                    num2 /= 10;
//                }
//                num1/=10;
//            }
            while ((num1 !=0) && (num2!=0)) {
                    int unitsNum1 = num1%10;
                    int unitsNum2 = num2%10;
                    if (unitsNum2 == unitsNum1) {
                        return true;
                    }
                    num2 /= 10;
                    num1/=10;
            }
        }
        return false;
    }
}
