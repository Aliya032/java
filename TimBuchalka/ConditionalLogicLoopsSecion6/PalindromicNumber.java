public class PalindromicNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(1001));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int revNumber = 0;
        int remainder;
        while (number != 0) {
            remainder = number % 10;
            revNumber = revNumber * 10 + remainder;
            number /= 10;
        }
        return (revNumber == originalNumber);
    }
}


