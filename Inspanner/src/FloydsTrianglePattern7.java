//1     1
//2     2
//3  3  3
//4     4
//5     5
public class FloydsTrianglePattern7 {
    public static void main(String[] args) {
        int i = 1;
        while (i<= 5) {
            if (i!=3) {
                System.out.print(i + " " + i);
            } else {
                System.out.print(i + "" + i + ""+ i);
            }
            System.out.println();
            i++;
        }
    }
}
