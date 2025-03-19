import java.util.Scanner;
//count number of vowels and consonants in an array of type char and size 10
public class VowelsConsonantsArrays9 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        char[] charArray = new char[10];
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i<charArray.length; i++) {
            System.out.println("Enter the character: ");
            charArray[i] = myobj.next().charAt(0);
            if (charArray[i] == 'a'||charArray[i] == 'e'|| charArray[i] == 'i'|| charArray[i] == 'o'|| charArray[i] == 'u'|| charArray[i] == 'A'||charArray[i] == 'E'|| charArray[i] == 'I'|| charArray[i] == 'O'|| charArray[i] == 'U') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        System.out.println("vowel count: "+vowelCount);
        System.out.println("consonant count: "+consonantCount);
    }
}
