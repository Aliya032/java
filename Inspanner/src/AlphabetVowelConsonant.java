import java.util.Scanner;

//- upper case ASCII code lies between 65-90
//        - lower case ASCII code lies between 97 to 122
//check if the character is alphabet or not then check if its vowel or consonant
public class AlphabetVowelConsonant {
    public static void main(String[] args) {
        Scanner newobj = new Scanner(System.in);
        System.out.println("Enter the character");
        char mychar = newobj.next().charAt(0);
        if ((mychar >= 65 && mychar <= 90) ||(mychar >= 97 && mychar <= 122)) {
            if (mychar == 'a' || mychar == 'e' || mychar == 'i' || mychar == 'o' || mychar == 'u' || mychar == 'A' || mychar == 'E' || mychar == 'I' || mychar == 'O' || mychar == 'U' ) {
                System.out.println("alphabet and vowel");
            } else {
                System.out.println("consonant");
            }
        } else {
            System.out.println("Not a alphabet");
        }
    }
}
