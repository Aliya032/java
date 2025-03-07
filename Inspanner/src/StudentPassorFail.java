public class StudentPassorFail {
    public static void main(String[] args) {
        int subject1 = 28;
        int subject2 = 40;
        int subject3 = 37;
        int subject4 = 18;
        int subject5 = 68;
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        System.out.println("Total marks: " + totalMarks);
        System.out.println(totalMarks >= 250 ? "You passed the exam!": "You failed, better luck next time");
    }
}
