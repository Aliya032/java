import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {

        //creating a thread safe arraylist
        CopyOnWriteArrayList<String> synArrayList = new CopyOnWriteArrayList<>();
        synArrayList.add("pencil");
        synArrayList.add("sharpner");
        synArrayList.add("eraser");
        synArrayList.add("pen");
        System.out.println("Displaying synchronized ArrayList: ");

        //synchronized block is not required in this method.
        Iterator<String> itr = synArrayList.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }
    }
}
