//A
//BB
//CCC
//DDDD
//EEEEE
public class FloydTrianlgeNestedForLoop5 {
    public static void main(String[] args) {
        char mychar = 'A';
        for (int i = 1; i<=5; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print(mychar);
            }
            System.out.println();
            mychar++;
        }
    }
}
