/*
find the smallest words length in a given string.
something is not working in this program.
 */
public class SmallestWordLengthInAString {
    public static void main(String[] args) {
        String str = "hope all is well";
        int stringSize = str.length();
        String finalString = "";
        String[] myStringArray = str.split(" ");
        for(int i = 0; i<myStringArray.length; i++) {
            if (myStringArray[i].length() < stringSize) {
                stringSize = myStringArray[i].length();
            }
        }
        for (int j = 0; j < myStringArray.length; j++) {
            if (myStringArray[j].length() == stringSize) {
                finalString = myStringArray[j];
            }
        }

        System.out.println("smallest string size " + stringSize + " - " + " smallest string \"" + finalString + "\"");
    }
}
