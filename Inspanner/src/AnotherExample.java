import java.util.ArrayList;

public class AnotherExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(4);
        al.add(19);
        al.add(12);
        al.add(17);
        al.add(4);
        for (int i : al) {
            System.out.println(i);
        }
        for (int i = 0; i< al.size() ; i++) {
            for (int j = 0; j<al.size(); j++) {
                int temp = al.get(i);
                if (al.get(i) < al.get(j)) {
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
        System.out.println("after sorting: "+ al);
    }
}
