//55555
//44444
//33333
//22222
//11111
public class printPattern2 {
    public static void main(String[] args) {
        int i = 5;
        while (i>=1) {
            int j = 5;
            while (j>=1) {
                System.out.print(i);
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
