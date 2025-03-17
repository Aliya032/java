//E
//DD
//CCC
//BBBB
//AAAAA
public class FloydTriangleNestedForLoop8 {
    public static void main(String[] args) {
        for (char a = 'E'; a >= 'A'; a--) {
            for (char b = 'E'; b>= a; b--) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
