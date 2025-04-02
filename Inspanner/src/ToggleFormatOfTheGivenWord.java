/*
write a program to print toggle format for a given word:
String str = "HellO";
              hELLo
- upper case ASCII code lies between 65-90
- lower case ASCII code lies between 97 to 122
 */

public class ToggleFormatOfTheGivenWord {
    public static void main(String[] args) {
        String str = "We ARe GoIng To DroWn bitches!";
        char[] mycharArray = str.toCharArray(); //creating character array from the String
        for (int i=0; i<mycharArray.length; i++) {
            Character mychar = mycharArray[i]; //initializing the variable
            if (mycharArray[i] >= 65 && mycharArray[i] <= 90) {
                mychar = Character.toLowerCase(mychar); //if that variable is uppercase making it lower case then storing it in the same variable
                mycharArray[i] = mychar; //updating the array element to that variable. so it changes in the array as well.
            } else if (mycharArray[i] >= 97 && mycharArray[i] <= 122) {
                mychar = Character.toUpperCase(mychar);
                mycharArray[i] = mychar;
            }
        }
        String finalString = new String(mycharArray); //converting character array to String
        System.out.println("Before toggling: " +str);
        System.out.println("After toggling: " + finalString);
    }
}

