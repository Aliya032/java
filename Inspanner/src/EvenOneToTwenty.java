//print all even numbers from one to twenty
public class EvenOneToTwenty {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i % 2== 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
