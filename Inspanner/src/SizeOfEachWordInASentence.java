/*
program to find size of each word in a give sentence:
hope all is well
4   3    2  4
 */
public class SizeOfEachWordInASentence {
    public static void main(String[] args) {

        String myString = "Don't worry honey, everything will fall into place.";

        String[] myStringArray = myString.split(" "); //array of words in the sentence

        for (int i = 0; i < myStringArray.length; i++) { //looping through the array of words
//            System.out.println(myStringArray[i]);
            String wordString = myStringArray[i]; //assigning that each word to a new variable as a String
            char[] myCharArray = wordString.toCharArray(); //making that string into a character array
            int count = 0; //starting the count at 0
            for (int j = 0; j< myCharArray.length; j++) { //looping through that character array
//                System.out.println(myCharArray[j]);
                count++; //while looping incrementing its count
            }
            System.out.println(myStringArray[i] + " " +count); //since the outer loop is looping through the word array, printing that word and its corresponding count.
        }

    }
}
