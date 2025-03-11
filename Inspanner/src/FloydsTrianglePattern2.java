//1
//22
//333
//4444
//55555
public class FloydsTrianglePattern2 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=5) {
            int j = 1;
            while (j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
