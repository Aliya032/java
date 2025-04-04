import java.util.Scanner;

/*
reverse a string
 */
public class ReverseOfAString {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = myobj.nextLine();
        String s2 = "";
        for (int i = s1.length()-1; i>=0; i--) {
            s2 += s1.charAt(i);
        }
        System.out.println("Before reversing: " + s1);
        System.out.println("After reversing: " + s2);
    }
}

