//fibonacci series using for loop
public class FibonacciSeriesForLoop5 {
    public static void main(String[] args) {
        int t1 = 1;
        int t2 = 1;
        System.out.println(t1);
        System.out.println(t2);
        for (int count = 1; count <= 5; count ++) {
            int t3 = t1 + t2;
            System.out.println(t3);
            t1 = t2;
            t2 = t3;
        }
    }
}
