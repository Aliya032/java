public class SingleLoopSort {
    public static void main(String[] args) {
        int a[] = {7,3,21,12,43,34};
        for ( int i = 1; i<a.length; i++) {
            if (a[i] <a[i-1]) {
                a[i] = a[i] + a[i-1];
                a[i-1] = a[i] -a[i-1];
                a[i] = a[i] - a[i-1];
                i=0;
            }
        }
        for(int j = 0; j<a.length;j++) {
            System.out.println(a[j]);
        }
    }
}
