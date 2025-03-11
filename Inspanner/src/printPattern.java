//11111
//22222
//33333
//44444
//55555
public class printPattern {
    public static void main(String[] args) {
        int i = 1;
        while (i<=5) {
            int j = 1;
            while (j<=5) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
