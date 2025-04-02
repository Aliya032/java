/*
print number of words in a string
 */
public class NumberOfWordsStrings {
    public static void main(String[] args) {
        String myString = "Today is Shab-e-Qadr, and we've to pray well.";
        int wordCount = 1;
        for (int i = 0; i<myString.length();i++) {
            if (myString.charAt(i) == 32) {
                wordCount++;
            }
        }
        System.out.println("number of words in the given string: " + wordCount);
    }
}
