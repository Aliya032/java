import java.util.Arrays;
import java.util.Scanner;

/*
given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
input num: [1,2,3,1]
output: true
explanation: element 1 occurs at the indices 0 and 3

LOGIC -> sort the array same elements come together ex: 1,1,2,3
 */
public class leetCodeEx {
    public static void main(String[] args) {
        Scanner myojb = new Scanner(System.in);
        int num[] = new int[5];
        for (int i = 0; i<num.length; i++) {
            System.out.println("Enter number");
            num[i] = myojb.nextInt();
        }
        Arrays.sort(num);
        for (int j = 0; j<num.length-1; j++) {
            if (num[j] == num[j+1]) {
                System.out.println("True");
            }
        }
    }
}
