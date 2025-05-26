/*
doesn't work
have to implement using linked hash set
 */
import java.lang.reflect.Array;
import java.util.Arrays;

/*
Write a program to delete duplicate elements from the given array such as arr[]={10,20,30,10,40,10,50,20};
 */
public class RemoveDuplicateElementsFromArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,10,40,10,50,20};
        removeDuplicates(arr);
    }


    public static int[] removeDuplicates(int[] numArr) {
        int[] originalArr = numArr;
        for (int i = 0; i < numArr.length; i++) {
            for(int j = 1; j < numArr.length; j++) {
                if (numArr[i] == numArr[j]) {
                    numArr = removeElement(numArr, j);
                }
            }
        }
        System.out.println("Original array: "+ Arrays.toString(originalArr));
        System.out.println("final array: "+ Arrays.toString(numArr));
        return numArr;
    }


    public static int[] removeElement(int[] numArray, int index) {
//        int[] originalArr = numArray;
//        System.out.println("Orinigal array: "+ Arrays.toString(numArray));
        int[] newArr = new int[numArray.length-1];
        if (numArray == null || index < 0 || index > numArray.length) {
            return numArray;
        }
        for (int i = 0, k=0; i<numArray.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[k++] = numArray[i];
        }
//    System.out.println("After deleting the array element at index: "+ Arrays.toString(newArr));
        return newArr;
    }

}