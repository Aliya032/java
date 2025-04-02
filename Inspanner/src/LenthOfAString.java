/*
find length of a String without using the length keyword
    LOGIC:  we are using for each enhanced loop.
 */
public class LenthOfAString {
    public static void main(String[] args) {
        String myString = "hope is all we got folks";
        char mycharArray[] = myString.toCharArray();
        int count = 0;
        for (char element:mycharArray) {
            count++;
        }
        System.out.println(count);
    }
}
