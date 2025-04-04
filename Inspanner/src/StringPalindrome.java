import java.util.Scanner;

/*
check if a string is palindrome or not
 */
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = myobj.nextLine();
        String s2 = "";
        for (int i = s1.length()-1; i>=0; i--) {
            s2 += s1.charAt(i);
        }
        if(s1.equals(s2)) {
            System.out.println("Given string is a plaindrome");
        } else {
            System.out.println("Not a plaindrome");
        }
    }
}
