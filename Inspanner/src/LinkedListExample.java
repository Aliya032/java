import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Steve");
        ll.add("John");
        ll.add("Chris");
        ll.add("Reese Murphy");
        System.out.println("initial linked list: " + ll);
        ll.add(3, "Gracie Reynolds");
        System.out.println("After adding gracie at 3rd: "+ ll);
        ll.addFirst("Cage Reynolds");
        System.out.println("After adding at first: "+ ll);
        ll.addLast("Brinkely Reynolds");
        System.out.println("After adding at last: "+ ll);


    }
}
