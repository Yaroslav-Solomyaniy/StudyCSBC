package ex_5;

public class Circle extends Shape{
    protected double radius;

    public Circle(){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    @Override
    double getArea()
    {
        return (Math.PI*(Math.pow(radius,2)));
    }

    @Override
    double getPerimeter()
    {
        return (2*Math.PI*radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
