//A
//BB
//CCC
//DDDD
//EEEEE
public class FloydTriangleNestedForLoop7 {
    public static void main(String[] args) {
        for (char a = 'A'; a<='E'; a++) {
            for (char b = 'A'; b<=a; b++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
