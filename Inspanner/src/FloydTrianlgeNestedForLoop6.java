//EEEEE
//DDDD
//CCC
//BB
//A
public class FloydTrianlgeNestedForLoop6 {
    public static void main(String[] args) {
        char mychar = 'E';
        for (int i = 1; i<= 5; i++) {
            for (int j = 5; j>= i; j--) {
                System.out.print(mychar);
            }
            System.out.println();
            mychar--;
        }
    }
}
