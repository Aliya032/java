/*
write a java program to print alternate characters of a String in reverse order.
 */
public class AlternateCharactersReverseStrings {
    public static void main(String[] args) {
        String myString = "Gotta work hard bro";
        for (int i = myString.length()-1; i>=0; i-=2) {
            System.out.println(myString.charAt(i));
        }
    }
}
