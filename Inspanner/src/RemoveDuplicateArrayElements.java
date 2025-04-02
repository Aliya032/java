/*
removing duplicate array elements form array
output: 10,20,50,30,40
 */
public class RemoveDuplicateArrayElements {
    public static void main(String[] args) {
        int i, j, k, n=8;
        int arr[] = {10,20,50,10,30,20,10,40};
        for (i=0; i<n;i++) {
            for (j=i+1; j<n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                    n = n-1;
                    for (k=j; k<n; k++) {
                        arr[k] = arr[k+1];
                    }
                    j = j-1;
                }
            }
        }
        System.out.println("elements after deleting: ");
        for (int l = 0; l<arr.length; l++) {
            System.out.println(arr[l]);
        }
    }
}
