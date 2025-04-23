/*
Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
 */
public class AbstractExample2 {
    public static void main(String[] args) {
        Shape circleObj = new Circle();
        Shape squareObj = new Square();
        System.out.println("Circle area: " + circleObj.calculateArea(2));
        System.out.println("Circle Perimeter: " + circleObj.calculatePerimeter(2));
        System.out.println("Square area: " + squareObj.calculateArea(2));
        System.out.println("Square Perimeter: " + squareObj.calculatePerimeter(2));
    }
}
abstract class Shape{
     public abstract double calculateArea(int x);
     public abstract double calculatePerimeter(int y);
}

 class Circle extends Shape{
    public  double calculateArea(int radius) {
        return 3.14 * radius * radius;
    }
    public double calculatePerimeter(int radius) {
        return 2 * 3.14 * radius;
    }
}

 class Square extends Shape {
    public double calculateArea(int side) {
        return side * side;
    }
    public double calculatePerimeter(int side) {
        return 4 * side;
    }
}
