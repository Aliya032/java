/*
to write characters along with ASCII code of a String
 */
public class CharactersAlongASCIIStrings {
    public static void main(String[] args) {
        String myString = "Today is Friday.";
        char mycharArray[] = myString.toCharArray();
        for (int i = 0; i<mycharArray.length;i++) {
            int charcode = mycharArray[i];
            System.out.println(mycharArray[i] + " " + charcode);
        }

    }
}
