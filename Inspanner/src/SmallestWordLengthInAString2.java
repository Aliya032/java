/*
find the smallest words length in a give string and print the corresponding word
 */
public class SmallestWordLengthInAString2 {
    public static void main(String[] args) {
        String str = "hope all is well";
        String[] strArray = str.split(" ");
        int stringSize = strArray[0].length();
        for (int i = 1; i< strArray.length; i++) {
            if (strArray[i].length() < stringSize) {
                stringSize = strArray[i].length();
            }
        }
        System.out.println("string size " + stringSize);
    }
}
