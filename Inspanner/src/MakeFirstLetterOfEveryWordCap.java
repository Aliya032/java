/*
/make the first letter of every word of the string to capital letter eg. We Are All Healthy.
 */
public class MakeFirstLetterOfEveryWordCap {
    public static void main(String[] args) {
        String mystr = "hope all is well";

        String[] mystrArray = mystr.split(" ");

        for (int j = 0; j< mystrArray.length; j++) {
            String word = mystrArray[j];
            for (int i = 0; i<word.length(); i++) {
                if (i==0) {
                    System.out.print(word.toUpperCase().charAt(0));
                } else {
                    System.out.print(word.charAt(i));
                }

            }
            System.out.print(" ");
        }
    }
}
