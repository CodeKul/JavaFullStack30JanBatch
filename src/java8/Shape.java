package java8;

public interface Shape {
    default void calculatePerimeter(){
        System.out.println("in Shape");
    }
    static Double calculateArea(int r){
        return 3.14 * r * r;
    }
}
class Circle implements Shape{


    @Override
    public void calculatePerimeter() {
        System.out.println("in calculate perimeter");
    }

}

class ShapeImpl{
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculatePerimeter();
        Shape.calculateArea(5);
    }
}