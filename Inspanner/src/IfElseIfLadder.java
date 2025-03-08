import java.util.Scanner;

//check if its lowercase, uppercase, or special character.
//lower case -
//- upper case ASCII code lies between 65-90
//- lower case ASCII code lies between 97 to 122
//special character ASCII 9-126
public class IfElseIfLadder {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter character: ");
        char mychar = myobj.next().charAt(0);
        if (mychar >= 65 && mychar <=90) {
            System.out.println("Uppercase");
        } else if (mychar >= 97 && mychar <= 122) {
            System.out.println("Lowercase");
        } else if (mychar>= 9 && mychar<= 126) {
            System.out.println("Special character");
        } else {
            System.out.println("Not a character");
        }
    }
}
