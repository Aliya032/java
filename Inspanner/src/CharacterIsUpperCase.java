//upper case ASCII code: 65 to 90
//lower case ASCII code: 97 to 122
public class CharacterIsUpperCase {
    public static void main(String[] args) {
        char c = 'T';
        System.out.println((c >= 65 && c <= 90) ? "Its uppercase": "Lowercase");
        System.out.println((c >= 'A' && c<= 'Z') ? "Uppercase" : "Lowercase");
    }
}
