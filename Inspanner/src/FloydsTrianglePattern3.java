//11111
//2222
//333
//44
//5
public class FloydsTrianglePattern3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            int j = 5;
            while (j>=i){
                System.out.print(i);
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
