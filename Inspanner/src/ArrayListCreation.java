import java.util.ArrayList;

public class ArrayListCreation {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<Integer>(4);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(131);
        System.out.println("ArrayList is: "+ al);
        System.out.println("ArrayList third item is: "+ al.get(2));
        System.out.println("ArrayList last item is: "+ al.get(3));
    }
}
