import java.util.Scanner;

public class VowelConsonantSwitch {
    public static void main(String[] args) {
        Scanner newobj = new Scanner(System.in);
        System.out.println("Enter character");
        char mychar = newobj.next().charAt(0);
        switch (mychar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
    }
}
