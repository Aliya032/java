/*
print each word in new line
 */
public class EachWordInNewLineStrings {
    public static void main(String[] args) {
        String myString = "Today is Shab-e-Qadr, and we've to pray well.";
        for(int i = 0; i<myString.length(); i++) {
            if(myString.charAt(i) != 32) {
                System.out.print(myString.charAt(i));
            } else {
                System.out.println();
            }
        }
    }
}
