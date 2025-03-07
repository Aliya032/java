import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner vowelObj = new Scanner(System.in);
        System.out.println("Enter the character");
        char isVowel = vowelObj.next().charAt(0);
        System.out.println((isVowel == 'a' || isVowel == 'e'|| isVowel == 'i' || isVowel == 'o' || isVowel == 'u') ? "Vowel" : "Consonant");

    }
}
