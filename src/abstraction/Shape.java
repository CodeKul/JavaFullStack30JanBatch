package abstraction;

public abstract class Shape {
    abstract void calculateArea();
}
class Circle extends Shape{
    int radius = 5;
    @Override
    void calculateArea() {
        double area = (3.14 * 5 * 5);

        System.out.println(area);
    }
}
class ShapeImpl{
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculateArea();
    }
}