/*
FINAL ANSWER
 */
import java.util.ArrayList;

class NewStudent {
    int roll;
    String name;
    public NewStudent(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }
}

public class StudentArrayList2 {
    public static void main(String[] args) {
        ArrayList<NewStudent> sal = new ArrayList<NewStudent>();

        NewStudent ns1 = new NewStudent(231, "John");
        sal.add(ns1);
        sal.add(new NewStudent(13, "Deepika"));
        sal.add(new NewStudent(3, "Graham"));


        int size = sal.size();

        System.out.println("Before sorting: ");
        for(NewStudent s1: sal) {
            System.out.println(s1.roll + " "+ s1.name);
        }

        /*SORTING */
        for (int i = 0; i< size; i++){
            for (int j = 0; j < size; j++) {
                if (sal.get(i).getRoll() < sal.get(j).getRoll()) {
                    NewStudent temp = sal.get(j);
                    sal.set(j, sal.get(i));
                    sal.set(i, temp);
                }
            }
        }
        System.out.println("After Sorting: ");
        for(NewStudent s1 : sal) {
            System.out.println(s1.roll + " "+ s1.name);
        }
    }
}

