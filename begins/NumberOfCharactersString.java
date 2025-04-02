/*
Write a program to count frequency of each character in a string
String str="aaabbbaacccb";

 */
public class NumberOfCharactersString {
    public static void main(String[] args) {
        String str="aaabbbaacccb";
        int[] countArray = new int[256];
        char finalChar = 0;
        for(int i =0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int a = ch;
            countArray[a]++;
        }
        int max = countArray[0];
        for (int i = 0; i<256; i++) {
            if(countArray[i] != 0) {
                System.out.println((char)i + " " + countArray[i]);
            }
            if (max < countArray[i]) {
                max = countArray[i];
                finalChar = (char)i;
            }
        }
        System.out.println(finalChar + " occurs maximum " + max + " number of times");

    }
}

