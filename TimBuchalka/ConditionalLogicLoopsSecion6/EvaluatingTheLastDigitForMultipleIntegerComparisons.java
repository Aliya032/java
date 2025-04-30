public class EvaluatingTheLastDigitForMultipleIntegerComparisons {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num1) && isValid(num3)) {
            int num1Remainder = num1 % 10;
            int num2Remainder = num2 % 10;
            int num3Remainder = num3 % 10;
            if ((num1Remainder == num2Remainder) || (num2Remainder == num3Remainder) || (num3Remainder == num1Remainder)) {
                return true;
            }

        }
        return false;
    }
    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) {
            return true;
        }
        return false;
    }
}
