import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> dequeexample = new ArrayDeque<>();
        dequeexample.offer("Arvind");
        dequeexample.offer("Gopal");
        dequeexample.add("Mukul");
        dequeexample.offerFirst("Fisher");
        System.out.println("After offerFirst Traversal");
        for (String s:dequeexample) {
            System.out.println(s);
        }
        dequeexample.poll();
        dequeexample.pollFirst();
        dequeexample.pollLast();
        System.out.println("After pollLast traversal");
        for (String s: dequeexample) {
            System.out.println(s);
        }
    }
}
