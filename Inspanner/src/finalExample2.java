public class finalExample2 {
    public static void main(String[] args) {
        Derived2 ob1 = new Derived2(3,4);
        Derived2 ob2 = new Derived2(13,14);
        System.out.println(ob1.getArea());
        System.out.println(ob2.getArea());

    }
}

abstract class Base2 {
    double height, width;
    public Base2(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public final double getWidth() {
        return width;
    }
    public final double getHeight() {
        return height;
    }
    abstract double getArea();
}

class Derived2 extends Base2 {
    public Derived2 (double width, double height) {
        super(width, height);
    }
    final double getArea() {
        return this.getHeight()* this.getWidth();
    }
}



