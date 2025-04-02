/*
print String characters in reverse order.
 */
public class StringCharactersReverse {
    public static void main(String[] args) {
        String myString = "Eid is coming honey";
        for (int i = myString.length()-1; i>=0; i--) {
            System.out.println(myString.charAt(i));
        }
    }
}
