public class TriangleValid {
    public static void main(String[] args) {
        int angleA = 90;
        int angleB = 45;
        int angleC = 45;
        int sum = angleA + angleB + angleC;
        System.out.println(sum == 180 ? "Triangle is valid" : "Triangle is invalid");
    }
}
