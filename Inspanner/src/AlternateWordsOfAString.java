/*
alternate words of a string
 */
public class AlternateWordsOfAString {
    public static void main(String[] args) {
        String myString = "You have to try honey.";
        String[] myStringArray = myString.split(" ");
        for (int i = 0; i<myStringArray.length; i+=2) {
            System.out.println(myStringArray[i]);
        }
    }
}
