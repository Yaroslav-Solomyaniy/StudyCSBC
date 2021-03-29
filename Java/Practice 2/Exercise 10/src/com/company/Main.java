package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class GeometricObject
{
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){}
    protected GeometricObject(String color,boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled() {
        return filled;
    }
    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
    abstract public double getArea();
    abstract public double getPerimeter();
}
class Triangle extends GeometricObject
{
    double a;
    double b;
    double c;
    {
        a = 1.0;
        b = 1.0;
        c = 1.0;
    }
    public Triangle(){}
    public Triangle(double a,double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {return a;}
    public void setA(double a) {this.a = a;}
    public double getB() {return b;}
    public void setB(double b) {this.b = b;}
    public double getC() {return c;}
    public void setC(double c) {this.c = c;}

    @Override
    public double getArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", Периметр=" + getPerimeter()+
                ", Площа=" + getArea() +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {
        Triangle One = new Triangle(25.5,30,40);
        System.out.println(One);
        printTimeStamp();
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
