/*
count number of vowels and consonants in a String
 */
public class VowelsConsonantsStrings {
    public static void main(String[] args) {
        String myString = "To hell and back!";
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i< myString.length();i++) {
            if (myString.charAt(i) == 'a' || myString.charAt(i) == 'e' || myString.charAt(i) == 'i' || myString.charAt(i) == 'o' || myString.charAt(i) == 'u' || myString.charAt(i) == 'A' || myString.charAt(i) == 'E' || myString.charAt(i) == 'I' || myString.charAt(i) == 'O' || myString.charAt(i) == 'U') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        System.out.printf("Vowel count: " + vowelCount + " Consonant Count: " + consonantCount);

    }
}
