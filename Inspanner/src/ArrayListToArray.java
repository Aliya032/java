import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(6);
        al.add(5);
        System.out.println("Contents of al: "+ al);
        //get the array
        Integer a[] = new Integer[al.size()];
        a = al.toArray(a);
        System.out.println("Contents of the array");
        for (int i :a) {
            System.out.println(i);
        }
        int sum = 0;
        for (int i: a) {
            sum += i;
        }
        System.out.println("Sum is: "+ sum);

    }
}
