package interfacedemo;

import java.io.Serializable;
import java.rmi.Remote;

public interface Area extends Perimeter {
    void calculateArea();
}

interface Perimeter{
    void calculatePerimeter();
}

class Rectangle implements Area{
    float length = 5;
    float width = 10;
    @Override
    public void calculateArea() {
        System.out.println("Area of Rectangle: " + (length*width));
    }

    @Override
    public void calculatePerimeter() {
        
    }
}
class Circle implements Area{
    int radius = 12;
    @Override
    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: "+area);
    }

    @Override
    public void calculatePerimeter() {
        
    }
}

class AreaImpl{
    public static void main(String[] args) {
        Area a1 = new Rectangle();
        Area a2 = new Circle();
        a1.calculateArea();
        a2.calculateArea();
    }
}