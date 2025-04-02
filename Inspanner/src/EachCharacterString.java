/*
print each character of the string
 */
public class EachCharacterString {
    public static void main(String[] args) {
        String myString = "hello";
        for (int i = 0; i<myString.length(); i++) {
            System.out.println(myString.charAt(i));
        }
    }
}
