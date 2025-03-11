public class sumOfDigits {
    public static void main(String[] args) {
        int num = 12765;
        int givenNum = num;
        int sum = 0;
        while (num!= 0) {
            int lastDigit = num%10;
            sum += lastDigit;
            num = num/10;
        }
        System.out.println(sum);
    }
}
