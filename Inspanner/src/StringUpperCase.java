/*
convert string to uppercase
 */
public class StringUpperCase {
    public static void main(String[] args) {
        String myString = "we aRe all lOiterIng aroUNd.";
        String updatedString = myString.toUpperCase();
        String updatedLowerString = myString.toLowerCase();
        System.out.println(myString);
        System.out.println(updatedString);
        System.out.println(updatedLowerString);
        //make the first letter of the string to capital letter eg. We Are All Healthy.
        String firstLetterCap = myString.toUpperCase();
    }
}
