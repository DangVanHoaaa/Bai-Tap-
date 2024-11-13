package bai7;

public class Circle implements GeometricObject{
    protected double radius;
    
    
    
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return this.radius * 3.14 * 2;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
    
}
