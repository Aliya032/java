import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String,String> tm = new TreeMap<String, String>();
        tm.put("Sachin", "456");
        tm.put("Yahya", "456");
        tm.put("Ujit", "456");
        tm.put("Nahim", "456");
        System.out.println("Tree map");
        System.out.println(tm);
    }
}
