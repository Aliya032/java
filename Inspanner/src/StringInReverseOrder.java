/*
print the String in reverse order
 */
public class StringInReverseOrder {
    public static void main(String[] args) {
        String myString = "You have to try honey.";
        String[] myStringArray = myString.split(" ");
        for (int i = myStringArray.length - 1; i>=0; i--) {
            System.out.println(myStringArray[i]);
        }
    }
}
