/*
print words of a String using split method
 */
public class WordsOfAString {
    public static void main(String[] args) {
        String myString = "We are not having a blast, Amelia!";
        String[] myStringArray = myString.split(" ");
        for (int i =0; i< myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }
    }
}
