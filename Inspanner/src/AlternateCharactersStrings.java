/*
print alternate characters of a string
 */
public class AlternateCharactersStrings {
    public static void main(String[] args) {
        String myString = "She's taking this really slow.";
        for(int i = 0; i<myString.length();i+=2) {
            System.out.println(myString.charAt(i));
        }
    }
}
