/*
print all characters of a String using toCharArray()
 */
public class CharactersOfString {
    public static void main(String[] args) {
        String str = "hope all is well";
        char c[] = str.toCharArray();
        for (int i = 0; i <c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
