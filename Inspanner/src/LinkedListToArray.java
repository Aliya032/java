import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArray {
    public static void main(String[] args) {
        LinkedList<String> courseList = new LinkedList<>();
        courseList.add("Physics");
        courseList.add("Physics");
        courseList.add("Physics");
        int size = courseList.size();
        String[] courseArray = new String[size];
        courseArray = courseList.toArray(courseArray);
        System.out.println("Elements of the array are: ");
        System.out.println(Arrays.toString(courseArray));
    }
}
