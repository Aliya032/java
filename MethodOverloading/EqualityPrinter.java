public class EqualityPrinter {
    public static void main(String[] args) {
        System.out.println(printEqual(1, 1, 1));
        System.out.println(printEqual(1, 1, 2));
        System.out.println(printEqual(-1, -1, -1));
        System.out.println(printEqual(1, 2, 3));
        System.out.println(printEqual(2,1,1));
    }
    public static String printEqual(int num1, int num2, int num3) {
        if (num1 <0 || num2 <0 || num3 < 0) {
            return ("Invalid Value");
        } else if (num1 == num2 && num2 == num3) {
            return ("All numbers are equal");
        } else if ((num1 == num2 && num1 != num3) || (num1 == num3 && num3 != num2 ) || (num2 == num3 && num3 != num1)){
            return ("Neither all are equal or different");
        } else {
            return ("All numbers are different");
        }
    }
}
