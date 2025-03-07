public class SquareOrNot {
    public static void main(String sides[]) {
        int length = Integer.parseInt(sides[0]);
        int breadth = Integer.parseInt(sides[1]);
        if (length == breadth) {
            System.out.println("It is a square");
        } else {
            System.out.println("Its not a square");
        }

    }
}
