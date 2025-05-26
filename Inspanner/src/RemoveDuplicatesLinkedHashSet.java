/*
Write a program to delete duplicate elements from the given array such as arr[]={10,20,30,10,40,10,50,20};
 */
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesLinkedHashSet {
    public static void main(String[] args) {
        //checking test cases:
        int arr[]={10,20,30,10,40,10,50,20};
        int arr2[] = {45,45,67,89,67,23,45,23};
        int[] finalResult = removeDuplicates(arr);
        int[] finalResult2 = removeDuplicates(arr2);
        System.out.println(Arrays.toString(finalResult));
        System.out.println(Arrays.toString(finalResult2));
    }

    public static int[] removeDuplicates(int[] numArr) {
        //creating a new hash set which doesn't take duplicates.
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for (int num: numArr) {
            hashSet.add(num);  //adding elements to hash set
        }

        //converting hash set back to array
        int[] finalArray = new int[hashSet.size()];
        int i = 0;
        for (int num: hashSet) {
            finalArray[i++] = num;
        }
        return finalArray;
    }


}