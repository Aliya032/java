import java.util.ArrayList;

public class ArrayListCreation2 {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<Integer>(4);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(131);
        System.out.println("ArrayList is: "+ al);
        System.out.println("ArrayList third item is: "+ al.get(2));
        System.out.println("ArrayList last item is: "+ al.get(3));
        System.out.println("Printing out each element line by line: ");
        for (int i:al) {
            System.out.println(i);
        }
        System.out.println("Methods of Array list");
        System.out.println("ArrayList deleted element: "+ al.remove(3));
        System.out.println("ArrayList after deletion: "+ al);
        al.add(1234);
        al.add(456);
        al.add(789);
        System.out.println("After adding three more elements: "+ al);
        System.out.println("Index of number 456: "+ al.indexOf(456));
        System.out.println("Size of the ArrayList: "+ al.size());
        System.out.println("Does the array list contain 25? " + al.contains(25));
        System.out.println("Does the array list contain 14? " + al.contains(14));

    }
}
