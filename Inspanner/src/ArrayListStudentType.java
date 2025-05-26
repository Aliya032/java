import java.util.ArrayList;
/*
create an ArrayList of type Student where Student is defined by {roll, name}
 */
class Student {
    int roll;
    String name;
    void info(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}
public class ArrayListStudentType {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.info(23,"Martin");
        s2.info(17,"Josseph");
        s3.info(12,"Mariana");
        ArrayList<Student> al = new ArrayList<Student>(6);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        System.out.println("Array list is: "+ al);
        for(Student i: al) {
            System.out.println(i.name + " "+ i.roll);
        }
        /*
        for (Student i: al) {
            int temp = i.roll;
            int j = i.roll+1;
            for (Student j: al) {
                if (i.roll < j.roll) {
                    al.set(i.roll, j.roll);
                    al.set(j.roll, temp);
                }

            }
        }

         */
        }
    }

