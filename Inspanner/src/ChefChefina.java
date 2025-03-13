import java.util.Scanner;

//the first line of input will contain a single integer T, denoting the number of test cases.
//turn will be good when the sum of their output on dice is > 6
//each  test case will contain two space separated integers X & Y - the numbers chef and Chefina got on their respective dice
//output format: for each test case, output on a new line, YES, if the turn was good and NO otherwise
public class ChefChefina {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter test cases: ");
        int T = myobj.nextInt();
        for (int i=1; i<=T; i++) {
            System.out.println("Enter Chef's dice number: ");
            int chef = myobj.nextInt();
            System.out.println("Enter Chefina's dice number: ");
            int chefina = myobj.nextInt();
            int sum = chef + chefina;
            if (sum > 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
