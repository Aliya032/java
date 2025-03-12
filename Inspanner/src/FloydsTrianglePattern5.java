//1
//23
//456
//78910
//1112131415

public class FloydsTrianglePattern5 {
    public static void main(String[] args) {
        int i = 1;
        int k = 1;
        while (i<= 5) {
            int j = 1;
            while (j<=i) {
                System.out.print(k);
                j++;
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
