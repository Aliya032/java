//check if a number is palindrome or not using do while
public class PalindromeDoWhile3 {
    public static void main(String[] args) {
        int num = 1221;
        int tempNum = 1221;
        int revNum = 0;
        do {
            int lastDigit = tempNum % 10;
            revNum = revNum*10 + lastDigit ;
            tempNum = tempNum/10;
        } while (tempNum>0);
        System.out.println(revNum);
        if (num == revNum) {
            System.out.println("palindrome");
        } else {
            System.out.println("not");
        }
    }
}
