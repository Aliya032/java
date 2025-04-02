/*
input: Mohandas Karamchand Gandhi
output: M.K.Gandhi
 */
public class AcceptFullName {
    public static void main(String[] args) {
        String name = "Mohandas Karamchand Gandhi";
        String[] strArray = name.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            String word = strArray[i];
            for (int j = 0; j < word.length(); j++) {
                if (i == strArray.length-1) { //if it is the last word of the array
                    if (j==0) {
                        System.out.print(word.toUpperCase().charAt(0));
                    } else {
                        System.out.print(word.charAt(j));
                    }
                } else { //if these are not the last word in the array
                    if (j==0) {
                        System.out.print(word.toUpperCase().charAt(0) + ".");
                    } else {
                        System.out.print("");
                    }
                }
            }
        }
    }
}
