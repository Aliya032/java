 class AnotherStudent {
    int roll;
    String name;
    String city;
    AnotherStudent(int roll, String name, String city) {
        this.roll =roll;
        this.name = name;
        this.city = city;
    }
    /* without this toString method it returns reference ids */
    /* with this method toString it returns the data. */
    public String toString() {
        return ("Roll: "+ roll + " Name: "+ name + " City: " + city);
    }
}
public class ToStringStudentArray {
    public static void main(String[] args) {
        AnotherStudent as1 = new AnotherStudent(101, "Raj", "Lucknow");
        AnotherStudent as2 = new AnotherStudent(102, "Loreal", "Gaziabad");
        System.out.println(as1);
        System.out.println(as2);
    }
}
