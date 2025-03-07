//vowel or consonant
import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter character");
        char character = obj.next().charAt(0);
        System.out.println("character: " +character);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
