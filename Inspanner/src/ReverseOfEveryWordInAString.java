/*
Write a program to print reverse of every word in the given sentence
If input is – Princess Noori
   Output is -  ssecnirP irooN
 */
public class ReverseOfEveryWordInAString {
    public static void main(String[] args) {
        String myString = "Princess Noori";
        String[] myStringArray = myString.split(" ");
        for (int i = 0; i<myStringArray.length; i++) { //iterating through the array
            String word = myStringArray[i];
            for (int j =word.length()-1; j>=0; j--) { //iterating through the word
                System.out.print(word.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
