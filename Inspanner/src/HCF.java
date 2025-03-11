//hcf of two variables
public class HCF {
    public static void main(String[] args) {
        int a= 3;
        int b = 5;
        while (a != b) {
            if (a>b){
                a = a-b;
            } else {
                b = b-a;
            }
        }
        System.out.println("HCF of given numbers is: " + a);
    }
}
