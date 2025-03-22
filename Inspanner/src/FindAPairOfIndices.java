/*
wrong
 */
/*
- you are given an integer array nums and two integers indexDiff and valueDiff.
- Find a pair of indices (i,j) such that: i!=j
- abs(i-j) <= indexDiff
- abs(nums[i] - nums[j] ) <= valueDiff and
- Return true if such pair exists or false otherwise

- example 1:
input: nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
output: true
explanation: we can choose (i,j) as(0,3)
cause abs(i-j) <= indexDiff --> abs(0-3) <= 3
and abs( nums[i] - nums[j] ) <= valueDiff --> abs(1-1) <=0
 */
import static java.lang.Math.abs;
public class FindAPairOfIndices {
    public static void main(String[] args) {
        int numArray[] = {1,2,3,1};
        System.out.println(findPair(numArray,2,0));
    }
    public static String findPair(int nums[], int indexDiff, int valueDiff) {
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < nums.length; i++ ) {
            for (int j = i+1; j<nums.length; j++) {
                if ((abs(i-j) <= indexDiff) && (abs(nums[i] - nums[j]) <= valueDiff)) {
//                    index1 = i;
//                    index2 =j;
                    System.out.println("true");
                }
            }
        }
        return ("Indices are: " + index2 +  " "+ index1);
    }
}

