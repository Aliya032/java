/*
Write a program to find second-largest element in an array of ‘n’ size?
 */
import java.util.Arrays;
public class SecondLargestElementArrayNSize {

    //main method to call other method
    public static void main(String[] args) {
        int[] numArr = {5,34,2,9,11}; //expected output: 11
        int[] numArr2 = {4,2,7,45,3,8,1}; //expected output: 8
        System.out.println(secondLargest(numArr));
        System.out.println(secondLargest(numArr2));
    }

    public static int secondLargest(int[] numArr) {
        for (int i = 0; i<numArr.length; i++) { //arranging elements in descending order
            for (int j = 0; j < numArr.length; j++) {
                int maxElement = numArr[i];
                if (numArr[i] > numArr[j]) {
                  int temp = numArr[j];
                  numArr[j] = numArr[i];
                  numArr[i] = temp;
                }
             }
        }
        int secondLargestElement = numArr[1]; //after arranging second-largest element would be the second element
        return secondLargestElement; //returning the second-largest element
    }
}
