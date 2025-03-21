//java program to search for a specific element in an array
public class Search {
    public static void main(String[] args) {
        int[] numArray = {1,2,3,5,6,7,8};
        int elementToBeSearched = 6;
        boolean isFound = false;
        int index  = -1;
        for (int i = 1; i<numArray.length; i++) {
            if (numArray[i] == elementToBeSearched) {
                isFound = true;
                index = i;

            }
        }
        if (isFound && index != -1) {
            System.out.println("Element " + elementToBeSearched + " is found at position " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
