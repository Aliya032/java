//5
//44
//333
//2222
//11111
public class Pattern1 {
    public static void main(String[] args) {
        int i = 5;
        while (i>=1) {
            int j = 5;
            while (j>=i) {
                System.out.print(i);
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
