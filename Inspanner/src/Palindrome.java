//check if the number is palindrome or not using while loop
//if number & reverse of a number is equal then its palindrome
//1234 -> not a palindrome
//121 -> palindrome
public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int givenNum = num;
        int revNum = 0;
        while (num != 0){
            int lastDigit = num%10;
            revNum = revNum*10 + lastDigit;
            num = num/10;
        }
        if (revNum == givenNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a plaindrome");
        }
    }
}
