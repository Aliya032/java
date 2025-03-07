//upper case ASCII code: 65 to 90
//lower case ASCII code: 97 to 122
public class CharacterIsLowerCase {
    public static void main(String[] args) {
        char c = 'r';
        System.out.println((c >= 97 && c <= 122) ? "Its Lowercase": "Uppercase"); //method 1 to check character codes
        System.out.println((c >= 'a' && c<= 'z') ? "Lowercase" : "Uppercase"); //method 2 to check between the characters itself
    }
}
