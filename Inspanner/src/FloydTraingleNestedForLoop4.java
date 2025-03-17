//EEEEE
//DDDDD
//CCCCC
//BBBBB
//AAAAA
public class FloydTraingleNestedForLoop4 {
    public static void main(String[] args) {
        char mychar = 'E';
        for (int i = 1; i<=5; i++ ) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(mychar);
            }
            System.out.println();
            mychar--;
        }
    }
}
