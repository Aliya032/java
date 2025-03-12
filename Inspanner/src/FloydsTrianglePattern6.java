//1
//2*3
//4*5*6
//7*8*9*10
//11*12*13*14*15
//logic -> the star is before the digit for every column besides one
public class FloydsTrianglePattern6 {
    public static void main(String[] args) {
        int i = 1;
        int k = 1;

        while (i<= 5) {
            int j = 1;
            while (j<=i) {
                if (j!=1) {
                    System.out.print("*" + k);
                } else {
                    System.out.print(k);
                }
                j++;
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
