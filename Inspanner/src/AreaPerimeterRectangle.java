public class AreaPerimeterRectangle {
    public static void main(String[] args) {
        int length = 50;
        int breadth = 1;
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println(area);
        System.out.println(perimeter);
        int difference = area - perimeter;
        System.out.println("difference: " + difference);
        System.out.println(area > perimeter ? "Area is greater by " + (area - perimeter) : "Perimeter is greater by: " + (perimeter-area));
    }
}
